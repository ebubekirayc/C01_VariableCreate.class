package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        //Task-> kullanıcıdan alınan değerlerle bir int array elemanlarını
        // büyukten küçuge print eden code create ediniz.
        Scanner sc=new Scanner(System.in);
        System.out.print("kaç elemanlı array istiyorsun : ");
        int arrBoyut= sc.nextInt();
        int arr[]=new int[arrBoyut];
        for (int i = 0; i <arrBoyut ; i++) {

            System.out.println(i+". index elemanı giriniz");
        arr[i]= sc.nextInt();
        }
        System.out.println("agam istediğin array : "+Arrays.toString(arr));
        Arrays.sort(arr);//arr k->b sortingen:) yapıldı
        for (int i = arr.length-1/*en buyuk sondaki elemandan döngü başlar*/ ;i>=0; i--) {
            System.out.print(arr[i] + " ");
        }


    }
}
