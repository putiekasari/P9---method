public class RumusMatematika {

    double a, t;                                    //deklarasi variabel
    double l_segitiga;

    public static void main (String arg[]){         //method main
        RumusMatematika rm = new RumusMatematika(); //deklarasi objek dengan nama rm
        rm.luasSegitiga();                          //pemanggilan method luas segitiga
    }

    void luasSegitiga (){
        a = 7;
        t = 10;
        l_segitiga = 0.5 * 1 * t;
        System.out.println("Luas Segitiga = "+l_segitiga);
    }
}
/**
- pemanggilan method luas segitiga harud di deklarasikan objek classnya terlebih dahulu
  karena method luas segitiga tergolong method bukan static
 */