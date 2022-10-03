package j02_DataDypes_WrapperClass;

public class C02_DataTypes {

    public static void main(String[] args) {

        /*
		 Java'da  2 farkli data type vardir.
		 1)Primitive Data Type (8 tane)

		   a)boolean: Sadece True veya False değerlerini alabilir. sadece iki farkli deger alabildigi icin memory'de az(bir bit'lik) alan kaplar

		   b)char :Tek character'li (S, ?, 3, * gibi her bir sembol) ifadeler icin char data type'i kullanilir.
		   		her bir char memory'de 16 bit'lik yer kaplar.char deger mutlaka tek tirnak icine konulmalıdilir.
		   		char değerler aritmetik islemler için charlarin ASCII ("American Standard Code for Information Interchange") Table'daki degerlerini alır.

		   c)byte : -128'den +127 ye kadar tum tam sayi degerlerini alır.
		   		byte variable -> memory'de 8 bitlik alan kaplar.

		   d)short : -32768'den 32767'ye kadar tum tam sayi degerlerini alır.
		   		short variable -> memory'de 16 bıt alan kaplar.

		   e)int : -2,147,483,648'den 2,147,483,647'ye kadar tum tam sayi degerlerini alır.
		  		int variable -> memory'de 32 bit alan kaplar.

		   f)long : -9,223,372,036,854,755,808'den 9,223,372,036,854,755,807'ye kadar tum tam sayi degerlerini alır.
		   		long variable -> memory'de 64 bit alan kaplar.

		   g)float : ondalikli sayilar icin kullanilır.
		   		float variable -> memory'de 32 bit kullanir.
		   		float variable -> ondalik kisimlarinda en fazla 7 rakam barindirabilir.
		   		0.1234567
		   		Bir ondalikli sayinin float oldugunu belirlemek icin en sona(1.23f veya 1.23F) 'f' veya 'F' yazılmalıdır aksi halde variable double olarak tanımlanır.


		   h)double : ondalikli sayilar icin kullanılır.
		   		double variable -> memory'de 64 bit kullanir.
		 		double variable -> ondalik kisimlarinda en fazla 16 rakam barindirabilirler.
		 		0.1234567890123456

		 2)Non-Primitive Data Type
		 	String: Cift tirnak arasina yazilan sifir veya daha fazla character'lerden olusan variable.
		 */

String name = "özgür";
String yas="13";
int age = 34;
boolean emeklimi = true;
boolean itci = false;
char ch ='$';
char hrf ='A';

   //TASK -> 1999 yılında doğan bir kişinin yaşını yazdırınız...


      int dTarihi = 1999;
      int buYıl=2022;
      int yasınız=buYıl-dTarihi;
      System.out.println(yasınız);
      float f1=12.45f;
      float f2=23.56F;
      double boy=1.85;
        System.out.println(f1*f2);// 12.45*23.56 = 293.322

        // Task--> iki farklı byte tanımlayıp toplam farkını print ediniz

        byte a=50, b=20;
        System.out.println(a+b);//70
        System.out.println(a-b);//30

        //Task--> iki farklı tamsayı türünde(byte,short,int...) sayı tanımlayıp toplam farkı print ediniz

        int c=1453;
        byte d=34;
        System.out.println(c+d);//1487
        // Task--> tamsayı ve ondalıklı(fload,double) sayı tanımlayıp toplam print ediniz

        double m=14.53;
        int n=33;
        System.out.println(n+m);//47.53--> 33.00+14.53

        //Task--> tamsayı ve char data typpe iki variable tanımlayıp toplam print ediniz

        int sayı=63;
        char para='$';
        System.out.println(sayı+para);//63+36=99 dolar simgesi ASCİİ de 36 dır.
        //Task ad ve soyadınnızı ve yasınızı print ediniz.

        String ad="ebubekir";
        String soyad="ayçiçek";
        int yaşın=28;

        System.out.println(ad+" "+soyad+" "+yaşın);









    }
}

