package J12_Loops_For_While_DoWhile.L01_Forloop.L02_WhileLoop;

public class c04_kendiaraştırmam
{
    public static void main(String[] args) {



    int deger = 60;
    int bolen = 1;
    int tamBolenlerToplami = 0;
while(bolen <= deger) {
        if(deger%bolen == 0) {
            System.out.println(deger+" sayısı "+bolen+" sayısına tam bölünür.");
            tamBolenlerToplami = tamBolenlerToplami+bolen;
        }
        bolen++;
    }
System.out.println("\n"+deger+" sayısının tam bölenlerinin toplamı: "+tamBolenlerToplami);
}
}
