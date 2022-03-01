package Hafta1;

import java.util.Scanner;

public class sayiIslemleri {

    public static void main(String[] args) {
        // sayisal ifadeler
        // interger -> tam sayi 2^32
        // float -> virgullu sayi 2^32
        // double -> buyuk virgullu sayi 2^64
        // long -> buyuk tam sayi 2^64
        // short -> kucuk tam sayi 2^16
/* Temel Sayisal Ifadeler
        int sayi1 = 10; // tek esittir sagdaki ifadeyi veya islemi soldaki degiskene atar
        float sayi2 = 2.6f; // javada virgül (.) olarak tanimlanir ve float tanimlarken sonuna f koyulur.
        double sayi3 = 568.65; //double tanimlanirken sonuna d koyulabilir.
        long sayi4 = 65; // long tanimlanirken sonuna l koyulabilir.
        short sayi5 = 5;
        System.out.println(sayi1);
        sayi1 = (int)sayi2;
        System.out.println(sayi1);
        */

        // 2 kenari belli olan dik ucgenin hipotenusunu hesaplama
        Scanner girdi = new Scanner(System.in); // Klavyeden veri girisi icin kullanilir
        System.out.print("Birinci Sayiyi Giriniz : ");
        float sayi1 = girdi.nextFloat();
        System.out.print("Ikinci Sayiyi Giriniz : ");
        float sayi2 = girdi.nextFloat();

        float sayi1kare = sayi1 * sayi1;
        float sayi2kare = sayi2 * sayi2;


        float hipotenus = (float) Math.sqrt(sayi1kare + sayi2kare);

        System.out.println("Hipotenüs : " + hipotenus);

    }
}
