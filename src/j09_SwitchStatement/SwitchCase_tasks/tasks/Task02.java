package j09_SwitchStatement.SwitchCase_tasks.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

        // Kullanıcının yasadıgı güne  göre 100 gün sonra hangi gün olduğunu print eden code create ediniz
        // pazartesi hafta başlangıcı olarak alınız
        Scanner scan = new Scanner(System.in);
        System.out.println("Pazartesi: 1\nSalı : 2\nÇarşamba: 3\nPerşembe: 4\nCuma: 5\nCumartesi: " +
                "6\nPazar: 7\n Haftanın hangi gününde olduğunu giriniz : ");
        int gün1 = scan.nextInt();
        if (gün1 >= 1 && gün1 <= 7) {
            int gün2 =((gün1+100)%7);
            switch (gün2) {

                case 0:
                    System.out.println("100 gün sonra Pazar");
                    break;
                case 1:
                    System.out.println("100 gün sonra Pazartesi");
                    break;
                case 2:
                    System.out.println("100 gün sonra Salı");
                    break;
                case 3:
                    System.out.println("100 gün sonra Çarşamba");
                    break;
                case 4:
                    System.out.println("100 gün sonra Perşembe");
                    break;
                case 5:
                    System.out.println("100 gün sonra Cuma");
                    break;
                case 6:
                    System.out.println("100 gün sonra Cumartesi");
                    break;


            }

        }else System.out.println("hatalı giriş yaptınız");
}
}

