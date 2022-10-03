package j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        //Array copy.. copyOf(arr, newLength);-> girilen arriyn newLength kadar ilk elmanını kopyalar
        int sayi[]={63,21,47,27,35,12,36,31,46,24};
        int yeniArr[]= Arrays.copyOf(sayi, 5);
        System.out.println("ilk beş elemanı kopyalanan yeniArr) = " + Arrays.toString(yeniArr));//[63, 21, 47, 27, 35]

int baskaArr[]=Arrays.copyOfRange(sayi, 3,8);//3 dahil 8 haric index elemanlar kopylanır//[27, 35, 12, 36, 31]


        System.out.println("sayi arr den özel kopyalanan başka Arr : = " + Arrays.toString(baskaArr));

        //Array'i belirli bir eleman ile update (set) etme... fill(arr,value);
        Arrays.fill(sayi,99);//[99, 99, 99, 99, 99, 99, 99, 99, 99, 99]
        System.out.println("sayı arr i 99 ile full lenmiş hali = " + Arrays.toString(sayi));
        Arrays.fill(sayi,3,7,33);
        System.out.println("sayi arr i 3 ile 7 index i arası 33 ile fullenmiş hali = " + Arrays.toString(sayi));


    }
}
