package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class _30_Scanner8 {

    public static void main(String[] args) {

    /*    Bir byte oluşturunuz.
          Konsola kg cinsinden bir ağırlık yazınız.
          Byte'ı yazdırınız.   */
byte kg=28;
Scanner scan=new Scanner(System.in);
        System.out.println("kg cinsinden bir ağırlık yazınız :");
        byte kilo= scan.nextByte();
        System.out.println("kilo = " + kilo);


    }
}
