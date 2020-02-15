package Bank;

import java.util.List;

public class DaneKlientow extends DaneBanku{
    String imie;
    String nazwisko;
    double pesel;
    int id;

    public DaneKlientow(String nazwaBanku, List<DaneKlientow> listaKlientow, String imie, String nazwisko,
                        double pesel, int id) {
        super(nazwaBanku, listaKlientow);
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public double getPesel() {
        return pesel;
    }

    public void setPesel(double pesel) {
        this.pesel = pesel;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
