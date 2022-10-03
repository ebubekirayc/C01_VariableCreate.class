import java.util.Scanner;

public class Q09 {

    public static void main(String[] args) {

		/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
	    */


        Scanner sc = new Scanner(System.in);
        System.out.println("bir cümle yazınız");
        String cümle = sc.nextLine();
        int uzunluk = cümle.length();
        String sonuç = uzunluk % 2 != 0 ? "yarısı yokutur" : (cümle.substring(0, cümle.length() / 2));

        System.out.println(sonuç);
    }
}
