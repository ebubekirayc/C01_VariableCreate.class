package j10_StringManipulations;

public class C01_Concatenation {
    public static void main(String[] args) {

        /**
         * concat() methodu içine (parametre) aldığı string variable ı calıştığı stringin sonuna ekler..
         * java da + işlemi yapılırken eğer en az bir string variable varsa java toplama deeğil concat yapar.
         *
         */
        String name = "Nur";
        String meslek = " Qa tester";
        System.out.println(name.concat(meslek));//Nur Qa tester
        System.out.println(name);//nur
        // TRİCK-> String methodları variable gecici değişiklikler yapar
        //ama değişken atam yapılırsa kalıcı değişir
        name=meslek.concat(name);
        System.out.println("name = " + name);//name= Qa tester nur
        System.out.println(name.concat(true +" :) "));
        //TRICK -> concat methodu parametre olarak string harici tüm dataları stringe çevirip concat eder


    }
}
