package Hafta10;

// Referanslama Yontemi

public class NesneTemel {
    public static void main(String[] args) {
        Hayvan h1 = new Hayvan();
        h1.tur = "Sürüngen"; //referanslama yöntemi ile nesneye deger atama
        h1.cins = "Kertenkele"; //referanslama yöntemi ile nesneye deger atama
        System.out.println(h1.tur + "\t" + h1.cins);

        Hayvan h2 = new Hayvan();
        h2.tur = "Omurgasız";
        h2.cins = "Deniz Anasi";
        System.out.println(h2.tur + "\t" + h2.cins);

    }
}


class Hayvan{
    String tur;
    String cins;

}
