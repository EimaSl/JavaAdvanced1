package lesson12.homework1;

import java.io.IOException;
import java.util.ArrayList;

public class PatientService {

    private ArrayList<Patient> getPatients() throws IOException {
        ReadingFromFileToArrayList readingFromFileToArrayList = new ReadingFromFileToArrayList();
        return readingFromFileToArrayList.readPatients();
    }

    public Integer getOldestPatient(Integer olderThanAge) throws IOException {
        ArrayList<Patient> readPatients = getPatients();
        System.out.println("Patients with age older " + olderThanAge + " are:");
        int oldestPatientAge = 0;
        for (Patient readPatient : readPatients) {
            if (readPatient.age > olderThanAge) {
                oldestPatientAge = readPatient.age;
                System.out.println("\t\t\t" + readPatient);
            }
        }
        return oldestPatientAge;
    }


    public Integer getNamesStartsWith(String nameStartsWith) throws IOException {
        ArrayList<Patient> readPatients = getPatients();
        System.out.println("Patients starts with " + nameStartsWith + " are:");
        int count = 0;
        for (Patient readPatient : readPatients) {
            if (readPatient.name.startsWith(nameStartsWith)) {
                System.out.println("\t\t\t" + readPatient);
                count++;
            }
        }
        return count;
    }

    public void getTallestPatient() throws IOException {
        ArrayList<Patient> readPatients = getPatients();
        System.out.println("Highest patient is:");

        double max = 0.0;
        int indexHighest = 0;
        for (Patient readPatient : readPatients) {
            if (max < readPatient.height) {
                max = readPatient.height;
                indexHighest = readPatients.indexOf(readPatient);
            }
        }
        System.out.println("\t\t\t" + readPatients.get(indexHighest));
    }

    public void getPatientsWithSpecificBloodType(String specificBloodType) throws IOException {
        ArrayList<Patient> readPatients = getPatients();
        System.out.println("Patients with blood type " + specificBloodType + " are:");
        for (Patient readPatient : readPatients) {
            if (readPatient.bloodType.equalsIgnoreCase(specificBloodType)) {
                System.out.println("\t\t\t" + readPatient);
            }
        }
    }

    public void findPatientsTallerThanGivenHeight(Double givenHeight) throws IOException {
        ArrayList<Patient> readPatients = getPatients();
        System.out.println("Patients taller than " + givenHeight + " are:");
        for (Patient readPatient : readPatients) {
            if (readPatient.height > givenHeight) {
                System.out.println("\t\t\t" + readPatient);
            }
        }
    }

    public void addNewPatient() throws IOException {
        System.out.println("New patient added");
        ArrayList<Patient> readPatients = getPatients();
        readPatients.add(new Patient("Darius", 10, "A-", 125, 30));
        System.out.println("Updated list: ");
        for (Patient readPatient : readPatients) {
            System.out.println("\t\t\t" + readPatient);
        }
    }
}


