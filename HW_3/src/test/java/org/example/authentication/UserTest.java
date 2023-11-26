package org.example.authentication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    public UserTest() {
    }

    User user;

    @BeforeEach
    void BeforeEach() {
        user = new User("user", "123", false);
    }

    @AfterEach
    void AfterEach() {
        user = null;
    }

    @Test 
    void authenticateTestTrue(){
        assertTrue(user.authenticate("user", "123"));
    }

    @Test
    void authenticateTestFalse(){
        assertFalse(user.authenticate("user", "1234"));
    }
    



}