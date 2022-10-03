package j09_SwitchStatement.SwitchCase_tasks.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Girilen bir sayının onlar basamağının değerini yazı ile yazdırınız.

        Scanner sc = new Scanner(System.in);
        System.out.print("Sayi = ");
        int sayi = sc.nextInt();
        sayi /= 10;
        sayi %= 10;
        System.out.println(sayi);

        switch (sayi) {
            case 0:
                System.out.println("onlar basamağı SIFIR");
                break;
            case 1:
                System.out.println("onlar basamağı BİR");
                break;
            case 2:
                System.out.println("onlar basamağı İKİ");
                break;
            case 3:
                System.out.println("onlar basamağı ÜÇ");
                break;
            case 4:
                System.out.println("onlar basamağı DÖRT");
                break;
            case 5:
                System.out.println("onlar basamağı BEŞ");
                break;
            case 6:
                System.out.println("onlar basamağı ALTI");
                break;
            case 7:
                System.out.println("onlar basamağı YEDİ");
                break;
            case 8:
                System.out.println("onlar basamağı SEKİZ");
                break;
            case 9:
                System.out.println("onlar basamağı DOKUZ");
                break;
        }


    }
}
