package J14_Scope;

public class C04_LocalVariable {
    public static void main(String[] args) {

        int yas=33;//main method local variable
        System.out.println("yas = " + yas);//33
        for (int i = 0; i <7 ; i++) {//for loop başı
            System.out.println(yas+"  :) ");//las local variable aynı localle call edildi

      i++;//i loop variable local içi call edildi
        }//for loop sonu

 yas=35;
    }//main sonu


}
