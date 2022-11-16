package j22_DateTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C08_Period {
    public static void main(String[] args) {
        //period= iki tarih arasında geçen tekrarlanabilen zamanı tutar
        LocalDate bugün=LocalDate.now();

        LocalDate fatihbirth=LocalDate.of(1994,3,24);
        Period fark=Period.between(fatihbirth,bugün);
        System.out.println("fark = " + fark);//fark = P-28Y-7M-2D


        System.out.println("fark.toTotalMonths() = " + fark.toTotalMonths());//fark datasının ay cinsinden değeri
        System.out.println("fark.getDays() = " + fark.getDays());//fark datasının gün bilgisi
        System.out.println("     *****  ***** * ** ** * ** * * * ** ** * ** *  *");
        System.out.println("bugün = " + bugün);

        Period period5Gun=Period.ofDays(5);//5 günde bir tekrarlayan period
        Period period7Ay=Period.ofMonths(7);//7 ayda bir tekrarlanan period
        Period periodX=Period.ofMonths(7).ofDays(21);//
            //TRİCK -> period tanımlamada birden çok zaman parametresi tanımlanırsa son
                       // parametre calışır diğerlerini ezer

        bugün=bugün.plus(period5Gun);//bugüne5 günluk period eklendi
        System.out.println("bugün = " + bugün);
        bugün=bugün.minus(period7Ay);//bugüne 7 aylık period geri gidildi
        System.out.println("bugün = " + bugün);
        bugün=bugün.plus(periodX);//bugüne periodx period gidildi
        System.out.println("bugün = " + bugün);

        //task->5.9.2022 de başlayan kurs 9 ay olduğuna göre bitiş tarihini print eden code create ediniz

        LocalDate baslangc=LocalDate.of(2022,9,5);
        System.out.println("baslangc = " + baslangc);
        Period kursSüre=Period.ofMonths(9);
        System.out.println("kursSüre = " + kursSüre);
        System.out.println("kurs bitiş tarihi"+baslangc.plus(kursSüre).format(DateTimeFormatter.ISO_DATE));


    }
}
