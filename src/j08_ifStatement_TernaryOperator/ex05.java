package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {

/* TASKS->girilen bir karakterin harf olup olmadığını kontrol eden code create ediniz.

 */
        Scanner sc=new Scanner(System.in);

        System.out.print("bir karakter giriniz :");
        char karakter=sc.nextLine().charAt(0);
        if ((karakter>='A'&&karakter<='Z') || (karakter>='a'&&karakter<='z')){
            System.out.println("girdiğiniz karakter harftir");
        }else System.out.println("girdğiiz karakter harf değildir");























    }
}
