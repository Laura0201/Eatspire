package BusinessLogik.EssensOrte;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eatspire.R;

import java.util.ArrayList;
import java.util.List;

public class RestaurantsListeRecyclerViewAdapter extends RecyclerView.Adapter<RestaurantItemViewHolder> {

    // Globale Variable für den Context
    private Context context;
    // Liste der Restaurants
    private ArrayList<Restaurant> restaurants;

    /**
     * Konstruktor: Hier werden der Context und die Liste der Restaurants übergeben.
     *
     * @param context     Der Context, z. B. die Activity, in der der Adapter verwendet wird.
     * @param restaurants Eine Liste der Restaurant-Objekte, die dargestellt werden sollen.
     */
    public RestaurantsListeRecyclerViewAdapter(Context context, List<Restaurant> restaurants) {
        this.context = context;
        // Falls du intern mit einer ArrayList arbeiten möchtest
        this.restaurants = new ArrayList<>(restaurants);
    }

    @NonNull
    @Override
    public RestaurantItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Hier verwenden wir den übergebenen Kontext, um das Layout aufzublasen.
        View view = LayoutInflater.from(context).inflate(R.layout.restaurant_item_view, parent, false);
        return new RestaurantItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantItemViewHolder holder, int position) {
        // Sicherheitscheck: Überprüfen ob der Index im gültigen Bereich liegt.
        if (position < 0 || position >= restaurants.size()) {
            return;
        }
        Restaurant restaurant = restaurants.get(position);
        holder.setRestaurant(restaurant);
    }

    @Override
    public int getItemCount() {
        return (restaurants == null) ? 0 : restaurants.size();
    }

    /**
     * Diese Methode aktualisiert die interne Liste der Restaurants.
     * Nach dem Aktualisieren wird der Adapter benachrichtigt, sodass der RecyclerView neu zeichnet.
     *
     * @param restaurantsAusDemDataManager Array von Restaurant-Objekten aus dem DataManager.
     */
    public void updateRestaurants(Restaurant[] restaurantsAusDemDataManager) {
        this.restaurants.clear();
        for (Restaurant r : restaurantsAusDemDataManager) {
            this.restaurants.add(r);
        }
        notifyDataSetChanged();
    }
}