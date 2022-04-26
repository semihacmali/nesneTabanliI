package Hafta10;

class Dikdortgen{
    float uzunKenar;
    float kisaKenar;

    void KenarGirdi(float uzun, float kisa){
        uzunKenar = uzun;
        kisaKenar = kisa;
    }
    float AlanHesabi(){
        float alan = uzunKenar * kisaKenar;
        return alan;
    }
}

public class NesneOrnek {
    public static void main(String[] args) {
        Dikdortgen d1 = new Dikdortgen();
        d1.KenarGirdi(15, 3);
        float alan = d1.AlanHesabi();
        System.out.println("Dikdortgenin Alani : " + alan);


    }
}
