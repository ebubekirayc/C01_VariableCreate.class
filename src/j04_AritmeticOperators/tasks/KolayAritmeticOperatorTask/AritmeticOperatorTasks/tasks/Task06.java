package j04_AritmeticOperators.tasks.KolayAritmeticOperatorTask.AritmeticOperatorTasks.tasks;

import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Task06 {

    public static void main(String[] args) {

        /*
         * Kullanicidan uc basamakli bir sayi alin
         * ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
         *
         *
         * Ornek : Inputs : 853
         * Output : Girdiginiz sayinin birler basamagi : 3
         *          Girdiginiz sayinin onlar basamagi : 5
         *          Girdiginiz sayinin yuzler basamagi : 8
         *
         *
         */


        Scanner scan= new Scanner(System.in);
        System.out.print("3 basamaklı bir sayı girin");

        int sayi=scan.nextInt();
 // 1 ler basamağı-> bir sayının 10 a bölümünden kalan birler basamağıdır..
     int birler=sayi%10;//sayının birler basamağı
        sayi /=10;// sa 10 bölümünden bölümü verir 853/10->85
        int onlar=sayi%10;//85in 10 a bölümünden kalan 5 i verir
        int yüzler =sayi/10;//85 in 10 a bölümünü verir ->8

        System.out.println("Girdiginiz sayinin birler basamagi :"+birler+"\n Girdiginiz sayinin onlar basamagi :"+onlar
        +"\nGirdiginiz sayinin yuzler basamagi"+yüzler);



    }
}
