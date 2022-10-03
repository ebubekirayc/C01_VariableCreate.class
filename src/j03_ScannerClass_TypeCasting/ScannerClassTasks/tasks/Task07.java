package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        double a,b,c;
        Scanner scan=new Scanner(System.in);
        System.out.print("mesafeyi giriniz:");
        a= scan.nextDouble();
        System.out.print("hızı giriniz:");
        b= scan.nextDouble();
        c=a/b;
        System.out.println("süre  " + c +" saattir.");


    }
}
