//package BusinessLogik;
//import com.google.gson.*;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class DataManager {
//    private List<User> users;
//    private List<Restaurant> restaurants;
//
//    private static final String USERS_FILE = "users.json";
//    private static final String RESTAURANTS_FILE = "restaurants.json";
//
//    public DataManager() {
//        users = new ArrayList<>();
//        restaurants = new ArrayList<>();
//        loadUsers();
//        loadRestaurants();
//    }
//
//    // Lade User aus der JSON-Datei
//    private void loadUsers() {
//        try (Reader reader = new FileReader(USERS_FILE)) {
//            Gson gson = new Gson();
//            User[] userArray = gson.fromJson(reader, User[].class);
//            if (userArray != null) {
//                users = new ArrayList<>(Arrays.asList(userArray));
//            }
//        } catch (IOException e) {
//            System.out.println("Keine Userdaten gefunden.");
//        }
//    }
//
//    // Speichere User in die JSON-Datei
//    public void saveUsers() {
//        try (Writer writer = new FileWriter(USERS_FILE)) {
//            Gson gson = new Gson();
//            gson.toJson(users, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Lade Restaurants aus der JSON-Datei
//    private void loadRestaurants() {
//        try (Reader reader = new FileReader(RESTAURANTS_FILE)) {
//            Gson gson = new Gson();
//            Restaurant[] restaurantArray = gson.fromJson(reader, Restaurant[].class);
//            if (restaurantArray != null) {
//                restaurants = new ArrayList<>(Arrays.asList(restaurantArray));
//            }
//        } catch (IOException e) {
//            System.out.println("Keine Restaurantdaten gefunden.");
//        }
//    }
//
//    // Speichere Restaurants in die JSON-Datei
//    public void saveRestaurants() {
//        try (Writer writer = new FileWriter(RESTAURANTS_FILE)) {
//            Gson gson = new Gson();
//            gson.toJson(restaurants, writer);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Füge neuen User hinzu
//    public void addUser(User user) {
//        users.add(user);
//        saveUsers();
//    }
//
//    // Füge neues Restaurant hinzu
//    public void addRestaurant(Restaurant restaurant) {
//        restaurants.add(restaurant);
//        saveRestaurants();
//    }
//}
//
//
