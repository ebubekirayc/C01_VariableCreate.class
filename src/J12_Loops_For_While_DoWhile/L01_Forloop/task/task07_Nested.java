package J12_Loops_For_While_DoWhile.L01_Forloop.task;

import java.util.Scanner;

public class task07_Nested {
    public static void main(String[] args) {
        /*
        girilen boyutta bir kare için 
         */

        Scanner sc=new Scanner(System.in);
        System.out.println("kare için boyut giriniz");
        int boyut = sc.nextInt();
        for (int i = 0; i <boyut; i++){
            for (int j = 0; j < boyut; j++) {
                if(i==j)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }




    }

}
