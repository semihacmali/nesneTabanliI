package Hafta4;

public class fonksiyonlar {

    /*
    public:
        Fonksiyonunun dış kullanıcılara açık olduğu ve buna Java InterPreter’ı da dahil herkes tarafından erişebileceğimizi belirtilir.
        Proje icerisinde her yerden erisilebilir.

    static:
        Hafiza optimizasyonu icin gerekli
        Metodunun sadece bu uygulamaya ait olduğu ve bu uygulama nesneye yönelik tarzda başka bir uygulamaya çağrıldığında değiştirilemeyeceğini gösterir.
        Hafızada ne kadar kullanılırsa kullanılsın hep tek kopya tutar.

    void:
        Metodun ekrana basma işlemi dışında hiçbir sonuç geri döndürmediğini gösterir.


    protected:
        Aynı paket içerisinden ve bu sınıfdan türemiş alt sınıflar tarafından erişilmeyi sağlayan erişim belirleyicisi.

    friendly:
        Yalnızca aynı paket içerisinden erişilmeyi sağlayan erişim belirleyicisi.

    private:
        Yalnızca kendi sınıfı içerisinden erişilmeyi sağlayan, başka her yerden erişimi kesen erişim belirleyicisi.
     */

    public static void main(String[] args) { // javanin temel fonksiyonudur ve calistirilabilir bir java dosya icin gereklidir
        // void türündeki fonksiyonlar ;
        // fonksiyon icersinde yapilan islemleri disari yansitmazlar
        // return terimi kullanilmaz ve istenmez


        // bir fonksiyonu cagirmak icin verilen ad kullanilir
        ilkFonksiyon();
        int i = 5;
        System.out.println("Main'deki i : " + i);
        ikinciFonksiyon(2,3);

        //System.out.println("i + j : " + sonuc); fonksiyon icerisinde tanimli olan degiskenler disari aktarilamaz

        // fonksiyon icerisindeki adsoyad degiskeni ile main blogundaki adsoyad degiskeni ram'de farkli yerlerde yer tutar
        // buradaki gibi degisken degerleri ayni olsa bile bu durum degismez
        String adsoyad = ucuncuFonksiyon("Semih", "ACMALI");// Semih ACMALI
        System.out.println("Ucuncu Foksiyonun Ciktisi : " + adsoyad);

        ////////

        String metin = "public:\n" +
                "        Fonksiyonunun dış kullanıcılara açık olduğu ve buna Java InterPreter’ı da dahil herkes tarafından erişebileceğimizi belirtilir.\n" +
                "        Proje icerisinde her yerden erisilebilir.\n" +
                "\n" +
                "    static:\n" +
                "        Hafiza optimizasyonu icin gerekli\n" +
                "        Metodunun sadece bu uygulamaya ait olduğu ve bu uygulama nesneye yönelik tarzda başka bir uygulamaya çağrıldığında değiştirilemeyeceğini gösterir.\n" +
                "        Hafızada ne kadar kullanılırsa kullanılsın hep tek kopya tutar.\n" +
                "\n" +
                "    void:\n" +
                "        Metodun ekrana basma işlemi dışında hiçbir sonuç geri döndürmediğini gösterir.\n" +
                "\n" +
                "\n" +
                "    protected:\n" +
                "        Aynı paket içerisinden ve bu sınıfdan türemiş alt sınıflar tarafından erişilmeyi sağlayan erişim belirleyicisi.\n" +
                "\n" +
                "    friendly:\n" +
                "        Yalnızca aynı paket içerisinden erişilmeyi sağlayan erişim belirleyicisi.\n" +
                "\n" +
                "    private:\n" +
                "        Yalnızca kendi sınıfı içerisinden erişilmeyi sağlayan, başka her yerden erişimi kesen erişim belirleyicisi.";
        int sonuc = dorduncuFonksiyon("OMER KORKMAZ");
        System.out.println("Dorduncu Fonksiyonun Ciktisi : " + sonuc);

        int sonuc1 = dorduncuFonksiyon(metin);
        System.out.println("Metin degiskeninin DorduncuFonksiyon Ciktisi : " + sonuc1);

        int sayi = 120;
        int sonuc2 = faktoriyel(sayi);
        System.out.println(sayi + " Faktoriyelinin Sonucu : " + sonuc2);

        System.out.println("90 Faktoriyelin Sonucu : " + faktoriyel(90));

        System.out.println("17 Faktoriyelin Sonucu : " + faktoriyel(17));

        System.out.println("Integer Max Degeri : " + Integer.MAX_VALUE);


    }



    // void oldugu icin geri deger dondurmez
    // () ici bos oldugu icin disardan deger almaz
    // yani bu fonksiyon tamamen kendi icerisinde islem yapan bir fonksiyondur
    public static void ilkFonksiyon(){
        System.out.println("Sonunda derse baslayabildik!");
    }

    // void oldugu icin geri deger dondurmez
    //() icersinde int i ve int j degerleri oldugu icin disardan deger alir
    // int i ve int j degiskenler sadece bu fonksiyon icerisinde tanimlidir
    public static void ikinciFonksiyon(int i, int j) {
        // int i = 2; // 2 degeri main blogunun icindeki ikinciFonksiyon(2,3); ilk deger olan 2'dir.
        // int j = 3; // 3 degeri main blogunun icindeki ikinciFonksiyon(2,3); ikinci deger olan 3'dur.
        System.out.println("IkinciFonksiyon'daki i : " + i);
        int sonuc = i + j;
        System.out.println("i + j : " + sonuc);

    }

    // () icerisinde iki adet String ifade var
    // String oldugu icin geriye deger dondurmek zorunda bunun icin return ifadesi kullanilir
    // return sayesinde fonksiyon disina bir degiskeni aktara biliyoruz
    public static String ucuncuFonksiyon(String ad, String soyad) {
        String adsoyad = ad + " " + soyad;
        return adsoyad;
    }

    // girdi olarak verilen String ifadenin uzunlugunu bulan ve bu uzunlugun karesini geri donduren bir fonksiyon yaziniz.

    public static int dorduncuFonksiyon(String metin){
        int uzunluk = metin.length();
        int sonuc = uzunluk * uzunluk;
        return sonuc;
    }
    // girdi olarak verilen sayinin faktoriyelini alan fonksiyon
    // 5! = 5 * 4 * 3 * 2 * 1
    // 5! = 1 * 2 * 3 * 4 * 5
    // 100! faktoriyeli hesaplatmak icin gerekli olan degisiklikleri yapın
    public static int faktoriyel(int deger){
        int sonuc = 1;
        for(int i = 1; i <= deger; i++){
            sonuc = sonuc * i;
            //System.out.println("For ciktilari : " + sonuc);
        }
        return sonuc;
    }
}

