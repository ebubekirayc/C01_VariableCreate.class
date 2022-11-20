package j34_Iterators;

import java.util.*;

public class C01_Iterators {
    public static void main(String[] args) {

       /* List<String> l1=new ArrayList<>(Arrays.asList("Nur","Gamze","Erol","Bekir"));
        System.out.println("l1 list ilk hali = " + l1);
//l1 elemanları for loop ile print ediniz

        for (int i = 0; i < l1.size(); i++) {
            System.out.println("l1.get(i) = " + l1.get(i)+" ");
        }
        System.out.println("********");

//l1 elamanları for-each loop ile print ediniz
        for (String w:l1) {
            System.out.println(w+" ");

        }

        System.out.println();
        System.out.println("***********");



        //lr herbir elemanı :-) for loop ile update edip print ediniz..
        for (int i = 0; i < l1.size(); i++) {


            System.out.println("l1 :-) update sonrası"+l1);
            l1.set(i,l1.get(i)+" :-)");

        }

        //l1 herbir elemanı  :-( for each loop ile update edip print ediniz...

        for (String w:l1) {
            w+=" :-(";
        }
        /*
        index desteklemeyen yapılarda tekrarlayan aksiyon için for-each loop update yapamayabilir yukardaki taskta olduğu gibi
        bu durumda java ıterator interface den tanımlanacak variable ile tekrarlayan index olmadan yapılır.


        System.out.println();
        System.out.println("*****Iterators******");

        .iterator();//ıterator intfaceden it1 variable tanımlandı . atama olarak l1 elemanları atandı

        while (it1.hasNext()){
            //hasNext()->//it1 elemanları için pointer old yerde eleman varsa true yoksa false vreir ve pointer bir sonrakieleman önüne koyulur

            it1.next();//next()-> listin pointer önündeki elemanın return eder
            System.out.print(it1.next()+" ");

        }
*/



        List<String> l1 = new ArrayList<>(Arrays.asList("Nur", "Gamze", "Erol", "Bekir"));
     System.out.println("l1 List ilk hali : " + l1);//[Nur, Gamze, Erol, Bekir]

     // l1 elamanları for loop ile print ediniz...

     for (int i = 0; i < l1.size(); i++) {
         System.out.print(l1.get(i) + " ");// Nur Gamze Erol Bekir
     }
     System.out.println();
     System.out.println("   ***   ");

     // l1 elamanları for-each loop ile print ediniz...

     for (String w : l1) {
         System.out.print(w + " ");//Nur Gamze Erol Bekir
     }
     System.out.println();
     System.out.println("   ***   ");

     // l1 herbir elamanı :-)  for loop ile update edip  print ediniz...

     for (int i = 0; i < l1.size(); i++) {
         l1.set(i,l1.get(i)+" :-) ");
     }
     System.out.println("l1 :-) update sonrası :"+l1);//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]

     System.out.println();
     System.out.println("   ***   ");

     // l1 herbir elamanı :-(  for-each loop ile update edip  print ediniz...

     for (String w:l1){
         w+=" :-( ";

     }
     System.out.println("l1 :-) update sonrası :"+l1);//[Nur :-) , Gamze :-) , Erol :-) , Bekir :-) ]
     /*
     index desteklemeyn yapılarda tekrarlayan  aksiyon için for-each lopp update yapamaybilir yukarıdaki task'de oldugu gibi
     Bu durumda java ıterator intarface'den tanımlanacak variable ile takrarlayan aksiyonlar index olmadan yapılır.
      */

     System.out.println();
     System.out.println("   *** Iterators ***   ");

     Iterator<String > it1=l1.iterator();//Iterator intface'den it1 variable tanımlandı .Atama olarak l1 elemanları atandı
     while(it1.hasNext()){
         //hasNext()->it1 elamanları için pointer old yerde elekman varsa true yoksa false verir ve pointer bir sonrakı elelman önüne koyulur
         // next()-> list'in pointer önündeki  elemnını return eder
         System.out.print(it1.next()+" ");//Nur :-)  Gamze :-)  Erol :-)  Bekir :-)

     }

        List<String> l2 = new ArrayList<>(Arrays.asList("baran", "gülsüm", "akif", "nazım"));

     //l2 elemanlarını ıterator ile silip print ediniz-> l2=[]
        System.out.println("\"iterator öncesi l2\" = " + l2);
        Iterator<String> it2=l2.iterator();
        while (it2.hasNext())//tekrardaki pointer onönde eleman varlığını kontrol eder
        {
            it2.next();//tekrardaki pointer önündeki elemanı verir
            it2.remove();//next ile gelen elemanı siler
        }
        System.out.println("iterator remove sonrası l2 = " + l2);//
        System.out.println("****listiterators****");

        List<String> l3 = new ArrayList<>(Arrays.asList("baran", "gülsüm", "akif", "nazım"));
        //l3 elemanlarını ıterator ile :-) set edip print ediniz->


        System.out.println("iterator öncesi l3 = " + l3);
        ListIterator<String>it3=l3.listIterator();//tekrar iterator yapısı tanımlandı

        while (it3.hasNext()){

            it3.set(it3.next()+" :-)");//tekrardaki next() ile gleen elemanı :-) concat ederek update edildi
        }

        System.out.println("iterator set sonrası l3 = " + l3);



        System.out.println("****listiterators****");


        System.out.println("   *** ListIterators ***   ");
        List<String> l4 = new ArrayList<>(Arrays.asList("Serhat ", "Yakup", "Mustafa", "Nazlı"));
        System.out.println("ListIterator öncesi l3 : " + l3);//[Baran, Gülsüm, Akif, Nazım]
        // l3 elamanlarının ilk harfi buyuk kln 3 hafi *** karakteri ve l4 listi ekleyip print ediniz
        ListIterator<String> ebikGabık = l3.listIterator();//tekrar iterator yapısı tanımlandı

        while (ebikGabık.hasNext()) {
            ebikGabık.set(ebikGabık.next().toUpperCase().charAt(0) + "***");//next()ilen l4 elamanbı ilk harf byk kalan 3 harf*** le set edildi
            ebikGabık.add(l4.toString());//tekrardaki updatebedilen l3 e l4 add edildi
        }


        System.out.println("Listiterator  set ve add sonrası l3 : " + l3);// [Baran :-), Gülsüm :-), Akif :-), Nazım :-)




    }
}
