package Hafta13;

public class Ucgen extends Kare{
    int c;

    Ucgen(int a, int c) {
        super(a);
        this.c = c;
    }

    public int Cevre(int c){
        int sonuc = Cevre() + c;
        return sonuc;
    }

    public int Alan(){
        int sonuc = a * c / 2;
        return sonuc;
    }

}
