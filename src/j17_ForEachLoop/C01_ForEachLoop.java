package j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {
        /*
        for-each loop for loopun gelşmiş halidir.
        1.clean code -yazım kolaylığı
        2.code okuma kolaylığı
        3.hata yapma riskini azaltır
         */
        System.out.println("***for i ile***");

        List<Integer> sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        //TASK: list elemanlarını ayrı satırlara print ediniz.
        for (int i = 0; i < sayiList.size(); i++) {
            System.out.print(sayiList.get(i)+ " ");

        }
        System.out.print("***for each ile");
        for (Integer a:sayiList){
    System.out.print(a+" ");
}
// task: list elemanlarının ilk 3 elaman hariç tek olanları print ediniz
        System.out.println("***task3****");
        for (Integer a:sayiList.subList(3,sayiList.size())){
            if (a %2==1) {
                System.out.println(a+" ");
            }
        }


       //task list elemanlarının 2 ile 5 index arasındaki(2,3,4,5) elemanların toplamını print ediniz
        System.out.println("****task4****");

       int toplam=0;
        for (int a:sayiList.subList(2,6)){

            toplam+=a;
        }


        System.out.println("toplam = " + toplam);


    }
}
