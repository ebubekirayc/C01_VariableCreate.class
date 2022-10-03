package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz :");
        String isim= scan.nextLine();
        System.out.println("soyisim giriniz :");
        String soyisim= scan.nextLine();
        System.out.println("yaşınızı giriniz :");
        short kilo= scan.nextShort();
        System.out.println("boyunuzu giriniz :");
        float boy= scan.nextFloat();
        System.out.println("kaç ay devam edeceğinizi giriniz :");
        short toplamAy= scan.nextShort();
        int toplamBorç=toplamAy*20;
        System.out.println("toplamBorç = " + toplamBorç+"$");


    }
}
