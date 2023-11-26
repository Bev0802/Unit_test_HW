package org.example.authentication;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    /*
     * Задание 3. (необязательное)
     * Добавьте функцию в класс UserRepository, которая разлогинивает всех
     * пользователей, кроме администраторов. Для этого, вам потребуется расширить класс User новым
     * свойством, указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.
     */
    List<User> data = new ArrayList<>();

    public UserRepository() {
    }

    public void addUser(User user) {
        data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logoutAll() {
        for (User user : data) {
            user.isAuthenticate = false;

        }
    }
}