package j23_Varargs_StringBuilder.Varargs;

public class C02_Varargs {
    public static void main(String[] args) {
        /*
        arr ve varargs method:
         */
        int arr[]={24,42,33,19,34,45,58,38};


        //task1 -> verilen array elemanları toplamını print eeden METHOD create ediniz..
        //tas2-> task1 varargs ile çalışınız

        System.out.println("arrTopla(arr) = " + arrTopla(arr));
        System.out.println("varargsTopla int değer toplam: " + varargsTopla(24, 42, 33, 19, 34, 45, 58, 38));
        System.out.println("varargsTopla arr değer toplam :  " + varargsTopla(arr));
//ahanda trick varargs method parametreleri array gibi tanımladğığı için varargs
// methoda parametre olarak array de verilebilir



    }//main sonu...


    public static int arrTopla(int[] a){//task1 cevap
        int toplam=0;
        for (int w:a){
            toplam+=w;
        }


        return toplam;


    }
    public static int varargsTopla(int...b){//task2
        int toplam=0;




        for(int s:b) {
            toplam+=s;
        }


        return toplam;



    }



}//class sonu
