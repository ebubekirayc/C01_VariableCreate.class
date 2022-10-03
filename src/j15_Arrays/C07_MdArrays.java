package j15_Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
        //TASK-> tum elemanlarını toplayan cade create ediniz
        int apt[][] = {
                {1, 2, 3},//0.kat
                {10, 20},//1.kat
                {101}};// 2. kat
        //        //          3 katlı apartman
int toplam=0;
        for (int kat = 0; kat < apt.length; kat++) {
            for (int daire = 0; daire < apt[kat].length; daire++) {

                toplam+=apt[kat][daire];

            }
        }
        System.out.println("arr deki tüm elemanlar toplamı : "+toplam);


    }


}
