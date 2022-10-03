package j04_AritmeticOperators;

import java.util.Scanner;

public class C03_RakamToplamı {

    public static void main(String[] args) {

        // kullanıcıdan alınan 3 basaaklı bir sayının
        // rakamları toplamını print eden code create ediniz

        Scanner scan= new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı girin");

        int sayi=scan.nextInt();
        // 1 ler basamağı-> bir sayının 10 a bölümünden kalan birler basamağıdır..
        int birler=sayi%10;//sayının birler basamağı
        sayi /=10;// sa 10 bölümünden bölümü verir 853/10->85
        int onlar=sayi%10;//85in 10 a bölümünden kalan 5 i verir
        int yüzler =sayi/10;//85 in 10 a bölümünü verir ->8

        int rakaToplamı=birler+onlar+yüzler;
        System.out.println("rakaToplamı = " + rakaToplamı);


    }

}
