package Hafta3;

public class ifSwitch {

    public static void main(String[] args) {
        //if ve Switch'in kullaniminda belli durumlar icin farkli islemler yapmak icin kullanilir
        // bu belli durumlar genel olarak dogru veya yanlis olmasina gore islem yapilmasini saglar

        int a = 20;
        int b = 25;

/*
        if(a < b){
            System.out.println("b sayisi a'dan buyuktur");
        }

        if(a > b){
            System.out.println("a sayisi b sayidan buyuktur");
        }
        */

/*

        if(a > 20){ // a degerinin en az 20.0000000000000001  olmasi gerekir
            System.out.println("a sayisi 20'den buyuktur");
        }

        if(a >= 20){ // a degeri en az 20 olmali
            System.out.println("a sayisi 20 veya 20'den buyuktur");
        }
*/
/*

        if(b == 25){ // == karsilastirma yapar
            System.out.println("b sayisi 25'e esittir");
        }
*/
       /*
        System.out.println(b == 25);

        boolean sonuc = a > 15; // karsilastirmalar sadece if blogunda veya switch'te kullanilmaz. Bu sekilde boolean sonucu olarakta ele alinabilir.
        System.out.println("a > 15 ifadesi : " + sonuc);
        */
/*

        a = 15;
        b = 15;

        if(a > b){ // ilk olarak bu ifadenin dogrulugu kontrol edilir eger dogruysa else if ve else kismi kontrol edilmez
            System.out.println("a sayisi b sayisindan buyuktur");
        }else if(b > a){ //eger ilk durum yanlis(false) ise bu durum kontrol edilir ve dogruysa else kismi kontrol edilmez
            System.out.println("b sayisi a sayisindan buyuktur");
        }else{ // diger durumlar yanlis(false) ise bu durum kesin olarak calistirilir
            System.out.println("a sayisi b sayisina esittir");
        }
*/

        a = 20;
        b = 25;
        int c = 30;

        /*
        // if blogu if'den baslar baska bir if'e kadar devam eder
        if(a > c){
            System.out.println("a sayisi c sayisindan buyuktur");
        }else if(c > b){
            System.out.println("c sayisi b sayisindan buyuktur");
        }else if(c > a){
            System.out.println("c sayisi a sayisindan buyuktur");
        }else{
            System.out.println("Kontrol edilen butun durumlar yanlistir");
        }
        */
/*

        //1. if blogu
        if(a > c){
            System.out.println("a sayisi c sayisindan buyuktur");
        }else if(c > b){
            System.out.println("c sayisi b sayisindan buyuktur");
        }
        //2. if blogu
        if(c > a){
            System.out.println("c sayisi a sayisindan buyuktur");
        }else{
            System.out.println("Kontrol edilen butun durumlar yanlistir");
        }
*/
//// SWİTCH
        int gun = 3;
        // break ifadesi konmaz ise durumlar break ifadesini gorene kadar devam eder.
        switch (gun){ // parantez icerisine yazilan degisken(deger) ile case ifadesinin yanina yazilan degisken(deger) ile karsilastirma yapilir
            case 1:
                System.out.println("Pazartesi");
                break;
            case 2:
                System.out.println("Salı");
                break;
            case 3:// break eklenmedi
                System.out.println("Çarşamba");
            case 4:
                System.out.println("Perşembe");
                break;
            case 5:
                System.out.println("Cuma");
                break;
            case 6:
                System.out.println("Cumartesi");
                break;
            case 7:
                System.out.println("Pazar");
                break;
            default:
                System.out.println("Girilen deger 1 ile 7 arasinda degildir");
                break;
        }


    }
}
