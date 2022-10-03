package j15_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.print("kaç elemanlı array istiyorsun : ");
        //int arrBoyut= sc.nextInt();
        int arr[]=new int[sc.nextInt()];
        for (int i = 0; i <arr.length ; i++) {

            System.out.println(i+". index elemanı giriniz");
            arr[i]= sc.nextInt();
        }
        System.out.println("agam istediğin array : "+ Arrays.toString(arr));
        int arrToplam=0;//local variable
        for (int i = 0; i < arr.length; i++) {
            arrToplam+=arr[i];
            System.out.println("array eleman toplamları : " + arrToplam);

        }




    }
}
