package j04_AritmeticOperators.tasks.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _01_ArithmeticOperator_sum {
    public static void main(String[] args) {

    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         toplamını print eden code create ediniz. */


        int num1,num2,toplam;
        Scanner scan=new Scanner(System.in);
        System.out.println("iki tane int giriniz");
        num1= scan.nextInt();
        num2= scan.nextInt();
        toplam=num1+num2;
        System.out.println("toplam = " + toplam);


    }
}
