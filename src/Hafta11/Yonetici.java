package Hafta11;

public class Yonetici extends Calisam{
    float maasBonus;
    String altBirim;

    public Yonetici(String isim, float maas, int yillikIzın, float maasBonus, String altBirim) {
        super(isim, maas, yillikIzın);
        this.maasBonus = maasBonus;
        this.altBirim = altBirim;
    }

    public void maasZam(float zamOrani){ // 0.2 0.3 gibi gelsin
        this.maas = this.maas + this.maas * zamOrani;
    }

    public void maasZam(int zamMiktari){ //1000 2000 gibi sayisal veri gelsin
        this.maas = this.maas + zamMiktari;
    }

}
