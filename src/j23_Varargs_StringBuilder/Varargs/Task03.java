package j23_Varargs_StringBuilder.Varargs;

public class Task03 {
    public static void main(String[] args) {
        /*
Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
 */



        int sayi=5;
        String str1="muharrem";
        String str2="uğur";
        String str3="ebikGabık";


carpStringenUzun(sayi,str1,"JavaCan",str2,str3);







    }//main sonu

    public static void carpStringenUzun(int carpacakSayi,String... str){

        String enUzun="";
        for (String a:str){
            if (a.length()>enUzun.length()){
                enUzun=a;
            }
        }
        System.out.println("ağam istediğin değer : "+(carpacakSayi*enUzun.length())+" "+enUzun);




    }





}//class sonu
