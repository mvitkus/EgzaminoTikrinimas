package EgzaminoAtsakymai;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class EgzaminoFailoGeneravimas {

    public static void generuotiEgzaminoFaila() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite egzamino ID: ");
        String egzaminoId = sc.next();
        System.out.println("Iveskite egzamino pavadinima: ");
        String egzaminoPavadinimas = sc.next();
        System.out.println("Iveskite egzamino tipa: ");
        String egzaminoTipas = sc.next();
        System.out.println("Iveskite klausimu kieki: ");
        int klausimuKiekis = sc.nextInt();
        EgzaminoFailas egzaminoFailas = new EgzaminoFailas(

                new Egzaminas(egzaminoId, egzaminoPavadinimas,egzaminoTipas), new ArrayList<Atsakymas>(){{

                    for(int i=1; i<=klausimuKiekis;i++){
                        System.out.println("Iveskite "+i+" atsakymo raide: ");
                        String atsakymoRaide = sc.next();
                        add(new Atsakymas(i, atsakymoRaide));
                    }

        }}
        );

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/atsakymai/atsakymai.json");
        try {
            mapper.writeValue(file,egzaminoFailas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void generuotiEgzaminoFailaRandom() {

        String egzaminoId ="124";
        String egzaminoPavadinimas="OOP pagrindai";
        String egzaminoTipas="testas";
        EgzaminoFailas egzaminoFailas = new EgzaminoFailas(

                new Egzaminas(egzaminoId, egzaminoPavadinimas,egzaminoTipas), new ArrayList<Atsakymas>(){{
            add(new Atsakymas(1, "a"));
            add(new Atsakymas(2, "a"));
            add(new Atsakymas(3, "b"));
            add(new Atsakymas(4, "c"));
            add(new Atsakymas(5, "a"));
            add(new Atsakymas(6, "c"));
            add(new Atsakymas(7, "b"));
            add(new Atsakymas(8, "b"));
            add(new Atsakymas(9, "a"));
            add(new Atsakymas(10, "a"));
            add(new Atsakymas(11, "a"));
            add(new Atsakymas(12, "c"));
            add(new Atsakymas(13, "b"));
            add(new Atsakymas(14, "c"));
            add(new Atsakymas(15, "a"));



        }}
        );

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/atsakymai/atsakymai.json");
        try {
            mapper.writeValue(file,egzaminoFailas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
