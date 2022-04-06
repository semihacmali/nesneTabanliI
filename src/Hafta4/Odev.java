package Hafta4;

import java.util.Scanner;

public class Odev {

    // 100! faktoriyeli hesaplayan fonksiyonu yaziniz.

    // 10 luk tabandan 2 lık tabana 8 lık tabana 16 lık tabana donusumlerin matematiksel olarak nasıl yapildigini arastirin
    // matetiksel formulleri ile gelin

    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);
/*
        System.out.println("Faktoriyelinin Alinmasini İstediginiz Sayiyi Giriniz :");
        int deger = girdi.nextInt();
        System.out.println(deger + "! = " + Faktoriyel(deger));

        */
        System.out.println("Ikilik Tabana Donusturulecek Sayiyi Giriniz : ");
        int onluk = girdi.nextInt();
        //System.out.println(onluk + " Degerinini Ikilik Karsiligi : " + onlukIkilik(onluk));
        System.out.println(onluk + " Degerinini Ikilik Karsiligi : " + recursiveIkilik(onluk));

    }

    public static double Faktoriyel(int deger){
        double sonuc = 1;
        for(int i = 1; i <= deger; i++){
            sonuc *= i; // sonuc = sonuc * i
        }
        return sonuc;
    }

    public static String onlukIkilik(int onluk){
        String ikilik = "";
        while(onluk >= 1){
            ikilik = ikilik + Integer.toString(onluk % 2);
            onluk = (int)(onluk / 2);
        }
        String tersIkilik = "";
        for(int i = ikilik.length() - 1; i >= 0; i--){
            tersIkilik = tersIkilik + ikilik.charAt(i);
        }
        return tersIkilik;
    }

    public static String recursiveIkilik(int onluk){
        if(onluk <= 1) {
            return Integer.toString(onluk);
        }
        else{
            String ikilik = Integer.toString(onluk % 2);
            onluk = (int)(onluk / 2);
            return recursiveIkilik(onluk) + ikilik;
        }
    }




}
