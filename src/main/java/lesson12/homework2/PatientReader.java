package lesson12.homework2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PatientReader {

    //initialized an array list for storing
    private static ArrayList<Patient> patientList = new ArrayList<Patient>();

    public static void readPatients() throws FileNotFoundException {

        //file reading reference
        File file = new File("src/main/resources/patients");
        Scanner readFile = new Scanner(file);
        StringTokenizer token = null;

        //initialize variables
        String fullName = "";
        int age = 0;
        double weight = 0;
        String illness = "";

        //https://www.geeksforgeeks.org/stringtokenizer-class-in-java/

        while (readFile.hasNext()) {
            token = new StringTokenizer(readFile.nextLine(), ",");
            fullName = token.nextToken();
            age = Integer.parseInt(token.nextToken());
            weight = Double.parseDouble(token.nextToken());
            illness = token.nextToken();

            Patient patient = new Patient(fullName, age, weight, illness);
            patientList.add(patient);
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        readPatients();
        for (Patient patient : patientList) {
            System.out.println(patient);
        }
        System.out.println("Patients names when age is over 25: ");
        for (Patient patient : patientList) {
            if(patient.age >= 25) {
                System.out.println( "\t\t\t" + patient.fullName);
            }
        }
        System.out.println("findPatientsWithNamesStartingWith = An");
        for (Patient patient : patientList) {
            if(patient.fullName.startsWith("An")) {
                System.out.println( "\t\t\t" + patient.fullName);
            }
        }
        
    }

}
