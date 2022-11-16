package j18_Constructor;

public class C03_StudentRunner {

    public static void main(String[] args) {
     C03_Student ogrc1=new C03_Student();//oğrc1 obj create edildi
     ogrc1.ad="fatih";
     ogrc1.soyad="ataş";
     ogrc1.sınıf=1;
     ogrc1.okulNo=1001;
     ogrc1.ortalama=77;
     ogrc1.takdir=false;


        System.out.println("ogrc1 = " + ogrc1);//ogrc1 = j18_Constructor.C03_Student@5f2050f6


        ogrc1.mezuniyet();//ağam diploman hayırlı olsun


    }
}
