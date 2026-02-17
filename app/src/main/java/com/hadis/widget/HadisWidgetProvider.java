package com.hadis.widget;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.SystemClock;
import android.widget.RemoteViews;

public class HadisWidgetProvider extends AppWidgetProvider {

    private static final String ACTION_NEXT = "com.hadis.widget.ACTION_NEXT";
    private static final String PREFS = "hadis_prefs";
    private static final String KEY_INDEX = "current_index";
    private static final long UPDATE_INTERVAL = 5 * 60 * 1000; // 5 minutes

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {
        for (int appWidgetId : appWidgetIds) {
            updateWidget(context, appWidgetManager, appWidgetId);
        }
        scheduleNextUpdate(context);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);

        if (ACTION_NEXT.equals(intent.getAction())) {
            // User tapped next button or auto-update triggered
            int newIndex = HadisData.getRandomIndex();
            SharedPreferences prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
            int currentIndex = prefs.getInt(KEY_INDEX, -1);

            // Make sure we get a different one
            while (newIndex == currentIndex && HadisData.getCount() > 1) {
                newIndex = HadisData.getRandomIndex();
            }

            prefs.edit().putInt(KEY_INDEX, newIndex).apply();

            AppWidgetManager manager = AppWidgetManager.getInstance(context);
            int[] ids = manager.getAppWidgetIds(new ComponentName(context, HadisWidgetProvider.class));
            for (int id : ids) {
                updateWidget(context, manager, id);
            }
            scheduleNextUpdate(context);
        }
    }

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
        scheduleNextUpdate(context);
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, HadisWidgetProvider.class);
        intent.setAction(ACTION_NEXT);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_IMMUTABLE);
        alarmManager.cancel(pendingIntent);
    }

    private void updateWidget(Context context, AppWidgetManager manager, int appWidgetId) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        int index = prefs.getInt(KEY_INDEX, -1);

        if (index < 0 || index >= HadisData.getCount()) {
            index = HadisData.getRandomIndex();
            prefs.edit().putInt(KEY_INDEX, index).apply();
        }

        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout);

        // Set texts
        views.setTextViewText(R.id.hadis_text, HadisData.getText(index));
        views.setTextViewText(R.id.source, HadisData.getSource(index));
        views.setTextViewText(R.id.ravi, HadisData.getNarrator(index));
        views.setTextViewText(R.id.counter, (index + 1) + " / " + HadisData.getCount());

        // Set badge
        views.setTextViewText(R.id.badge, HadisData.getBadgeText(index));
        if (HadisData.isHadis(index)) {
            views.setInt(R.id.badge, "setBackgroundResource", R.drawable.badge_hadis);
            views.setTextColor(R.id.badge, 0xFF7DCEA0);
        } else {
            views.setInt(R.id.badge, "setBackgroundResource", R.drawable.badge_hikmet);
            views.setTextColor(R.id.badge, 0xFFD4B872);
        }

        // Set click action for next button
        Intent nextIntent = new Intent(context, HadisWidgetProvider.class);
        nextIntent.setAction(ACTION_NEXT);
        PendingIntent nextPendingIntent = PendingIntent.getBroadcast(context, 0, nextIntent, PendingIntent.FLAG_IMMUTABLE);
        views.setOnClickPendingIntent(R.id.btn_next, nextPendingIntent);

        manager.updateAppWidget(appWidgetId, views);
    }

    private void scheduleNextUpdate(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, HadisWidgetProvider.class);
        intent.setAction(ACTION_NEXT);
        PendingIntent pendingIntent = PendingIntent.getBroadcast(context, 0, intent, PendingIntent.FLAG_IMMUTABLE);
        alarmManager.cancel(pendingIntent);
        alarmManager.setRepeating(
            AlarmManager.ELAPSED_REALTIME,
            SystemClock.elapsedRealtime() + UPDATE_INTERVAL,
            UPDATE_INTERVAL,
            pendingIntent
        );
    }
}
