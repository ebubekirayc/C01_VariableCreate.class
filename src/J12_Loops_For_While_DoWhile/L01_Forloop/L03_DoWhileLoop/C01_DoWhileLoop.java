package J12_Loops_For_While_DoWhile.L01_Forloop.L03_DoWhileLoop;

public class C01_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop -> önce şart konrol edilir eğer şart sonucu true alınırsa body action çalışır
        do-While Loop -> önce body action calışır sonra şart kontrol edilir. şart turue ise döngü devam eder
        şart false ise döngü kırılır ve döngüden sonraki ilk satır çalışır.
        do-While loop -> daha çok game app de daha çok kullanılır.
        TRİCK : while loop şart sağlanmazsa hiç çalışmayabilir. ama do-while şart sağlasın sağlamasın
        en az bir kez çalışır
         */



        int yas=31;
        while (yas<33){
            System.out.println("agam yas "+yas+" gayet başarılı while body action... :)");


        yas++;
        }

        do {
            System.out.println("agam yas "+yas+" gayet başarılı do while body action");

        yas++;
        }while (yas<33);



    }
}
