package lesson12.homework1;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PatientServiceTest {

    @org.junit.jupiter.api.Test
    void getOldestPatient() throws IOException {
        //given
        PatientService patientService = new PatientService();
        ReadingFromFileToArrayList readingFromFileToArrayList= new ReadingFromFileToArrayList();
        //when
        ArrayList<Patient> patients = readingFromFileToArrayList.readPatients();
//        patients.add(new Patient("Tom", 100, "A+", 200, 200));
        //then
        assertEquals(62, patientService.getOldestPatient(50));
    }

    @org.junit.jupiter.api.Test
    void getNamesStartsWith() throws IOException {
        //given
        PatientService patientService = new PatientService();
        ReadingFromFileToArrayList readingFromFileToArrayList= new ReadingFromFileToArrayList();
        //when
        ArrayList<Patient> patients = readingFromFileToArrayList.readPatients();
        //then
        assertEquals(1, patientService.getNamesStartsWith("Da"));
    }

    @org.junit.jupiter.api.Test
    void getTallestPatient() {
        //given
        //when
        //then
    }

    @org.junit.jupiter.api.Test
    void getPatientsWithSpecificBloodType() {
        //given
        //when
        //then
    }

    @org.junit.jupiter.api.Test
    void findPatientsTallerThanGivenHeight() {
        //given
        //when
        //then
    }


}