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

    @Override
    public void onUpdate(Context context, AppWidgetManager manager, int[] ids) {
        for (int id : ids) {
            updateWidget(context, manager, id);
        }
        setAlarm(context);
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
        if (ACTION_NEXT.equals(intent.getAction())) {
            nextHadis(context);
        }
    }

    @Override
    public void onEnabled(Context context) {
        super.onEnabled(context);
        setAlarm(context);
    }

    @Override
    public void onDisabled(Context context) {
        super.onDisabled(context);
        cancelAlarm(context);
    }

    private void nextHadis(Context context) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        int old = prefs.getInt(KEY_INDEX, 0);
        int next = HadisData.getRandomIndex();
        while (next == old && HadisData.getCount() > 1) {
            next = HadisData.getRandomIndex();
        }
        prefs.edit().putInt(KEY_INDEX, next).apply();

        AppWidgetManager manager = AppWidgetManager.getInstance(context);
        int[] ids = manager.getAppWidgetIds(new ComponentName(context, HadisWidgetProvider.class));
        for (int id : ids) {
            updateWidget(context, manager, id);
        }
    }

    private void updateWidget(Context context, AppWidgetManager manager, int widgetId) {
        SharedPreferences prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE);
        int index = prefs.getInt(KEY_INDEX, 0);
        if (index >= HadisData.getCount()) {
            index = 0;
            prefs.edit().putInt(KEY_INDEX, 0).apply();
        }

        RemoteViews views = new RemoteViews(context.getPackageName(), R.layout.widget_layout);

        views.setTextViewText(R.id.hadis_text, HadisData.getText(index));
        views.setTextViewText(R.id.source, HadisData.getSource(index));
        views.setTextViewText(R.id.ravi, HadisData.getNarrator(index));
        views.setTextViewText(R.id.badge, HadisData.getBadgeText(index));
        views.setTextViewText(R.id.counter, (index + 1) + " / " + HadisData.getCount());

        if (HadisData.isHadis(index)) {
            views.setInt(R.id.badge, "setBackgroundResource", R.drawable.badge_hadis);
            views.setTextColor(R.id.badge, 0xFF7DCEA0);
        } else {
            views.setInt(R.id.badge, "setBackgroundResource", R.drawable.badge_hikmet);
            views.setTextColor(R.id.badge, 0xFFD4B872);
        }

        Intent intent = new Intent(context, HadisWidgetProvider.class);
        intent.setAction(ACTION_NEXT);
        PendingIntent pi = PendingIntent.getBroadcast(context, 0, intent,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        views.setOnClickPendingIntent(R.id.btn_next, pi);

        manager.updateAppWidget(widgetId, views);
    }

    private void setAlarm(Context context) {
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, HadisWidgetProvider.class);
        intent.setAction(ACTION_NEXT);
        PendingIntent pi = PendingIntent.getBroadcast(context, 1, intent,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        am.setRepeating(AlarmManager.ELAPSED_REALTIME,
                SystemClock.elapsedRealtime() + 300000, 300000, pi);
    }

    private void cancelAlarm(Context context) {
        AlarmManager am = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context, HadisWidgetProvider.class);
        intent.setAction(ACTION_NEXT);
        PendingIntent pi = PendingIntent.getBroadcast(context, 1, intent,
                PendingIntent.FLAG_UPDATE_CURRENT | PendingIntent.FLAG_IMMUTABLE);
        am.cancel(pi);
    }
}
