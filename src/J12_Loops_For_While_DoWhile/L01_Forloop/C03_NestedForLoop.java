package J12_Loops_For_While_DoWhile.L01_Forloop;

public class C03_NestedForLoop {
    public static void main(String[] args) {

        /*
        eğer bir döngünün bodysinde başka bir döngü bulunuyorsa bu tür döngülere nested loop içice döngü denir.
        iç döngü dış döngünün her adımında tekrar çalışır
        içiçe döngülerde en içteki döngü en önce çalışır..
         */
        for (int apartman = 1; apartman <= 10; apartman++) {
            System.out.println("apartman döngü : " + apartman);

            for (int daire = 1; daire < 6; daire++) {
                System.out.println("apartman : " + apartman + " için daire döngü j :" + daire);

            }

        }


    }//main sonu
}
