package j18_Constructor;

public class C02_Arac {
    String marka;
    String model;
    int km = 10;
    double motorHcm;
    boolean vitesAuto = false;
    boolean ikinciEl;
    int yıl;

    public static void main(String[] args) {
        C02_Arac arac1 = new C02_Arac();//defauld cons ile arac1 obj create edildi
        arac1.ikinciEl = true;
        arac1.marka = "volvo";
        arac1.km = 50000;
        arac1.model = "XC60";
        arac1.motorHcm = 2.4;
        //                     volvo               xc60     50000        defauld=0        true                  2,4
        System.out.println(arac1.marka + " " + arac1.model + " " + arac1.km + " " + arac1.yıl + " " + arac1.ikinciEl + " " + arac1.motorHcm + " ");
// task-> ikinci bir aracın tüm field larını atayarak print ediniz.


    }


}//class sonu
