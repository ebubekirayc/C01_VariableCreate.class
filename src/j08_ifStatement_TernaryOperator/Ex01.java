package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        /*
          Task01
girilen bir sayının negatif ve pozitifliğini kontrol eden code create ediniz..
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı = sc.nextInt();
        if (sayı > 0) {
            System.out.println("girilen sayı pozitif");
        } else if (sayı < 0) {
            System.out.println("girilen sayı negatif");
        } else {
            System.out.println("girilen sayı sıfır");

        }


    }
}