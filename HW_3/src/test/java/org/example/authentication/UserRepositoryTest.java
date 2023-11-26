package org.example.authentication;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    public UserRepositoryTest() {
    }

    User user;
    UserRepository userRepository;

    @BeforeEach
    void beforeEach() {
        userRepository = new UserRepository();
        user = new User("user", "123", false);
    }

    @AfterEach
    void afterEach() {
        userRepository = null;
        user = null;
    }

    @Test
    @DisplayName("Проверка метода Пользователь может быть добавлен в репозиторий")
    void userRepositoryTest() {
        user.authenticate("user", "123");
        userRepository.addUser(user);
    }

    @Test
    @DisplayName("Проверка методовк findByName()")
    void userRepositoryNoAdmin() {
        user.authenticate("user", "123");
        userRepository.addUser(user);

        // Проверка, что метод findByName() UserRepository ищет имя пользователя «user»
        // в списке пользователей.
        assertTrue(userRepository.findByName(user.name));
    }

    @Test
    @DisplayName("Проверка методовк logoutAll()")
    void adminHasAccessListUsers() {

        User userNAdmin = new User("user_1", "psw1", false);
        user.authenticate("user_0", "psw0");
        userNAdmin.authenticate("user_1", "psw1");
        userRepository.addUser(user);
        userRepository.addUser(userNAdmin);
        userRepository.logoutAll();
        assertFalse(user.isAuthenticate);
    }
}