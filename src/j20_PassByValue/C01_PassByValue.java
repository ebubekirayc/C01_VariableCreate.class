package j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {
        /*
        java pass by value bir programlama dilidir.
        bir primitive variable argüment olarak bir methoda call edildiğinde
         variable değil bir copy yani clone(vesikalık) (pointer)değeri görderilir.

         */

        //task-> verilen fiyat için %24 artırılmış print eden method create ediniz

        double fiyat = 100;
        System.out.println("method  calla öncesi fiyat değeri = " + fiyat);//100
        fiyatArttır(fiyat);//fiyat variable method'a parametre call edildi//124
        System.out.println("\"method call sonrası fiyat değeir =\" " + fiyat);//100

    }//main sonu

    public static void fiyatArttır(double bişey) {
        bişey *= 1.24;
        System.out.println("arttırılmış fiyat : " + bişey);

    }


}
