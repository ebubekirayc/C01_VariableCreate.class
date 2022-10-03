package J12_Loops_For_While_DoWhile.L01_Forloop.task;

import java.util.Scanner;

public class task10_Nested {
    public static void main(String[] args) {
        /*
        girilen bir ifadenin istenen harf sayısını print eden code creat ediniz
         input: selam javaCan lar
         output: a sayısı : 3

         */

        Scanner sc=new Scanner(System.in);
        System.out.println(" cümle yazınız :");
        String  cumle= sc.nextLine();
        System.out.println("sayılacak harfi giriniz");
        char harf=sc.next().charAt(0);

        int harfSayısı=0;//ilk değer 0 atandaki saymada etki etmesin
        for (int i = 0; i <= cumle.length()-1; i++) {
            if (cumle.charAt(i)==harf){
                harfSayısı++;
            }

        }
        System.out.println("girdiğiniz cümle :"+cumle+"de istediginiz harf : "+harf+" "+harfSayısı+" kadar var");

















     }
}
