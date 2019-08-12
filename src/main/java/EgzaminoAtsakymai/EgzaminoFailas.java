package EgzaminoAtsakymai;

import java.util.ArrayList;

public class EgzaminoFailas {

    private Egzaminas egzaminas;
    private ArrayList<Atsakymas> atsakymai;

    public EgzaminoFailas() {
    }

    public EgzaminoFailas(Egzaminas egzaminas, ArrayList<Atsakymas> atsakymai) {
        this.egzaminas = egzaminas;
        this.atsakymai = atsakymai;
    }

    public Egzaminas getEgzaminas() {
        return egzaminas;
    }

    public void setEgzaminas(Egzaminas egzaminas) {
        this.egzaminas = egzaminas;
    }

    public ArrayList<Atsakymas> getAtsakymai() {
        return atsakymai;
    }

    public void setAtsakymai(ArrayList<Atsakymas> atsakymai) {
        this.atsakymai = atsakymai;
    }
}
