package day_01;

public class Q07_Converting {
    public static void main(String[] args) {
/*
   galonu litreye ceviren bir java programi yaziniz
       1 gallon = 3.785 litre
   litreyi galona ceviren bir java programi yaziniz
       1 litre = 1/3.785 gallon

   //  Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın. (Scanner class)
   // formül
   // c = (f-32)*5/9
*/

        int gallon=1000;
        double litre=gallon*3.785;
        String soru1=gallon + " galon değeri " + litre + " litredir ";
        System.out.println("soru1 = " + soru1);


        double litres = 100;
        double galon = litres/3.785;
        String soru2 = litres + " litre değeri " + galon + " galona eşittir";

    }
}
