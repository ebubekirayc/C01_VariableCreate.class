package j25_Encapsulation.Encapsulation01;

public class C02_Encapsulation {//pojo class
    private String name = "Gamze Hanım";
    private int id = 1001;

    public C02_Encapsulation() {


    }

 //public String getName() {
 //    return name;
 //}

 //public void setName(String name) {
 //    this.name = name;
 //}

 //public int getId() {
 //    return id;
 //}

 //public void setId(int id) {
 //    this.id = id;
 //}

    public C02_Encapsulation(String name, int id) {
        this.name = name;
        this.id = id;
    }

 public String isimVer() {
     return name;
 }
 public int idVer() {
     return id;
 }
 public void isimDegis(String isim) {
     this.name = isim;
 }
   @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", id=" + id;
    }



}
