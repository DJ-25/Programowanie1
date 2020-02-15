package Bank;

import java.util.List;

public class RachunkiKlientow extends DaneKlientow{
    String typ;
    double stanRachunku;

    public RachunkiKlientow(String nazwaBanku, List<DaneKlientow> listaKlientow, String imie, String nazwisko,
                            double pesel, int id, String typ, double stanRachunku) {
        super(nazwaBanku, listaKlientow, imie, nazwisko, pesel, id);
        this.typ = typ;
        this.stanRachunku = stanRachunku;

    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public double getStanRachunku() {
        return stanRachunku;
    }

    public void setStanRachunku(double stanRachunku) {
        this.stanRachunku = stanRachunku;
    }
}
