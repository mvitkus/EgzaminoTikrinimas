package StudentoAtsakymai;

import java.util.ArrayList;

public class StudentoGeneravimas {

    private Studentas studentas;
    private Egzaminas egzaminas;
    private ArrayList<Atsakymas> atsakymai;

    public StudentoGeneravimas() {
    }

    public StudentoGeneravimas(Studentas studentas, Egzaminas egzaminas, ArrayList<Atsakymas> atsakymai) {
        this.studentas = studentas;
        this.egzaminas = egzaminas;
        this.atsakymai = atsakymai;
    }

    public Studentas getStudentas() {
        return studentas;
    }

    public void setStudentas(Studentas studentas) {
        this.studentas = studentas;
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
