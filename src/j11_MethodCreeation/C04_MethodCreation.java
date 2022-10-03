package j11_MethodCreeation;

public class C04_MethodCreation {
    public static void main(String[] args) {
        String name="haluk";
        System.out.println("car car "+name);
        C04_MethodDeopo.gecmeNotu(24);//Depo classtan class name ile method call ettik ->diğer köyün amelesi
        /*
        farklı classtan method call etmek için..
        1. method static-> gökteki güneş gibi
        2.className.methodName() şeklinde call edilir
          aynı classdaki method doğrudan methodName ile call edilir...

         */
        selamVer();//aynı classtan methodName ile call edildi->kendi köyümün amelesi


    }//main sonu
    public static void selamVer(){
        System.out.println("ağam selamlar devamkee");
    }

}
