package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		
		
		// kullanicidan 2 tam sayi alip bu 2 tamsayinin  dort islem sonucunu yazdiriniz.
		
Scanner scan=new Scanner(System.in);
		System.out.println("iki tane tam sayı giriniz :");
		double x= scan.nextDouble();
		double y= scan.nextDouble();
		double toplama=x+y;
		double çıkartma=x-y;
		double çarpma=x*y;
		double bölme=x/y;
		System.out.println("toplama = " + toplama);
		System.out.println("çıkartma = " + çıkartma);
		System.out.println("çarpma = " + çarpma);
		System.out.println("bölme = " + bölme);


	}

}
