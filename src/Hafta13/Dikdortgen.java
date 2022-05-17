package Hafta13;

public class Dikdortgen {
    int a,b;

    Dikdortgen(int a, int b){
        this.a = a;
        this.b = b;
    }

    //Cevre Hesaplama
    public int Cevre(int a, int b){
        int cevre = 2 * (a + b);
        return cevre;
    }

    public int Alan(){
        int sonuc = a * b;
        return sonuc;
    }

}
