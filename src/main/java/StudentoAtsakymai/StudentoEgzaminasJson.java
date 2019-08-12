package StudentoAtsakymai;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.javafaker.Faker;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentoEgzaminasJson implements Runnable {

    private String studentoId;
    private String studentoVardas;
    private String studentoPavarde;
    private String egzaminoId;
    private String egzaminoPavadinimas;
    private String egzaminoTipas;
    private static int counter = 1;

    String failoPavadinimas;

    public void sugeneruotiStudentoEgzaminaRandom(int klausimuSkaicius) {


        Faker faker = new Faker();
        studentoId = Integer.toString(getRandomNumberInRange(1, 500));
        studentoVardas = faker.name().firstName();
        studentoPavarde = faker.name().lastName();
        egzaminoId = "124";
        egzaminoPavadinimas = "OOP pagrindai";
        egzaminoTipas = "testas";
        failoPavadinimas = "Studentas" + counter + ".json";
        counter++;

        StudentoGeneravimas studentas = new StudentoGeneravimas(
                new Studentas(studentoId, studentoVardas, studentoPavarde),
                new Egzaminas(egzaminoId, egzaminoPavadinimas, egzaminoTipas),
                new ArrayList<>() {{
                    for (int j = 1; j <= klausimuSkaicius; j++) {
                        Random r = new Random();
                        char c = (char) (r.nextInt(3) + 'a');
                        add(new Atsakymas(j, Character.toString(c)));
                    }
                }}
        );

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/studentai/" + failoPavadinimas);
        try {
            mapper.writeValue(file, studentas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void sugeneruotiStudentoEgzamina() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite studento ID: ");
        studentoId = sc.next();
        System.out.println("Iveskite varda: ");
        studentoVardas = sc.next();
        System.out.println("Iveskite pavarde: ");
        studentoPavarde = sc.next();
        System.out.println("Iveskite egzamino ID: ");
        egzaminoId = sc.next();
        System.out.println("Iveskite egzamino pavadinima: ");
        egzaminoPavadinimas = sc.next();
        System.out.println("Iveskite egzamino tipa: ");
        egzaminoTipas = sc.next();
        System.out.println("Iveskite klausimu skaiciu: ");
        int klausimuSkaicius = sc.nextInt();


        failoPavadinimas = "Studentas" + counter + ".json";
        counter++;

        StudentoGeneravimas studentas = new StudentoGeneravimas(
                new Studentas(studentoId, studentoVardas, studentoPavarde),
                new Egzaminas(egzaminoId, egzaminoPavadinimas, egzaminoTipas),
                new ArrayList<>() {{
                    for (int j = 1; j <= klausimuSkaicius; j++) {
                        //  Random r = new Random();
                        // char c = (char) (r.nextInt(3) + 'a');
                        System.out.println("Iveskite " + j + "atsakyma: ");
                        String atsakymas = sc.next();
                        add(new Atsakymas(j, atsakymas));
                    }
                }}
        );

        ObjectMapper mapper = new ObjectMapper();
        File file = new File("src/main/resources/studentai/" + failoPavadinimas);
        try {
            mapper.writeValue(file, studentas);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }


    @Override
    public void run() {
        Thread thread = new Thread();
        thread.start();
        Arrays.stream(new File("src/main/resources/studentai/").listFiles()).forEach(File::delete);

        for (int i = 0; i < 10; i++) {
            sugeneruotiStudentoEgzaminaRandom(15);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
