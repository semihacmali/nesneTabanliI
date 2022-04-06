package Hafta3;

import java.util.Scanner;

public class Odev {
    public static void main(String[] args) {


        //Odev1
        // Carpim Tablosunu ekrana yazdiracaksiniz.
        /*
        1x1 = 1 \t  1x2 = 2   1x3 = 3   ...... 1x10 = 10
        2x1 = 2 \t  2x2 = 4   2x3 = 6 ........ 2x10 = 20
        ..........................
        .................
        10x1 = 10   10x2 = 20 .............. 10x10 = 100
         */
        //Seklinde yazdirilacak
        //iç ice 2 for-while-doWhile dongusu ile yapilacak

        //Odev2
        int Max = 100;
        int Min = 0;

        int rastgele = (int)(Math.random() * ( Max - Min ));
        //System.out.print(rastgele);

        // Yukaridaki ifade Max ile Min Arasinda rastgele bir tam sayi uretir
        //Sayi Tahmin Oyunu Yapicaksiniz
        /*
        Bilgisayar tarafindan uretilen rasgele sayiyi klavyeden girerek tahmin edeceksiniz
        Sayiyi tahmin ederken mesela girilen sayi uretilen sayidan buyuktur veya kucuktur
        Toplamda 5 farkli tahminde sayiyi bulmaya calisacagiz.
        Eger sayiyi bulursak Tebrikler sayiyi buldunuz sayi ... dir
        sayiyi bulamazsanizda Hakkiniz bitti Sayi .... ydi.
         */

        /*
        Scanner girdi = new Scanner(System.in);
        int tahminAdet = 0;
        boolean dogrumu = false;
        while(tahminAdet < 5 & !(dogrumu)){
            System.out.println("Sayi Giriniz : ");
            int tahmin = girdi.nextInt();
            tahminAdet++;
            if(tahmin >= 0 & tahmin <= 100){
                if(tahmin == rastgele){
                    System.out.println("Dogru Tahmin Ettiniz!!!" + "\n Olusturulan Sayi : " + rastgele);
                    dogrumu = true;
                }else if(tahmin > rastgele){
                    System.out.println("Daha Kucuk Bir Sayi Deneyiniz!");
                    System.out.println("Kalan Tahmin Hakkiniz :" + (5-tahminAdet));
                }else{
                    System.out.println("Daha Buyuk Bir Sayi Deneyiniz!");
                    System.out.println("Kalan Tahmin Hakkiniz :" + (5-tahminAdet));
                }
            }

        }
       if(!dogrumu){
           System.out.println("Uretilen Sayi : " + rastgele);
       }
       */

        for(int i = 1; i <= 10; i++){
            for(int j = 1; j <= 10; j++){
                System.out.print(i + "x" + j + " = " + i*j + "\t");
            }
            System.out.println();
        }
    }
}
