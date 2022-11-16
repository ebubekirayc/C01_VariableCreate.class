package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> listIsim=new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        ArrayList<String> aOlmayanlistIsim=new ArrayList<>();//bos list
        for (int i = 0; i < listIsim.size(); i++) {
            if (!listIsim.get(i).toLowerCase().contains("a")){//listin her bir elemanı a bulundurmuyorsa
                aOlmayanlistIsim.add(listIsim.get(i));//yeni list'e a olmayan eleman eklendi
            }
        }
        System.out.println("aOlmayanlistIsim = " + aOlmayanlistIsim);
listIsim.clear();//list isim boşaltıldı
        listIsim.addAll(aOlmayanlistIsim);
        System.out.println("listIsim = " + listIsim);//[Veli, Omer]

    }
}
