package Hafta11;

public class Calisam {
    String isim;
    float maas;
    int yillikIzın;

    Calisam(String isim, float maas, int yillikIzın) {
        this.isim = isim;
        this.maas = maas;
        this.yillikIzın = yillikIzın;
    }

    Calisam(int yillikIzın, String isim, float maas) {
        this.isim = isim;
        this.maas = maas;
        this.yillikIzın = yillikIzın;
    }

    Calisam( String isim, int yillikIzın, float maas) {
        this.isim = isim;
        this.maas = maas;
        this.yillikIzın = yillikIzın;
    }

    public String getIsim() {
        return isim;
    }

    public float getMaas() {
        return maas;
    }

    public int getYillikIzın() {
        return yillikIzın;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setMaas(float maas) {
        this.maas = maas;
    }

    public void setYillikIzın(int yillikIzın) {
        this.yillikIzın = yillikIzın;
    }


}
