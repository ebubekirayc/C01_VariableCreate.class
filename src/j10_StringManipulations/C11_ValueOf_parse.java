package j10_StringManipulations;

public class C11_ValueOf_parse {
    public static void main(String[] args) {

// Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
// Stringlerle matematiksel islemler yapabilmemizi saglar.

//valueOf() hem Integer wrapper classinin icinde hem de String'in icinde var. Integer wrapper classinin icinde
//olan valueOf() methdou String'i integer'a cevirir. String'in icindeki valueOf() methodu integer'i String'e cevirir.


//task-> string type verilen iki adet bağış miktarını toplayan code create ediniz.
        String bagıs1="1500";
        String bagıs2="2500";

        int bagisDegeri1=Integer.valueOf(bagıs1);//bagis1 string içindeki sayı değerini int e çevirdi bagisDegeri1 e atadı
        int bagisDegeri2=Integer.valueOf(bagıs2);//bagis2 string içindeki sayı değerini int e çevirdi bagisDegeri2 e atadı
        System.out.println("toplam bagis miktarı : "+(bagisDegeri1+bagisDegeri2));// bagısDeğerleri toplanıp print edildi:4000

        System.out.println(Integer.parseInt(bagıs1) + Integer.parseInt(bagıs2));

        int tc=1234567;
        String strTc = String.valueOf(tc);
        System.out.println("strTc = " + strTc);//1234567
        System.out.println("strTc+tc = " + (strTc + tc));//

        String  fiyat="$150";
        int yeniFiyat=  Integer.valueOf(fiyat);
        System.out.println("yeniFiyat = " + yeniFiyat);



    }}
