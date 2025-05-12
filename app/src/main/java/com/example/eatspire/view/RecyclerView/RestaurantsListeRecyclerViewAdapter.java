package com.example.eatspire.view.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eatspire.R;
import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.view.ViewHolder.RestaurantItemViewHolder;

import java.util.ArrayList;

public class RestaurantsListeRecyclerViewAdapter extends RecyclerView.Adapter<RestaurantItemViewHolder> {

    private final ArrayList<Restaurant> restaurants = new ArrayList<>();

    @NonNull
    @Override
    public RestaurantItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.restaurant_item_view, parent, false);
        return new RestaurantItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RestaurantItemViewHolder holder, int position) {
        if (position >= 0 && position < restaurants.size()) {
            holder.setRestaurant(restaurants.get(position));
        }
    }

    @Override
    public int getItemCount() {
        return restaurants.size();
    }

    public void updateRestaurants(Restaurant[] restaurantsAusDemDataManager) {
        restaurants.clear();
        if (restaurantsAusDemDataManager != null) {
            for (Restaurant r : restaurantsAusDemDataManager) {
                restaurants.add(r);
            }
        }
        notifyDataSetChanged();
    }
}
