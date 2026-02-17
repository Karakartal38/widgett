package com.hadis.widget;

import java.util.Random;

public class HadisData {

    private static final Random random = new Random();

    private static final String[][] ENTRIES = {
        {"Geliniz, varligimizi bir yana atarak O'na kosalim. Bu yolda biraz da perisanlik cekelim. Halk bizi rezil gorsunn. Ne cikar! Biraz zahmet ceksen, O'na vardiktan sonra hepsi gecip gider. Icimize ve disimiza sultan kesilen nefsimizi Hak yoluna cevirelim.", "Fethur-Rabbani, 1. Sohbet"},
        {"Yalniz kaldigin zaman, seni kotu isten koruyacak duyguya muhtacsin. Ayak kaymasini onleyecek tedbirin olmali. Hakk'in her an seni kontrol ettigini icinden sezmelisin. Bu dusunceler varligini sarmali. Benligini bu ogutlerle donattiktan sonra nefisle cenge cikman kabil olur.", "Fethur-Rabbani, 1. Sohbet"},
        {"Hepinizin kalbi olu, oldurdunuz kalbinizi. Yaptiginiz hatalar onu perisan etti. Nefsinizi dirilttiniz. Kalp, halki aradan birakinca dirilige erer, Hak'la olur ve hayata kavusur. Hak'la olmak, emrine uymak demektir. Sozumuzun manasini kavramaniz gerek.", "Fethur-Rabbani, 3. Sohbet"},
        {"Ey evlad! Dunyalik toplarken dikkatli ol. Dikkati elden birakma. Gece odun toplayan gibi olma. Elini attigin zaman, neyi alacagini onceden kestirmelisin. Gece odun toplayan eline gireni bilmez. Seni de ona benzetiyorum. Ayik ol; sonra felaketin azim olur.", "Fethur-Rabbani, 4. Sohbet"},
        {"Hak'la cekisme. Nefsin icin onu kotuleme. Malin azaldi diye O'nu itham etme. Sucu evvela kendinde ara. Allah'a emir mi vereceksin? Bunu yapmaktan utanmaz misin? Her is senin keyfine gore olsun, istiyorsun. En buyuk hukum, senin mi olmali, yoksa O'nun mu?", "Fethur-Rabbani, 4. Sohbet"},
        {"Dunyada O'nunla sohbet istiyorsan sessiz ol. Sakin ve sessiz ol. Allah'in sevgili kullari edeplidir. O'nun gozunde en buyuk edep gereklerini yerine getirirler. Attiklari her adim, acik izne baglidir. Kalplerini hos etmeyecek hicbir ise yakin durmazlar.", "Fethur-Rabbani, 4. Sohbet"},
        {"Ey hasta! Hastaliginin gecmesini mutlak olarak isteme. Afiyetin her zaman yararli olacagini sana kim dedi? Simdi hastasin, imanin var; saglam olunca bu imani kaybetmeyecegini kim temin eder? Dunyaliga dalar, Allah'i, Peygamberi unutursun. Akilli ol; her olur olmaz seyin pesine kosma.", "Fethur-Rabbani, 3. Sohbet"},
        {"Sabirli olun, icinde bulundugunuz dunya, afet ve musibet doludur. Sabredin, cunku sabir basariya ulastirir, yardimi bol eder. Siz sabra devam ettikce her an yardiminiz O olur. Kadere riza gostermeyen, gelen belaya kizanin hali harap olur.", "Fethur-Rabbani, 7. Sohbet"},
        {"Dogruluk kanatlarin boyle acilir, gelisir. Kalp gozlerin de gormeye baslar. Varligin genisler, Ilahi bilginin boslugunda ucmaya baslarsin. Sarki, garbi, denizi, deryayi gezersin. Semaya yukselirsin, yere iner, sessiz gezersin. Cunku himmetin yucedir. Arkadasin buyuktur.", "Fethur-Rabbani, 8. Sohbet"},
        {"Ey evlad! Allah'in hilmine guvenme. O'nun tutusu sedittir. Bir tutarsa yikilirsin. Su cahil bilginler seni aldatmasin. Onlarin cumle bilgileri aleyhlerine cikar. Allah'in hukumlerini bilirler; o varlik sahibinin zatindan tamamen gafil gezerler.", "Fethur-Rabbani, 9. Sohbet"},
        {"Sen Hakk'i aradigini soyluyorsun; halbuki, halki ariyorsun. Ben Mekke'ye gidiyorum deyip Horasan yolunu tutana benziyorsun. Horasan'a yakin oldukca Mekke'den uzak kalirsin. Ic alemin temiz oldugunu soyluyorsun; fakat onlardan hem korkuyor hem de bir seyler bekliyorsun.", "Fethur-Rabbani, 10. Sohbet"},
        {"Ibadet bir sanattir; onu yapanlar, Allah'in sevgili kullaridir. Varligini Hak varligina katanlar ve O'ndan baska seyi gormeyenler... Farzet, halkin teveccuhu sana geldi; olum aninda neye yarar? Olum aninda aranizda ucurumlar olur. Seni kurtaramazlar.", "Fethur-Rabbani, 11. Sohbet"},
        {"Ey Allah'in kullari, nefsinizi O'na teslim ediniz. Soyliyiniz: Nefis, mal, cennet senin olsun. Bize Zatini ver. Baskasini istemiyoruz. Bize ev verirsin, icinde Sen olmayinca neyleriz? Yola ciktigimizda, yol arkadasimiz Sen olmadiktan sonra yolculugu ne yapariz?", "Fethur-Rabbani, 12. Sohbet"},
        {"Sizde nifak cogaldi; ihlas azaldi. Sozler cok, fakat onlara uygun is yok. Isi olmayan soz, hicbir seye yaramaz. Sahibine felaket getirir. Onune is gelmeyen soz, kapisiz eve benzer; merdivensiz binadir. Icinden iyilik gecmeyen hazineye benzer. Amelsiz soz, kuru davadan ibarettir.", "Fethur-Rabbani, 20. Sohbet"},
        {"Irfan sahiplerine uyunuz. Onlarla arkadas olunuz. Onlarin hali baskadir; sizinkine benzemez. Bilirler, is tutarlar. Halka dilencilik icin degil, nasihat icin kosarlar. Kalbinizi Hakk'a cevirmekten baska gayeleri yoktur. Kalp yuzlerini Hakk'a cevirmislerdir.", "Fethur-Rabbani, 22. Sohbet"},
        {"Musibetleri sakli tutmak, Ars hazinelerinden birine sahip olmak kadar buyuktur. Derdini Hakk'a soyleyecegine halka anlatiyor, onlardan medet umuyorsun. Halbuki senin derdine deva verecek olan yalniz Hak'tir.", "Fethur-Rabbani, 26. Sohbet"},
        {"Veli kullarin kimi dunyada, kimi ahirette Hakk'a kavusur. Kalp ve sir alemi ile dunyada Hakk'a vasil olan azdir. Kavusan rahat ve huzura erer. Ama onceleri, aglamakla sizlamakla gecer. Allah yolcularinin darligi gecmez. Sancilari dinmez. Ta Hak Teala'ya kavusuncaya kadar.", "Fethur-Rabbani, 28. Sohbet"},
        {"Bu veraset peygamberlerin yoluna giden ve ilmi ile amil olan her iman sahibine nasip olur. Bu hale ermek yalniz dis ilimle olmaz. Ona bir ic eklemek lazim olur. Senetsiz dava ispat edilemez. Amelsiz ilmin yarari olmaz. Ilim ameli cagirir; icabet ederse pekala, aksi halde gider.", "Fethur-Rabbani, 30. Sohbet"},
        {"Kadere senin hukmun gecmez. Sana dusen, duygularinin kontroludur. Niyetin temiz olmalidir. Halkin korkusu ile nefsini bagladin. Onlardan bekledigin seyle is tutmaktan kaldin. Onlarin bagini nefsinin ayagindan coz. Onu Yaratici'nin hizmetine kaldir.", "Fethur-Rabbani, 32. Sohbet"},
        {"Hak Teala'ya ve kullarina karsi edebinizi takininiz! Isinize yaramayan laflari bir yana atiniz. Bir zat soyle der: Geziyordum, bir genc gordum; yer kaziyordu. Ona bu agir isi birak dedim. Bu sozumun cezasini cok agir odedim. Alti ay gece namazina kalkamadim.", "Fethur-Rabbani, 33. Sohbet"},
        {"Bir kul, dustugu darlik halinde sabir yolunu tutarsa, karanlik yollara cira ile girerse, darligi genislige cevrilir. Hata karanligini ibadet lambasi aydinlatir. Rahmet nazari o kula gelir. Nasibi ummadigi yollardan verilir. Yusuf Peygamber sabirla o buyuk devlete kavustu.", "Fethur-Rabbani, 35. Sohbet"},
        {"Butun esya, ilahi kuvvetle hareket eder ve ayni kuvvetle sukunet bulur. Bir kula bunu anlamak nasip olursa, hic bir sey zor degildir. Her seyin ardindaki kudreti gorunce hayret eder ve sukut eder. Bu sukut, bilgisizlik degil, tam bilgidir.", "Fethur-Rabbani, 41. Sohbet"},
        {"Nefsini cihad potasinda erit. O, ancak varligi eridikten sonra kalbin arzularina boyun eger. Nefisle olan cihad, dis alemdekinden daha zordur. Nefis butun arzularindan kesilir. Sonra tek yol acilir. O da Allah'in emri yolu. Bu, onun doymak bilmeyen hirsini tatmin edemiyor.", "Fethur-Rabbani, 42. Sohbet"},
        {"Kotuluge karsi kendinizi daimi oruca alistiriniz. Oz varliginizi daimi namaza, eksiksiz ve kesintisiz huzura alistiriniz. Sabri hicbir zaman elden birakmayiniz. Nefsinizi boylece eziniz. Bir kula nefsi bos arzudan almak nasip olunca, Mevla'sini o dem bulur.", "Fethur-Rabbani, 49. Sohbet"},
        {"Calis, islerde sen olmayasin; yapan ve eden O ola. Basina kotu hal geldiginde gitmesini isteyen olmayasin. Anlattigim hali benliginde duydugu an Hak sana hizmet edeni gonderir. O'nunla ol! Halin, yikayici onundeki oluye benzesin. Cumle tedbiri birak. O'nun onunde iman ayaginla dur.", "Fethur-Rabbani, 47. Sohbet"},
        {"Mecnun gibi olmalisin. O, kalbinde sevgi yer ettigi zaman halk arasindan cikti. Yalniz olmayi istedi. Halkin ne ovmesini dinledi ne de kotulemesine kulak asti. Sordular: Sen kimsin? Soyledi: Leyla. Neredensin? Leyla. Nereye? Leyla. Baskalarini gozu gormuyordu.", "Fethur-Rabbani, 41. Sohbet"},
        {"Ilim sahibi Hakk'in kapisinda durur. Marifet bilgisi ona verilmistir. Irfan sahibi emirsiz hicbir is gormez. Ver denilirse verir, verme dendi mi kimse ondan bir sey alamaz. Ye denir yer, yeme denirse ac kalir. Yapacagi isleri vicdaninin emri ile yapar.", "Fethur-Rabbani, 45. Sohbet"},
        {"Sebeplerin hakkini ode. Tevekkule dus. Hocana karsi iyi edepli ol; sessiz halin, sozunden cok olsun. Bu hal, ogrenecegi seylerin icin daha yararli olur. Iyi edep seni arzularina yakin kilar, kotu edep ise uzak kilar.", "Fethur-Rabbani, 51. Sohbet"},
        {"Dunyalik elde olur, cepte olur. Iyi ve yararli binalar yapmak icin caiz. Ama onlari kalbe sokmak olmaz. Dunyaligin kalp kapisinda beklemesi olur, ama iceri girmesi asla. Dunyaliktan gecici seyleri kalbin kosesine yerlestirirsen, sende de hayir kalmaz.", "Fethur-Rabbani, 53. Sohbet"},
        {"Imanini kalbine yerlestiren tam mumin, kalbi, sirri ve manasi halktan ayridir. Hakk'in kudreti onunde, gucsuz ve kuvvetsiz olarak serilir. Bu hali bulan iman sahibine her seyden iyilik yagar. Canlari ve baslari ile Hak yola girenlere zahmet verme.", "Fethur-Rabbani, 55. Sohbet"},
        {"Ey evlad! Beni nasil sevmezsin? Seni senin icin isterim; benim icin degil. Su oldurucu ve aldatici dunyanin elinden kurtulmanini dilerim. Daha ne kadar onun ardindan gideceksiniz? Yakinda size donecek ve hesap soracak.", "Fethur-Rabbani, 57. Sohbet"},
        {"Sozumu kabul et; ben, senin yumagini sarmaktayim. Sozlerimi dinle, bana dusmanlik etme. Ben, namazgahinim; pisligini ve kirlerini gidermeye calisirim. Tevbe eder, dini ahkami tasdik edersen, icinde tat bulur, hos olursun. Hayra ve selamete erersin.", "Fethur-Rabbani, 59. Sohbet"},
        {"Ici bozuk adamin sesi dilden gelir; iman sahibinin sozu ise kalpten. Iman sahibinin kalbi, Yaratan'in kapisinda durur, sirri ise ondan iceride. Bir kalp ki hem Hakk'i hem de halki sever; o sihhat bulamaz. Kalp, Hak sevgisi ile dolar, dis yuzunu halka yoneltirse, o olur.", "Fethur-Rabbani, 61. Sohbet"},
        {"Iman sahipleri senden nur almaya, imanlarini canlandirmaya kosarlar. Sozun tutulur. Belanin gelmesine uzulup onunla mesgul olma. Bunlar imanin yerlesmesini saglar. Marifet halini gelistirir. Sonunda da selamet gelir. Peygamberlerin yolunda yurumus olursun.", "Fethur-Rabbani, 64. Sohbet"},
        {"Marifet sahibinin zahirde yaptigi isler, ic alemindeki islere nisbetle bir zerre sayilir. Duygulari sakindir, ama kalbi daima hareket eder. Bas gozu uyur, kalp gozu uyumaz. Uyur, ama kalbi isleri gorur, Hakk'i anar. Elinde tesbih oldugu halde uyur, uyandigi zaman onu yine cevrilirken gorurmus.", "Fethur-Rabbani, 68. Sohbet"},
        {"Ey ahiret yoluna koyulan, o yola daha once girenleri delil tut. Onder zatin cocugu ol, ona uy. Butun yukunu onun onune dok. Onunla yola koyul. Bazen saginda, bazen solunda, bazen gerisinde yola devam et. Sakin onun gorusu disina cikma. Boyle yaparsan, maksuduna kavusursun.", "Fethur-Rabbani, 70. Sohbet"},
        {"Iman ki yakin derecesine cikar, yakin ki marifet halini alir, marifet ki ilim olur: Iste o zaman Hak'dan guzellikler gelir ve sen diledigini yapar olursun. Zengin kisilerden mal alir, fakirlere dagitirsin. Kalp ve sir elinle riziklar tasimaya baslarsin.", "Fethur-Rabbani, 68. Sohbet"},
        {"Bir kimse ki Allah icin tevazu eder, Allah onu yukseltir. Kibir yolunu tutan dusurulur. Azla yetinene cok gelir. Zillet halini sabirla karsilayana izzet gelir. Bulundugun hale razi ol, islerin aniden degisir. Verilmiyor diye bagirirsan, verilince utanirsin.", "Fethur-Rabbani, 59. Sohbet"},
        {"Nefsin yuzune gulme. Sana bin kelime soz etse ancak birine cevap ver. Nefis maddi arzulara dair bir sey dilerse iptal et. Istegini tehir eyle. Nefse arzusunun yerine gelmemesi aci gelir. Bu aciya dayanirsa iyilik bulur. Sabirla nefsi sabra yoneltmeye cabalarsan Ilahi tecellilere mazhar olursun.", "Fethur-Rabbani, 42. Sohbet"},
        {"Hak Teala sevdigi kulunun safiyetini artirmak icin onu imtihan eder. O kullar ebedi bir cekinme ayagi ustunde dururlar. En cok korktulari sey, hallerinin kotuluge cevrilmesidir. Iman sahibi, ancak ihlas yolu ile Hakk'a vasil olabilir.", "Fethur-Rabbani, 49. Sohbet"},
        {"Yalanci olma. Sana iki kalp verilmedi. Sinen bir kalp tasir. O bir seyle dolunca ikincisi sigmaz. Allah soyle buyurur: Allah bir kisinin sine bosluguna iki kalp yerlestirmedi. Bir kalp ki hem Hakk'i hem de halki sever, o sihhat bulamaz.", "Fethur-Rabbani, 61. Sohbet"},
        {"Halk onlarin emri altindadir. O buyuklerin her biri kendi capinda bir idarecidir. Bunlar, aklin otesinden gelen emirle olur. O buyukler halk icin birer doktor sayilir. Hakiki varligi sezemeyen herkes birer hastadir. Kendini az hasta sayan onlarin pesine kosmalidir.", "Fethur-Rabbani, 9. Sohbet"},
        {"Sizin cogunuz, Hakk'in nurundan, islamin ruhundan mahrum ve onlara karsi perdelenmis. Islam iddiasini yapar, ama onun hakikatinden haberi yoktur. Yaziklar olsun, Islamin yalniz ismi size ne fayda saglar ki, onun adi ile yetinirsiniz. Disaridan sartlarini yerine getirmeye gayret edersiniz, ama hakikatini asla.", "Fethur-Rabbani, 72. Sohbet"},
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
        return "Abdulkadir Geylani (k.s.)";
    }

    public static boolean isHadis(int index) {
        return false;
    }

    public static String getBadgeText(int index) {
        return "Fethur-Rabbani";
    }

    public static int getRandomIndex() {
        return random.nextInt(ENTRIES.length);
    }
}
