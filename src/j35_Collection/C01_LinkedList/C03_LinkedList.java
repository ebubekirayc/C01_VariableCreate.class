package j35_Collection.C01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;

public class C03_LinkedList {
    public static void main(String[] args) {
        //remove....
        LinkedList<String> ll1=new LinkedList<>(Arrays.asList("javacan","Ebubekir","Gülsüm","Ebubekir","Adem","İlker","javacan","Merve"));

        //LinkedList remove()...ilk node silinir ve silinen node return edilir
        System.out.println("ll1 = " + ll1);//ll1 = [javacan, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javacan, Merve]

        System.out.println("ll1.remove() = " + ll1.remove());//ll1.remove() = javacan
        ll1.remove(3);
        System.out.println("ll1 = " + ll1);//ll1 = [Ebubekir, Gülsüm, Ebubekir, İlker, javacan, Merve]
        System.out.println("ll1.remove(\"Merve\") = " + ll1.remove("Merve"));//true
        System.out.println("ll1.remove(\"javatar\") = " + ll1.remove("javatar"));//false->olmanyan node false olan node true return eder

        ll1.removeFirstOccurrence("Ebubekir");//
        System.out.println("ll1 = " + ll1);//[Gülsüm, Ebubekir, İlker, javacan]
        System.out.println("ll1.element() = " + ll1.element());//ilk node return eder->ll1.element() = Gülsüm

        LinkedList<String> ll2=new LinkedList<>(Arrays.asList("javacan","Ebubekir","Gülsüm","Ebubekir","Adem","İlker","javacan","Merve"));
        LinkedList<String> ll3=new LinkedList<>(Arrays.asList("Hasan","Harun","Haluk","Hasmayan"));

        ll2.addAll(ll3);
        System.out.println("ll2 = " + ll2);//[javacan, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javacan, Merve, Hasan, Harun, Haluk, Hasmayan]
        System.out.println("ll2.removeAll(ll3) = " + ll2.removeAll(ll3));//true
        System.out.println("ll2 = " + ll2);//[javacan, Ebubekir, Gülsüm, Ebubekir, Adem, İlker, javacan, Merve]
        //LinkedList get() getFirst() getLast().. girilen index ve ilk son node return eder..

        System.out.println("ll2.get(2) = " + ll2.get(2));//ll2.get(2) = Gülsüm
        System.out.println("ll2.getFirst() = " + ll2.getFirst());//ll2.getFirst() = javacan
        System.out.println("ll3.getLast() = " + ll3.getLast());//ll3.getLast() = Hasmayan



    }
}
