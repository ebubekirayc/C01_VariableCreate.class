package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_equals {
    public static void main(String[] args) {
        //equals();-> iki listin index ve elaman eşitliğini kontrol eder true/false return eder
        List<String> lis1=new ArrayList<>(Arrays.asList("a","B"));
        List<String> lis2=new ArrayList<>(Arrays.asList("A","B"));
        List<String> lis3=new ArrayList<>(Arrays.asList("a","B"));
        List<String> lis4=new ArrayList<>(Arrays.asList("B","a"));

        System.out.println("lis1.equals(lis3) = " + lis1.equals(lis3));//true
        System.out.println("lis2.equals(lis3) = " + lis2.equals(lis3));//false
        System.out.println("lis1.equals(lis2) = " + lis1.equals(lis2));//false
        System.out.println("lis1.equals(lis4) = " + lis1.equals(lis4));//false


    }
}
