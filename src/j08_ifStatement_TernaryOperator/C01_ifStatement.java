package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C01_ifStatement {
    public static void main(String[] args) {

        int krmYas = 45;
        int ismlYas = 63;
        if (krmYas == ismlYas) {
            System.out.println("aynı yaşdasınız güzel insanlar");
            System.out.println("yoksa siz ikiz misiniz ? ");
        }
        if (krmYas >= 40) System.out.println(" krm bey olgunluk yaşınızdasınız");
//if blok da {} kullanılmazsa ilk ; kadar olan komut calışır veya çalışmaz
        if (krmYas + ismlYas > 100) {
            System.out.println("krm bey ve ismal bey yaşları toplamı 100 den buyuk");
        }

        //ctrl+alt+l-->code reformat yani java formatında yazar
        /*
       --> bağımsız if satatement yapıları sadece kendi scap(kapsamlarını) şart sağlarsa run eder.
       -->birden fazla bağımsız if statement yapılar hepsinin body çalışabileceği gibi
        hiçbirisinin body de çalışmayabilir
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("yıl giriniz :");
        int yıl = scan.nextInt();



    }

}
