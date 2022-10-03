package J12_Loops_For_While_DoWhile.L01_Forloop.L02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tam sayının rakamları oplamını pirint eden METHOD create ediniz
        Scanner sc = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");
        int sayi = sc.nextInt();

        rakamTopla(sayi);
        System.out.println(rakamTopla(sayi));

    }//main sonu

    private static int rakamTopla(int sayi) {
        int rakamToplamı=0;
        while (sayi > 0) {//sayı 1 olana dek body action çalış

            rakamToplamı += sayi % 10;
            sayi /= 10;
        }

return rakamToplamı;
    }
}