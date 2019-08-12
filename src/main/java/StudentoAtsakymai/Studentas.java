package StudentoAtsakymai;

public class Studentas {
    private String id;
    private String vardas;
    private String pavarde;

    public Studentas(String id, String vardas, String pavarde) {
        this.id = id;
        this.vardas = vardas;
        this.pavarde = pavarde;
    }

    public Studentas() {
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
}
