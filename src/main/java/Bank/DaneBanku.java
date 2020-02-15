package Bank;

import java.util.List;

public class DaneBanku {

    String NazwaBanku;
    List<DaneKlientow> ListaKlientow;

    public DaneBanku(String nazwaBanku, List<DaneKlientow> listaKlientow) {
        NazwaBanku = nazwaBanku;
        ListaKlientow = listaKlientow;
    }

    public String getNazwaBanku() {
        return NazwaBanku;
    }

    public void setNazwaBanku(String nazwaBanku) {
        NazwaBanku = nazwaBanku;
    }

    public List<DaneKlientow> getListaKlientow() {
        return ListaKlientow;
    }

    public void setListaKlientow(List<DaneKlientow> listaKlientow) {
        ListaKlientow = listaKlientow;
    }

}
