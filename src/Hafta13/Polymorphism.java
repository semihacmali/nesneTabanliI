package Hafta13;
// Cok bicimlilik
public class Polymorphism {

    public static void main(String[] args) {

        //Dikdortgen d1 = new Dikdortgen(3,6);
       // System.out.println(d1.Cevre());

        Kare k1 = new Kare(5);
        System.out.println(k1.Cevre());

        Ucgen u1 = new Ucgen(6,8);
        System.out.println(u1.a + "\t" + u1.b + "\t" + u1.c);

        // en uygun ve iliskisel olarak en yakindaki class'a bakarak sonuc uretir
        System.out.println(u1.Cevre(u1.c));
        System.out.println(u1.Cevre(u1.a,u1.b));

        // en uygun ve iliskisel olarak en yakindaki class'a bakarak sonuc uretir
        System.out.println(u1.Alan());
        System.out.println(k1.Alan());

    }
}
