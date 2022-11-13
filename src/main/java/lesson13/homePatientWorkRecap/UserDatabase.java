package lesson13.homePatientWorkRecap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserDatabase {

    public static ArrayList<User> users = new ArrayList<>();


    public static void populateUsersFromFile() throws IOException {
        FileReader fr = new FileReader("src/main/resources/user.txt");
        BufferedReader br = new BufferedReader(fr);
        String currentLine = br.readLine();

        //enter loop only when not empty
        while (currentLine != null) {
            String[] splitedLine = currentLine.split(";");

            String name = splitedLine[0];
            int age = Integer.parseInt(splitedLine[1]);
            int height = Integer.parseInt(splitedLine[2]);

            users.add(new User(name, age, height));
            currentLine = br.readLine();
        }
    }
}
