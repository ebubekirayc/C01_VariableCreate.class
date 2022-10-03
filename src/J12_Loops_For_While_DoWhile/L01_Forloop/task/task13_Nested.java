package J12_Loops_For_While_DoWhile.L01_Forloop.task;

public class task13_Nested {
    public static void main(String[] args) {
/*
A
B B
C C C
D D D D
E E E E E
F F F F F F
şekli yazdırınız
*/

        int harf=65;// A ascii değeri
        for (int i = 0; i <6 ; i++) {//apartman döngü
            for (int j = 0; j <=i ; j++) {//daire döngü
                System.out.print((char)(harf+i)+" ");

            }
            System.out.println();//dummy
        }




    }
}
