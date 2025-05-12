package com.example.eatspire.model.Data;

import com.example.eatspire.model.UserStuff.User;

public class UserVerwaltung {

    private static final String HARDCODED_USERNAME = "demo";
    private static final String HARDCODED_PASSWORD = "1234";

    private static User aktuellerUser = null;

    public static boolean isValidLogin(String username, String password) {
        if (HARDCODED_USERNAME.equals(username) && HARDCODED_PASSWORD.equals(password)) {
            aktuellerUser = new User(username, password);  // ggf. mit Standort oder weiteren Infos
            return true;
        }
        return false;
    }

    public static User getAktuellerUser() {
        return aktuellerUser;
    }

    public static void logout() {
        aktuellerUser = null;
    }
}
