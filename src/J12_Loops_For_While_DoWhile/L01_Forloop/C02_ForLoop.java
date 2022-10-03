package J12_Loops_For_While_DoWhile.L01_Forloop;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        // TASK girilen sayıdan 100 e kadar  4un katı tamsayıları print eden code creat ediniz

        Scanner sc = new Scanner(System.in);
        System.out.println("bir pozitif tam sayı griniz :");
        int sayı = sc.nextInt();


        if (sayı > 100) {
            System.out.println("ağam hani 100 den kücük girecektin :(");
        } else {
            for (int i = sayı; i < 100; i++) {
                if (i % 4 == 0) {
                    System.out.print(i + " ");
                }

            }
            //System.out.println("selam");
        }


    }
}
