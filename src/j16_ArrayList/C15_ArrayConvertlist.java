package j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C15_ArrayConvertlist {
    public static void main(String[] args) {
        // king of Trick: Arrayrdan çevirilen list aray kaynaklı olduğu için array davranısı
        //gösterir boyut sabittir dolayısla remove add method çalışmaz

    String arrJavaCan[]={"Akif","Gamze","Musty","SevdeNur"};
        List<String> listJavaTar= Arrays.asList(arrJavaCan);//arrJavaCan değerleri list eleman olarak atandı
        System.out.println("listJavaTar = " + listJavaTar);//[Akif, Gamze, Musty, SevdeNur]
        System.out.println("listJavaTar.size() = " + listJavaTar.size());//4
       // listJavaTar.add("sefilcan haluk");//array a eleman eklenmezzzz
                                            //RTE->UnsupportedOperationException
        //ahanda kral trick-> list data type ArrayList tanımlanırsa RTE vermez kaynağı array
        // de olsa list davranır boyut esneklği yapar.

        ArrayList<String> listJavaTar1= new ArrayList<>(Arrays.asList(arrJavaCan));
        listJavaTar1.add("sefil haluk");

        System.out.println("listJavaTar1 = " + listJavaTar1);//[Akif, Gamze, Musty, SevdeNur, sefil haluk]



    }
}
