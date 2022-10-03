package j08_ifStatement_TernaryOperator;

import java.util.Scanner;

public class C02_ifElseStatement {
    public static void main(String[] args) {

        /* task -> girilen yaşın 18 den büyüklüğünü kontral eden code create ediniz*/
        Scanner scan = new Scanner(System.in);
        System.out.println("yaşınızı giriniz :");
        int yas = scan.nextInt();
        // if (yas>18){
        //   System.out.println("yaşınız 18 den büyük");



        /* task -> girilen yaşın 18 den büyüklüğünü kontral eden code create ediniz
         18 den kçk ise ehliyet alamazsınız*/


     if (yas>=18){// girilen yaşın 18 den büyük ve eşit olmasını kontrol eder
         System.out.println("yaşınız 18 den küçük değil");
     }else System.out.println("ehliyet alamazsınız");// if şartı sağlamazsa ->yaş 18den byük ve eşit değil
}//yasın 18 den küçük olması
}
