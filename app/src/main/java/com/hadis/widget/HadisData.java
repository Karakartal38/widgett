package com.hadis.widget;

import java.util.Random;

public class HadisData {

    private static final Random random = new Random();

    // Format: text | source | narrator | type (h=hadis, k=hikmet)
    private static final String[][] ENTRIES = {
        {"Ameller niyetlere göredir. Herkese niyet ettiğinin karşılığı vardır. Kim Allah'a ve Resûlüne hicret etmişse, onun hicreti Allah'a ve Resûlünedir.", "Buhârî, Müslim", "Hz. Ömer (r.a.)", "h"},
        {"Sizden biriniz, kendisi için sevip istediği şeyi din kardeşi için de sevip istemedikçe gerçek anlamda iman etmiş olmaz.", "Buhârî, Müslim", "Hz. Enes (r.a.)", "h"},
        {"Müslüman, elinden ve dilinden diğer Müslümanların güvende olduğu kimsedir.", "Buhârî, Müslim", "Hz. Abdullah b. Amr (r.a.)", "h"},
        {"Allah'a ve ahiret gününe iman eden kimse ya hayır söylesin ya da sussun. Allah'a ve ahiret gününe iman eden kimse komşusuna ikram etsin.", "Buhârî, Müslim", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Kolaylaştırınız, zorlaştırmayınız; müjdeleyiniz, nefret ettirmeyiniz.", "Buhârî", "Hz. Enes (r.a.)", "h"},
        {"İnsanlara merhamet etmeyene Allah da merhamet etmez. Yeryüzündekilere merhamet ediniz ki gökyüzündekiler de size merhamet etsin.", "Buhârî, Tirmizî", "Hz. Cerîr b. Abdullah (r.a.)", "h"},
        {"Kuvvetli kimse güreşte başkalarını yenen değil, öfke anında kendine hâkim olandır.", "Buhârî, Müslim", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Temizlik imanın yarısıdır. Namaz bir nurdur, sadaka bir burhandır, sabır bir ziyadır.", "Müslim", "Hz. Ebû Mâlik (r.a.)", "h"},
        {"Kim bir müminin dünya sıkıntılarından birini giderirse, Allah da onun kıyamet günü sıkıntılarından birini giderir. Kul, kardeşinin yardımında olduğu müddetçe Allah da kulun yardımındadır.", "Müslim", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Allah sizin dış görünüşünüze ve mallarınıza değil, kalplerinize ve amellerinize bakar.", "Müslim", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"İnsanların en hayırlısı, insanlara en çok faydalı olandır.", "Taberânî", "Hz. Câbir (r.a.)", "h"},
        {"Dünyada sanki bir garip veya bir yolcu gibi ol. Sağlığından hastalığın için, hayatından da ölümün için bir şeyler hazırla.", "Buhârî", "Hz. Abdullah b. Ömer (r.a.)", "h"},
        {"İlim öğrenmek kadın erkek her Müslümana farzdır.", "İbn Mâce", "Hz. Enes (r.a.)", "h"},
        {"Güler yüzle kardeşini karşılaman da bir sadakadır. Yolunu kaybeden kimseye yol göstermen sadakadır.", "Tirmizî", "Hz. Ebû Zer (r.a.)", "h"},
        {"Doğruluktan ayrılmayın! Çünkü doğruluk iyiliğe, iyilik de cennete götürür. Yalandan sakının!", "Buhârî, Müslim", "Hz. Abdullah b. Mes'ûd (r.a.)", "h"},
        {"Birbirinizi sevmedikçe cennete giremezsiniz. Aranızda selâmı yayınız.", "Müslim", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Komşusu açken tok yatan bizden değildir.", "Hâkim", "Hz. Enes (r.a.)", "h"},
        {"Ayık olun, insanda bir et parçası vardır. O iyi olunca bütün duygular güzelleşir. İşte o et parçası kalptir.", "Buhârî, Müslim", "Hz. Nu'mân b. Beşîr (r.a.)", "h"},
        {"Müminin durumu ne hoştur! Başına sevinecek bir hal gelirse şükreder, sıkıntı gelirse sabreder. Her ikisi de onun için hayırdır.", "Müslim", "Hz. Suheyb (r.a.)", "h"},
        {"Sabır, acı bir olayın ilk anında gösterilendir. Asıl meziyet, musibete ilk çarptığında Allah'a sığınabilmektir.", "Buhârî, Müslim", "Hz. Enes (r.a.)", "h"},
        {"Haset etmekten sakının. Çünkü haset, ateşin odunu yakıp bitirdiği gibi sevapları yer bitirir.", "Ebû Dâvûd", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Cennet anaların ayakları altındadır.", "Nesâî", "Hz. Enes (r.a.)", "h"},
        {"Her iyilik bir sadakadır. Güzel söz sadakadır.", "Buhârî", "Hz. Câbir (r.a.)", "h"},
        {"Mümin bir delikten iki kere ısırılmaz.", "Buhârî, Müslim", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Güçlü mümin, Allah katında zayıf müminden daha hayırlı ve daha sevimlidir. Sana fayda veren şeye gayret et ve Allah'tan yardım iste.", "Müslim", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Allah sevdiği kimseyi üzmez; ama tecrübe için bazı belâ verir. Her belâ bir iyiliğin öncüsüdür.", "Tirmizî", "Hz. Enes (r.a.)", "h"},
        {"Haksızlık karşısında susan dilsiz şeytandır.", "Beyhakî", "Hz. Ebû Saîd (r.a.)", "h"},
        {"İki günü eşit geçen ziyandadır.", "Deylemî", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Cömert kimse Allah'a yakın, cennete yakın, insanlara yakın ve cehennemden uzaktır.", "Tirmizî", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Öfkelendiğinde ayaktaysan otur, oturuyorsan yat. Çünkü öfke şeytandandır.", "Ebû Dâvûd", "Hz. Ebû Zer (r.a.)", "h"},
        {"Ey insanoğlu, iyiliğim sana daima inmekte; ama senin de kötülüklerin bana gelmekte.", "Hadis-i Kudsî", "Hadis-i Kudsî", "h"},
        {"Mümin müminin aynasıdır; mümin müminin kardeşidir. Onun geçimini korur ve her yönden onu gözetir.", "Ebû Dâvûd, Tirmizî", "Hz. Ebû Hüreyre (r.a.)", "h"},
        {"Allah yavaş hareket edip de işini sağlam yapanı sever. Acele şeytandan, teenni ise Allah'tandır.", "Beyhakî, Tirmizî", "Hz. Âişe (r.anhâ)", "h"},
        {"İşlerinizi gizli tutarak yürütmeye gayret ediniz. Zira her nimet sahibine haset edilir.", "Taberânî", "Hz. Muâz b. Cebel (r.a.)", "h"},
        {"Din nasihattir. Allah'a, Kitabına, Peygamberine ve bütün Müslümanlara karşı nasihattir.", "Müslim", "Hz. Temîm ed-Dârî (r.a.)", "h"},
        // ===== Fethü'r-Rabbânî Hikmetleri =====
        {"Kader başa geldiği zaman gönderene kafa tutmak, inancı öldürür. İman sahibinin bildiği tek şey: Hoş geldi, safalar getirdi… diye karşılamaktır.", "Fethü'r-Rabbânî, 1. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Kalplerinizi ıslâh etmeye çalışın. Kalp, şu bünye kafesinde bir kuş gibidir. Bakılacak şey, kafes değil, içindeki kuştur.", "Fethü'r-Rabbânî, 1. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Geliniz, varlığımızı bir yana atarak O'na koşalım. Biraz zahmet çeksen, O'na vardıktan sonra hepsi geçip gider.", "Fethü'r-Rabbânî, 1. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Yalnız kaldığın zaman, seni kötü işten koruyacak duyguya muhtaçsın. Hakk'ın her an seni kontrol ettiğini içinden sezmelisin.", "Fethü'r-Rabbânî, 1. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Allah'a kul olduğunu iddia ediyorsun, ibadet ederken de kalbinde başkasını saklıyorsun. Kapı önünde tevhid, içeri girince de şirk! Yakışır mı?", "Fethü'r-Rabbânî, 1. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Dünyada O'nunla sohbet istiyorsan sessiz ol. Allah'ın sevgili kulları edeplidir. Attıkları her adım, açık izne bağlıdır.", "Fethü'r-Rabbânî, 4. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Ölümü düşün, âfetlere sabırla karşı koy, Allah'a tevekkül et. Ölümü düşünürsen hırsın yok olur. Sabırlı olursan her murada erersin.", "Fethü'r-Rabbânî, 5. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"İhlâs yolunu tut. En büyük şey odur. İhlâs sahibinin şahı ruhunda yaşar. İçini dışını bir eden var mı?", "Fethü'r-Rabbânî, 5. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Sabırlı olun, içinde bulunduğunuz dünya, âfet ve musibet doludur. Sabır başarıya ulaştırır, yardımı bol eder.", "Fethü'r-Rabbânî, 7. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"İsyan hastalığına çare, itaattir. Zulmü, adalet yıkar. Hata bir hastalıktır; ilâcı ise doğruluktur.", "Fethü'r-Rabbânî, 9. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Hak'la yalnızlığın temiz olursa için ürperir, kalbin parlar. Dünyalık işleri düşünmek, insanın iç âlemini kapkara eder.", "Fethü'r-Rabbânî, 5. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Tevbe etmek iş değil; asıl iş onu bozmamaktadır. Bir ağacı dikmek marifet değil, asıl marifet meyvesini almaktır.", "Fethü'r-Rabbânî, 5. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Bütün ömrünü dünyalığa veriyorsun. Herkesin kısmeti yıllarca önce hazırlanmış. İstesen de gelir, istemesen de. Neden dünya için hüzün duyarsın?", "Fethü'r-Rabbânî, 5. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Doğru olarak Allah'tan utanın. Ömrünüz geçmekte, zamanınız tükenmekte… Kalbinize sahip olun. Dışınız dünyayı yapsın, kalbiniz Allah ile olsun.", "Fethü'r-Rabbânî, 4. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Dünyalık toplarken dikkatli ol. Gece odun toplayan gibi olma. Elini attığın zaman, neyi alacağını önceden kestirmelisin. Ayık ol!", "Fethü'r-Rabbânî, 4. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Hak'la çekişme. Malın azaldı diye O'nu itham etme. Suçu evvelâ kendinde ara. En büyük hüküm, senin mi olmalı, yoksa O'nun mu?", "Fethü'r-Rabbânî, 4. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Bir eline dünyayı, öbür eline de âhireti al. Aralarından çık. Mevlâ'na yönel. Kalbin çıplak olsun.", "Fethü'r-Rabbânî, 1. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Allah yolcularının hâli ne kadar hoştur. Onlar, marifet şarabını içmişlerdir. Hakk'ın lütuf kucağında yatarlar.", "Fethü'r-Rabbânî, 15. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Bildiklerinle amel etmek, seni Hakk'a götürür. İlmiyle âmil olanlar, Peygamber Efendimizin vârisleridir.", "Fethü'r-Rabbânî, 3. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Şerli adamlarla konuşma. Onlarla oturan bir gün gelir kötü olur. Kur'ân-ı Kerîm'in gölgesinde yürü, Sünnet-i Resûlüllah'a uy.", "Fethü'r-Rabbânî, 4. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Gayretin yemek, içmek olmasın. Çünkü hepsi nefsin arzularıdır. Bütün gayretin en çok lâzım olana olmalı. O en lüzumlu olan ise Allah'tır.", "Fethü'r-Rabbânî, 1. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Cenâb-ı Hakk'a en yakın olan kimse, güzel ahlâkla huyunu genişletip süsleyen kimsedir.", "Fethü'r-Rabbânî, Tarikat", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"Ruhunu temiz tutmaya gayret et. O kudret eli, bir gün sana da gelir; kolundan tutar, velayet makamına yerleştirir.", "Fethü'r-Rabbânî, 5. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"İman sahibi, yalnız Allah'tan korkar. Kalbi Hakk'ta, kalıbı ise yerdedir.", "Fethü'r-Rabbânî, 11. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
        {"İman sahibi, bir yolcu gibidir. Burada az zaman kalacağını bilir. Çalışır, kazanır, ama içten Mevlâ ile olur.", "Fethü'r-Rabbânî, 15. Sohbet", "Abdülkâdir Geylânî (k.s.)", "k"},
    };

    public static int getCount() {
        return ENTRIES.length;
    }

    public static String getText(int index) {
        return ENTRIES[index][0];
    }

    public static String getSource(int index) {
        return ENTRIES[index][1];
    }

    public static String getNarrator(int index) {
        return "— " + ENTRIES[index][2];
    }

    public static boolean isHadis(int index) {
        return ENTRIES[index][3].equals("h");
    }

    public static String getBadgeText(int index) {
        return isHadis(index) ? "Hadis-i Şerif" : "Fethü'r-Rabbânî";
    }

    public static int getRandomIndex() {
        return random.nextInt(ENTRIES.length);
    }
}
