package j10_StringManipulations;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
        /*
        charAt()methodu parametre int olarak girilen index deki char değerini return eder.
        index değir 0 dan başlar
         */
String sehir="istanbul";
char besinciİndexKrktr=sehir.charAt(5);
        System.out.println("sehir.charAt(5) = " + sehir.charAt(5));//b
        System.out.println(besinciİndexKrktr);//b


        //SON index karakteri--> lenght()-1
        System.out.println(sehir.charAt(sehir.length() - 1));

        System.out.println(sehir.charAt(0));

       // System.out.println(sehir.charAt(18));//rte
        //TRİCKK -> charAt() index boyutunu geçerse rte verir

        // task-> istanbul kelimesinin ortadaki karakteri pirint eden code create ediniz

        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime gir");

        String kelime= sc.nextLine();

        if (kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1)/ 2));
        }else System.out.println("girilen kelimenin orta karakteri yoktur");











    }}