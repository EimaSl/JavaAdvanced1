package lesson12.homework1;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        PatientService patientService = new PatientService();

        patientService.getOldestPatient(23);
        patientService.getNamesStartsWith("Ma");
        patientService.getTallestPatient();
        patientService.getPatientsWithSpecificBloodType("A+");
        patientService.findPatientsTallerThanGivenHeight(100.0);

        patientService.addNewPatient();



    }
}
