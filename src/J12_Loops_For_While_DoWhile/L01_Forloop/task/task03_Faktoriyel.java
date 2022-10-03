package J12_Loops_For_While_DoWhile.L01_Forloop.task;

import java.util.Scanner;

public class task03_Faktoriyel {
    public static void main(String[] args) {
        /*
        task-> girilen sayının faktoriyelini hesaplayan method create ediniz
      sayi!=1*2*3*...*sayi
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("tam sayı giriniz");
        int sayı = sc.nextInt();

        faktoriyel(sayı);//int parametreli method call


    }//main sonu

    private static void faktoriyel(int sayı) {
        int faktoriyel = 1;
        for (int i = 1; i <= sayı; i++) {
            faktoriyel *= i;
            System.out.println();

        }
        System.out.println(sayı + "!=" + faktoriyel);


    }
}//clas sonu
