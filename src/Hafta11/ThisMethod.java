package Hafta11;

class Matematik{
    float sayi1;
    float sayi2;
    char islem;

    Matematik(){
        this.sayi1 = 0;
        this.sayi2 = 0;
        this.islem = '-';
    }

    Matematik(float sayi1,float sayi2){
        this.sayi1 = sayi1;
        this.sayi2 = sayi2;
    }

    Matematik(char islem, float sayi1, float sayi2){
        //this.sayi1 = sayi1;
        //this.sayi2 = sayi2;
        this(sayi1, sayi2); // iki degiskenli contructor(Yapıcı) yi cagirir
        this.islem = islem;
    }

}




public class ThisMethod {
    public static void main(String[] args) {
        Matematik m1 = new Matematik();
        System.out.println(m1.sayi1 + "\t" + m1.sayi2 + "\t" + m1.islem);

        //Matematik m2 = new Matematik(3.0f, 6.5f); // sonuna ki 'f' nin amacı sayinin float oldugunu belirtmek
        //System.out.println(m2.sayi1 + "\t" + m2.sayi2 + "\t" + m2.islem);

        Matematik m3 = new Matematik('+', 3.0f, 6.5f); // sonuna ki 'f' nin amacı sayinin float oldugunu belirtmek
        System.out.println(m3.sayi1 + "\t" + m3.sayi2 + "\t" + m3.islem);

    }
}
