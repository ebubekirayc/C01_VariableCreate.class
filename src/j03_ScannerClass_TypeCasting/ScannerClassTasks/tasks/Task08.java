package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */


        double vize1,vize2,Final,geçmeNotu;
        Scanner scan=new Scanner(System.in);
        System.out.println("vize1");
        vize1= scan.nextDouble();
        System.out.println("vize2");
        vize2= scan.nextDouble();
        System.out.println("Final");
        Final= scan.nextDouble();
        geçmeNotu=((vize1+vize2)/2)*0.3+(Final*0.7);
        System.out.println("geçmeNotu = " + geçmeNotu);


    }
}
