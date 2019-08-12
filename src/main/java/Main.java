import EgzaminoAtsakymai.EgzaminoFailas;
import EgzaminoAtsakymai.EgzaminoFailoGeneravimas;
import Rezultatai.Nuskaitymas.AtsakymuNuskaitymas;
import Rezultatai.Nuskaitymas.StudentuNuskaitymas;
import Rezultatai.RezultatuGeneravimas;
import StudentoAtsakymai.StudentoEgzaminasJson;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;



public class Main {

    public static void main(String[] args) throws InterruptedException, IOException {


        EgzaminoFailoGeneravimas egzaminoFailas = new EgzaminoFailoGeneravimas();

        egzaminoFailas.generuotiEgzaminoFailaRandom();


        StudentoEgzaminasJson runnable = new StudentoEgzaminasJson();
        Thread thrad = new Thread(runnable);
            thrad.start();


        StudentuNuskaitymas studentuNuskaitymas = new StudentuNuskaitymas();
        AtsakymuNuskaitymas atsakymuNuskaitymas = new AtsakymuNuskaitymas();
        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("Iveskite:");

boolean run =true;
        printMenuList();
        while(run){
            input = sc.next();
            if (input.equals("1")) {
                System.out.println("Sukurta failu: " + getFolderElementsSize());
                printMenuList();

            }

            if (input.equals("2")) {
                studentuNuskaitymas.nuskaitytiStudentusIsJson(getFolderElementsSize());
                atsakymuNuskaitymas.nuskaitytiIsJson();
                RezultatuGeneravimas rezultatuGeneravimas = new RezultatuGeneravimas();
                try {
                    rezultatuGeneravimas.generuotiValidziusIsJson();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                printMenuList();
            }
            if (input.equals("3")) {
                StudentoEgzaminasJson studentoEgzaminasJson = new StudentoEgzaminasJson();
                studentoEgzaminasJson.sugeneruotiStudentoEgzamina();

                printMenuList();
            }
            if (input.equals("x")) {
                run = false;
                break;


            }
            }

        }



    public static long getFolderElementsSize(){

        long studentuSk=0;
        try (Stream<Path> files = Files.list(Paths.get("src/main/resources/studentai/"))) {
            studentuSk = files.count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  studentuSk;
    }

    private static void printMenuList() {

        System.out.println();
        System.out.println("Pasirinkite: ");
        System.out.println("[1] - Gautu studentu atsakymu failu skaicius:");
        System.out.println("[2] - Sugeneruoti rezultatu faila ");
        System.out.println("[3] - Prideti unikalu studenta: ");
       // System.out.println("[4] - Sugeneruoti egzamino faila");
        System.out.println("[x] - Uzbaigti programa");

    }
}
