package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    private static final String NULL_FIELD = null;
    private static final String EMPTY_FIELD = "";

    private static User user1 = new User(null, null);
    private static User user2 = new User("RandomLogin", "RandomLogin@gmail.com");
    private static User user3 = new User("RandomLogin@gmail.com", "RandomLogin@gmail.com");

    @Test
    public void areValuesEqualNulls() {
        //Assertions.assertTrue(user1.getEmail() == NULL_FIELD && user1.getLogin() == NULL_FIELD);
        Assertions.assertNull(user1);
    }

    @Test
    public void areValuesInitialized(){
        Assertions.assertTrue(!(user2.getEmail().isEmpty()&&user2.getEmail().isBlank()));
        Assertions.assertTrue(!(user2.getLogin().isEmpty()&&user2.getLogin().isBlank()));
    }

    @Test
    public void isEmailValueCorrectlyInitialized(){
        Assertions.assertTrue(user2.getEmail().contains("@") && user2.getEmail().contains("."));
    }

    @Test
    public void doEmailAndLoginEqual() {
        Assertions.assertNotEquals(user2.getEmail(), user2.getLogin());
    }

    //public void doEmailAndLoginEqual() {
    //        Assertions.assertNotEquals(user3.getEmail(), user3.getLogin());
    //    }



}
