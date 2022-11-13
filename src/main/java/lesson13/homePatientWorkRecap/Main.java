package lesson13.homePatientWorkRecap;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

        UserService userService = new UserService();
        System.out.println(UserDatabase.users);
        UserDatabase.populateUsersFromFile();
        System.out.println(UserDatabase.users);

        ArrayList<User> foundHighUsers = userService.getUsersThanGivenHeight(UserDatabase.users, 195);
        System.out.println("Higher than 195 = " + foundHighUsers);

    }
}
