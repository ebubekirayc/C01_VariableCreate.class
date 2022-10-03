package j11_MethodCreeation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //TASK-> girilen iki sayının eşitliğini kontrol eden method creat ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("birinci sayı giriniz : ");
        double sayi1= sc.nextDouble();

        System.out.println("ikinci sayı giriniz : ");
        double sayi2= sc.nextDouble();
        System.out.println(esitKontrol(sayi1, sayi2));




    }//main sonu

    public static boolean esitKontrol(double sayi1, double sayi2) {
        boolean esitMi=false;
        if (sayi1==sayi2){
            esitMi=true;
        }else esitMi=false;
        return esitMi;

    }


}
