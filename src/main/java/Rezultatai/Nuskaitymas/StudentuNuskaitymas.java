package Rezultatai.Nuskaitymas;

import StudentoAtsakymai.StudentoGeneravimas;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class StudentuNuskaitymas {

    private static   ArrayList<StudentoGeneravimas> studentuAtsakymuSarasas = new ArrayList<>();

    public  ArrayList<StudentoGeneravimas> getStudentuAtsakymuSarasas() {
        return studentuAtsakymuSarasas;
    }

    public  void nuskaitytiStudentusIsJson(long studentusk) throws IOException {


        ObjectMapper mapper = new ObjectMapper();
        studentuAtsakymuSarasas.clear();
        for (int i = 1; i <= studentusk; i++) {
            String failoPavadinimas = "Studentas" + i + ".json";
            File file = new File("src/main/resources/studentai/" + failoPavadinimas);

            StudentoGeneravimas studentasisJson = mapper.readValue(file, StudentoGeneravimas.class);
//            System.out.println(studentasisJson);
            studentuAtsakymuSarasas.add(studentasisJson);

        }
    }
}
