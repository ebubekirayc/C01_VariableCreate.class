package j04_AritmeticOperators.tasks.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _05_ArithmeticOperator_sum3 {

    public static void main(String[] args) {

          /*    kullanıcıdan alınan 3 tane int
         toplamını print eden code create ediniz. */

int a,b,c,toplam;
Scanner scan=new Scanner(System.in);
        System.out.println("3 tane sayı giriniz");
       a= scan.nextInt();
       b= scan.nextInt();
       c= scan.nextInt();
       toplam=a+b+c;
        System.out.println("toplam = " + toplam);

    }
}
