package j11_MethodCreeation;

import java.util.Scanner;

public class C02_MethodCreation {
    //task->girilen 3 notun ortalmasını hesaplayan method create ediniz
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.notu giriniz : ");
        double not1= sc.nextDouble();

        System.out.println("2.notu giriniz : ");
        double not2= sc.nextDouble();

        System.out.println("3.notu giriniz : ");
        double not3= sc.nextDouble();


double ortalamanız=ortalamaHesapla(not1,not2,not3);
        System.out.println("not ortalamanız agam = " + ortalamanız);


    }   //main sonu

    public static double ortalamaHesapla(double a, double b, double c) {

        return (a+b+c)/3;
    }
}
