package j04_AritmeticOperators.tasks.KolayAritmeticOperatorTask;

import java.util.Scanner;

public class _06_ArithmeticOperator_division1 {

    public static void main(String[] args) {

        /*    /*    kullanıcıdan alınan iki tane int  (num1 , num2),
         bölümünü print eden code create ediniz. */

        int a,b,bölüm;
        Scanner scan=new Scanner(System.in);
        System.out.println("iki tane sayı griniz");
        a= scan.nextInt();
        b= scan.nextInt();
        bölüm=a/b;
        System.out.println("bölüm = " + bölüm);

    }
}
