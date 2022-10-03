package j04_AritmeticOperators.tasks.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _02_ArithmeticOperator_sum2 {

    public static void main(String[] args) {

     /*     /*    kullanıcıdan alınan 4 tane int
         toplamını print eden code create ediniz. */

        int a,b,c,d,toplam;
        Scanner scan=new Scanner(System.in);
        System.out.println("4 tane sayı giriniz");
        a= scan.nextInt();
        b= scan.nextInt();
        c= scan.nextInt();
        d= scan.nextInt();
        toplam=a+b+c+d;
        System.out.println("toplam = " + toplam);


    }
}
