package j29_Exceptions;

public class C04_NullPointerException {
    public static void main(String[] args) {
        //NullPointerException-> null ataması yapılan bir String'de length() method run edildinginde oluşan RTE exception



        String str="";
        System.out.println("str.length() = " + str.length());//str.length() = 0


        String str1=null;
       // System.out.println("str1.length() = " + str1.length());//NullPointerException ->kod kırılır

        try {
            System.out.println("str1.length() = " + str1.length());
            System.out.println("excp. fırlatmadı kod çalıştı ");
        }catch (NullPointerException e){
            System.out.println("agam hele dutlukdaki string boyutum heseaplanır");
        }









        System.out.println("agam sorun handle edildi devamkee..");//kod çalışırsa bu kod çıkar


    }//main sonu

}//class sonu
