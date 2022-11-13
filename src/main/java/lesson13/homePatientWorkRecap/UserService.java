package lesson13.homePatientWorkRecap;

import java.util.ArrayList;

public class UserService {

    // return users highest than 180

    public ArrayList<User> getUsersThanGivenHeight(ArrayList<User> users, int heightMargin) {

        //empty list
        ArrayList<User> tallUsers = new ArrayList<>();

        for (User user : users) {
            if (user.height >= heightMargin) {
            tallUsers.add(user); // in list add new user
            }
        }
        return tallUsers;
    }
    public void printUserData(ArrayList<User> users){
        for (User user : users) {
            System.out.println("Name: " + user.name + ", Height: " + user.height + ", Age:" + user.age);
        }
    }
}
