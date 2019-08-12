package Rezultatai;

import java.util.ArrayList;

public class Rezultatas {

    private String id;
    private String pavadinimas;
    private ArrayList<StudentuRezultatas> studentuRezultatai;


    public Rezultatas(String id, String pavadinimas, ArrayList<StudentuRezultatas> studentuRezultatai) {
        this.id = id;
        this.pavadinimas = pavadinimas;
        this.studentuRezultatai = studentuRezultatai;
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

    public ArrayList<StudentuRezultatas> getStudentuRezultatai() {
        return studentuRezultatai;
    }

    public void setStudentuRezultatai(ArrayList<StudentuRezultatas> studentuRezultatai) {
        this.studentuRezultatai = studentuRezultatai;
    }
}
