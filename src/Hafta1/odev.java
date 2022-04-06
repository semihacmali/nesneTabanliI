package Hafta1;

import java.util.Scanner;

public class odev {

    public static void main(String[] args) {

        // Dikdortgenin alanini ve Silindirin alanini hesaplayiniz!
        Scanner girdi = new Scanner(System.in);

   /*
        //Dikdorgenin Alani

        System.out.println("Uzun Kenari Giriniz : ");
        float uzunKenar = girdi.nextFloat();
        System.out.println("Kisa Kenari Giriniz : ");
        float kisaKenar = girdi.nextFloat();

        float dikdortgenAlan = uzunKenar * kisaKenar;

        System.out.println("Girilen Dikdortgenini Alani : " + dikdortgenAlan);

*/

        // Silindirin Alani
        // 2 pi r 2 h


        System.out.println("Silindirin Capini Giriniz : ");
        float cap = girdi.nextFloat();
        System.out.println("Silindirin Yuksekligini Giriniz : ");
        float yukseklik = girdi.nextFloat();
        double silindirAlan = 2 * Math.PI * cap * cap * yukseklik;
        System.out.println("Silindirin Alani : " + silindirAlan);




        
    }
}
