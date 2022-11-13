package lesson13.homePatientWorkRecap;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class UserServiceTest {

    @Test
    void shouldGetAllUsersTallerThan200() {
        //given
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("Tom", 15, 199));
        users.add(new User("Nom", 19, 201));
        users.add(new User("Rom", 19, 205));

        UserService userService = new UserService();
        //when
        ArrayList<User> actualTallUsers = userService.getUsersThanGivenHeight(users, 200);
        //then
        assertEquals(2, actualTallUsers.size());
        assertEquals(201, actualTallUsers.get(0).height);
        assertEquals(205, actualTallUsers.get(1).height);

    }
}