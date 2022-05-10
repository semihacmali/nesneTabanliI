package Hafta11;

public class Kalitim {
    public static void main(String[] args) {

        Yonetici yonet1 = new Yonetici("Mustafa Sarı", 20000f, 5,
                25000f, "IT");

        Yazilimci yazil1 = new Yazilimci("Sude Ertaş", 10000f, 15,
                10000f, "IT", "E-Ticaret");

        System.out.println("Guncellemeden Once : " + yonet1.isim);
        yonet1.setIsim("Jigglypuff Sarı");
        System.out.println("Guncellemeden Sonra : " + yonet1.getIsim());

        System.out.println("Guncellemeden Once : " + yazil1.maas);
        yazil1.setMaas(20000f);
        System.out.println("Guncellemeden Sonra : " + yazil1.getMaas());

        System.out.println("Maas Guncellemesinden Once : " + yonet1.getMaas());
        yonet1.maasZam(0.6f);
        System.out.println("Maas Guncellemesinden Sonra : " + yonet1.getMaas());

        System.out.println("Maas Guncellemesinden Once : " + yazil1.getMaas());
        yazil1.maasZam(0.5f);
        System.out.println("Maas Guncellemesinden Sonra : " + yazil1.getMaas());

        System.out.println("Maas Guncellemesinden Once : " + yazil1.getMaas());
        yazil1.maasZam(500);
        System.out.println("Maas Guncellemesinden Sonra : " + yazil1.getMaas());

    }
}
