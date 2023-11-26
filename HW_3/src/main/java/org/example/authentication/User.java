package org.example.authentication;

public class User {

    String name;
    String password;
    boolean isAuthenticate = false;
    boolean isAdmin;

    /*
     * расширить класс User новым свойством, указывающим, обладает ли пользователь
     * админскими правами.
     */
    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    public boolean authenticate(String name, String password) {
        if (name.equals(this.name) && password.equals(this.password)) {
            this.isAuthenticate = true;
            return true;
        } else {
            this.isAuthenticate = false;
            return false;
        }
    }

    public void logout() {
        this.isAuthenticate = false;
    }
}
