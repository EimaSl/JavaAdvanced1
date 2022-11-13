package lesson12.homeworkCsvFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException {
        //CSV = Comma seperated Values

        ArrayList<String> database = new ArrayList<>();

        String file = "src/main/resources/Book1.csv";
        BufferedReader reader = null;
        String line = "";

        try {
            reader = new BufferedReader(new FileReader(file));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",");

                for (String index : row) {
                    System.out.printf("%-20s", index);

                }
                System.out.println();
            }
            for (String s : database) {
                System.out.println(s);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}
