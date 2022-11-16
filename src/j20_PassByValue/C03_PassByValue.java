package j20_PassByValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {
        /*
        java non-primitive(Class array list-> referans) data türlerinde obj kendisi değil de dataları değişirse
        objenin referans ve kendisi değişmediği için dataları değişikliini kalıcı yapar.
         */
        //Task-> list elemanları 24,20,87 iki farklı method ile list elemanlarını update
        // edip print eden code create ediniz
    //1.method with for each, 2. method-> set(index, value)

        List<Integer> list=new ArrayList<>(Arrays.asList(24,20,87));
        System.out.println("method öncesi list = " + list);

        listupdate1(list);//
        listupdate2(list);
        System.out.println("method sonrası list = " + list);



    }//main sonu
    public static void listupdate1(List<Integer> list){
        for (Integer v:list){
            v*=2;


        }
        System.out.println(list);



    }




    public static void listupdate2(List<Integer> list){
        for (int i = 0; i <list.size() ; i++) {
            list.set(i,list.get(i)*2);
        }

        System.out.println("list = " + list);

    }


}//class sonu
