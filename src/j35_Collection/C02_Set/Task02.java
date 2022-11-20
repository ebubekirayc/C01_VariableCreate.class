package j35_Collection.C02_Set;

import java.util.HashSet;
import java.util.TreeSet;

public class Task02 {
    public static void main(String[] args) {
        //interview question: girilen String datanın arakterlerini alfabetik print ediniz->TreeSet'e atanır ....
        //hashSet VE TreeSet tanımlayıp run sürelerini karşılaştırınız
        //Trick run süresi için System.currenTimeMillis() meth call ediniz..
long tsBasla=System.currentTimeMillis();
        TreeSet<String>ts=new TreeSet<>();
        ts.add("Salim");
        ts.add("Koray");
        ts.add("Haluk");
        ts.add("Hasan");
        ts.add("Hasmayan");
        ts.add("Koray");
        long tsBitir=System.currentTimeMillis();
        System.out.println("ts run süresi = " + (tsBitir - tsBasla));
        System.out.println("**********************************");
        long hsBasla=System.currentTimeMillis();
        HashSet<String>hs=new HashSet<>();
        hs.add("ebik");
        hs.add("gabık");
        hs.add("falan");
        hs.add("filan");
        hs.add("fesmekan");
        hs.add("agam");
        hs.add("böbrek yatağı");
        hs.add("poc güvec");
        hs.add("kusleme");
        long hsBitir=System.currentTimeMillis();
        System.out.println("hs run süresi = " + (hsBitir - hsBasla));


    }
}
