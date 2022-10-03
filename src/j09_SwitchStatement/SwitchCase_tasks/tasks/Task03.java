package j09_SwitchStatement.SwitchCase_tasks.tasks;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Girilen  gün sayısına karşılık gelen günün  adını print eden code create ediniz
        // 1.gün Pazartesi alınız

        Scanner oku = new Scanner(System.in);
        System.out.print("gunNo = ");
        int gunNo = oku.nextInt();

        if (gunNo >= 1 && gunNo <= 7) {


            switch (gunNo) {
                case 1:
                    System.out.println("pazartesi");
                    break;
                case 2:
                    System.out.println("salı");
                    break;
                case 3:
                    System.out.println("çarşamba");
                    break;
                case 4:
                    System.out.println("perşembe");
                    break;
                case 5:
                    System.out.println("cuma");
                    break;
                case 6:
                    System.out.println("cumartesi");
                    break;
                case 7:
                    System.out.println("pazar");
                    break;
                default:
                    System.out.println("hatalı giriş yaptınız yeniden deneyiniz");

            }


        }




    }
}
