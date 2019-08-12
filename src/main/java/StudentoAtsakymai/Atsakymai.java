package StudentoAtsakymai;

import java.util.ArrayList;

public class Atsakymai {

    private ArrayList<Atsakymas> atsakymas;

    public ArrayList<Atsakymas> getAtsakymas() {
        return atsakymas;
    }

    public void setAtsakymas(ArrayList<Atsakymas> atsakymas) {
        this.atsakymas = atsakymas;
    }

    public Atsakymai(ArrayList<Atsakymas> atsakymas) {
        this.atsakymas = atsakymas;
    }

    public Atsakymai() {
    }
}
