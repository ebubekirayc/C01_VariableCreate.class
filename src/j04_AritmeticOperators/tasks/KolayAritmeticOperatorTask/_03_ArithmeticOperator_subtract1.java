package j04_AritmeticOperators.tasks.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _03_ArithmeticOperator_subtract1 {

    public static void main(String[] args) {

    /*     /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         farkını print eden code create ediniz. */

        int num1,num2,fark;
        Scanner scan=new Scanner(System.in);
        System.out.println("iki tane sayı giriniz:");
        num1= scan.nextInt();
        num2= scan.nextInt();
        fark=num1-num2;
        System.out.println("fark = " + fark);


    }
}
