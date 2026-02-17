package com.hadis.widget;

import java.util.Random;

public class HadisData {

    private static final Random random = new Random();

    private static final String[][] ENTRIES = {
        {"Ameller niyetlere goredir. Herkese niyet ettigi seyin karsiligi vardir.", "Buhari, Muslim", "Hz. Omer (r.a.)", "h"},
        {"Sizden biriniz, kendisi icin sevip istedigi seyi din kardesi icin de sevip istemedikce gercek anlamda iman etmis olmaz.", "Buhari, Muslim", "Hz. Enes (r.a.)", "h"},
        {"Muslim, elinden ve dilinden diger Muslumanlarin guvende oldugu kimsedir.", "Buhari, Muslim", "Hz. Abdullah b. Amr (r.a.)", "h"},
        {"Allah'a ve ahiret gunune iman eden kimse ya hayir soylesin ya da sussun.", "Buhari, Muslim", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Kolaylastiriniz, zorlastirmayiniz; mujdeleyiniz, nefret ettirmeyiniz.", "Buhari", "Hz. Enes (r.a.)", "h"},
        {"Insanlara merhamet etmeyene Allah da merhamet etmez. Yerdekilere merhamet ediniz ki goktekilere de size merhamet etsin.", "Buhari, Tirmizi", "Hz. Cerir b. Abdullah (r.a.)", "h"},
        {"Kuvvetli kimse gureste baskalirini yenen degil, ofke aninda kendine hakim olandir.", "Buhari, Muslim", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Temizlik imanin yarisidir. Namaz bir nurdur, sadaka bir burhandir, sabir bir ziyadir.", "Muslim", "Hz. Ebu Malik (r.a.)", "h"},
        {"Kim bir muminin dunya sikintilarindan birini giderirse, Allah da onun kiyamet gunu sikintilarindan birini giderir.", "Muslim", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Allah sizin dis gorunusunuze ve mallariniza degil, kalplerinize ve amellerinize bakar.", "Muslim", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Insanlarin en hayirlisi, insanlara en cok faydali olandir.", "Taberani", "Hz. Cabir (r.a.)", "h"},
        {"Dunyada sanki bir garip veya bir yolcu gibi ol. Sagligindan hastaligin icin bir seyler hazirla.", "Buhari", "Hz. Abdullah b. Omer (r.a.)", "h"},
        {"Ilim ogrenmek kadin erkek her Muslumana farzdir.", "Ibn Mace", "Hz. Enes (r.a.)", "h"},
        {"Guler yuzle kardesini karsilaman da bir sadakadir.", "Tirmizi", "Hz. Ebu Zer (r.a.)", "h"},
        {"Dogruluktan ayrilmayin! Cunku dogruluk iyilige, iyilik de cennete goturur.", "Buhari, Muslim", "Hz. Abdullah b. Mesud (r.a.)", "h"},
        {"Birbirinizi sevmedikce cennete giremezsiniz. Araninizda selami yayiniz.", "Muslim", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Komsusu acken tok yatan bizden degildir.", "Hakim", "Hz. Enes (r.a.)", "h"},
        {"Ayik olun, insanda bir et parcasi vardir. O iyi olunca butun duygular guzellesir. Iste o et parcasi kalptir.", "Buhari, Muslim", "Hz. Numan b. Besir (r.a.)", "h"},
        {"Muminin durumu ne hostur! Basina sevinecek bir hal gelirse sukreder, sikinti gelirse sabreder.", "Muslim", "Hz. Suheyb (r.a.)", "h"},
        {"Sabir, aci bir olayin ilk aninda gosterilendir.", "Buhari, Muslim", "Hz. Enes (r.a.)", "h"},
        {"Haset etmekten sakinin. Cunku haset, atesin odunu yakip bitirdigi gibi sevaplari yer bitirir.", "Ebu Davud", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Cennet analarin ayaklari altindadir.", "Nesai", "Hz. Enes (r.a.)", "h"},
        {"Her iyilik bir sadakadir. Guzel soz sadakadir.", "Buhari", "Hz. Cabir (r.a.)", "h"},
        {"Mumin bir delikten iki kere isilmaz.", "Buhari, Muslim", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Guclu mumin, Allah katinda zayif muminden daha hayirli ve daha sevimlidir.", "Muslim", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Haksizlik karsisinda susan dilsiz seytandir.", "Beyhaki", "Hz. Ebu Said (r.a.)", "h"},
        {"Iki gunu esit gecen ziyandadir.", "Deylemi", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Comert kimse Allah'a yakin, cennete yakin, insanlara yakin ve cehennemden uzaktir.", "Tirmizi", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Ofkelendiginde ayaktaysan otur, oturuyorsan yat. Cunku ofke seytandandir.", "Ebu Davud", "Hz. Ebu Zer (r.a.)", "h"},
        {"Mumin muminin aynasidir; mumin muminin kardesidir.", "Ebu Davud, Tirmizi", "Hz. Ebu Hureyre (r.a.)", "h"},
        {"Allah yavas hareket edip de isini saglam yapani sever.", "Beyhaki, Tirmizi", "Hz. Aise (r.anha)", "h"},
        {"Islerinizi gizli tutarak yurutmeye gayret ediniz. Zira her nimet sahibine haset edilir.", "Taberani", "Hz. Muaz b. Cebel (r.a.)", "h"},
        {"Din nasihattir. Allah'a, Kitabina, Peygamberine ve butun Muslumanlara karsi nasihattir.", "Muslim", "Hz. Temim ed-Dari (r.a.)", "h"},
        {"Ey insanoglu, iyiligim sana daima inmekte; ama senin de kotuluklerin bana gelmekte.", "Hadis-i Kudsi", "Hadis-i Kudsi", "h"},
        {"Insanlarin en hayirlisi, omru uzun ve ameli guzel olandir.", "Tirmizi", "Hz. Abdullah b. Busr (r.a.)", "h"},
        // Hikmetler
        {"Kader basa geldigi zaman gonderene kafa tutmak, inanci oldurur. Iman sahibinin bildigi tek sey: Hos geldi, safalar getirdi...", "Fethur-Rabbani, 1. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Kalplerinizi islah etmeye calisin. Kalp, su bunye kafesinde bir kus gibidir. Bakilacak sey, kafes degil, icindeki kustur.", "Fethur-Rabbani, 1. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Geliniz, varligimizi bir yana atarak O'na kosalim. Biraz zahmet ceksen, O'na vardiktan sonra hepsi gecip gider.", "Fethur-Rabbani, 1. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Yalniz kaldigin zaman, seni kotu isten koruyacak duyguya muhtacsin. Hakk'in her an seni kontrol ettigini icinden sezmelisin.", "Fethur-Rabbani, 1. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Allah'a kul oldugunu iddia ediyorsun, ibadet ederken de kalbinde baskasini sakliyorsun. Kapi onunde tevhid, iceri girince de sirk!", "Fethur-Rabbani, 1. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Dunyada O'nunla sohbet istiyorsan sessiz ol. Allah'in sevgili kullari edeplidir.", "Fethur-Rabbani, 4. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Olumu dusun, afetlere sabirla karsi koy, Allah'a tevekkul et. Olumu dusunursen hirsin yok olur.", "Fethur-Rabbani, 5. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Ihlas yolunu tut. En buyuk sey odur. Ihlas sahibinin sahi ruhunda yasar.", "Fethur-Rabbani, 5. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Sabirli olun, icinde bulundugunuz dunya, afet ve musibet doludur. Sabir basariya ulastirir.", "Fethur-Rabbani, 7. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Isyan hastaligina care, itaattir. Zulmu, adalet yikar. Hata bir hastaliktir; ilaci ise dogruluktur.", "Fethur-Rabbani, 9. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Tevbe etmek is degil; asil is onu bozmamaktadir. Bir agaci dikmek marifet degil, asil marifet meyvesini almaktir.", "Fethur-Rabbani, 5. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Butun omrunu dunyaliga veriyorsun. Herkesin kismeti yillarca once hazirlanmis. Neden dunya icin huzun duyarsin?", "Fethur-Rabbani, 5. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Dogru olarak Allah'tan utanin. Omrunuz gecmekte, zamaniniz tukenmekte. Kalbinize sahip olun.", "Fethur-Rabbani, 4. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Dunyelik toplarken dikkatli ol. Gece odun toplayan gibi olma. Ayik ol!", "Fethur-Rabbani, 4. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Bir eline dunyayi, obur eline de ahireti al. Aralarindan cik. Mevla'na yonel. Kalbin ciplak olsun.", "Fethur-Rabbani, 1. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Allah yolcularinin hali ne kadar hostur. Onlar, marifet sarabini icmislerdir.", "Fethur-Rabbani, 15. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Bildiklerinle amel etmek, seni Hakk'a goturur. Ilmiyle amil olanlar, Peygamber Efendimizin varisleridir.", "Fethur-Rabbani, 3. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Serli adamlarla konusma. Onlarla oturan bir gun gelir kotu olur. Kuran'in golgesinde yuru.", "Fethur-Rabbani, 4. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Gayretin yemek, icmek olmasin. Butun gayretin en cok lazim olana olmali. O en luzumlu olan ise Allah'tir.", "Fethur-Rabbani, 1. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Cenab-i Hakk'a en yakin olan kimse, guzel ahlakla huyunu genisletip susleyen kimsedir.", "Fethur-Rabbani, Tarikat", "Abdulkadir Geylani (k.s.)", "k"},
        {"Ruhunu temiz tutmaya gayret et. O kudret eli, bir gun sana da gelir; kolundan tutar.", "Fethur-Rabbani, 5. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Iman sahibi, yalniz Allah'tan korkar. Kalbi Hakk'ta, kalibi ise yerdedir.", "Fethur-Rabbani, 11. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
        {"Iman sahibi, bir yolcu gibidir. Burada az zaman kalacagini bilir. Calisir, kazanir, ama icten Mevla ile olur.", "Fethur-Rabbani, 15. Sohbet", "Abdulkadir Geylani (k.s.)", "k"},
    };

    public static int getCount() {
        return ENTRIES.length;
    }

    public static String getText(int index) {
        return ENTRIES[index % ENTRIES.length][0];
    }

    public static String getSource(int index) {
        return ENTRIES[index % ENTRIES.length][1];
    }

    public static String getNarrator(int index) {
        return ENTRIES[index % ENTRIES.length][2];
    }

    public static boolean isHadis(int index) {
        return ENTRIES[index % ENTRIES.length][3].equals("h");
    }

    public static String getBadgeText(int index) {
        return isHadis(index) ? "Hadis-i Serif" : "Fethur-Rabbani";
    }

    public static int getRandomIndex() {
        return random.nextInt(ENTRIES.length);
    }
}
