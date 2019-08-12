package Rezultatai;

import Rezultatai.Nuskaitymas.AtsakymuNuskaitymas;
import Rezultatai.Nuskaitymas.StudentuNuskaitymas;
import StudentoAtsakymai.StudentoEgzaminasJson;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

public class RezultatuGeneravimas {

    private ArrayList<StudentuRezultatas> studentuRezultatais = new ArrayList<>();


    public void generuotiRezultatus() throws IOException {



//        Egzaminai egzaminai = new Egzaminai(new ArrayList<>() {{
//            add(new Rezultatas("1", "OOP", new ArrayList<>() {{
//                add(new StudentuRezultatai(studentoId, studentoVardas, studentoPavarde, ivertinimas));
//
//            }}));
//        }});

        // Egzaminai egzaminai2 = new Egzaminai(visiEgzai);

        Egzaminai egzaminai2 = new Egzaminai(new ArrayList<>() {{
            add(new Rezultatas("1", "OOP", studentuRezultatais));
        }});


        LocalDateTime now = LocalDateTime.now();


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

        String formatDateTime = now.format(formatter);


        ObjectMapper mapper = new ObjectMapper();
        Arrays.stream(new File("src/main/resources/rezultatai/").listFiles()).forEach(File::delete);

        File file = new File("src/main/resources/rezultatai/rezultatai" + formatDateTime + ".json");
        mapper.writeValue(file, egzaminai2);

//        FileWriter writeToFile = new FileWriter(file,true);
//        SequenceWriter seqWritter = mapper.writer().writeValuesAsArray(writeToFile);
//        seqWritter.write(egzaminai);

    }

    public void generuotiValidziusIsJson() throws IOException {

        AtsakymuNuskaitymas atsakymuNuskaitymas = new AtsakymuNuskaitymas();
        StudentuNuskaitymas studentuNuskaitymas = new StudentuNuskaitymas();


        studentuNuskaitymas.getStudentuAtsakymuSarasas();
//        System.out.println(studentuNuskaitymas.getStudentuAtsakymuSarasas());
//        System.out.println(atsakymuNuskaitymas.getAtsakymuListas());

        studentuRezultatais.clear();
        for (int i = 0; i < studentuNuskaitymas.getStudentuAtsakymuSarasas().size(); i++) {
            int viso = atsakymuNuskaitymas.getAtsakymuListas().get(0).getAtsakymai().size();
            double teisingi = 0;
            double pazimys = 0;

            for (int j = 0; j < studentuNuskaitymas.getStudentuAtsakymuSarasas().get(i).getAtsakymai().size(); j++) {

                if (studentuNuskaitymas.getStudentuAtsakymuSarasas().get(i).getAtsakymai().get(j).getAtsakymas().equals(atsakymuNuskaitymas.getAtsakymuListas().get(0).getAtsakymai().get(j).getAtsakymas())) {
                    teisingi++;
                }


            }

            DecimalFormat df2 = new DecimalFormat("#.##");
            pazimys = (teisingi * 10) / viso;

            pazimys= Double.parseDouble(df2.format(pazimys));




            int k = i;
            for (k = 0; k < studentuNuskaitymas.getStudentuAtsakymuSarasas().size(); k++) {

                int finalK = k;
                double finalPazimys = pazimys;


            }
            int finalI = i;
            double finalPazimys1 = pazimys;


            Rezultatas rezultatas = new Rezultatas("1", "OOP", new ArrayList<>() {{
                add(new StudentuRezultatas(studentuNuskaitymas.getStudentuAtsakymuSarasas().get(finalI).getStudentas().getId(), studentuNuskaitymas.getStudentuAtsakymuSarasas().get(finalI).getStudentas().getVardas(), studentuNuskaitymas.getStudentuAtsakymuSarasas().get(finalI).getStudentas().getPavarde(), finalPazimys1));

            }});

            StudentuRezultatas studrez = new StudentuRezultatas(studentuNuskaitymas.getStudentuAtsakymuSarasas().get(finalI).getStudentas().getId(), studentuNuskaitymas.getStudentuAtsakymuSarasas().get(finalI).getStudentas().getVardas(), studentuNuskaitymas.getStudentuAtsakymuSarasas().get(finalI).getStudentas().getPavarde(), finalPazimys1);
            studentuRezultatais.add(studrez);

            generuotiRezultatus();
        }


    }
}


