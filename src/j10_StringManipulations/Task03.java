package j10_StringManipulations;

public class Task03 {
    public static void main(String[] args) {
        //"Alamanya" Stringindeki ikinci 'a' caharacterinin indexini bulunuz.
        String str="Alamanya";
        System.out.println(str.indexOf('a', str.indexOf('a') + 1));


    }
}
