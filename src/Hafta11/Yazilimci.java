package Hafta11;

public class Yazilimci extends Yonetici{
    String calistigiProje;


    public Yazilimci(String isim, float maas, int yillikIzın, float maasBonus, String altBirim, String calistigiProje) {
        super(isim, maas, yillikIzın, maasBonus, altBirim);
        this.calistigiProje = calistigiProje;
    }

   /* bu metod sadece bu sinifta veya bu siniftan uretilecebilecek alt siniflardan kullanilabilir
   public void maasZam(float zamOrani){ // 0.2 0.3 gibi gelsin
        this.maas = this.maas + this.maas * zamOrani;
    }
*/

}
