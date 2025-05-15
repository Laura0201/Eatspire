package com.example.eatspire.view.RecyclerView;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eatspire.R;
import com.example.eatspire.model.EssensOrte.Restaurant;

public class RestaurantItemViewHolder extends RecyclerView.ViewHolder{
    private ImageView bildDesRestaurants;
    private TextView nameDesRestaurants;
    private TextView beschreibungDesRestaurants;
    private TextView AdresseDesRestaurants;
    private TextView websiteDesRestaurants;
    private TextView kategorieDesRestaurants;

    public RestaurantItemViewHolder(@NonNull View itemView) {
        super(itemView);
        bildDesRestaurants = itemView.findViewById(R.id.bildDesRestaurants);
        nameDesRestaurants = itemView.findViewById(R.id.nameDesRestaurantsTextView);
        beschreibungDesRestaurants = itemView.findViewById(R.id.beschreibungDesRestaurantsTextView);
        AdresseDesRestaurants = itemView.findViewById(R.id.adresseDesRestaurantsTextview);
        websiteDesRestaurants = itemView.findViewById(R.id.websiteDesRestaurantsTextView);
    }
    public void setRestaurant(Restaurant restaurant) {
        if (restaurant == null) {
            return;
        }
        bildDesRestaurants.setImageResource(restaurant.getBildResourceId());
        nameDesRestaurants.setText(restaurant.getName());
        beschreibungDesRestaurants.setText(restaurant.getBeschreibung());
        AdresseDesRestaurants.setText(restaurant.getAdressfeld());
        websiteDesRestaurants.setText(restaurant.getWebsite());

    }

}
