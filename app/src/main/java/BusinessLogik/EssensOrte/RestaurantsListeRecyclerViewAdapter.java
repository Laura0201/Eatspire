package BusinessLogik.EssensOrte;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eatspire.R;

import java.util.ArrayList;

public class RestaurantsListeRecyclerViewAdapter extends RecyclerView.Adapter<RestaurantItemViewHolder> {
    private ArrayList<Restaurant> restaurants;
    @NonNull
    @Override
    public RestaurantItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.restaurant_item_view, viewGroup, false);
        return new RestaurantItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantItemViewHolder holder, int i) {
        if (i < 0 || i > restaurants.size()) {
            return;
        }
        Restaurant restaurant = restaurants.get(i);
        holder.setRestaurant(restaurant);
    }

    @Override
    public int getItemCount() {
        if (restaurants == null) {
            return 0;
        }
        return 0;
    }
    public void updateRestaurants(Restaurant[] restaurantsAusdemDatamanger){

        this.restaurants.clear();
        for (int i = 0; i < restaurantsAusdemDatamanger.length; i++) {
            this.restaurants.add(restaurantsAusdemDatamanger[i]);
        }
    }
}
