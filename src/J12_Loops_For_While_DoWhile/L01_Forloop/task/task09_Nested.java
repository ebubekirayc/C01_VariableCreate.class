package J12_Loops_For_While_DoWhile.L01_Forloop.task;

import java.util.Scanner;

public class task09_Nested {
    public static void main(String[] args) {

         /*
girilen boyutta kare aşağıdaki şekli print eden code create ediniz
Örnek Ekran çıktısı
*
**
***
****

        */

        Scanner sc=new Scanner(System.in);
        System.out.println(" boyut giriniz :");
        int boyut= sc.nextInt();
        for (int i = 1; i <=boyut ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("* ");//yanyana olması için ln kullanılmaz
            }
            System.out.println();//dummy
        }




    }
}
