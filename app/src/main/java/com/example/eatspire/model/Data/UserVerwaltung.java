package com.example.eatspire.model.Data;

import com.example.eatspire.model.UserStuff.User;

import java.util.ArrayList;

public class UserVerwaltung {

    private final String HARDCODED_USERNAME = "demo";
    private final String HARDCODED_PASSWORD = "1234";

    private static User aktuellerUser = null;
    private static ArrayList<User> listeAllerUser = new ArrayList<>();
    UserVerwaltung(){
        listeAllerUser.add(new User(HARDCODED_USERNAME, HARDCODED_PASSWORD));
    }
    public static boolean isValidLogin(String username, String password) {
        for(int i = 0; i<listeAllerUser.size(); i++){
            if(listeAllerUser.get(i).getUsername().equals(username) && listeAllerUser.get(i).getPassword().equals(password)){
                setAktuellerUser(listeAllerUser.get(i));
                return true;
            }
        }
        return false;
    }
    public void hinzufügenUser(String username, String password) {
        User neuerUser = new User(username, password);
        listeAllerUser.add(neuerUser);
    }
    public static User getAktuellerUser() {
        return aktuellerUser;
    }
    public static void setAktuellerUser(User aktuellerUser) {
        UserVerwaltung.aktuellerUser = aktuellerUser;
    }

    public static void logout() {
        aktuellerUser = null;
    }
}
