package Rezultatai;

public class StudentuRezultatas {

    private String id;
    private String vardas;
    private String pavarde;
    private Double ivertinimas;

    public StudentuRezultatas(String id, String vardas, String pavarde, Double ivertinimas) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.ivertinimas = ivertinimas;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public Double getIvertinimas() {
        return ivertinimas;
    }

    public void setIvertinimas(Double ivertinimas) {
        this.ivertinimas = ivertinimas;
    }
}
