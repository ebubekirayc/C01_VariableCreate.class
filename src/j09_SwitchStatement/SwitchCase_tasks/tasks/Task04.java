package j09_SwitchStatement.SwitchCase_tasks.tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
		/*
		Girilen  ayın  kac cektigini print eden code create ediniz.
		 */


        Scanner sc = new Scanner(System.in);
        System.out.println("ay giriniz");
        int ay = sc.nextInt();
        switch (ay) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gün");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("girilen ay 30 gün");
                break;
            case 2:
                System.out.println("yılınızı giriniz");
                int yıl = sc.nextInt();
                if (yıl % 4 == 0) {
                    System.out.print("girilen ay subat ayı 29 gün içerir");

                } else System.out.println("girilen ay subat ayı 29 gün içerir");
                break;

            default:
                System.out.println("adam gibi bir şey gir");
        }


    }
}
