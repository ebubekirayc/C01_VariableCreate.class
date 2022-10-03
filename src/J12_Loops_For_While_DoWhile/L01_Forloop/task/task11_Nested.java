package J12_Loops_For_While_DoWhile.L01_Forloop.task;

public class task11_Nested {
    /*
    A
    A B
    A B C
    A B C D
    A B C D E
    A B C D E F
    şeklini yazdırınız.  65=A'nın ascıı değeri
    */
    public static void main(String[] args) {

        int harf=65;
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print((char)(harf+j)+" ");
            }
            System.out.println();//dummy
        }












    }




}
