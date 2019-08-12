package Rezultatai.Nuskaitymas;

import EgzaminoAtsakymai.EgzaminoFailas;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class AtsakymuNuskaitymas {

    private static ArrayList<EgzaminoFailas> atsakymuListas = new ArrayList<>();

    public  ArrayList<EgzaminoFailas> getAtsakymuListas() {
        return atsakymuListas;
    }

    public void nuskaitytiIsJson() throws IOException {

        atsakymuListas.clear();

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/atsakymai/atsakymai.json");

        EgzaminoFailas atsIsJson = mapper.readValue(file, EgzaminoFailas.class);


        atsakymuListas.add(atsIsJson);

    }


}
