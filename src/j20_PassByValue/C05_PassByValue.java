package j20_PassByValue;

public class C05_PassByValue {
    public static void main(String[] args) {
        /*
eger bir method2Da yapılan değişiklik kalıcı olsun istenirse
2.değişklik  yapılan variable'lar static olarak tanımlanır.
 */
        double etiketFiyatı=100;//primitive
        double indirimOranı=0.1;//primitive
        System.out.println("indirim öncesi etiketFiyatı = " + etiketFiyatı);
        etiketFiyatı=indirim(etiketFiyatı, indirimOranı);
        System.out.println("indirim sonrası etiketFiyatı = "+etiketFiyatı);


    }//main sonu
    public static double indirim(double fiyat,double oran){

       return fiyat*=(1-oran);

    }




}
