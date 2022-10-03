package J13_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        //TASK : Stringi data type BİR PİN DATASINI  3 giriş hakkında kontrol eden code kreate ediniz


        Scanner sc=new Scanner(System.in);


        String dgruPin= "javaCAN";


int girisHakkı=3;
while (true){
    System.out.println("pini giriniz");
    String agaPin= sc.nextLine();
    if (agaPin.equals(dgruPin)){
        System.out.println("başarılı giriş ");
        break;
    }else System.out.println("yanlış pin girdiniz");
    girisHakkı--;
    System.out.println("kalan giriş hakkı : "+girisHakkı);
    if (girisHakkı==0){
        System.out.println("3 kere yanlış giriş yaptınız pin bloke :");
        break;
    }




}











    }
}
