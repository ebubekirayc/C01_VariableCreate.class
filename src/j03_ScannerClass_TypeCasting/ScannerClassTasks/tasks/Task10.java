package j03_ScannerClass_TypeCasting.ScannerClassTasks.tasks;

import java.util.Scanner;

public class Task10 {
/*
Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazınız. formül c = (f-32)59
  */  public static void main(String[] args) {


        double c,f;
        Scanner scan=new Scanner(System.in);
    System.out.println("fahrenheit:");
    f= scan.nextDouble();
    c=(f-32)*59;
    System.out.println("celcius = " + c);


}


}
