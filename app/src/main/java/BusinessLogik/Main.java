package BusinessLogik;

import android.os.Build;

import java.time.LocalTime;

public class Main {
    public static void main(String[]  args){
        User Jona = new User("jt.buettner", "JTZ67(@erkjlsg");
        Restaurant Restaurant1 = new Restaurant(52.5200, 13.4050);
        Restaurant1.setName("Restaurant1");
        Restaurant1.setAdresse("Musterstraße 1, 12345 Musterstadt");


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            System.out.println(Restaurant1.istGeoeffnet(LocalTime.parse("19:00"))); // Beispiel: Montag, 12:30 Uhr
        }
    }
    }

