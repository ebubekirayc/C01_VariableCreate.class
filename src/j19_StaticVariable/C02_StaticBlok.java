package j19_StaticVariable;
 /*
        1.satatic blok yapıları static variable'rı değer ataması update için kullanılır
        2.static bloc Class oluştrulduğunda bütün method'lardan(main method daahil) önce çalışr
        3.birden fazla static block varsa yukardan aşagıya sıralama ile çalişır

         */

public class C02_StaticBlok {

    static String isim="sefil haluk";//gns-> statick var
    static {
        System.out.println("ağam 1. statick block çalıştı  ");
    isim="dilek hanım";
        System.out.println("isim = " + isim);//


    }
    public static void main(String[] args) {
        System.out.println(">>>>>>>main method başladı <<<<<<");
       isim="kerim bey";
        System.out.println("isim = " + isim);
        System.out.println(">>>>> main method bitti <<<<<");
    }//main sonu
    static {
        System.out.println("ağam 2. statick block çalıştı  ");
        isim = "uğur javacan";
        System.out.println("isim = " + isim);//
    }



}//class sonu
