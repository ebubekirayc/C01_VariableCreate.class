package j22_DateTime;

import java.time.LocalDate;

public class C07_ComparingDateTime {//karşılaştırma
    public static void main(String[] args) {
        LocalDate bugün=LocalDate.now();
        LocalDate falanGün=bugün.minusDays(2);
        LocalDate fesmekanGün=bugün.plusDays(3);
        LocalDate fatihbirth=LocalDate.of(1993,5,19);



        System.out.println("bugün = " + bugün);//bugün = 2022-10-26
        System.out.println("falanGün = " + falanGün);//falanGün = 2022-10-24
        System.out.println("fesmekanGün = " + fesmekanGün);//fesmekanGün = 2022-10-29

//TRİCK is ile başlayan methodlar boolean return eder

        System.out.println("bugün.isBefore(falanGün) = " + bugün.isBefore(falanGün));
        System.out.println("bugün.isBefore(fesmekanGün) = " + bugün.isBefore(fesmekanGün));
        System.out.println("falanGün.isBefore(fesmekanGün) = " + falanGün.isBefore(fesmekanGün));


        System.out.println("bugün.isAfter(falanGün) = " + bugün.isAfter(falanGün));
        System.out.println("falanGün.isAfter(fesmekanGün) = " + falanGün.isAfter(fesmekanGün));

        System.out.println("bugün.isLeapYear() = " + bugün.isLeapYear());


       int fark= bugün.compareTo(falanGün);

        System.out.println("fark = " + fark);

int fark1=falanGün.compareTo(fesmekanGün);
        System.out.println("fark1 = " + fark1);



        int fark2=fesmekanGün.compareTo(falanGün);
        System.out.println("fark2 = " + fark2);


        System.out.println("bugün.compareTo(fatihbirth) = " + bugün.compareTo(fatihbirth));
        //2022.10.26->1993.5.19

      /*     ComperaTo komutu işlevi:
      2020-05-23 >  2018-04-02   compareTo =>  2  en büyük fark yılda olduğu için
      2020-05-23 >  2020-04-02   compareTo =>  1  en büyük fark ayda  olduğu için
      2020-05-23 >  2020-05-02   compareTo =>  21  en büyük fark günde olduğu için    */






    }
}
