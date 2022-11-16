package j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {

        /* TASK :
 Kullanıcıdan alacağınız 6 elemanlı bir dizinin
 sadece tek elemanlarını ayrı diziye bir metodda atayarak
  yazdırınız.

 */
        int sayiArr[]= new int[6];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < sayiArr.length; i++) {
            System.out.println(i+1+". elemanı ağam giresin :");
        sayiArr[i]= sc.nextInt();
        }
        tekElemanmlar(sayiArr);
        System.out.println("tekElemanmlar() = " + tekElemanmlar(sayiArr));


    }//main sonu

    private static ArrayList<Integer> tekElemanmlar(int[] sayiArr) {
        ArrayList<Integer>tekSayilar=new ArrayList<>();// tek sayıların atanacağı boş list
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i]%2==1){//array elemanları tek olma şartı atandı
                tekSayilar.add(sayiArr[i]);// tek olma şartı sağlayan array elemanı liste atandı
            }
        }
        return tekSayilar;









    }
}
