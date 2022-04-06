package Hafta2;

public class odev {

    public static void main(String[] args) {


        String isimler = "Batuhan,*Bengisu,*Beyza,*Bora,*Emircan,*Emir,*İnci,*İsmail";
        String soyisimler = "Kaya,Durmus,Aktas,Evren,Aydin,Yilmaz,Cumen,Aytar,";

        // Bu sekilde verilmis iki farkli String ifadedeki isimler ile soyisimleri
        // eslestiren(birlestiren) uygulamayi yaziniz ve herbir isim soyisim esinin uzunlugunu bulunuz

        // Kullanilmasi gereken fonk;
        // split, (concat veya join), lenght

        //Ornek Cikti;
        // İsim Soyisim : Batuhan Kaya, Uzunluk : 12

        String[] isimDizi = isimler.split(",\\*");
        String[] soyisimDizi = soyisimler.split(",");
 /*
        // Yapilan islemin dogrulugunu kontrol etmek icin yazildi
        for(int i=0; i < isimDizi.length; i++){
            System.out.println("İsim : " + isimDizi[i] + "\nİsim Uzunluk : " + isimDizi[i].length());
        }
*/
        if(isimDizi.length == soyisimDizi.length){
            String[] isimSoyisim = new String[isimDizi.length];
            for(int i = 0; i < soyisimDizi.length; i++){
                isimSoyisim[i] = isimDizi[i].concat(" " + soyisimDizi[i]);
                System.out.println("Isim Soyisim : " +isimSoyisim[i] + ", Uzunluk : " + isimSoyisim[i].length());
            }
        }else{
            System.out.println("Dizilerin Uzunluklari Esit Degil!!");
        }

    }
}
