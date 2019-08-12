package StudentoAtsakymai;

public class Egzaminas {
    private String id;
    private String pavadinimas;
    private String tipas;


    public Egzaminas(String id, String pavadinimas, String tipas) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.tipas = tipas;
    }

    public Egzaminas() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public String getTipas() {
        return tipas;
    }

    public void setTipas(String tipas) {
        this.tipas = tipas;
    }
}
