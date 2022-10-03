package J14_Scope;

public class C03_Scope {
    public static void main(String[] args) {
        C01_İnstanceVariable kus=new C01_İnstanceVariable();
        kus.name="HÜMA";
        kus.developerMı=false;
        System.out.println("kus.name = " + kus.name);//hüma

        C01_İnstanceVariable.staticMethod();//class name ile static method call
kus.non_staticMethod();// obj ile non-static method call
    }

}
