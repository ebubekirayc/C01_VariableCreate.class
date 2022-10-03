package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        double a,b ;
        Scanner scan=new Scanner(System.in);
        System.out.println("birinci dikkenar:");
        a= scan.nextDouble();
        System.out.println("ikinci dikkenar:");
        b= scan.nextDouble();

        System.out.println("hipotenüs : = " +Math.sqrt(a*a+b*b));


    }
}
