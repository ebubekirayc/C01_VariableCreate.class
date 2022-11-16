package j18_Constructor;

public class C04_TeacherRunner {
    public static void main(String[] args) {

            C04_Teacher ogrt1=new C04_Teacher();//ogrt1 create edildi

        ogrt1.ad="muharrem";
        ogrt1.soyad="Güzel";
        ogrt1.brans="Qa";
        ogrt1.emekli=false;
        ogrt1.maas=23000;
        ogrt1.tecrube=11;
        ogrt1.derssaati();
        System.out.println(ogrt1);

        C04_Teacher ogrt2 =new C04_Teacher("uğur","javacan",15,"dev",10000,333,false);

        System.out.println(ogrt2);//C04_Teacher{ad='uğur', soyad='javacan', tecrube=15, brans='dev', maas=10000.0, id=333, emekli=false}
    }
}
