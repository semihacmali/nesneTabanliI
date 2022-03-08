package Hafta2;

import java.util.Locale;

public class stringCalismasi {

    public static void main(String[] args) {
        int sayi = 1;
        String ad = "Semih"; // Javada String bir classtir

        String ilk = "Java";
        String ikinci = "Python";
        String ucuncu = "R Programming Language";

/*
        // String in uzunlugunu bulma
        // Uzunluk bilgisi int türünde gelir
        int uzun = ilk.length();
        System.out.println("İlk Stringin Uzunlugu : " + ilk.length());
        System.out.println("İkinci Stringin Uzunlugu : " + ikinci.length());
        System.out.println("Ucuncu Stringin Uzunlugu : " + ucuncu.length());

*/
        /*
        //İki Stringi birlestirme
        String birlesik = ilk + ikinci;
        System.out.println("Concatsiz Birlestirme : " + birlesik);

        // ilk Stringinin sonuna ikinciyi ekleme fonksiyonu
        String birlesik1 = ilk.concat(ikinci);
        System.out.println("Concatli Birlestirme : " + birlesik1);

        //ikiden fazla String birlestirme
        String coklubirlesik = ilk + ikinci + ucuncu;
        System.out.println("Joinsiz Birlestirme : " + coklubirlesik);

        //String classinin icindeki join fonksiyonu;
        //İlk ifade olarak ayraci girmenizi ister daha sonra ise
        //istenilen kadar String ifadeyi girmeniz gerekir ve bunlari birlestirir
        String coklubirlesik1 = String.join(" ", ilk, ikinci, ucuncu);
        System.out.println("Joinli Birlestirme : " + coklubirlesik1 );
        */
/*
        //Boolean degisken turu;
        //Evet-Hayir, 0-1, true-false(dogru-yanlis) sadece bu degerleri alir
        boolean deneme = false;



        String language1 = "java programming";
        String language2 = "java programming";
        String language3 = "java pRogramming";

        language1 = "Python Programming"; // degiskenin degerini degistirme islemi

        //Iki String i karsilastirma(Compare)
        //equals fonk bir nesne(object) tarafindan cagirilir ve
        //parantez icindeki nesne ile karsilastirma yapar
        boolean result1 = language1.equals(language2);
        System.out.println("Language1 ve Language2 aynı mı : " + result1);

        boolean result2 = language2.equals(language3);
        System.out.println("Language1 ve Language3 aynı mı : " + result2);


        //toLowerCase() - Stringin butun karakterlerini kucuk harf yapar
        //toUpperCase() - Stringin butun karakterlerini buyuk harf yapar

        System.out.println("Buyuk Harfe Yazdirma : " + language3.toUpperCase());
        System.out.println("Kucuk Harfe Yazirma : " + language3.toLowerCase());

        //Girilen String büyük harf veya kucuk harf olmasi yazilimimiz icin
        //ayirt edici bir ozellik olmasin ama String degistirmeyelim
        //boolean result2 = language2.equals(language3);
        boolean result3 = language2.toLowerCase().equals(language3.toLowerCase());
        System.out.println("Language2 ve Language3 aynı mı : " + result3);

        System.out.println("Language2 : " + language2);
        System.out.println("Language3 : " + language3);
        */

/*
        String bolunecek = "Nesne Tabanli Programlama"; // N '0'. ifade; a ise '24'. ifade

        System.out.println(bolunecek.length());

        //baslangic index i yazilir, istenilen yerin bir fazlasi bitis index i olarak yazilir
        System.out.println("SubString Ciktisi : " + bolunecek.substring(6, 13)); //Tabanli

        //eger bitis verilmezse String sonuna kadar alinir
        System.out.println("SubString Ciktisi : " + bolunecek.substring(14));

*/

/*
        //Bir String de belli bir String yerine başka bir String yazma islemi - replace

        ad = "Enes Sahbudak";

        String ad1 = ad.replace("S", "Ş");
        System.out.println("Degistirilmis İsim : " + ad1);

        String ad2 = ad.replace("Sahb", "B");
        System.out.println("Degistirilmis İsim : " + ad2);

        String ad3 = ad.replace(" ", " Arda "); // Enes Arda Sahbudak
        System.out.println("Degistirilmis İsim : " + ad3);

*/

/*
        //dizi ornegi

        String[] dizi = {"Semih", "Arda", "Aykan"};

        System.out.println(dizi[2] + dizi[1] + dizi[0]);

        // Belli bir String i belli bir ifadeye göre ayirma
        String metin = "Yüksek İhtisas Üniversitesi Meslek " +
                "Yüksekokulu Bilgisayar Programciligi Programi";

        String[] sonuc = metin.split(" ");

        for(int i = 0; i < sonuc.length; i++){
            System.out.println("Metinin " + i + ".elemani : " + sonuc[i]);
        }
*/

        //Belli bir String in belli bir baska String i icerip icermedigini kontrol etme

        String isim = "Emir Can Aydın";

        System.out.println("isim Stringin icinde \"an\" Kelimesi var mı :  " + isim.contains("an"));








    }
}
