package j26_Inheritance.task02;

public class SubClass extends SuperClass{

    public static void main(String[] args) {

        SubClass obj=new SubClass();
        obj.my_method();



    }
    int num=10;
public void my_method(){
    goster();//SubClass call
    super.goster();//superClass Call
    System.out.println("subClass num :"+num);
    System.out.println("subClass num :"+super.num);


}
    @Override
    public void goster() {

        System.out.println("Bu method sub classsın görüntülenme methodudur.");
    }
}
