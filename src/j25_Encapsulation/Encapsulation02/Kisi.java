package j25_Encapsulation.Encapsulation02;

public class Kisi {
    /*
    kisi pojo class için fields->ad, soyad, password(String), yas
    tüm  field'ları kullanıcı görebilmeli ve password haric update edebilmeli
    password encapsulated update edilmemeli. yas varibale nefatif değer girmeye karşı encapsulated
    (password encapsulated update edilmemeli)


    runner class'da obj ile field'ları print eden code create ediniz
     */

    //fields...
    String ad;
    String soyad;
    private String password;
    private int yas;

    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = yas;
    }

    public String getPassword() {
        return password;
    }


    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = Math.abs(yas);//parametre gelen yas- den kurtuludu
    }
}
