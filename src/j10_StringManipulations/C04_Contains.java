package j10_StringManipulations;

public class C04_Contains {
    public static void main(String[] args) {
        /*
        String içersinde istenen stringin varlığını kontrol eder boolean return eder..

         */

        String s1 = "Enise Hanım başarılı bir Qa tester team lead";

        System.out.println(s1.contains("hanım"));// false
        System.out.println(s1.contains("E"));// true

        String s2 = "Qa";
        System.out.println(s1.contains(s2));//true
        System.out.println(s2.contains(s1));//false

        // tasm-> girilen bir cümlede aranan kelimenin varlığını kontrol eden bir code create ediniz-->ternary kullanınız



    }
}
