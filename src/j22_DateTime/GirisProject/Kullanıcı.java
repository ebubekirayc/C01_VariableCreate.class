package j22_DateTime.GirisProject;


import java.time.LocalDateTime;
//Task 1. step

public class Kullanıcı {
    String name;//obj de değer alacak inst. variable
    LocalDateTime kayıtZamanı;//obj de değer alacak  inst. variable

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//full paramatleri telescopik consraktır
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }

    @Override
    public String toString() {// bu classan oluşturulan obj print etmek için obj datalarını stringe çevirir
        return
                "name='" + name + '\'' +
                ", kayıtZamanı=" + kayıtZamanı +
                '}';
    }
}
