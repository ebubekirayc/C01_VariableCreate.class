import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Q07 {
    public static void main(String[] args) {

        /* TASK :
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
         * Test data: ali eme all
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("üç harften oluşan bir kelime yazınız");
        String isim = sc.nextLine();
        String sonuç= isim.length()!=3 ? "isim 3 harfli değil": isim.charAt(0)==isim.charAt(2) || isim.charAt(0)==isim.charAt(1)
               || isim.charAt(1)==isim.charAt(2)? "harfler aynıdır":"harfler aynı değildir";
        System.out.println(sonuç);


    }
}