package Rezultatai;

import java.util.ArrayList;

public class Egzaminai {

    ArrayList<Rezultatas> egzaminoRezultatas;

    public Egzaminai(ArrayList<Rezultatas> egzaminoRezultatas) {
        this.egzaminoRezultatas = egzaminoRezultatas;
    }

    public ArrayList<Rezultatas> getEgzaminoRezultatas() {
        return egzaminoRezultatas;
    }

    public void setEgzaminoRezultatas(ArrayList<Rezultatas> egzaminoRezultatas) {
        this.egzaminoRezultatas = egzaminoRezultatas;
    }
}
