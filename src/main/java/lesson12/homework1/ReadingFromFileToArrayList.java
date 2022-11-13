package lesson12.homework1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadingFromFileToArrayList {

    public static final String ResourceReference = "src/main/resources/PatientDatabase";

    ArrayList<Patient> readPatients() throws IOException {
        Patient patients = new Patient();
        BufferedReader br = new BufferedReader(new FileReader(ResourceReference));
        ArrayList<Patient> dataBase = new ArrayList<>();
        String line = br.readLine();

        while (line != null) {
            String[] split = line.split(",");
            patients.name = split[0];
            patients.age = Integer.parseInt(split[1]);
            patients.bloodType = split[2];
            patients.height = Double.parseDouble(split[3]);
            patients.weight = Double.parseDouble(split[4]);
            line = br.readLine();
            Patient patient = new Patient(patients.name, patients.age, patients.bloodType, patients.height, patients.weight);
            dataBase.add(patient);
        }
        br.close();
        dataBase.add(new Patient("Rex", 10, "A+", 152, 122));

        return dataBase;
    }
}
