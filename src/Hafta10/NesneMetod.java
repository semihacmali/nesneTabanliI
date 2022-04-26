package Hafta10;

// Metod ile deger atama

class Kus{
    int boyut;
    String tur;
    void girdiAlma(String disTur, int disBoyut) {
        tur = disTur;
        boyut = disBoyut;
    }
    void ekranaYazma(){
        System.out.println(tur + " 'nun Boyutu : " + boyut + " metredir.");
    }
}

public class NesneMetod {
    public static void main(String[] args) {
        Kus k1 = new Kus();
        k1.girdiAlma("Akbaba", 2);
        k1.ekranaYazma();

        Kus k2 = new Kus();
        k2.girdiAlma("Güvercin", 1);
        k2.ekranaYazma();
    }
}
