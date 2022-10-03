package J12_Loops_For_While_DoWhile.L01_Forloop.task;

import java.util.Scanner;

public class task02_Polindrome {
    public static void main(String[] args) {
        /*
        girilen ifadenin polindrome olmasın kontrol eden method create ediniz
        polindrome-> her iki yönde okunduğunda eşit olan ifadeler
        örnek: ey edip adanada pide ye  ... :)
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str = sc.nextLine();

        polindrome(str);//String aprametreli method call


    }//main sonu

    private static void polindrome(String str) {
        String tersStr = "";//boş bir string kutu açtık
        for (int i = str.length() - 1; i >= 0; i--) {
            tersStr += str.charAt(i);// strnin i.ci karakterini tersStr ye ekler(concat)

        }
        System.out.println("girilen ifadenin tersi : " + tersStr);
        if (str.equalsIgnoreCase(tersStr)) {//Str ile tersstr eşitlik kontrol
            System.out.println("girilen ifade POLİNDROM");
        } else System.out.println("girilne ifade polindrom değil");


    }


}//class sonu
