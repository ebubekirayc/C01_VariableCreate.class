package j20_PassByValue;

public class C04_PassByValue {

    static double etiketFiyatı;//güneş
    static double indirimOranı;//güneş


    public static void main(String[] args) {//main başı
        /*
        eğer bir methodda yapılan değişiklik kalıcı olsun istenirse
        1.değişiklik yapılan variabllar static olarak tanımlanır.

         */

        etiketFiyatı=100;
        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);
        indirimOranı=0.11;

indir();//metohod call
        indirimOranı=0.22;

        indir();
        indirimOranı=0.05;

        indir();

        System.out.println("indirim sonrası  etiketFiyatı = " + etiketFiyatı);


    }//main sonu
    public  static void indir(){
        etiketFiyatı*=(1-indirimOranı);//etiket fiyatı indirimli hale getirildi
        System.out.println("etiketFiyatı = " + etiketFiyatı);

    }



}
