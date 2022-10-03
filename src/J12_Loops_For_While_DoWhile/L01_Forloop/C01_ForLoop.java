package J12_Loops_For_While_DoWhile.L01_Forloop;

public class C01_ForLoop {
    public static void main(String[] args) {
//41 kere maşallah print ediniz
      // System.out.println("maşallah");
      // System.out.println("maşallah");
      // System.out.println("maşallah");
      // System.out.println("maşallah");
      // System.out.println("maşallah");
      // System.out.println("maşallah");
      // System.out.println("maşallah");
      // System.out.println("maşallah");
      // System.out.println("maşallah");
      // System.out.println("maşallah");
        /*
        loop ->döngü tekrarlanan aksiyonlar için kullanılan code blok larıdır
         */
        //başlangiç  //bitiş //degişim
      /*  for (int i=1; i<=41; i++){//döngü boyunca tekrarlanacaek aksiyon
            System.out.println(i+". maşallah");//41 tane maşallah yazar
            System.out.println(i+" selam javacanlar bolcana offer");
        }

    //Task 2 basamaklı tek sayıları yan yana print eden code create ediniz->11,13,15..99
        for (int i=11; i<=99; i+=2){
            System.out.print(i+" ");
        }
        System.out.println("******");
for (int i=10; i<100; i++){
    if (i%2==1){
        System.out.print(i+" ");
    }
}

*/
        //çalışmayan loop
for (int i =0; i>10;i++){//şartı sağlamayan->false olan for body run olmaz kod kırlarak //
                        // sıradaki(41) satırdan devam eder
    System.out.println("selam javacan");
}
//durmayan loop
        System.out.println("ağam bu metni okuduysan yukarıdaki for çalışmadı");
for (int i =0; i>=0; i++){
    System.out.println(i);
}




    }
}
