package EgzaminoAtsakymai;

public class Atsakymas {

    private int klausimas;
    private String atsakymas;

    public Atsakymas(int klausimas, String atsakymas) {
        this.klausimas = klausimas;
        this.atsakymas = atsakymas;
    }

    public Atsakymas() {
    }

    public int getKlausimas() {
        return klausimas;
    }

    public void setKlausimas(int klausimas) {
        this.klausimas = klausimas;
    }

    public String getAtsakymas() {
        return atsakymas;
    }

    public void setAtsakymas(String atsakymas) {
        this.atsakymas = atsakymas;
    }
}
