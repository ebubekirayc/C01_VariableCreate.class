package J12_Loops_For_While_DoWhile.L01_Forloop.L03_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {
        // girilen sayı 17 den kücuk ise "kazandınız" degil ise "kaybettiniz"
        // do While looh ile print eden code create ediniz
        System.out.println("bir sayı giriniz");
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        do {


            System.out.println(sayi+" için kazandınız .... :)");
            sayi++;
        }while (sayi<17);
        System.out.println(sayi+" için kaybettiniz ....  :(");













    }//main sonu
 }// class sonu
