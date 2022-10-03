package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        /* TASK->
		 Kullanıcıdan ara sınav notu, final notu ve proje notunu girmesini isteyin
Genel notu hesaplayın (ara sınav: %30, proje: %20, final: %50)

Örnek:
GİRDİ: ara sınav notu=78
final notu = 66
proje notu = 90
ÇIKTI: "Notunuz : 81,6"
		 */
        Scanner scan=new Scanner(System.in);
        System.out.println("ara sınav notunuzu giriniz :");
        float araSınavNotu= scan.nextFloat();
        System.out.println("final notunuzu giriniz :");
       float finalNotu= scan.nextFloat();
        System.out.println("proje notunuzu giriniz :");
        float projeNotu= scan.nextFloat();
float genelNot= (float) (araSınavNotu*0.3+finalNotu*0.5+projeNotu*0.2);
        System.out.println("genelNot = " + genelNot);



    }
}
