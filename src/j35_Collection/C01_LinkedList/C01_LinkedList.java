package j35_Collection.C01_LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class C01_LinkedList {
    public static void main(String[] args) {
        /*

        LinkedList..
        1- LinkedList'de elemanlar "data" ve "adres" olmak üzere iki kısımdan oluşur ve eleman yerine "node" olarak tanımlanır
        2-LinkedList'de ilk node data barındırmayan sadece adres bulunduran head node tanımlanmıştır.
        3-LinkedList'de son node adres kısımı null olan sadece data bulunduran tail node tanımlanmıştır
        4-ArrayList searching LinkedLsit node ekleme ve silmede daha avantajlıdır. LinkedList elelman bulmada index yapısı olmadığı için başarısızdır
        5-LinkedList-> tren vagon iliskisi bağlatısı gbii düşünülebilir
        6- Collection obj tanımlanırken cons Class(LinkedLsit, ArrayList..) olmalı interface(List. qeueu...) olmamasına dikkat edilmeli
        ancak obj datatype olarak parent interface tanımlanabilir.
        7- linkedList class iki tane parent interface den(List, Queue) implemet etmiştir


         */


        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("Ebubekir","Gülsüm","Adem","İlker","Merve"));//LinkedLsit-> declare+assaignment
        //LinkedList print...

        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gülsüm, Adem, İlker, Merve]
        //LinkedList add();

        ll1.add("Ugur");
        System.out.println("ll1 = " + ll1);//[Ebubekir, Gülsüm, Adem, İlker, Merve, Ugur]
        ll1.add(2,"Abdulaziz");
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, Ugur]
        ll1.addFirst("javacan");
        System.out.println("ll1 = " + ll1);//ll1 = [javacan, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, Ugur]
        ll1.addLast("javatar");
        System.out.println("ll1 = " + ll1);//ll1 = [javacan, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, Ugur, javatar]


        List<String>ll2=new LinkedList<>(Arrays.asList("fatih","erol","nur"));//DataType interface Lsit olan Linkedlist
        ll1.addAll(ll2);
        //ll1.addAll("agam");//CTE -> parametre coll olmazsa
        System.out.println("ll1 = " + ll1);//ll1 = [javacan, Ebubekir, Gülsüm, Abdulaziz, Adem, İlker, Merve, Ugur, javatar]
        ll1.addAll(3,ll2);
        System.out.println("ll1 = " + ll1);//ll1 = [javacan, Ebubekir, Gülsüm, fatih, erol, nur, Abdulaziz, Adem, İlker, Merve, Ugur, javatar, fatih, erol, nur]

    }
}
