package j02_DataDypes_WrapperClass;

public class C03_Concatenation {
    public static void main(String[] args) {

        String ad="ebubekir";
        String soyad="ayçiçek";

       int a=7;
       int b=11;
//birden çok String variable ile farklı data type variable ler + ile işleme alınırsa
// java birleştirme yaparak yeni bir String oluşturur

        System.out.println(ad+soyad+a+b);//ebubekirayçiçek711

        System.out.println(a+ad+soyad+b);//7ebubekirayçiçek11

        System.out.println(a+b+ad+soyad);//18ebubekirayçiçek

        System.out.println(" "+a+b);//

        System.out.println(ad+soyad+(a+b));//

        System.out.println((a+b)+ad+soyad);//

        System.out.println(ad+(a-b)+(a-b));//

        System.out.println(ad+((a-b)+(a-b)));//


       char ch='1';//

        System.out.println(ad+ch);//ebubekir1

        System.out.println(a+ch+ad);//56ebubekir

        System.out.println(ad+(ch+b));//ebubekir60

        System.out.println(a+ad+ch);//7ebubekir1

/* TRICK -> char data turu isleme girdigi variables'in turune gore farkli işlem yapar
  eger isleme girdigi variables  aritmetik bir islemse  ascii değeri ile işelm yapar ->
 */

        // TRICK :) Bir aritmetik işlem içinde String kullanılırsa, aritmetik işlem önceliğine göre
        // işlem yapılıp String variable'a Concatenation yapılır








    }

}
