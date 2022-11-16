package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Kullanıcıdan a,B ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden B'nin karesini cikarip c nin 3 katina bolunuz

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        B sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        double a,b,c,sonuç;
        Scanner scan=new Scanner(System.in);
        System.out.print("a sayısını giriniz:");
        a= scan.nextDouble();
        System.out.print("B sayısını giriniz:");
        b= scan.nextDouble();
        System.out.print("c sayısını giriniz:");
        c= scan.nextDouble();
        System.out.println("sonuç : " + ((a*a)-(b*b))/(3*c));


    }
}
