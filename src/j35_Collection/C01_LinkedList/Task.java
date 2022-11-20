package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task {
    public static void main(String[] args) {
        /*
        task->
        node degerleri "yakup","javaCAN","javaTAR","Tekinay" olan beş linkedlist create ediniz
        girilen bir string değeri linkedlistte varlığını kontrol edip varsa silip "Agam eleman halledildi"
        yoksa "Agam aradğınız kişiye ulaşılamadı" print eden code create ediniz




         */

        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("yakup", "javaCAN", "javaTAR", "Tekinay"));
        Scanner sc = new Scanner(System.in);
        System.out.println("agam kime bakmıştınız : ");
        String aganınAdamı = sc.next();
        System.out.println("ll1 = " + ll1);
        if (ll1.remove(aganınAdamı)) {//true-> istenen node var ve silindi
            System.out.println("Agam eleman halledildi");
            System.out.println("aganın adamı hallolduktan sonra" + ll1);
        } else System.out.println("Agam aradğınız kişiye ulaşılamadı");


    }
}
