package org.example;

public class User {
    private String login;
    private String email;

    public User(String login, String email) {
        if (login.isBlank()||login.isEmpty()||email.isEmpty()||email.isBlank()) {
            throw new RuntimeException();
        }

        if (login == null || email == null) {
            throw new NullPointerException();
        }

        this.login = login;
        this.email = email;
    }

    public User() {
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
