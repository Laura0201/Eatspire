package com.example.eatspire.model;

import com.example.eatspire.businesslogik.UserStuff.User;

import java.util.ArrayList;

public class UserVerwaltung {

    private final String HARDCODED_USERNAME = "demo";
    private final String HARDCODED_PASSWORD = "1234";

    private User aktuellerUser = null;
    private ArrayList<User> listeAllerUser = new ArrayList<>();
    UserVerwaltung(){
        listeAllerUser.add(new User(HARDCODED_USERNAME, HARDCODED_PASSWORD));
    }
    public boolean isValidLogin(String username, String password) {
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
        setAktuellerUser(neuerUser);
    }
    public User getAktuellerUser() {
        return aktuellerUser;
    }
    public void setAktuellerUser(User neuerAktuellerUser) {
        aktuellerUser = neuerAktuellerUser;
    }

    public void logout() {
        aktuellerUser = null;
    }
}
