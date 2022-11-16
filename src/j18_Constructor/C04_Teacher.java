package j18_Constructor;

public class C04_Teacher {
    String ad;
    String soyad;
    int tecrube;
    String brans;
    double maas;
    int id;
    boolean emekli;


    public void derssaati(){
        System.out.println("ağam haftada 20 saatten sonra extraya girer ");
    }

    public C04_Teacher(){//p lini ediği defauld cons yerine py siz cons

    }
    //king of trick-> p li cons default con ezer

    public C04_Teacher(String ad, String soyad, int tecrube, String brans, double maas, int id, boolean emekli) {
        this.ad = ad;
        this.soyad = soyad;
        this.tecrube = tecrube;
        this.brans = brans;
        this.maas = maas;
        this.id = id;
        this.emekli = emekli;
    }

    @Override
    public String toString() {
        return "C04_Teacher{" +
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", tecrube=" + tecrube +
                ", brans='" + brans + '\'' +
                ", maas=" + maas +
                ", id=" + id +
                ", emekli=" + emekli +
                '}';


    }
}
