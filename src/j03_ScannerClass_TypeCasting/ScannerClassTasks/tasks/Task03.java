package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scan=new Scanner(System.in);
        System.out.print("günde kaç saat uyuyorsunuz :");
       int günlükUykuSaati= scan.nextInt();
        System.out.print(" ayda " + günlükUykuSaati*30/24+",");
        System.out.print("yılda " + günlükUykuSaati*365/24+",");
        System.out.print(" 40 yılda " + günlükUykuSaati*365*40/24+" "+" gününüz uykuda geçiyor:))");
    }
}
