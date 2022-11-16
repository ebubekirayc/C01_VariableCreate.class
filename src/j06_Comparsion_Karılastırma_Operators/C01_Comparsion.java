package j06_Comparsion_Karılastırma_Operators;

public class C01_Comparsion {

    public static void main(String[] args) {

/*

==     Esit               x == y
!=     Esit degil         x != y
>      buyuk              x > y
<      kucuk              x < y
>=     buyuk esit         x >= y
<=     kücük esit         x <= y

 */

        int slmYs=33;
        int krmYs=41;

        System.out.println("krm B esit mi slm B -> "+(krmYs==slmYs));//false
        System.out.println("krm B esit değil  mi slm B -> "+(krmYs!=slmYs));//true
        System.out.println("krm B kucuk mu  slm B -> "+(krmYs<slmYs));//false
        System.out.println("krm B buyuk mu   slm B -> "+(krmYs>slmYs));//true
        /*s1 ve s2 String constant pool içerisinde aynı referans değere (reference)
        sahiptir.
         s1 == s2 , s1 ve s2 'nin hafızadaki adres değerlerini karşılaştırır ve
          String constant pool üzerinde aynı adresi gösterirler.
       Böylece ekrana TRUE yazdırır.*/



        String s1 = "Kerem bey";
        String s2 = "kerem bey";

        System.out.println(s1==s2);//

    }
}



