package BusinessLogik.EssensOrte;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.eatspire.R;

public class RestaurantItemViewHolder extends RecyclerView.ViewHolder {
    private ImageView bildDesRestaurants;
    private TextView nameDesRestaurants;
    private TextView beschreibungDesRestaurants;
    private TextView adresseDesRestaurants;
    private TextView websiteDesRestaurants;
    private TextView kategorieDesRestaurants;

    public RestaurantItemViewHolder(@NonNull View itemView) {
        super(itemView);
        // Initialisiere alle Views anhand der IDs, wie sie in restaurant_item_view.xml definiert sind
        bildDesRestaurants = itemView.findViewById(R.id.bildDesRestaurants);
        nameDesRestaurants = itemView.findViewById(R.id.nameDesRestaurantsTextView);
        beschreibungDesRestaurants = itemView.findViewById(R.id.beschreibungDesRestaurantsTextView);
        adresseDesRestaurants = itemView.findViewById(R.id.adresseDesRestaurantsTextview);
        websiteDesRestaurants = itemView.findViewById(R.id.websiteDesRestaurantsTextView);
        kategorieDesRestaurants = itemView.findViewById(R.id.kategorieDesRestaurantsTextView);
    }

    public void setRestaurant(Restaurant restaurant) {
        if (restaurant == null) {
            return;
        }
        // Falls gewünscht: Bild setzen – hier z. B. ein Placeholder, wenn du noch keine Bild-Ladelogik hast.
        // bildDesRestaurants.setImageResource(R.drawable.ic_placeholder_restaurant);

        // Setze die Texte der einzelnen Views mit den Daten aus dem Restaurant-Objekt
        nameDesRestaurants.setText(restaurant.getName());
        beschreibungDesRestaurants.setText(restaurant.getBeschreibung());
        adresseDesRestaurants.setText(restaurant.getAdressfeld());
        websiteDesRestaurants.setText(restaurant.getWebsite());

        // Prüfe, ob eine Kategorie vorhanden ist und setze sie
        if (restaurant.getKategorie() != null) {
            kategorieDesRestaurants.setText(restaurant.getKategorie().name());
        } else {
            kategorieDesRestaurants.setText("");  // ODER einen Default-Wert
        }
    }
}