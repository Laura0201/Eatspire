package com.example.eatspire.model.Data;

import android.content.Context;
import android.os.Build;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import com.example.eatspire.R;
import com.example.eatspire.controller.AppController;
import com.example.eatspire.model.EssensOrte.Kategorien;
import com.example.eatspire.model.EssensOrte.Restaurant;
import com.example.eatspire.model.Nahrung.Hauptspeise;
import com.example.eatspire.model.Nahrung.Heißgetränk;
import com.example.eatspire.model.Nahrung.Kaltgetränk;
import com.example.eatspire.model.Nahrung.Nachspeiße;
import com.example.eatspire.model.Nahrung.Vorspeise;
import com.example.eatspire.model.Nahrung.Zutat;

public class RestaurantRepository {
    private final ArrayList<Restaurant> restaurants = new ArrayList<>();


    public void initRestaurants(Context context) {
        // Restaurant „Bella Napoli“ Initialisierung
        // Zutaten
        Zutat[] VegetarischeLasagne = new Zutat[]{
                new Zutat("Kardamom", 2.67),
                new Zutat("Lasagneblätter", 3.57),
                new Zutat("Estragon", 0.82),
                new Zutat("Tomaten", 3.3),
                new Zutat("Knoblauch", 4.2),
                new Zutat("Trüffel", 2.46)
        };
        Zutat[] Käseplatte = new Zutat[] {
                new Zutat("Parmesan", 2.10),
                new Zutat("Gorgonzola", 2.50),
                new Zutat("Camembert", 1.80),
                new Zutat("Baguette", 1.20)
        };
        Zutat[] Bruschetta = new Zutat[] {
                new Zutat("Ciabatta", 1.00),
                new Zutat("Tomaten", 0.80),
                new Zutat("Knoblauch", 0.40),
                new Zutat("Basilikum", 0.30),
                new Zutat("Olivenöl", 0.50)
        };
        Zutat[] Carpaccio = new Zutat[] {
                new Zutat("Rinderfilet", 3.50),
                new Zutat("Rucola", 0.60),
                new Zutat("Parmesan", 1.50),
                new Zutat("Zitronensaft", 0.30),
                new Zutat("Olivenöl", 0.50)
        };
        Zutat[] VitelloTonnato = new Zutat[] {
                new Zutat("Kalbfleisch", 3.80),
                new Zutat("Thunfisch", 1.80),
                new Zutat("Kapern", 0.60),
                new Zutat("Mayonnaise", 0.50),
                new Zutat("Zitronensaft", 0.30)
        };
        Zutat[] AntipastiMisto = new Zutat[] {
                new Zutat("Gegrillte Zucchini", 0.80),
                new Zutat("Aubergine", 0.90),
                new Zutat("Paprika", 0.70),
                new Zutat("Oliven", 0.60),
                new Zutat("Mozzarella", 1.20)
        };
        Zutat[] CrostiniFunghi = new Zutat[] {
                new Zutat("Crostini", 1.00),
                new Zutat("Champignons", 0.90),
                new Zutat("Petersilie", 0.20),
                new Zutat("Knoblauch", 0.30),
                new Zutat("Butter", 0.40)
        };
        Zutat[] ProsciuttoMelone = new Zutat[] {
                new Zutat("Parmaschinken", 2.00),
                new Zutat("Honigmelone", 1.50)
        };

        // Kalt- und Heißgetränke für das Restaurant "Bella Napoli"
        Zutat[] SanPellegrino = new Zutat[] {
                new Zutat("Mineralwasser", 0.50),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] Aranciata = new Zutat[] {
                new Zutat("Orangensaft", 0.80),
                new Zutat("Zucker", 0.20),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] Chinotto = new Zutat[] {
                new Zutat("Chinotto-Extrakt", 1.00),
                new Zutat("Zucker", 0.20),
                new Zutat("Wasser", 0.30),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] EisteePfirsich = new Zutat[] {
                new Zutat("Schwarzer Tee", 0.30),
                new Zutat("Pfirsicharoma", 0.40),
                new Zutat("Zucker", 0.20),
                new Zutat("Wasser", 0.30),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] Espresso = new Zutat[] {
                new Zutat("Espressobohnen", 0.50),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] Cappuccino = new Zutat[] {
                new Zutat("Espressobohnen", 0.50),
                new Zutat("Milch", 0.40),
                new Zutat("Milchschaum", 0.30)
        };

        Zutat[] LatteMacchiato = new Zutat[] {
                new Zutat("Espressobohnen", 0.50),
                new Zutat("Milch", 0.60),
                new Zutat("Milchschaum", 0.30)
        };

        Zutat[] HeißeSchokolade = new Zutat[] {
                new Zutat("Milch", 0.50),
                new Zutat("Kakaopulver", 0.40),
                new Zutat("Zucker", 0.20)
        };

        // Getränke – Kalt
        ArrayList<Kaltgetränk> drinksBellaNapoli = new ArrayList<>();
        drinksBellaNapoli.add(new Kaltgetränk("San Pellegrino", SanPellegrino, false));
        drinksBellaNapoli.add(new Kaltgetränk("Aranciata", Aranciata, false));
        drinksBellaNapoli.add(new Kaltgetränk("Chinotto", Chinotto, false));
        drinksBellaNapoli.add(new Kaltgetränk("Eistee Pfirsich", EisteePfirsich, false));

        // Getränke – Heiß
        ArrayList<Heißgetränk> hotDrinksBellaNapoli = new ArrayList<>();
        hotDrinksBellaNapoli.add(new Heißgetränk("Espresso", Espresso));
        hotDrinksBellaNapoli.add(new Heißgetränk("Cappuccino", Cappuccino));
        hotDrinksBellaNapoli.add(new Heißgetränk("Latte Macchiato", LatteMacchiato));
        hotDrinksBellaNapoli.add(new Heißgetränk("Heiße Schokolade", HeißeSchokolade));

        // Gerichte – Haupt- & Vorspeisen
        ArrayList<Hauptspeise> hauptspeisen = new ArrayList<>();
        hauptspeisen.add(new Hauptspeise("Vegetarische Lasagne", VegetarischeLasagne));
        ArrayList<Vorspeise> vorspeisen = new ArrayList<>();
        vorspeisen.add(new Vorspeise("Käseplatte", Käseplatte));
        vorspeisen.add(new Vorspeise("Bruschetta", Bruschetta));
        vorspeisen.add(new Vorspeise("Carpaccio", Carpaccio));
        vorspeisen.add(new Vorspeise("Vitello Tonnato", VitelloTonnato));
        vorspeisen.add(new Vorspeise("Antipasti Misto", AntipastiMisto));
        vorspeisen.add(new Vorspeise("Crostini Funghi", CrostiniFunghi));
        vorspeisen.add(new Vorspeise("Prosciutto Melone", ProsciuttoMelone));

        // Restaurant anlegen und zuweisen
        Restaurant bellaNapoli = new Restaurant(Kategorien.ITALIENISCH, true);
        bellaNapoli.setName("Bella Napoli");
        bellaNapoli.setHauptspeisenListe(hauptspeisen);
        bellaNapoli.setVorspeisenListe(vorspeisen);
        bellaNapoli.setKaltgetränkeListe(drinksBellaNapoli);
        bellaNapoli.setHeißgetränkeListe(hotDrinksBellaNapoli);
        bellaNapoli.setAdresse("Lange-Strasse 19, 50667 Köln");
        bellaNapoli.setLatitude(50.937531);
        bellaNapoli.setLongitude(6.960279);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            bellaNapoli.setOeffnungszeiten(LocalTime.of(9, 30), LocalTime.of(22, 0));
        }

        bellaNapoli.setWebsite ("www.bellanapoli.de");
        bellaNapoli.setBeschreibung ("Das Beste italienische Restaurant der Stadt mit einem großen Angebot weit über Pizza und Pasta hinaus. "
                + "Unser freundliches Personal freut sich auf Ihren Besuch und kann Sie auch in Bezug auf unsere große Weinkarte gut beraten!");
        bellaNapoli.setTelefonnummer ("0123 456789");
        bellaNapoli.setMail ("bella@napoli.com");

        // Restaurant zur Liste hinzufügen
        restaurants.add(bellaNapoli);

        // Restaurant „La Provence“ Initialisierung

        // Zutaten definieren

        Zutat[] ratatouille = { new Zutat("Aubergine", 2.10), new Zutat("Zucchini", 1.80), new Zutat("Paprika", 1.50), new Zutat("Tomaten", 2.30), new Zutat("Thymian", 0.90) };
        Zutat[] quicheLorraine = { new Zutat("Blätterteig", 2.00), new Zutat("Schinken", 2.50), new Zutat("Ei", 0.80), new Zutat("Sahne", 1.60), new Zutat("Lauch", 1.20) };
        Zutat[] bouillabaisse = { new Zutat("Fischfilet", 4.50), new Zutat("Fenchel", 1.20), new Zutat("Safran", 3.00), new Zutat("Tomaten", 2.00), new Zutat("Weißwein", 2.70) };
        Zutat[] coqAuVin = { new Zutat("Hähnchenkeule", 3.20), new Zutat("Rotwein", 2.80), new Zutat("Champignons", 1.30), new Zutat("Zwiebeln", 0.60), new Zutat("Thymian", 0.80) };
        Zutat[] tarteTatin = { new Zutat("Äpfel", 1.50), new Zutat("Blätterteig", 2.10), new Zutat("Zucker", 0.70), new Zutat("Butter", 1.10), new Zutat("Zimt", 0.60) };
        Zutat[] zwiebelsuppe = { new Zutat("Zwiebeln", 0.80), new Zutat("Butter", 0.50), new Zutat("Weißwein", 1.20), new Zutat("Rinderbrühe", 0.90), new Zutat("Baguette", 1.00), new Zutat("Gruyere", 1.50) };
        Zutat[] quicheLorraineAlt = { new Zutat("Blätterteig", 1.20), new Zutat("Sahne", 0.80), new Zutat("Eier", 0.60), new Zutat("Speck", 1.00), new Zutat("Emmentaler", 1.10) };
        Zutat[] ratatouilleAlt = { new Zutat("Zucchini", 0.70), new Zutat("Aubergine", 0.80), new Zutat("Paprika", 0.90), new Zutat("Tomaten", 0.80), new Zutat("Knoblauch", 0.30), new Zutat("Olivenöl", 0.50) };
        Zutat[] coquillesSaintJacques = { new Zutat("Jakobsmuscheln", 4.50), new Zutat("Weißwein", 1.30), new Zutat("Butter", 0.60), new Zutat("Sahne", 0.90), new Zutat("Petersilie", 0.20) };
        Zutat[] saladeNicoise = { new Zutat("Thunfisch", 1.80), new Zutat("Oliven", 0.60), new Zutat("Tomaten", 0.70), new Zutat("Eier", 0.50), new Zutat("Grüne Bohnen", 0.90), new Zutat("Kartoffeln", 0.60) };
        Zutat[] tarteTatinSavory = { new Zutat("Blätterteig", 1.10), new Zutat("Zwiebeln", 0.80), new Zutat("Ziegenkäse", 1.60), new Zutat("Honig", 0.40), new Zutat("Thymian", 0.20) };
        Zutat[] croqueMonsieur = { new Zutat("Toastbrot", 0.70), new Zutat("Kochschinken", 1.00), new Zutat("Emmentaler", 1.20), new Zutat("Bechamelsauce", 0.90) };
        Zutat[] terrineDeCampagne = { new Zutat("Schweinefleisch", 2.00), new Zutat("Leber", 1.30), new Zutat("Pistazien", 1.00), new Zutat("Thymian", 0.30), new Zutat("Cognac", 1.50) };
        Zutat[] lachsTatar = { new Zutat("Räucherlachs", 2.80), new Zutat("Schalotten", 0.40), new Zutat("Zitronensaft", 0.30), new Zutat("Dill", 0.20), new Zutat("Creme Fraiche", 0.70) };
        Zutat[] kaeseAuswahl = { new Zutat("Brie", 1.50), new Zutat("Roquefort", 1.70), new Zutat("Comte", 1.80), new Zutat("Baguette", 1.00), new Zutat("Trauben", 0.60) };

// Getränke
        Zutat[] perrier = { new Zutat("Mineralwasser", 0.50), new Zutat("Kohlensäure", 0.10) };
        Zutat[] orangina = { new Zutat("Orangensaft", 0.80), new Zutat("Zitronensaft", 0.30), new Zutat("Zucker", 0.20), new Zutat("Kohlensäure", 0.10) };
        Zutat[] cassisLimonade = { new Zutat("Johannisbeersirup", 0.60), new Zutat("Zitronenlimonade", 0.80), new Zutat("Wasser", 0.30), new Zutat("Eiswürfel", 0.10) };
        Zutat[] eisteeLavendel = { new Zutat("Schwarzer Tee", 0.40), new Zutat("Lavendelsirup", 0.50), new Zutat("Zucker", 0.20), new Zutat("Eiswürfel", 0.10) };

        Zutat[] cafeCreme = { new Zutat("Kaffeebohnen", 0.50), new Zutat("Milch", 0.40) };
        Zutat[] chocolatChaud = { new Zutat("Milch", 0.50), new Zutat("Kakaopulver", 0.40), new Zutat("Zucker", 0.20) };
        Zutat[] theVert = { new Zutat("Grüner Tee", 0.30), new Zutat("Wasser", 0.10) };
        Zutat[] cafeAuLait = { new Zutat("Kaffeebohnen", 0.50), new Zutat("Milch", 0.60) };

// Vorspeisen & Hauptspeisen
        vorspeisen.add(new Vorspeise("Zwiebelsuppe", zwiebelsuppe));
        vorspeisen.add(new Vorspeise("Coquilles Saint Jacques", coquillesSaintJacques));
        vorspeisen.add(new Vorspeise("Salade Nicoise", saladeNicoise));
        vorspeisen.add(new Vorspeise("Tarte Tatin Savory", tarteTatinSavory));
        vorspeisen.add(new Vorspeise("Croque Monsieur", croqueMonsieur));
        vorspeisen.add(new Vorspeise("Terrine de Campagne", terrineDeCampagne));
        vorspeisen.add(new Vorspeise("Lachs Tatar", lachsTatar));
        vorspeisen.add(new Vorspeise("Käseauswahl", kaeseAuswahl));


        hauptspeisen.add(new Hauptspeise("Ratatouille", ratatouilleAlt));
        hauptspeisen.add(new Hauptspeise("Quiche Lorraine", quicheLorraineAlt));
        hauptspeisen.add(new Hauptspeise("Bouillabaisse", bouillabaisse));
        hauptspeisen.add(new Hauptspeise("Coq au Vin", coqAuVin));
        hauptspeisen.add(new Hauptspeise("Tarte Tatin", tarteTatin));

        ArrayList<Kaltgetränk> kaltgetraenke = new ArrayList<>();
        kaltgetraenke.add(new Kaltgetränk("Perrier", perrier, false));
        kaltgetraenke.add(new Kaltgetränk("Orangina", orangina, false));
        kaltgetraenke.add(new Kaltgetränk("Cassis Limonade", cassisLimonade, false));
        kaltgetraenke.add(new Kaltgetränk("Eistee Lavendel", eisteeLavendel, false));

        ArrayList<Heißgetränk> heissgetraenke = new ArrayList<>();
        heissgetraenke.add(new Heißgetränk("Café Crème", cafeCreme));
        heissgetraenke.add(new Heißgetränk("Chocolat Chaud", chocolatChaud));
        heissgetraenke.add(new Heißgetränk("Thé Vert", theVert));
        heissgetraenke.add(new Heißgetränk("Café au Lait", cafeAuLait));

// Restaurantobjekt
        Restaurant laProvence = new Restaurant(Kategorien.FRANZÖSISCH, true);
        laProvence.setName("La Provence");
        laProvence.setVorspeisenListe(vorspeisen);
        laProvence.setHauptspeisenListe(hauptspeisen);
        laProvence.setKaltgetränkeListe(kaltgetraenke);
        laProvence.setHeißgetränkeListe(heissgetraenke);
        laProvence.setAdresse("Bahnhof Strasse 15, 20095 Hamburg");
        laProvence.setLatitude(53.548828);
        laProvence.setLongitude(9.987170);
        laProvence.setWebsite ( "www.laprovence.fr");
        laProvence.setTelefonnummer ( "0456 789012");
        laProvence.setMail ( "info@laprovence.fr");
        laProvence.setBeschreibung ("Ein charmantes französisches Bistro im Herzen der Stadt – genießen Sie klassische Spezialitäten und erlesene Weine in stilvollem Ambiente.");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            laProvence.setOeffnungszeiten(LocalTime.of(11, 0), LocalTime.of(23, 0));
        }
        restaurants.add(laProvence);
        
        // Aus altem Datammanager

        // Zutaten und Gerichte für das Restaurant "Cocktail Lounge"
        Zutat[] Mojito = new Zutat[] {
                new Zutat("Rum", 2.50),
                new Zutat("Minze", 0.30),
                new Zutat("Zucker", 0.20),
                new Zutat("Limettensaft", 0.50),
                new Zutat("Soda", 0.20),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] TequilaSunrise = new Zutat[] {
                new Zutat("Tequila", 2.20),
                new Zutat("Orangensaft", 0.80),
                new Zutat("Grenadine", 0.50),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] WhiskeySour = new Zutat[] {
                new Zutat("Whiskey", 2.50),
                new Zutat("Zitronensaft", 0.50),
                new Zutat("Zucker", 0.20),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] PinaColada = new Zutat[] {
                new Zutat("Rum", 2.50),
                new Zutat("Kokosmilch", 1.00),
                new Zutat("Ananassaft", 0.80),
                new Zutat("Sahne", 0.40),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] BlueLagoon = new Zutat[] {
                new Zutat("Wodka", 2.00),
                new Zutat("Blue Curaçao", 1.00),
                new Zutat("Zitronensaft", 0.50),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] GinTonic = new Zutat[] {
                new Zutat("Gin", 2.20),
                new Zutat("Tonic Water", 0.80),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] EspressoMartini = new Zutat[] {
                new Zutat("Wodka", 2.00),
                new Zutat("Kaffeelikör", 1.20),
                new Zutat("Espresso", 0.80),
                new Zutat("Eiswürfel", 0.10)
        };
        Zutat[] MiniBurgerSlider = new Zutat[] {
                new Zutat("Rindfleisch", 2.00),
                new Zutat("Minibrötchen", 1.20),
                new Zutat("Cheddar", 0.80),
                new Zutat("Gurke", 0.30),
                new Zutat("Cocktailsauce", 0.50)
        };
        Zutat[] NachoPlatte = new Zutat[] {
                new Zutat("Tortilla Chips", 1.50),
                new Zutat("Cheddar", 1.00),
                new Zutat("Jalapeños", 0.60),
                new Zutat("Guacamole", 1.20),
                new Zutat("Salsa", 0.70),
                new Zutat("Sauerrahm", 0.60)
        };
        Zutat[] GarnelenCocktail = new Zutat[] {
                new Zutat("Garnelen", 2.50),
                new Zutat("Cocktailsauce", 0.60),
                new Zutat("Blattsalat", 0.50),
                new Zutat("Zitrone", 0.30),
                new Zutat("Dill", 0.20)
        };
        Zutat[] ChickenWings = new Zutat[] {
                new Zutat("Hähnchenflügel", 2.30),
                new Zutat("BBQ-Sauce", 0.60),
                new Zutat("Selleriestangen", 0.40),
                new Zutat("Blue Cheese Dip", 0.70)
        };
        Zutat[] FalafelBällchen = new Zutat[] {
                new Zutat("Kichererbsen", 0.80),
                new Zutat("Petersilie", 0.20),
                new Zutat("Knoblauch", 0.30),
                new Zutat("Tahini-Dip", 0.70),
                new Zutat("Limette", 0.30)
        };
        Zutat[] MozzarellaSticks = new Zutat[] {
                new Zutat("Mozzarella", 1.50),
                new Zutat("Paniermehl", 0.40),
                new Zutat("Eier", 0.30),
                new Zutat("Tomatendip", 0.60)
        };
        Zutat[] TrüffelPommes = new Zutat[] {
                new Zutat("Pommes frites", 1.20),
                new Zutat("Trüffelöl", 1.50),
                new Zutat("Parmesan", 1.00),
                new Zutat("Petersilie", 0.20)
        };
        Zutat[] VeggieWraps = new Zutat[] {
                new Zutat("Tortilla Wrap", 0.70),
                new Zutat("Paprika", 0.40),
                new Zutat("Zucchini", 0.50),
                new Zutat("Hummus", 0.80),
                new Zutat("Rucola", 0.30)
        };
        Restaurant BarLounge = new Restaurant(Kategorien.SPIRITUOSEN, false);
        ArrayList<Hauptspeise> drinksBarLounge = new ArrayList<>();
        ArrayList<Vorspeise> drinksBarLoungeVorspeisen = new ArrayList<>();
        drinksBarLoungeVorspeisen.add(new Vorspeise("Mini Burger Slider", MiniBurgerSlider));
        drinksBarLoungeVorspeisen.add(new Vorspeise("Nacho Platte", NachoPlatte));
        drinksBarLoungeVorspeisen.add(new Vorspeise("Garnelen Cocktail", GarnelenCocktail));
        drinksBarLoungeVorspeisen.add(new Vorspeise("Chicken Wings", ChickenWings));
        drinksBarLoungeVorspeisen.add(new Vorspeise("Falafel Bällchen", FalafelBällchen));
        drinksBarLoungeVorspeisen.add(new Vorspeise("Mozzarella Sticks", MozzarellaSticks));
        drinksBarLoungeVorspeisen.add(new Vorspeise("Trüffel Pommes", TrüffelPommes));
        drinksBarLoungeVorspeisen.add(new Vorspeise("Veggie Wraps", VeggieWraps));
        BarLounge.setVorspeisenListe(drinksBarLoungeVorspeisen);
        drinksBarLounge.add(new Hauptspeise("Mojito", Mojito));
        drinksBarLounge.add(new Hauptspeise("Tequila Sunrise", TequilaSunrise));
        drinksBarLounge.add(new Hauptspeise("Whiskey Sour", WhiskeySour));
        drinksBarLounge.add(new Hauptspeise("Pina Colada", PinaColada));
        drinksBarLounge.add(new Hauptspeise("Blue Lagoon", BlueLagoon));
        drinksBarLounge.add(new Hauptspeise("Gin Tonic", GinTonic));
        drinksBarLounge.add(new Hauptspeise("Espresso Martini", EspressoMartini));
        BarLounge.setHauptspeisenListe(drinksBarLounge);
        BarLounge.setAdresse("Reeperbahn 34, 20359 Hamburg");
        BarLounge.setLatitude(53.554246);
        BarLounge.setLongitude(9.964778);
        BarLounge.setName("BarLounge");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            BarLounge.setOeffnungszeiten(LocalTime.of(18, 0), LocalTime.of(2, 0));
        }
        BarLounge.setWebsite ("www.barlounge1.de");
        BarLounge.setBeschreibung ("Die stilvolle Cocktailbar im Herzen der Stadt mit Signature Drinks und entspannter Atmosphäre.");
        BarLounge.setTelefonnummer ("040 9876543");
        BarLounge.setMail ("info@barlounge1.de");

        restaurants.add(BarLounge);

        // Zutaten und Gerichte für das Restaurant "SnackHaus 1"
        Zutat[] SchinkenBaguette = new Zutat[] {
                new Zutat("Baguette", 1.20),
                new Zutat("Butter", 0.30),
                new Zutat("Schinken", 1.00),
                new Zutat("Käse", 0.80)
        };
        Zutat[] ChickenWrap = new Zutat[] {
                new Zutat("Weizentortilla", 1.00),
                new Zutat("Hähnchenbrust", 2.00),
                new Zutat("Eisbergsalat", 0.60),
                new Zutat("Guacamole", 0.90)
        };
        Zutat[] VeggieToast = new Zutat[] {
                new Zutat("Toastbrot", 0.50),
                new Zutat("Paprika", 0.60),
                new Zutat("Tomaten", 0.70),
                new Zutat("Käse", 0.80)
        };
        Zutat[] SpiegeleiSandwich = new Zutat[] {
                new Zutat("Toastbrot", 0.50),
                new Zutat("Spiegelei", 1.00),
                new Zutat("Bacon", 1.00),
                new Zutat("Ketchup", 0.30)
        };
        Zutat[] TunaSnack = new Zutat[] {
                new Zutat("Thunfisch", 1.20),
                new Zutat("Oliven", 0.60),
                new Zutat("Zwiebeln", 0.40)
        };
        Zutat[] MozzarellaCiabatta = new Zutat[] {
                new Zutat("Ciabatta", 1.20),
                new Zutat("Mozzarella", 1.00),
                new Zutat("Tomaten", 0.70),
                new Zutat("Basilikum", 0.40)
        };
        Zutat[] Snackplatte = new Zutat[] {
                new Zutat("Salami", 1.00),
                new Zutat("Käse", 0.80),
                new Zutat("Gurke", 0.40),
                new Zutat("Röstzwiebeln", 0.30)
        };
        Zutat[] Brownie = new Zutat[] {
                new Zutat("Zartbitterschokolade", 1.20),
                new Zutat("Butter", 0.70),
                new Zutat("Zucker", 0.40),
                new Zutat("Eier", 0.60),
                new Zutat("Mehl", 0.30),
                new Zutat("Walnüsse", 1.10)
        };
        Zutat[] Donut = new Zutat[] {
                new Zutat("Mehl", 0.40),
                new Zutat("Zucker", 0.30),
                new Zutat("Milch", 0.50),
                new Zutat("Eier", 0.60),
                new Zutat("Schokoglasur", 0.80),
                new Zutat("Streusel", 0.40)
        };
        Zutat[] WaffelMitKirschen = new Zutat[] {
                new Zutat("Waffelteig", 0.90),
                new Zutat("Kirschen", 0.80),
                new Zutat("Vanillesauce", 0.70),
                new Zutat("Puderzucker", 0.20)
        };
        Zutat[] CookieSandwich = new Zutat[] {
                new Zutat("Cookies", 1.00),
                new Zutat("Vanilleeis", 1.20),
                new Zutat("Schokodrops", 0.60)
        };
        Zutat[] Muffin = new Zutat[] {
                new Zutat("Mehl", 0.30),
                new Zutat("Zucker", 0.40),
                new Zutat("Eier", 0.50),
                new Zutat("Backpulver", 0.20),
                new Zutat("Blaubeeren", 0.90)
        };
        Zutat[] Eisbecher = new Zutat[] {
                new Zutat("Vanilleeis", 1.00),
                new Zutat("Schokoeis", 1.00),
                new Zutat("Sahne", 0.40),
                new Zutat("Schokosauce", 0.50),
                new Zutat("Krokant", 0.60)
        };
        Zutat[] MilchreisZimtZucker = new Zutat[] {
                new Zutat("Milchreis", 0.80),
                new Zutat("Milch", 0.70),
                new Zutat("Zucker", 0.30),
                new Zutat("Zimt", 0.20)
        };
        Zutat[] Apfeltasche = new Zutat[] {
                new Zutat("Blätterteig", 0.90),
                new Zutat("Äpfel", 0.80),
                new Zutat("Zimt", 0.20),
                new Zutat("Zucker", 0.30)
        };
        Zutat[] MiniPancakes = new Zutat[] {
                new Zutat("Pfannkuchenteig", 0.90),
                new Zutat("Ahornsirup", 0.70),
                new Zutat("Beerenmix", 0.80)
        };
        Zutat[] ChurrosMitSchokosauce = new Zutat[] {
                new Zutat("Churros-Teig", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Zimt", 0.20),
                new Zutat("Schokosauce", 0.60)
        };
        Zutat[] Cola = new Zutat[] {
                new Zutat("Wasser", 0.20),
                new Zutat("Zucker", 0.30),
                new Zutat("Kohlensäure", 0.10),
                new Zutat("Cola-Aroma", 0.40)
        };

        Zutat[] Apfelschorle = new Zutat[] {
                new Zutat("Apfelsaft", 0.60),
                new Zutat("Mineralwasser", 0.40)
        };

        Zutat[] EisteePfirsich1 = new Zutat[] {
                new Zutat("Schwarzer Tee", 0.30),
                new Zutat("Pfirsicharoma", 0.40),
                new Zutat("Zucker", 0.20),
                new Zutat("Wasser", 0.30),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] Zitronenlimonade = new Zutat[] {
                new Zutat("Zitronensaft", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Wasser", 0.30),
                new Zutat("Kohlensäure", 0.10)
        };

// Heißgetränke für "SnackHaus 1"
        Zutat[] Kaffee = new Zutat[] {
                new Zutat("Kaffeepulver", 0.50),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] Kakao = new Zutat[] {
                new Zutat("Milch", 0.50),
                new Zutat("Kakaopulver", 0.40),
                new Zutat("Zucker", 0.20)
        };

        Zutat[] TeeKamille = new Zutat[] {
                new Zutat("Kamillentee", 0.30),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] Cappuccino1 = new Zutat[] {
                new Zutat("Espressobohnen", 0.50),
                new Zutat("Milch", 0.40),
                new Zutat("Milchschaum", 0.30)
        };

        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksSnackHaus = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksSnackHaus = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksSnackHaus.add(new Kaltgetränk("Cola", Cola, false));
        drinksSnackHaus.add(new Kaltgetränk("Apfelschorle", Apfelschorle, false));
        drinksSnackHaus.add(new Kaltgetränk("Eistee Pfirsich", EisteePfirsich1, false));
        drinksSnackHaus.add(new Kaltgetränk("Zitronenlimonade", Zitronenlimonade, false));

// Heißgetränke hinzufügen
        hotDrinksSnackHaus.add(new Heißgetränk("Kaffee", Kaffee));
        hotDrinksSnackHaus.add(new Heißgetränk("Kakao", Kakao));
        hotDrinksSnackHaus.add(new Heißgetränk("Tee Kamille", TeeKamille));
        hotDrinksSnackHaus.add(new Heißgetränk("Cappuccino", Cappuccino1));

        Restaurant SnackHaus = new Restaurant(Kategorien.SNACKS, true);
        SnackHaus.setBildResourceId(R.drawable.bella_napoli);
        ArrayList<Hauptspeise> speisenSnackHaus = new ArrayList<>();
        ArrayList<Nachspeiße> snackHausNachspeisen = new ArrayList<>();
        speisenSnackHaus.add(new Hauptspeise("Schinken Baguette", SchinkenBaguette));
        speisenSnackHaus.add(new Hauptspeise("Chicken Wrap", ChickenWrap));
        speisenSnackHaus.add(new Hauptspeise("Veggie Toast", VeggieToast));
        speisenSnackHaus.add(new Hauptspeise("Spiegelei Sandwich", SpiegeleiSandwich));
        speisenSnackHaus.add(new Hauptspeise("Tuna Snack", TunaSnack));
        speisenSnackHaus.add(new Hauptspeise("Mozzarella Ciabatta", MozzarellaCiabatta));
        speisenSnackHaus.add(new Hauptspeise("Snackplatte", Snackplatte));
        SnackHaus.setHauptspeisenListe(speisenSnackHaus);
        snackHausNachspeisen.add(new Nachspeiße("Brownie",Brownie));
        snackHausNachspeisen.add(new Nachspeiße("Donut", Donut));
        snackHausNachspeisen.add(new Nachspeiße("Waffel mit Kirschen", WaffelMitKirschen));
        snackHausNachspeisen.add(new Nachspeiße("Cookie Sandwich", CookieSandwich));
        snackHausNachspeisen.add(new Nachspeiße("Muffin", Muffin));
        snackHausNachspeisen.add(new Nachspeiße("Eisbecher", Eisbecher));
        snackHausNachspeisen.add(new Nachspeiße("Milchreis mit Zimt und Zucker", MilchreisZimtZucker));
        snackHausNachspeisen.add(new Nachspeiße("Apfeltasche", Apfeltasche));
        snackHausNachspeisen.add(new Nachspeiße("Mini Pancakes", MiniPancakes));
        snackHausNachspeisen.add(new Nachspeiße("Churros mit Schokosauce", ChurrosMitSchokosauce));
        SnackHaus.setNachspeisenListe(snackHausNachspeisen);
        SnackHaus.setKaltgetränkeListe(drinksSnackHaus);
        SnackHaus.setHeißgetränkeListe(hotDrinksSnackHaus);
        SnackHaus.setAdresse("Mönckebergstraße 11, 20095 Hamburg");
        SnackHaus.setLatitude(53.550290);
        SnackHaus.setLongitude(10.001400);
        SnackHaus.setName("SnackHaus");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            SnackHaus.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(20, 0));
        }
        SnackHaus.setWebsite ("www.snackhaus.de");
        SnackHaus.setBeschreibung ("Knackige Snacks, frisch belegt und ideal für unterwegs. Bei uns trifft Genuss auf Geschwindigkeit!");
        SnackHaus.setTelefonnummer ("030 11122233");
        SnackHaus.setMail ("kontakt@snackhaus.de");

        restaurants.add(SnackHaus);

        // Zutaten und Gerichte für das Asiatische Restaurant "Tokyo Zen"
        // 1. Sushi Platter
        Zutat[] SushiZutaten = new Zutat[]{
                new Zutat("Reis", 2.50),
                new Zutat("Nori", 1.50),
                new Zutat("Lachs", 5.00),
                new Zutat("Gurke", 0.80),
                new Zutat("Avocado", 1.20)
        };
        Hauptspeise SushiPlatter = new Hauptspeise("Sushi Platter", SushiZutaten);

        // 2. Gemüse Tempura
        Zutat[] TempuraZutaten = new Zutat[]{
                new Zutat("Garnelen", 3.75),
                new Zutat("Zucchini", 1.80),
                new Zutat("Aubergine", 2.00),
                new Zutat("Tempura-Teig", 0.90),
                new Zutat("Dip-Sauce", 0.50)
        };
        Hauptspeise GemüseTempura = new Hauptspeise("Gemüse Tempura", TempuraZutaten);

        // 3. Miso Suppe
        Zutat[] MisoZutaten = new Zutat[]{
                new Zutat("Miso Paste", 1.25),
                new Zutat("Tofu", 2.10),
                new Zutat("Frühlingszwiebeln", 0.65),
                new Zutat("Seetang", 1.10)
        };
        Hauptspeise MisoSuppe = new Hauptspeise("Miso Suppe", MisoZutaten);
        Zutat[] Edamame = new Zutat[] {
                new Zutat("Edamame", 1.20),
                new Zutat("Meersalz", 0.20)
        };
        Zutat[] Gyoza = new Zutat[] {
                new Zutat("Schweinehackfleisch", 1.80),
                new Zutat("Ingwer", 0.50),
                new Zutat("Knoblauch", 0.30),
                new Zutat("Sojasauce", 0.40),
                new Zutat("Teig", 0.70)
        };
        Zutat[] Misosuppe = new Zutat[] {
                new Zutat("Miso-Paste", 0.90),
                new Zutat("Tofu", 0.80),
                new Zutat("Frühlingszwiebeln", 0.20),
                new Zutat("Algen", 0.30),
                new Zutat("Wasser", 0.10)
        };
        Zutat[] WakameSalat = new Zutat[] {
                new Zutat("Wakame-Algen", 1.00),
                new Zutat("Sesamöl", 0.50),
                new Zutat("Reisessig", 0.30),
                new Zutat("Sesamsamen", 0.20)
        };
        Zutat[] SushiRollen = new Zutat[] {
                new Zutat("Nori", 0.40),
                new Zutat("Sushireis", 1.20),
                new Zutat("Lachs", 2.50),
                new Zutat("Gurke", 0.30),
                new Zutat("Avocado", 0.80)
        };
        Zutat[] Frühlingsrollen = new Zutat[] {
                new Zutat("Reisblätter", 0.80),
                new Zutat("Gemüse", 0.60),
                new Zutat("Hähnchenbrust", 1.50),
                new Zutat("Sojasauce", 0.40),
                new Zutat("Koriander", 0.20)
        };
        Zutat[] Tempura = new Zutat[] {
                new Zutat("Garnelen", 2.50),
                new Zutat("Gemüse", 0.70),
                new Zutat("Tempurateig", 0.90),
                new Zutat("Sojasauce", 0.40)
        };
        Zutat[] TofuTatar = new Zutat[] {
                new Zutat("Tofu", 1.00),
                new Zutat("Sesamöl", 0.50),
                new Zutat("Frühlingszwiebeln", 0.20),
                new Zutat("Sojasauce", 0.40),
                new Zutat("Chili", 0.30)
        };
        Zutat[] Sashimi = new Zutat[] {
                new Zutat("Lachs", 2.50),
                new Zutat("Thunfisch", 2.80),
                new Zutat("Wasabi", 0.30),
                new Zutat("Sojasauce", 0.40)
        };
        Zutat[] Ramen = new Zutat[] {
                new Zutat("Ramen-Nudeln", 0.90),
                new Zutat("Brühe", 1.20),
                new Zutat("Eier", 0.60),
                new Zutat("Frühlingszwiebeln", 0.20),
                new Zutat("Schweinebauch", 2.00)
        };
        Zutat[] Mochi = new Zutat[] {
                new Zutat("Reismehl", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Erdbeeren", 1.00),
                new Zutat("Matcha-Pulver", 0.50)
        };
        Zutat[] Ananasspieße = new Zutat[] {
                new Zutat("Ananas", 0.90),
                new Zutat("Kokosnuss", 0.80),
                new Zutat("Honig", 0.30),
                new Zutat("Lime", 0.20)
        };
        Zutat[] MatchaTiramisu = new Zutat[] {
                new Zutat("Mascarpone", 1.50),
                new Zutat("Löffelbiskuits", 0.80),
                new Zutat("Matcha", 0.50),
                new Zutat("Zucker", 0.30)
        };
        Zutat[] RoteBohnensuppe = new Zutat[] {
                new Zutat("Adzukibohnen", 1.00),
                new Zutat("Zucker", 0.30),
                new Zutat("Sahne", 0.40),
                new Zutat("Vanille", 0.20)
        };
        Zutat[] TempuraEis = new Zutat[] {
                new Zutat("Vanilleeis", 1.20),
                new Zutat("Tempurateig", 0.90),
                new Zutat("Sesamsamen", 0.30),
                new Zutat("Zucker", 0.20)
        };
        Zutat[] YuzuSorbet = new Zutat[] {
                new Zutat("Yuzu", 1.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Wasser", 0.10)
        };
        Zutat[] Sesamkekse = new Zutat[] {
                new Zutat("Mehl", 0.30),
                new Zutat("Sesam", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Ei", 0.30)
        };
        Zutat[] GrüneTeemousse = new Zutat[] {
                new Zutat("Matcha", 0.50),
                new Zutat("Sahne", 0.70),
                new Zutat("Zucker", 0.30),
                new Zutat("Ei", 0.40)
        };
        Zutat[] BananenTempura = new Zutat[] {
                new Zutat("Bananen", 0.60),
                new Zutat("Tempurateig", 0.90),
                new Zutat("Zucker", 0.20),
                new Zutat("Honig", 0.30)
        };
        Zutat[] KaramellisiertesIngwerEis = new Zutat[] {
                new Zutat("Ingwer", 0.50),
                new Zutat("Sahne", 0.70),
                new Zutat("Zucker", 0.30),
                new Zutat("Vanille", 0.20)
        };
        // Kaltgetränke für "Tokyo Zen"
        Zutat[] Ramune = new Zutat[] {
                new Zutat("Zitronenaroma", 0.40),
                new Zutat("Zucker", 0.30),
                new Zutat("Kohlensäure", 0.10),
                new Zutat("Wasser", 0.30)
        };

        Zutat[] GrünerTeeKalt = new Zutat[] {
                new Zutat("Grüner Tee", 0.40),
                new Zutat("Wasser", 0.20),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] YuzuLimonade = new Zutat[] {
                new Zutat("Yuzu-Saft", 0.60),
                new Zutat("Zucker", 0.30),
                new Zutat("Sodawasser", 0.40)
        };

        Zutat[] MatchaLatteCold = new Zutat[] {
                new Zutat("Matcha", 0.50),
                new Zutat("Milch", 0.70),
                new Zutat("Eiswürfel", 0.10),
                new Zutat("Zucker", 0.30)
        };

// Heißgetränke für "Tokyo Zen"
        Zutat[] GrünerTeeHeiß = new Zutat[] {
                new Zutat("Grüner Tee", 0.40),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] MatchaLatte = new Zutat[] {
                new Zutat("Matcha", 0.50),
                new Zutat("Milch", 0.70),
                new Zutat("Zucker", 0.30)
        };

        Zutat[] IngwerTee = new Zutat[] {
                new Zutat("Ingwer", 0.50),
                new Zutat("Honig", 0.30),
                new Zutat("Zitronensaft", 0.20),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] JasminTee = new Zutat[] {
                new Zutat("Jasmintee", 0.40),
                new Zutat("Wasser", 0.10)
        };
        // Erstellen des Restaurants und Befüllen der Gerichte-Liste
        Restaurant TokyoZen = new Restaurant(Kategorien.ASIATISCH, true);
        ArrayList<Hauptspeise> listeTokyoZenHauptspeisen = new ArrayList<Hauptspeise>();
        ArrayList<Nachspeiße> listeTokyoZenNachspeisen = new ArrayList<Nachspeiße>();
        ArrayList<Vorspeise> listeTokyoZenVorspeisen = new ArrayList<Vorspeise>();
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksTokyoZen = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksTokyoZen = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksTokyoZen.add(new Kaltgetränk("Ramune", Ramune, false));
        drinksTokyoZen.add(new Kaltgetränk("Grüner Tee (kalt)", GrünerTeeKalt, false));
        drinksTokyoZen.add(new Kaltgetränk("Yuzu Limonade", YuzuLimonade, false));
        drinksTokyoZen.add(new Kaltgetränk("Matcha Latte (kalt)", MatchaLatteCold, false));

// Heißgetränke hinzufügen
        hotDrinksTokyoZen.add(new Heißgetränk("Grüner Tee (heiß)", GrünerTeeHeiß));
        hotDrinksTokyoZen.add(new Heißgetränk("Matcha Latte", MatchaLatte));
        hotDrinksTokyoZen.add(new Heißgetränk("Ingwertee", IngwerTee));
        hotDrinksTokyoZen.add(new Heißgetränk("Jasmintee", JasminTee));
        listeTokyoZenVorspeisen.add(new Vorspeise("Edamame", Edamame));
        listeTokyoZenVorspeisen.add(new Vorspeise("Gyoza", Gyoza));
        listeTokyoZenVorspeisen.add(new Vorspeise("Miso Suppe", Misosuppe));
        listeTokyoZenVorspeisen.add(new Vorspeise("Wakame Salat", WakameSalat));
        listeTokyoZenVorspeisen.add(new Vorspeise("Sushi Rollen", SushiRollen));
        listeTokyoZenVorspeisen.add(new Vorspeise("Frühlingsrollen", Frühlingsrollen));
        listeTokyoZenVorspeisen.add(new Vorspeise("Tempura", Tempura));
        listeTokyoZenVorspeisen.add(new Vorspeise("Tofu Tatar", TofuTatar));
        listeTokyoZenVorspeisen.add(new Vorspeise("Sashimi", Sashimi));
        listeTokyoZenVorspeisen.add(new Vorspeise("Ramen", Ramen));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Mochi", Mochi));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Ananasspieße", Ananasspieße));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Matcha Tiramisu", MatchaTiramisu));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Rote Bohnensuppe", RoteBohnensuppe));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Tempura Eis", TempuraEis));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Yuzu Sorbet", YuzuSorbet));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Sesamkekse", Sesamkekse));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Grüne Teemousse", GrüneTeemousse));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Bananen Tempura", BananenTempura));
        listeTokyoZenNachspeisen.add(new Nachspeiße("Karamellisiertes Ingwer Eis", KaramellisiertesIngwerEis));
        TokyoZen.setNachspeisenListe(listeTokyoZenNachspeisen);
        TokyoZen.setVorspeisenListe(listeTokyoZenVorspeisen);
        listeTokyoZenHauptspeisen.add(SushiPlatter);
        listeTokyoZenHauptspeisen.add(GemüseTempura);
        listeTokyoZenHauptspeisen.add(MisoSuppe);
        TokyoZen.setHauptspeisenListe(listeTokyoZenHauptspeisen);
        // Listen zum Restaurant hinzufügen
        TokyoZen.setKaltgetränkeListe(drinksTokyoZen);
        TokyoZen.setHeißgetränkeListe(hotDrinksTokyoZen);
        TokyoZen.setAdresse("Steinstraße 1, 20095 Hamburg");
        TokyoZen.setLatitude(53.548469);
        TokyoZen.setLongitude(10.002377);
        TokyoZen.setName("Tokyo Zen");
        // Öffnungszeiten setzen (mit API Level Überprüfung)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            TokyoZen.setOeffnungszeiten(LocalTime.of(11, 0), LocalTime.of(23, 0));
        }
        TokyoZen.setWebsite ("www.tokyozen.jp");
        TokyoZen.setBeschreibung ("Erleben Sie authentische japanische Küche in modernem Ambiente. Unser Angebot umfasst frisches Sushi, knackige Tempura und traditionelle Miso Suppe. Wir freuen uns auf Ihren Besuch!");
        TokyoZen.setTelefonnummer ("0987 654321");
        TokyoZen.setMail ("info@tokyozen.jp");

        restaurants.add(TokyoZen);

        // Zutaten und Gerichte für das Italienische Restaurant "Ristorante Amore"
        Zutat[] PenneArrabbiata = new Zutat[] {
                new Zutat("Penne", 2.20),
                new Zutat("Tomaten", 1.50),
                new Zutat("Chili", 0.80),
                new Zutat("Knoblauch", 0.60)
        };
        Zutat[] Caprese = new Zutat[] {
                new Zutat("Mozzarella", 2.00),
                new Zutat("Tomaten", 1.30),
                new Zutat("Basilikum", 0.70),
                new Zutat("Olivenöl", 1.10)
        };
        Zutat[] SpaghettiBolognese = new Zutat[] {
                new Zutat("Spaghetti", 1.00),
                new Zutat("Rinderhackfleisch", 2.00),
                new Zutat("Tomaten", 1.50),
                new Zutat("Zwiebel", 0.40),
                new Zutat("Knoblauch", 0.30),
                new Zutat("Basilikum", 0.50),
                new Zutat("Parmesan", 1.00)
        };
        Zutat[] PizzaMargherita = new Zutat[] {
                new Zutat("Pizzateig", 1.00),
                new Zutat("Tomatensauce", 0.50),
                new Zutat("Mozzarella", 1.20),
                new Zutat("Basilikum", 0.50)
        };
        Zutat[] Lasagne = new Zutat[] {
                new Zutat("Lasagneblätter", 1.50),
                new Zutat("Rinderhackfleisch", 2.00),
                new Zutat("Bechamelsauce", 1.00),
                new Zutat("Tomaten", 1.50),
                new Zutat("Zwiebel", 0.40),
                new Zutat("Parmesan", 1.00)
        };
        Zutat[] TagliatelleAlfredo = new Zutat[] {
                new Zutat("Tagliatelle", 1.20),
                new Zutat("Sahne", 0.80),
                new Zutat("Parmesan", 1.00),
                new Zutat("Butter", 0.50),
                new Zutat("Knoblauch", 0.30)
        };
        Zutat[] RisottoAiFunghi = new Zutat[] {
                new Zutat("Risottoreis", 1.00),
                new Zutat("Pilze", 1.50),
                new Zutat("Sahne", 0.80),
                new Zutat("Parmesan", 1.00),
                new Zutat("Zwiebel", 0.40)
        };
        Zutat[] GnocchiSorrentina = new Zutat[] {
                new Zutat("Gnocchi", 1.00),
                new Zutat("Tomatensauce", 0.50),
                new Zutat("Mozzarella", 1.20),
                new Zutat("Basilikum", 0.50),
                new Zutat("Parmesan", 1.00)
        };
        Zutat[] FrittierteAuberginen = new Zutat[] {
                new Zutat("Auberginen", 0.90),
                new Zutat("Mehl", 0.30),
                new Zutat("Ei", 0.40),
                new Zutat("Paniermehl", 0.50),
                new Zutat("Olivenöl", 0.70)
        };
        Zutat[] PolloAllaCacciatora = new Zutat[] {
                new Zutat("Hähnchenschenkel", 2.50),
                new Zutat("Tomaten", 1.50),
                new Zutat("Oliven", 0.60),
                new Zutat("Paprika", 0.80),
                new Zutat("Zwiebel", 0.40),
                new Zutat("Knoblauch", 0.30)
        };
        Zutat[] SaltimboccaAllaRomana = new Zutat[] {
                new Zutat("Kalbsschnitzel", 3.00),
                new Zutat("Schinken", 1.20),
                new Zutat("Salbei", 0.30),
                new Zutat("Weißwein", 0.80),
                new Zutat("Butter", 0.50)
        };
        Zutat[] BranzinoAlForno = new Zutat[] {
                new Zutat("Branzino", 4.00),
                new Zutat("Rosmarin", 0.30),
                new Zutat("Olivenöl", 0.50),
                new Zutat("Zitrone", 0.40),
                new Zutat("Knoblauch", 0.30)
        };
        Zutat[] Bruschetta1 = new Zutat[] {
                new Zutat("Baguette", 1.00),
                new Zutat("Tomaten", 1.50),
                new Zutat("Basilikum", 0.50),
                new Zutat("Olivenöl", 0.50),
                new Zutat("Knoblauch", 0.30)
        };
        Zutat[] Caprese1 = new Zutat[] {
                new Zutat("Mozzarella", 1.20),
                new Zutat("Tomaten", 1.50),
                new Zutat("Basilikum", 0.50),
                new Zutat("Olivenöl", 0.50)
        };
        Zutat[] CarpaccioDiManzo = new Zutat[] {
                new Zutat("Rinderfilet", 3.00),
                new Zutat("Rucola", 0.70),
                new Zutat("Parmesan", 1.00),
                new Zutat("Olivenöl", 0.50),
                new Zutat("Zitrone", 0.40)
        };
        Zutat[] AntipastiMisto1 = new Zutat[] {
                new Zutat("Salami", 1.20),
                new Zutat("Mozzarella", 1.20),
                new Zutat("Oliven", 0.60),
                new Zutat("Paprika", 0.80),
                new Zutat("Tomaten", 1.50)
        };
        Zutat[] FritturaDiPesce = new Zutat[] {
                new Zutat("Fischfilets", 2.50),
                new Zutat("Mehl", 0.30),
                new Zutat("Paniermehl", 0.50),
                new Zutat("Olivenöl", 0.70),
                new Zutat("Zitrone", 0.40)
        };
        Zutat[] Tiramisu = new Zutat[] {
                new Zutat("Mascarpone", 1.50),
                new Zutat("Löffelbiskuits", 0.80),
                new Zutat("Kaffee", 0.40),
                new Zutat("Kakaopulver", 0.30),
                new Zutat("Zucker", 0.30)
        };
        Zutat[] PannaCotta = new Zutat[] {
                new Zutat("Sahne", 0.80),
                new Zutat("Vanille", 0.30),
                new Zutat("Zucker", 0.30),
                new Zutat("Gelatine", 0.40)
        };
        Zutat[] Cannoli = new Zutat[] {
                new Zutat("Cannoli-Schalen", 1.00),
                new Zutat("Ricotta", 1.20),
                new Zutat("Puderzucker", 0.20),
                new Zutat("Schokoladenstückchen", 0.50)
        };
        Zutat[] Zabaione = new Zutat[] {
                new Zutat("Eier", 0.60),
                new Zutat("Marsala", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Vanille", 0.20)
        };
        Zutat[] Gelato = new Zutat[] {
                new Zutat("Vanilleeis", 1.00),
                new Zutat("Schokoladeneis", 1.00),
                new Zutat("Früchte", 0.80),
                new Zutat("Krokant", 0.50)
        };
        Restaurant RistoranteAmore = new Restaurant(Kategorien.ITALIENISCH, true);
        ArrayList<Hauptspeise> listeHauptspeisenAmore = new ArrayList<>();
        ArrayList<Vorspeise> listeVorspeisenAmore = new ArrayList<>();
        ArrayList<Nachspeiße> listeNachspeisenAmore = new ArrayList<>();
        listeHauptspeisenAmore.add(new Hauptspeise("Penne Arrabbiata", PenneArrabbiata));
        listeHauptspeisenAmore.add(new Hauptspeise("Caprese", Caprese));
        listeHauptspeisenAmore.add(new Hauptspeise("Spaghetti Bolognese", SpaghettiBolognese));
        listeHauptspeisenAmore.add(new Hauptspeise("Pizza Margherita", PizzaMargherita));
        listeHauptspeisenAmore.add(new Hauptspeise("Lasagne", Lasagne));
        listeHauptspeisenAmore.add(new Hauptspeise("Tagliatelle Alfredo", TagliatelleAlfredo));
        listeHauptspeisenAmore.add(new Hauptspeise("Risotto ai Funghi", RisottoAiFunghi));
        listeHauptspeisenAmore.add(new Hauptspeise("Gnocchi Sorrentina", GnocchiSorrentina));
        listeHauptspeisenAmore.add(new Hauptspeise("Frittierte Auberginen", FrittierteAuberginen));
        listeHauptspeisenAmore.add(new Hauptspeise("PolloAllaCacciatora", PolloAllaCacciatora));
        listeHauptspeisenAmore.add(new Hauptspeise("SaltimboccaAllaRomana", SaltimboccaAllaRomana));
        listeHauptspeisenAmore.add(new Hauptspeise("Branzino al Forno", BranzinoAlForno));
        RistoranteAmore.setHauptspeisenListe(listeHauptspeisenAmore);
        listeVorspeisenAmore.add(new Vorspeise("Bruschetta", Bruschetta1));
        listeVorspeisenAmore.add(new Vorspeise("Caprese", Caprese1));
        listeVorspeisenAmore.add(new Vorspeise("Carpaccio di Manzo", CarpaccioDiManzo));
        listeVorspeisenAmore.add(new Vorspeise("Antipasti Misto", AntipastiMisto1));
        listeVorspeisenAmore.add(new Vorspeise("Frittura di Pesce", FritturaDiPesce));
        RistoranteAmore.setVorspeisenListe(listeVorspeisenAmore);
        listeNachspeisenAmore.add(new Nachspeiße("Tiramisu", Tiramisu));
        listeNachspeisenAmore.add(new Nachspeiße("Panna Cotta", PannaCotta));
        listeNachspeisenAmore.add(new Nachspeiße("Cannoli", Cannoli));
        listeNachspeisenAmore.add(new Nachspeiße("Zabaione", Zabaione));
        listeNachspeisenAmore.add(new Nachspeiße("Gelato", Gelato));
        RistoranteAmore.setNachspeisenListe(listeNachspeisenAmore);
        RistoranteAmore.setAdresse("Hohenstaufenring 29, 50674 Köln");
        RistoranteAmore.setLatitude(50.931390);
        RistoranteAmore.setLongitude(6.944976);
        RistoranteAmore.setName("Ristorante Amore");
        RistoranteAmore.setWebsite ("www.ristorante-amore.it");
        RistoranteAmore.setBeschreibung ("Klassische italienische Küche mit Leidenschaft gekocht. Besonders bekannt für unsere hausgemachten Nudelgerichte.");
        RistoranteAmore.setTelefonnummer ("030 112233");
        RistoranteAmore.setMail ("info@amore.it");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            RistoranteAmore.setOeffnungszeiten(LocalTime.of(12, 0), LocalTime.of(22, 0));
        }

        restaurants.add(RistoranteAmore);

        // Zutaten und Gerichte für das Restaurant "Trattoria Roma"
        Zutat[] PizzaQuattroFormaggi = new Zutat[] {
                new Zutat("Pizzateig", 1.80),
                new Zutat("Mozzarella", 2.10),
                new Zutat("Gorgonzola", 2.20),
                new Zutat("Parmesan", 2.00),
                new Zutat("Emmentaler", 1.90)
        };
        Zutat[] PastamitMeeresfrüchten = {
                new Zutat("Spaghetti", 0.83),
                new Zutat("Garnelen", 3.25),
                new Zutat("Oktopus", 3.86),
                new Zutat("Olivenöl extra vergine", 1.77),
                new Zutat("Knoblauch", 2.34)
        };
        Zutat[] GnocchiAlPesto = new Zutat[] {
                new Zutat("Gnocchi", 2.50),
                new Zutat("Pesto", 1.80),
                new Zutat("Pinienkerne", 1.60),
                new Zutat("Parmesan", 2.10)
        };
        Zutat[] PizzaQuattroStagioni = new Zutat[] {
                new Zutat("Pizzateig", 1.00),
                new Zutat("Tomatensauce", 0.50),
                new Zutat("Mozzarella", 1.20),
                new Zutat("Schinken", 1.00),
                new Zutat("Artischocken", 0.80),
                new Zutat("Oliven", 0.60)
        };
        Zutat[] FettuccineAlfredo = new Zutat[] {
                new Zutat("Fettuccine", 1.20),
                new Zutat("Sahne", 0.80),
                new Zutat("Parmesan", 1.00),
                new Zutat("Butter", 0.50),
                new Zutat("Knoblauch", 0.30)
        };
        Zutat[] RisottoAllaPescatora = new Zutat[] {
                new Zutat("Risottoreis", 1.00),
                new Zutat("Meeresfrüchte", 2.50),
                new Zutat("Sahne", 0.80),
                new Zutat("Knoblauch", 0.30),
                new Zutat("Parmesan", 1.00)
        };
        Zutat[] PizzaDiavola = new Zutat[] {
                new Zutat("Pizzateig", 1.00),
                new Zutat("Tomatensauce", 0.50),
                new Zutat("Mozzarella", 1.20),
                new Zutat("Salami", 1.00),
                new Zutat("Chili", 0.50)
        };
        Zutat[] GnocchiBurroSalvia = new Zutat[] {
                new Zutat("Gnocchi", 1.00),
                new Zutat("Butter", 0.50),
                new Zutat("Salbei", 0.30),
                new Zutat("Parmesan", 1.00)
        };
        Zutat[] PolloAllaParmigiana = new Zutat[] {
                new Zutat("Hähnchenbrust", 2.50),
                new Zutat("Tomatensauce", 0.50),
                new Zutat("Mozzarella", 1.20),
                new Zutat("Parmesan", 1.00),
                new Zutat("Paniermehl", 0.50)
        };
        Zutat[] LasagneAllaBolognese = new Zutat[] {
                new Zutat("Lasagneblätter", 1.50),
                new Zutat("Rinderhackfleisch", 2.00),
                new Zutat("Tomaten", 1.50),
                new Zutat("Bechamelsauce", 1.00),
                new Zutat("Parmesan", 1.00)
        };
        Zutat[] SaltimboccaAllaRomana1 = new Zutat[] {
                new Zutat("Kalbsschnitzel", 3.00),
                new Zutat("Schinken", 1.20),
                new Zutat("Salbei", 0.30),
                new Zutat("Weißwein", 0.80),
                new Zutat("Butter", 0.50)
        };
        Zutat[] FritturaDiPesce1 = new Zutat[] {
                new Zutat("Fischfilets", 2.50),
                new Zutat("Mehl", 0.30),
                new Zutat("Paniermehl", 0.50),
                new Zutat("Olivenöl", 0.70),
                new Zutat("Zitrone", 0.40)
        };
        Zutat[] BruschettaAlPomodoro = new Zutat[] {
                new Zutat("Baguette", 1.00),
                new Zutat("Tomaten", 1.50),
                new Zutat("Basilikum", 0.50),
                new Zutat("Olivenöl", 0.50),
                new Zutat("Knoblauch", 0.30)
        };
        Zutat[] Caprese2= new Zutat[] {
                new Zutat("Mozzarella", 1.20),
                new Zutat("Tomaten", 1.50),
                new Zutat("Basilikum", 0.50),
                new Zutat("Olivenöl", 0.50)
        };
        Zutat[] ProsciuttoEMelone = new Zutat[] {
                new Zutat("Prosciutto", 1.50),
                new Zutat("Melone", 1.00)
        };
        Zutat[] FritturaDiVegetali = new Zutat[] {
                new Zutat("Zucchini", 0.80),
                new Zutat("Paprika", 0.60),
                new Zutat("Mehl", 0.30),
                new Zutat("Paniermehl", 0.50),
                new Zutat("Olivenöl", 0.70)
        };
        Zutat[] CarpaccioDiManzo2 = new Zutat[] {
                new Zutat("Rinderfilet", 3.00),
                new Zutat("Rucola", 0.70),
                new Zutat("Parmesan", 1.00),
                new Zutat("Olivenöl", 0.50),
                new Zutat("Zitrone", 0.40)
        };
        Zutat[] Tiramisu2 = new Zutat[] {
                new Zutat("Mascarpone", 1.50),
                new Zutat("Löffelbiskuits", 0.80),
                new Zutat("Kaffee", 0.40),
                new Zutat("Kakaopulver", 0.30),
                new Zutat("Zucker", 0.30)
        };
        Zutat[] PannaCotta2 = new Zutat[] {
                new Zutat("Sahne", 0.80),
                new Zutat("Vanille", 0.30),
                new Zutat("Zucker", 0.30),
                new Zutat("Gelatine", 0.40)
        };
        Zutat[] Cannoli2 = new Zutat[] {
                new Zutat("Cannoli-Schalen", 1.00),
                new Zutat("Ricotta", 1.20),
                new Zutat("Puderzucker", 0.20),
                new Zutat("Schokoladenstückchen", 0.50)
        };
        Zutat[] Gelato2 = new Zutat[] {
                new Zutat("Vanilleeis", 1.00),
                new Zutat("Schokoladeneis", 1.00),
                new Zutat("Früchte", 0.80),
                new Zutat("Krokant", 0.50)
        };
        Zutat[] Zabaione2 = new Zutat[] {
                new Zutat("Eier", 0.60),
                new Zutat("Marsala", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Vanille", 0.20)
        };

        // Kaltgetränke für "Ristorante Amore"
        Zutat[] SanPellegrino2 = new Zutat[] {
                new Zutat("Mineralwasser", 0.50),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] AranciataRossa = new Zutat[] {
                new Zutat("Blutorangensaft", 0.80),
                new Zutat("Zucker", 0.20),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] Chinotto2 = new Zutat[] {
                new Zutat("Chinotto-Extrakt", 1.00),
                new Zutat("Zucker", 0.20),
                new Zutat("Wasser", 0.30),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] Limonata = new Zutat[] {
                new Zutat("Zitronensaft", 0.60),
                new Zutat("Zucker", 0.20),
                new Zutat("Sodawasser", 0.30)
        };

// Heißgetränke für "Ristorante Amore"
        Zutat[] Espresso2 = new Zutat[] {
                new Zutat("Espressobohnen", 0.50),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] Cappuccino2 = new Zutat[] {
                new Zutat("Espressobohnen", 0.50),
                new Zutat("Milch", 0.40),
                new Zutat("Milchschaum", 0.30)
        };

        Zutat[] LatteMacchiato2 = new Zutat[] {
                new Zutat("Espressobohnen", 0.50),
                new Zutat("Milch", 0.60),
                new Zutat("Milchschaum", 0.30)
        };

        Zutat[] CaffèCorretto = new Zutat[] {
                new Zutat("Espresso", 0.50),
                new Zutat("Grappa", 1.20)
        };
        Restaurant TrattoriaRoma = new Restaurant(Kategorien.ITALIENISCH, true);
        ArrayList<Hauptspeise> listeHauptspeisenRoma = new ArrayList<>();
        ArrayList<Vorspeise> listeVorspeisenRoma = new ArrayList<>();
        ArrayList<Nachspeiße> listeNachspeisenRoma = new ArrayList<>();
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksTrattoriaRoma = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksTrattoriaRoma = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksTrattoriaRoma.add(new Kaltgetränk("San Pellegrino", SanPellegrino, false));
        drinksTrattoriaRoma.add(new Kaltgetränk("Aranciata Rossa", AranciataRossa, false));
        drinksTrattoriaRoma.add(new Kaltgetränk("Chinotto", Chinotto, false));
        drinksTrattoriaRoma.add(new Kaltgetränk("Limonata", Limonata, false));

// Heißgetränke hinzufügen
        hotDrinksTrattoriaRoma.add(new Heißgetränk("Espresso", Espresso));
        hotDrinksTrattoriaRoma.add(new Heißgetränk("Cappuccino", Cappuccino));
        hotDrinksTrattoriaRoma.add(new Heißgetränk("Latte Macchiato", LatteMacchiato));
        hotDrinksTrattoriaRoma.add(new Heißgetränk("Caffè Corretto", CaffèCorretto));
        listeHauptspeisenRoma.add(new Hauptspeise("Penne Arrabbiata", PenneArrabbiata));
        listeHauptspeisenRoma.add(new Hauptspeise("Pizza Quattro Stagioni", PizzaQuattroStagioni));
        listeHauptspeisenRoma.add(new Hauptspeise("Fettuccine Alfredo", FettuccineAlfredo));
        listeHauptspeisenRoma.add(new Hauptspeise("Risotto alla Pescatora", RisottoAllaPescatora));
        listeHauptspeisenRoma.add(new Hauptspeise("Pizza Diavola", PizzaDiavola));
        listeHauptspeisenRoma.add(new Hauptspeise("Gnocchi Burro Salvia", GnocchiBurroSalvia));
        listeHauptspeisenRoma.add(new Hauptspeise("Pollo alla Parmigiana", PolloAllaParmigiana));
        listeHauptspeisenRoma.add(new Hauptspeise("Lasagne alla Bolognese", LasagneAllaBolognese));
        listeHauptspeisenRoma.add(new Hauptspeise("Saltimbocca alla Romana", SaltimboccaAllaRomana));
        listeHauptspeisenRoma.add(new Hauptspeise("Frittura di Pesce", FritturaDiPesce));
        TrattoriaRoma.setHauptspeisenListe(listeHauptspeisenRoma);
        listeVorspeisenRoma.add(new Vorspeise("Bruschetta al Pomodoro", BruschettaAlPomodoro));
        listeVorspeisenRoma.add(new Vorspeise("Caprese", Caprese2));
        listeVorspeisenRoma.add(new Vorspeise("Prosciutto e Melone", ProsciuttoEMelone));
        listeVorspeisenRoma.add(new Vorspeise("Frittura di Vegetali", FritturaDiVegetali));
        listeVorspeisenRoma.add(new Vorspeise("Carpaccio di Manzo", CarpaccioDiManzo2));
        TrattoriaRoma.setVorspeisenListe(listeVorspeisenRoma);
        listeNachspeisenRoma.add(new Nachspeiße("Tiramisu", Tiramisu2));
        listeNachspeisenRoma.add(new Nachspeiße("Panna Cotta", PannaCotta2));
        listeNachspeisenRoma.add(new Nachspeiße("Cannoli", Cannoli2));
        listeNachspeisenRoma.add(new Nachspeiße("Gelato", Gelato2));
        listeNachspeisenRoma.add(new Nachspeiße("Zabaione", Zabaione2));
        TrattoriaRoma.setNachspeisenListe(listeNachspeisenRoma);
        // Listen zum Restaurant hinzufügen
        TrattoriaRoma.setKaltgetränkeListe(drinksTrattoriaRoma);
        TrattoriaRoma.setHeißgetränkeListe(hotDrinksTrattoriaRoma);
        TrattoriaRoma.setAdresse("Venloer Str. 20, 50672 Köln");
        TrattoriaRoma.setLatitude(50.942173);
        TrattoriaRoma.setLongitude(6.942328);
        TrattoriaRoma.setName("Trattoria Roma");
        TrattoriaRoma.setWebsite ("www.trattoria-roma.it");
        TrattoriaRoma.setBeschreibung ("Traditionelle Trattoria mit Holzofenpizza und mediterranem Flair.");
        TrattoriaRoma.setTelefonnummer ("040 998877");
        TrattoriaRoma.setMail ("kontakt@trattoriaroma.it");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            TrattoriaRoma.setOeffnungszeiten(LocalTime.of(11, 30), LocalTime.of(23, 0));
        }

        restaurants.add(TrattoriaRoma);

        // Zutaten und Gerichte für das Restaurant "Sakura Sushi"
        Zutat[] MakiLachs = new Zutat[] {
                new Zutat("Sushireis", 1.00),
                new Zutat("Lachs", 2.50),
                new Zutat("Nori", 0.80),
                new Zutat("Sojasauce", 0.50)
        };
        Zutat[] Edamame1 = new Zutat[] {
                new Zutat("Edamame", 1.20),
                new Zutat("Meersalz", 0.40)
        };
        Zutat[] ThunfischtatarmitAvocado = {
                new Zutat("Thunfischsteak", 2.69),
                new Zutat("Avocado", 2.12),
                new Zutat("Zitronenzeste", 3.7),
                new Zutat("Sesamöl", 0.61)
        };
        Zutat[] SushiVariation = {
                new Zutat("Sushi-Reis", 3.88),
                new Zutat("Wasabi", 2.09),
                new Zutat("Nori", 1.48),
                new Zutat("Lachsfilet", 2.79),
                new Zutat("Sojasauce", 1.37)
        };
        Zutat[] SushiMaki = new Zutat[] {
                new Zutat("Sushireis", 1.00),
                new Zutat("Nori-Blätter", 0.50),
                new Zutat("Lachs", 2.50),
                new Zutat("Gurken", 0.80),
                new Zutat("Wasabi", 0.30)
        };
        Zutat[] CaliforniaRoll = new Zutat[] {
                new Zutat("Sushireis", 1.00),
                new Zutat("Nori-Blätter", 0.50),
                new Zutat("Krabbenfleisch", 2.00),
                new Zutat("Avocado", 1.00),
                new Zutat("Gurke", 0.80)
        };
        Zutat[] NigiriLachs = new Zutat[] {
                new Zutat("Sushireis", 1.00),
                new Zutat("Lachs", 2.50),
                new Zutat("Wasabi", 0.30)
        };
        Zutat[] TeriyakiHähnchen = new Zutat[] {
                new Zutat("Hähnchenbrust", 2.50),
                new Zutat("Teriyakisauce", 1.00),
                new Zutat("Reis", 0.80),
                new Zutat("Sesam", 0.40)
        };
        Zutat[] RamenShoyu = new Zutat[] {
                new Zutat("Ramen-Nudeln", 1.00),
                new Zutat("Schweinefleisch", 2.50),
                new Zutat("Sojasauce", 0.50),
                new Zutat("Frühlingszwiebeln", 0.30),
                new Zutat("Eier", 0.60)
        };
        Zutat[] TempuraShrimps = new Zutat[] {
                new Zutat("Shrimps", 2.00),
                new Zutat("Mehl", 0.30),
                new Zutat("Ei", 0.20),
                new Zutat("Paniermehl", 0.50),
                new Zutat("Sesamöl", 0.40)
        };
        Zutat[] Yakimeshi = new Zutat[] {
                new Zutat("Reis", 0.80),
                new Zutat("Eier", 0.60),
                new Zutat("Frühlingszwiebeln", 0.30),
                new Zutat("Sojasauce", 0.50),
                new Zutat("Gemüse", 1.00)
        };
        Zutat[] EbiSushi = new Zutat[] {
                new Zutat("Sushireis", 1.00),
                new Zutat("Garnelen", 2.00),
                new Zutat("Nori-Blätter", 0.50),
                new Zutat("Wasabi", 0.30)
        };
        Zutat[] SashimiLachs = new Zutat[] {
                new Zutat("Lachs", 2.50),
                new Zutat("Wasabi", 0.30),
                new Zutat("Ingwer", 0.20)
        };
        Zutat[] UnagiDon = new Zutat[]{
                new Zutat("Reis", 2.50)
        };
        Zutat[] MisoSuppe2 = new Zutat[] {
                new Zutat("Miso", 0.50),
                new Zutat("Tofu", 0.80),
                new Zutat("Frühlingszwiebeln", 0.30),
                new Zutat("Seetang", 0.30)
        };
        Zutat[] Gyoza2 = new Zutat[] {
                new Zutat("Gyozateig", 0.50),
                new Zutat("Schweinefleisch", 2.00),
                new Zutat("Gingko", 0.40),
                new Zutat("Sojasauce", 0.50)
        };
        Zutat[] Wakamesalat = new Zutat[] {
                new Zutat("Wakame", 0.80),
                new Zutat("Sesam", 0.30),
                new Zutat("Reisessig", 0.30),
                new Zutat("Gurken", 0.80)
        };
        Zutat[] Tamagoyaki = new Zutat[] {
                new Zutat("Eier", 0.60),
                new Zutat("Sojasauce", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Reisessig", 0.30)
        };
        Zutat[] Mochi2 = new Zutat[] {
                new Zutat("Reismehl", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Füllung", 0.80),
                new Zutat("Matcha", 0.50)
        };
        Zutat[] MatchaEis = new Zutat[] {
                new Zutat("Matcha", 0.50),
                new Zutat("Milch", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Eis", 1.00)
        };
        Zutat[] Taiyaki = new Zutat[] {
                new Zutat("Teig", 1.00),
                new Zutat("Füllung", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Rote Bohnenpaste", 1.00)
        };
        Zutat[] Anmitsu = new Zutat[] {
                new Zutat("Agar-Agar", 0.50),
                new Zutat("Rote Bohnenpaste", 1.00),
                new Zutat("Früchte", 0.80),
                new Zutat("Siru", 0.30)
        };
        Zutat[] KuzuKudzu = new Zutat[] {
                new Zutat("Kuzu", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Früchte", 0.80)
        };
        Restaurant SakuraSushi = new Restaurant(Kategorien.ASIATISCH, true);
        ArrayList<Hauptspeise> listeHauptspeisenSakura = new ArrayList<>();
        ArrayList<Vorspeise> listeVorspeisenSakura = new ArrayList<>();
        ArrayList<Nachspeiße> listeNachspeisenSakura = new ArrayList<>();
        listeHauptspeisenSakura.add(new Hauptspeise("Maki mit Lachs", MakiLachs));
        listeHauptspeisenSakura.add(new Hauptspeise("Edamame", Edamame1));
        listeHauptspeisenSakura.add(new Hauptspeise("Thunfischtatar mit Avocado", ThunfischtatarmitAvocado));
        listeHauptspeisenSakura.add(new Hauptspeise("Sushi Variation", SushiVariation));
        listeHauptspeisenSakura.add(new Hauptspeise("Sushi Maki", SushiMaki));
        listeHauptspeisenSakura.add(new Hauptspeise("California Roll", CaliforniaRoll));
        listeHauptspeisenSakura.add(new Hauptspeise("Nigiri Lachs", NigiriLachs));
        listeHauptspeisenSakura.add(new Hauptspeise("Teriyaki Hähnchen", TeriyakiHähnchen));
        listeHauptspeisenSakura.add(new Hauptspeise("Ramen Shoyu", RamenShoyu));
        listeHauptspeisenSakura.add(new Hauptspeise("Tempura Shrimps", TempuraShrimps));
        listeHauptspeisenSakura.add(new Hauptspeise("Yakimeshi", Yakimeshi));
        listeHauptspeisenSakura.add(new Hauptspeise("Ebi Sushi", EbiSushi));
        listeHauptspeisenSakura.add(new Hauptspeise("Sashimi Lachs", SashimiLachs));
        listeHauptspeisenSakura.add(new Hauptspeise("Unagi Don", UnagiDon));
        listeVorspeisenSakura.add(new Vorspeise("Miso Suppe", MisoSuppe2));
        listeVorspeisenSakura.add(new Vorspeise("Gyoza", Gyoza2));
        listeVorspeisenSakura.add(new Vorspeise("Wakamesalat", Wakamesalat));
        listeVorspeisenSakura.add(new Vorspeise("Tamagoyaki", Tamagoyaki));
        listeNachspeisenSakura.add(new Nachspeiße("Mochi", Mochi2));
        listeNachspeisenSakura.add(new Nachspeiße("Matcha Eis", MatchaEis));
        listeNachspeisenSakura.add(new Nachspeiße("Taiyaki", Taiyaki));
        listeNachspeisenSakura.add(new Nachspeiße("Anmitsu", Anmitsu));
        listeNachspeisenSakura.add(new Nachspeiße("Kuzu Kudzu", KuzuKudzu));
        SakuraSushi.setHauptspeisenListe(listeHauptspeisenSakura);
        SakuraSushi.setVorspeisenListe(listeVorspeisenSakura);
        SakuraSushi.setNachspeisenListe(listeNachspeisenSakura);
        SakuraSushi.setAdresse("Neuer Wall 50, 20354 Hamburg");
        SakuraSushi.setLatitude(53.552574);
        SakuraSushi.setLongitude(9.988593);
        SakuraSushi.setName("Sakura Sushi Bar");
        SakuraSushi.setWebsite ("www.sakura-sushi.de");
        SakuraSushi.setBeschreibung ("Frisches Sushi in modernem Ambiente. Unsere Spezialität: kreative Maki-Rollen.");
        SakuraSushi.setTelefonnummer ("089 334455");
        SakuraSushi.setMail ("info@sakura.de");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            SakuraSushi.setOeffnungszeiten(LocalTime.of(12, 0), LocalTime.of(22, 30));
        }

        restaurants.add(SakuraSushi);

        // Zutaten und Gerichte für das Restaurant "Wok Dynasty"
        Zutat[] WokGemüseReis = new Zutat[] {
                new Zutat("Reis", 1.20),
                new Zutat("Gemüsemix", 1.40),
                new Zutat("Sojasauce", 0.60),
                new Zutat("Sesamöl", 0.70)
        };
        Zutat[] ThaiCurry = new Zutat[] {
                new Zutat("Kokosmilch", 1.50),
                new Zutat("Currypaste", 1.10),
                new Zutat("Hähnchen", 2.40),
                new Zutat("Bambus", 1.00)
        };
        Zutat[] JakobsmuschelnmitSafransauce = {
                new Zutat("Jakobsmuschel", 1.48),
                new Zutat("Sahne", 1.67),
                new Zutat("Zutat118", 1.3),
                new Zutat("Kapern", 2.94)
        };
        Zutat[] OktopusCarpaccio = {
                new Zutat("Oktopus", 4.22),
                new Zutat("Olivenöl extra vergine", 1.95),
                new Zutat("Zitrone", 0.89),
                new Zutat("Pfeffer weiß", 1.11)
        };
        Zutat[] Frühlingsrollen2 = new Zutat[] {
                new Zutat("Reisblätter", 0.60),
                new Zutat("Gemüse", 1.00),
                new Zutat("Hähnchenbrust", 2.00),
                new Zutat("Sojasauce", 0.50),
                new Zutat("Ingwer", 0.30)
        };
        Zutat[] DimSum = new Zutat[] {
                new Zutat("Gyozateig", 0.50),
                new Zutat("Schweinefleisch", 2.00),
                new Zutat("Gemüse", 0.80),
                new Zutat("Ingwer", 0.30),
                new Zutat("Sojasauce", 0.50)
        };
        Zutat[] WokGemüse = new Zutat[] {
                new Zutat("Paprika", 0.60),
                new Zutat("Zucchini", 0.80),
                new Zutat("Brokkoli", 1.00),
                new Zutat("Sojasauce", 0.50),
                new Zutat("Knoblauch", 0.40)
        };
        Zutat[] TofuFrühlingsrollen = new Zutat[] {
                new Zutat("Reisblätter", 0.60),
                new Zutat("Tofu", 1.20),
                new Zutat("Mungobohnensprossen", 0.80),
                new Zutat("Koriander", 0.50),
                new Zutat("Sesamöl", 0.40)
        };
        Zutat[] Erdnusssuppe = new Zutat[] {
                new Zutat("Erdnüsse", 1.00),
                new Zutat("Hühnerbrühe", 1.50),
                new Zutat("Sojasauce", 0.50),
                new Zutat("Frühlingszwiebeln", 0.30),
                new Zutat("Knoblauch", 0.40)
        };
        Zutat[] GebrateneBananen = new Zutat[] {
                new Zutat("Bananen", 0.80),
                new Zutat("Reismehl", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Kokosflocken", 0.50),
                new Zutat("Honig", 0.40)
        };
        Zutat[] MangoStickyRice = new Zutat[] {
                new Zutat("Süßer Reis", 1.00),
                new Zutat("Kokosmilch", 1.20),
                new Zutat("Mango", 1.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Sesam", 0.40)
        };
        Zutat[] KokosnussPudding = new Zutat[] {
                new Zutat("Kokosmilch", 1.20),
                new Zutat("Puderzucker", 0.30),
                new Zutat("Agar-Agar", 0.50),
                new Zutat("Fruchtpüree", 0.80)
        };
        Zutat[] LycheeSorbet = new Zutat[] {
                new Zutat("Lychee", 1.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Wasser", 0.20),
                new Zutat("Zitronensaft", 0.40)
        };
        Zutat[] Sesamkugeln = new Zutat[] {
                new Zutat("Sesamsamen", 0.50),
                new Zutat("Reismehl", 0.40),
                new Zutat("Zucker", 0.30),
                new Zutat("Kochbananen", 0.80),
                new Zutat("Palmzucker", 0.50)
        };
        // Kaltgetränke für "Sakura Sushi Bar"
        Zutat[] RamuneSakura = new Zutat[] {
                new Zutat("Zitronenaroma", 0.40),
                new Zutat("Zucker", 0.30),
                new Zutat("Kohlensäure", 0.10),
                new Zutat("Wasser", 0.30)
        };

        Zutat[] GrünerTeeKaltSakura = new Zutat[] {
                new Zutat("Grüner Tee", 0.40),
                new Zutat("Wasser", 0.20),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] SakuraLimo = new Zutat[] {
                new Zutat("Kirschblütensirup", 0.70),
                new Zutat("Sodawasser", 0.40),
                new Zutat("Zitrone", 0.20)
        };

        Zutat[] MatchaIcedLatte = new Zutat[] {
                new Zutat("Matcha", 0.50),
                new Zutat("Milch", 0.70),
                new Zutat("Eiswürfel", 0.10),
                new Zutat("Zucker", 0.30)
        };

// Heißgetränke für "Sakura Sushi Bar"
        Zutat[] GrünerTeeHeißSakura = new Zutat[] {
                new Zutat("Grüner Tee", 0.40),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] MatchaLatteHeiß = new Zutat[] {
                new Zutat("Matcha", 0.50),
                new Zutat("Milch", 0.70),
                new Zutat("Zucker", 0.30)
        };

        Zutat[] Hojicha = new Zutat[] {
                new Zutat("Gerösteter Grüntee", 0.50),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] IngwerZitroneTee = new Zutat[] {
                new Zutat("Ingwer", 0.40),
                new Zutat("Zitronensaft", 0.30),
                new Zutat("Honig", 0.30),
                new Zutat("Wasser", 0.10)
        };
        Restaurant WokDynasty = new Restaurant(Kategorien.ASIATISCH, true);
        ArrayList<Hauptspeise> listeWok = new ArrayList<>();
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksSakuraSushi = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksSakuraSushi = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksSakuraSushi.add(new Kaltgetränk("Ramune", RamuneSakura, false));
        drinksSakuraSushi.add(new Kaltgetränk("Grüner Tee (kalt)", GrünerTeeKaltSakura, false));
        drinksSakuraSushi.add(new Kaltgetränk("Sakura Limo", SakuraLimo, false));
        drinksSakuraSushi.add(new Kaltgetränk("Matcha Iced Latte", MatchaIcedLatte, false));

// Heißgetränke hinzufügen
        hotDrinksSakuraSushi.add(new Heißgetränk("Grüner Tee (heiß)", GrünerTeeHeißSakura));
        hotDrinksSakuraSushi.add(new Heißgetränk("Matcha Latte", MatchaLatteHeiß));
        hotDrinksSakuraSushi.add(new Heißgetränk("Hōjicha", Hojicha));
        hotDrinksSakuraSushi.add(new Heißgetränk("Ingwer-Zitrone-Tee", IngwerZitroneTee));
        listeWok.add(new Hauptspeise("Gebratener Reis mit Gemüse", WokGemüseReis));
        listeWok.add(new Hauptspeise("Thai-Curry mit Hähnchen", ThaiCurry));
        listeWok.add(new Hauptspeise("Jakobsmuscheln mit Safransauce", JakobsmuschelnmitSafransauce));
        listeWok.add(new Hauptspeise("Oktopus-Carpaccio", OktopusCarpaccio));
        ArrayList<Vorspeise> listeVorspeisenWok = new ArrayList<>();
        ArrayList<Nachspeiße> listeNachspeisenWok = new ArrayList<>();
        listeVorspeisenWok.add(new Vorspeise("Frühlingsrollen", Frühlingsrollen));
        listeVorspeisenWok.add(new Vorspeise("Dim Sum", DimSum));
        listeVorspeisenWok.add(new Vorspeise("Wok Gemüse", WokGemüse));
        listeVorspeisenWok.add(new Vorspeise("Tofu Frühlingsrollen", TofuFrühlingsrollen));
        listeVorspeisenWok.add(new Vorspeise("Erdnuss Suppe", Erdnusssuppe));
        listeNachspeisenWok.add(new Nachspeiße("Gebratene Bananen", GebrateneBananen));
        listeNachspeisenWok.add(new Nachspeiße("Mango Sticky Rice", MangoStickyRice));
        listeNachspeisenWok.add(new Nachspeiße("Kokosnuss Pudding", KokosnussPudding));
        listeNachspeisenWok.add(new Nachspeiße("Lychee Sorbet", LycheeSorbet));
        listeNachspeisenWok.add(new Nachspeiße("Sesamkugeln", Sesamkugeln));
        WokDynasty.setVorspeisenListe(listeVorspeisenWok);
        WokDynasty.setNachspeisenListe(listeNachspeisenWok);
        WokDynasty.setHauptspeisenListe(listeWok);
        // Listen zum Restaurant hinzufügen
        SakuraSushi.setKaltgetränkeListe(drinksSakuraSushi);
        SakuraSushi.setHeißgetränkeListe(hotDrinksSakuraSushi);
        WokDynasty.setAdresse("Dammtorstraße 12, 20354 Hamburg");
        WokDynasty.setLatitude(53.556285);
        WokDynasty.setLongitude(9.989712);
        WokDynasty.setName("Wok Dynasty");
        WokDynasty.setWebsite ("www.wokdynasty.de");
        WokDynasty.setBeschreibung ("Authentische asiatische Wok-Gerichte – frisch und schnell zubereitet.");
        WokDynasty.setTelefonnummer ("0711 223344");
        WokDynasty.setMail ("kontakt@wokdynasty.de");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            WokDynasty.setOeffnungszeiten(LocalTime.of(10, 30), LocalTime.of(21, 30));
        }

        restaurants.add(WokDynasty);

        // Zutaten und Gerichte für das Restaurant "Burger Factory"
        Zutat[] Cheeseburger = new Zutat[] {
                new Zutat("Rindfleischpatty", 2.50),
                new Zutat("Cheddar", 1.00),
                new Zutat("Burgerbrötchen", 0.80),
                new Zutat("Tomaten", 0.70),
                new Zutat("Salat", 0.60)
        };
        Zutat[] VeggieBurger = new Zutat[] {
                new Zutat("Gemüsepatty", 2.00),
                new Zutat("Avocado", 1.20),
                new Zutat("Salat", 0.60),
                new Zutat("Brötchen", 0.80)
        };
        Zutat[] ClassicCheeseburger = new Zutat[] {
                new Zutat("Rindfleisch-Patty", 3.00),
                new Zutat("Cheddar-Käse", 1.00),
                new Zutat("Salat", 0.40),
                new Zutat("Tomaten", 0.50),
                new Zutat("Burgerbrötchen", 0.80),
                new Zutat("Senf", 0.20),
                new Zutat("Ketchup", 0.30)
        };
        Zutat[] BaconCheeseburger = new Zutat[] {
                new Zutat("Rindfleisch-Patty", 3.00),
                new Zutat("Cheddar-Käse", 1.00),
                new Zutat("Bacon", 1.20),
                new Zutat("Salat", 0.40),
                new Zutat("Tomaten", 0.50),
                new Zutat("Burgerbrötchen", 0.80),
                new Zutat("Ketchup", 0.30),
                new Zutat("Mayonnaise", 0.30)
        };
        Zutat[] ChickenBurger = new Zutat[] {
                new Zutat("Hähnchenbrust-Patty", 3.00),
                new Zutat("Cheddar-Käse", 1.00),
                new Zutat("Salat", 0.40),
                new Zutat("Tomaten", 0.50),
                new Zutat("Burgerbrötchen", 0.80),
                new Zutat("Mayonnaise", 0.30),
                new Zutat("BBQ-Sauce", 0.40)
        };
        Zutat[] BBQBurger = new Zutat[] {
                new Zutat("Rindfleisch-Patty", 3.00),
                new Zutat("Cheddar-Käse", 1.00),
                new Zutat("Zwiebeln", 0.40),
                new Zutat("Salat", 0.40),
                new Zutat("Burgerbrötchen", 0.80),
                new Zutat("BBQ-Sauce", 0.50),
                new Zutat("Pickles", 0.30)
        };
        Zutat[] Schokoladenkuchen = new Zutat[] {
                new Zutat("Schokolade", 1.00),
                new Zutat("Mehl", 0.50),
                new Zutat("Eier", 0.40),
                new Zutat("Zucker", 0.30),
                new Zutat("Butter", 0.60)
        };
        Zutat[] Cheesecake = new Zutat[] {
                new Zutat("Frischkäse", 1.50),
                new Zutat("Kekse", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Butter", 0.60),
                new Zutat("Eier", 0.40)
        };
        Zutat[] Apfelstrudel = new Zutat[] {
                new Zutat("Äpfel", 0.80),
                new Zutat("Blätterteig", 0.70),
                new Zutat("Zucker", 0.30),
                new Zutat("Zimt", 0.20),
                new Zutat("Rosinen", 0.40)
        };
        Zutat[] MilkshakeVanille = new Zutat[] {
                new Zutat("Vanilleeis", 1.00),
                new Zutat("Milch", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Vanille", 0.20)
        };
        Zutat[] Donuts = new Zutat[] {
                new Zutat("Mehl", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Ei", 0.40),
                new Zutat("Hefe", 0.20),
                new Zutat("Schokolade", 1.00)
        };
        // Kaltgetränke für "Burger Factory"
        Zutat[] Cola3 = new Zutat[] {
                new Zutat("Wasser", 0.20),
                new Zutat("Zucker", 0.30),
                new Zutat("Cola-Aroma", 0.40),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] EisteeZitrone = new Zutat[] {
                new Zutat("Schwarzer Tee", 0.30),
                new Zutat("Zitronensaft", 0.30),
                new Zutat("Zucker", 0.30),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] MilkshakeSchoko = new Zutat[] {
                new Zutat("Schokoladeneis", 1.00),
                new Zutat("Milch", 0.50),
                new Zutat("Kakaopulver", 0.30),
                new Zutat("Zucker", 0.30)
        };

        Zutat[] LimonadeHausgemacht = new Zutat[] {
                new Zutat("Zitronensaft", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Wasser", 0.30),
                new Zutat("Minze", 0.20)
        };

// Heißgetränke für "Burger Factory"
        Zutat[] Filterkaffee = new Zutat[] {
                new Zutat("Kaffeepulver", 0.50),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] HeißeSchokolade3 = new Zutat[] {
                new Zutat("Milch", 0.50),
                new Zutat("Kakaopulver", 0.40),
                new Zutat("Zucker", 0.30)
        };

        Zutat[] TeePfefferminz = new Zutat[] {
                new Zutat("Pfefferminztee", 0.30),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] Cappuccino3 = new Zutat[] {
                new Zutat("Espressobohnen", 0.50),
                new Zutat("Milch", 0.40),
                new Zutat("Milchschaum", 0.30)
        };
        Restaurant BurgerFactory = new Restaurant(Kategorien.FASTFOOD, true);
        ArrayList<Hauptspeise> listeHauptspeisenBurger = new ArrayList<>();
        listeHauptspeisenBurger.add(new Hauptspeise("Cheeseburger", Cheeseburger));
        listeHauptspeisenBurger.add(new Hauptspeise("Veggie Burger", VeggieBurger));
        ArrayList<Nachspeiße> listeNachspeisenBurger = new ArrayList<>();
        listeHauptspeisenBurger.add(new Hauptspeise("Classic Cheeseburger", ClassicCheeseburger));
        listeHauptspeisenBurger.add(new Hauptspeise("Bacon Cheeseburger", BaconCheeseburger));
        listeHauptspeisenBurger.add(new Hauptspeise("Veggie Burger", VeggieBurger));
        listeHauptspeisenBurger.add(new Hauptspeise("Chicken Burger", ChickenBurger));
        listeHauptspeisenBurger.add(new Hauptspeise("BBQ Burger", BBQBurger));
        listeNachspeisenBurger.add(new Nachspeiße("Schokoladenkuchen", Schokoladenkuchen));
        listeNachspeisenBurger.add(new Nachspeiße("Cheesecake", Cheesecake));
        listeNachspeisenBurger.add(new Nachspeiße("Apfelstrudel", Apfelstrudel));
        listeNachspeisenBurger.add(new Nachspeiße("Milkshake Vanille", MilkshakeVanille));
        listeNachspeisenBurger.add(new Nachspeiße("Donuts", Donuts));
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksBurgerFactory = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksBurgerFactory = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksBurgerFactory.add(new Kaltgetränk("Cola", Cola3, false));
        drinksBurgerFactory.add(new Kaltgetränk("Eistee Zitrone", EisteeZitrone, false));
        drinksBurgerFactory.add(new Kaltgetränk("Milkshake Schoko", MilkshakeSchoko, false));
        drinksBurgerFactory.add(new Kaltgetränk("Hausgemachte Limonade", LimonadeHausgemacht, false));

// Heißgetränke hinzufügen
        hotDrinksBurgerFactory.add(new Heißgetränk("Filterkaffee", Filterkaffee));
        hotDrinksBurgerFactory.add(new Heißgetränk("Heiße Schokolade", HeißeSchokolade3));
        hotDrinksBurgerFactory.add(new Heißgetränk("Pfefferminztee", TeePfefferminz));
        hotDrinksBurgerFactory.add(new Heißgetränk("Cappuccino", Cappuccino3));

        BurgerFactory.setHauptspeisenListe(listeHauptspeisenBurger);
        BurgerFactory.setNachspeisenListe(listeNachspeisenBurger);
        // Listen zum Restaurant hinzufügen
        BurgerFactory.setKaltgetränkeListe(drinksBurgerFactory);
        BurgerFactory.setHeißgetränkeListe(hotDrinksBurgerFactory);
        BurgerFactory.setAdresse("Große Bergstraße 251, 22767 Hamburg");
        BurgerFactory.setLatitude(53.553436);
        BurgerFactory.setLongitude(9.939162);
        BurgerFactory.setName("Burger Factory");
        BurgerFactory.setWebsite ("www.burgerfactory.de");
        BurgerFactory.setBeschreibung ("Handgemachte Burger mit hochwertigen Zutaten – klassisch oder vegan!");
        BurgerFactory.setTelefonnummer ("0201 556677");
        BurgerFactory.setMail ("info@burgerfactory.de");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            BurgerFactory.setOeffnungszeiten(LocalTime.of(11, 0), LocalTime.of(23, 0));
        }

        restaurants.add(BurgerFactory);

        // Zutaten und Gerichte für das Restaurant "Frittenkönig"
        Zutat[] CurrywurstPommes = new Zutat[] {
                new Zutat("Currywurst", 2.20),
                new Zutat("Pommes", 1.50),
                new Zutat("Currysauce", 0.90)
        };
        Zutat[] ChiliCheeseFries = new Zutat[] {
                new Zutat("Pommes", 1.50),
                new Zutat("Chilisoße", 1.10),
                new Zutat("Cheddar", 1.00),
                new Zutat("Frühlingszwiebeln", 0.70)
        };
        Zutat[] PommesFritesClassic = new Zutat[] {
                new Zutat("Pommes Frites", 2.00),
                new Zutat("Ketchup", 0.30),
                new Zutat("Mayonnaise", 0.30)
        };
        Zutat[] PommesFritesCurrywurst = new Zutat[] {
                new Zutat("Pommes Frites", 2.00),
                new Zutat("Currywurst", 3.50),
                new Zutat("Ketchup", 0.30),
                new Zutat("Currypulver", 0.20)
        };
        Zutat[] PommesFritesCheese = new Zutat[] {
                new Zutat("Pommes Frites", 2.00),
                new Zutat("Cheddar-Käse", 1.00),
                new Zutat("Käse-Sauce", 0.50)
        };
        Zutat[] FrittenMitPulledPork = new Zutat[] {
                new Zutat("Pommes Frites", 2.00),
                new Zutat("Pulled Pork", 3.00),
                new Zutat("BBQ-Sauce", 0.40),
                new Zutat("Krautsalat", 0.80)
        };
        Zutat[] FrittenMitHähnchen = new Zutat[] {
                new Zutat("Pommes Frites", 2.00),
                new Zutat("Hähnchenbrust", 3.00),
                new Zutat("Kräuterbutter", 0.30),
                new Zutat("Rucola", 0.40)
        };
        Zutat[] Schokofrüchte = new Zutat[] {
                new Zutat("Erdbeeren", 1.00),
                new Zutat("Schokolade", 1.00),
                new Zutat("Zucker", 0.30)
        };
        Zutat[] Waffeln = new Zutat[] {
                new Zutat("Waffelteig", 1.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Schlagsahne", 0.50),
                new Zutat("Erdbeeren", 0.80)
        };
        Zutat[] Donuts1 = new Zutat[] {
                new Zutat("Mehl", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Ei", 0.40),
                new Zutat("Hefe", 0.20),
                new Zutat("Zuckerglasur", 0.50)
        };
        Zutat[] Eisbecher1 = new Zutat[] {
                new Zutat("Vanilleeis", 1.00),
                new Zutat("Schokoladensirup", 0.50),
                new Zutat("Waffel", 0.30),
                new Zutat("Schlagsahne", 0.50)
        };
        Zutat[] Apfelstrudel1 = new Zutat[] {
                new Zutat("Äpfel", 0.80),
                new Zutat("Blätterteig", 0.70),
                new Zutat("Zucker", 0.30),
                new Zutat("Zimt", 0.20),
                new Zutat("Rosinen", 0.40)
        };
        // Kaltgetränke für "Frittenkönig"
        Zutat[] ColaFritten = new Zutat[] {
                new Zutat("Wasser", 0.20),
                new Zutat("Zucker", 0.30),
                new Zutat("Cola-Aroma", 0.40),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] FantaFritten = new Zutat[] {
                new Zutat("Orangensaftkonzentrat", 0.40),
                new Zutat("Zucker", 0.30),
                new Zutat("Kohlensäure", 0.10),
                new Zutat("Wasser", 0.30)
        };

        Zutat[] SpeziFritten = new Zutat[] {
                new Zutat("Cola", 0.40),
                new Zutat("Orangenlimonade", 0.40),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] ApfelschorleFritten = new Zutat[] {
                new Zutat("Apfelsaft", 0.60),
                new Zutat("Mineralwasser", 0.40)
        };

// Heißgetränke für "Frittenkönig"
        Zutat[] KaffeeFritten = new Zutat[] {
                new Zutat("Kaffeepulver", 0.50),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] KakaoFritten = new Zutat[] {
                new Zutat("Milch", 0.50),
                new Zutat("Kakaopulver", 0.40),
                new Zutat("Zucker", 0.30)
        };

        Zutat[] TeeZitroneFritten = new Zutat[] {
                new Zutat("Schwarzer Tee", 0.30),
                new Zutat("Zitronensaft", 0.30),
                new Zutat("Wasser", 0.10),
                new Zutat("Zucker", 0.30)
        };

        Zutat[] CappuccinoFritten = new Zutat[] {
                new Zutat("Espressopulver", 0.50),
                new Zutat("Milch", 0.40),
                new Zutat("Milchschaum", 0.30)
        };
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksFrittenkoenig = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksFrittenkoenig = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksFrittenkoenig.add(new Kaltgetränk("Cola", ColaFritten, false));
        drinksFrittenkoenig.add(new Kaltgetränk("Fanta", FantaFritten, false));
        drinksFrittenkoenig.add(new Kaltgetränk("Spezi", SpeziFritten, false));
        drinksFrittenkoenig.add(new Kaltgetränk("Apfelschorle", ApfelschorleFritten, false));

// Heißgetränke hinzufügen
        hotDrinksFrittenkoenig.add(new Heißgetränk("Kaffee", KaffeeFritten));
        hotDrinksFrittenkoenig.add(new Heißgetränk("Kakao", KakaoFritten));
        hotDrinksFrittenkoenig.add(new Heißgetränk("Tee mit Zitrone", TeeZitroneFritten));
        hotDrinksFrittenkoenig.add(new Heißgetränk("Cappuccino", CappuccinoFritten));
        Restaurant Frittenkoenig = new Restaurant(Kategorien.FASTFOOD, true);
        ArrayList<Hauptspeise> listeHauptspeisenFrittenkönig = new ArrayList<>();
        ArrayList<Nachspeiße> listeNachspeisenFrittenkönig = new ArrayList<>();
        listeHauptspeisenFrittenkönig.add(new Hauptspeise("Currywurst mit Pommes", CurrywurstPommes));
        listeHauptspeisenFrittenkönig.add(new Hauptspeise("Chili Cheese Fries", ChiliCheeseFries));
        listeHauptspeisenFrittenkönig.add(new Hauptspeise("Pommes Frites Classic", PommesFritesClassic));
        listeHauptspeisenFrittenkönig.add(new Hauptspeise("Pommes Frites mit Currywurst", PommesFritesCurrywurst));
        listeHauptspeisenFrittenkönig.add(new Hauptspeise("Pommes Frites mit Cheddar", PommesFritesCheese));
        listeHauptspeisenFrittenkönig.add(new Hauptspeise("Fritten mit Pulled Pork", FrittenMitPulledPork));
        listeHauptspeisenFrittenkönig.add(new Hauptspeise("Fritten mit Hähnchen", FrittenMitHähnchen));
        listeNachspeisenFrittenkönig.add(new Nachspeiße("Schokofrüchte", Schokofrüchte));
        listeNachspeisenFrittenkönig.add(new Nachspeiße("Waffeln", Waffeln));
        listeNachspeisenFrittenkönig.add(new Nachspeiße("Donuts", Donuts1));
        listeNachspeisenFrittenkönig.add(new Nachspeiße("Eisbecher", Eisbecher1));
        listeNachspeisenFrittenkönig.add(new Nachspeiße("Apfelstrudel", Apfelstrudel1));
        Frittenkoenig.setHauptspeisenListe(listeHauptspeisenFrittenkönig);
        Frittenkoenig.setNachspeisenListe(listeNachspeisenFrittenkönig);
        // Listen zum Restaurant hinzufügen
        Frittenkoenig.setKaltgetränkeListe(drinksFrittenkoenig);
        Frittenkoenig.setHeißgetränkeListe(hotDrinksFrittenkoenig);
        Frittenkoenig.setAdresse("Lange Reihe 67, 20099 Hamburg");
        Frittenkoenig.setLatitude(53.556701);
        Frittenkoenig.setLongitude(10.012248);
        Frittenkoenig.setName("Frittenkönig");
        Frittenkoenig.setWebsite ("www.frittenkoenig.de");
        Frittenkoenig.setBeschreibung ("Deftiges Fastfood mit Kultcharakter – schnell, günstig, lecker.");
        Frittenkoenig.setTelefonnummer ("0511 909090");
        Frittenkoenig.setMail ("kontakt@frittenkoenig.de");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Frittenkoenig.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(22, 0));
        }
        restaurants.add(Frittenkoenig);

        // Zutaten und Gerichte für das deutsche Restaurant "Hausmannskost"
        Zutat[] EntenbrustaufOrangenspiegel = {
                new Zutat("Entenbrust", 4.31),
                new Zutat("Orangenzeste", 2.43),
                new Zutat("Honig", 1.58),
                new Zutat("Zimtstange", 1.87)
        };
        Zutat[] ZiegenkäseimSpeckmantel = {
                new Zutat("Ziegenkäse", 2.33),
                new Zutat("Frühstücksspeck", 1.98),
                new Zutat("Honig", 1.56),
                new Zutat("Thymian", 0.67)
        };
        Zutat[] KalbsrückeninSenfkruste = {
                new Zutat("Kalbsrücken", 3.84),
                new Zutat("Senf", 1.05),
                new Zutat("Paniermehl", 0.87),
                new Zutat("Estragon", 0.78)
        };Zutat[] ZitronenhähnchenmitRosmarinkartoffeln = {
                new Zutat("Hähnchenschenkel", 2.77),
                new Zutat("Zitrone", 0.88),
                new Zutat("Rosmarin", 0.69),
                new Zutat("Kartoffeln", 1.35)
        };
        Zutat[] Rindergulasch = {
                new Zutat("Rindfleisch", 3.72),
                new Zutat("Paprika", 0.97),
                new Zutat("Zwiebel", 0.33),
                new Zutat("Lorbeerblatt", 0.31)
        };
        Zutat[] SchweinshaxemitKrautsalat = {
                new Zutat("Schweinshaxe", 4.12),
                new Zutat("Krautsalat", 1.55),
                new Zutat("Senf", 0.64),
                new Zutat("Kartoffeln", 1.02)
        };
        Zutat[] ForelleMüllerinArt = {
                new Zutat("Forelle", 3.11),
                new Zutat("Butter", 1.32),
                new Zutat("Zitrone", 0.94),
                new Zutat("Petersilie", 0.73)
        };
        Zutat[] KalbsleberBerlinerArt = {
                new Zutat("Kalbsleber", 2.87),
                new Zutat("Zwiebel", 0.43),
                new Zutat("Apfel", 0.88),
                new Zutat("Kartoffelpüree", 1.77)
        };
        Zutat[] WienerSchnitzel = {
                new Zutat("Kalbfleisch", 4.55),
                new Zutat("Ei", 0.38),
                new Zutat("Paniermehl", 0.55),
                new Zutat("Zitrone", 0.81)
        };
        Zutat[] SchweinebratenmitKloß = {
                new Zutat("Schweinebraten", 3.44),
                new Zutat("Kartoffelklöße", 2.22),
                new Zutat("Sauerkraut", 1.19),
                new Zutat("Kümmel", 0.61)
        };
        Zutat[] HackbratenmitErbsen = {
                new Zutat("Hackfleisch", 2.05),
                new Zutat("Erbsen", 1.15),
                new Zutat("Zwiebel", 0.35),
                new Zutat("Senf", 0.54)
        };
        Zutat[] ApfelstrudelHausmannskost = new Zutat[] {
                new Zutat("Äpfel", 0.80),
                new Zutat("Blätterteig", 0.70),
                new Zutat("Zucker", 0.30),
                new Zutat("Zimt", 0.20),
                new Zutat("Rosinen", 0.40),
                new Zutat("Vanillesauce", 0.50)
        };
        Zutat[] SchwarzwälderKirschtorte = new Zutat[] {
                new Zutat("Schokoladenboden", 1.00),
                new Zutat("Sahne", 1.00),
                new Zutat("Kirschen", 0.80),
                new Zutat("Kirschenlikör", 0.50),
                new Zutat("Zucker", 0.20)
        };
        Zutat[] BirnenKompot = new Zutat[] {
                new Zutat("Birnen", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Zimt", 0.20),
                new Zutat("Vanillezucker", 0.20)
        };
        Zutat[] RoteGrütze = new Zutat[] {
                new Zutat("Himbeeren", 0.90),
                new Zutat("Johannisbeeren", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Vanillesoße", 0.50)
        };
        Zutat[] Bienenstich = new Zutat[] {
                new Zutat("Hefeteig", 0.80),
                new Zutat("Sahne", 0.60),
                new Zutat("Honig", 0.40),
                new Zutat("Mandeln", 0.30),
                new Zutat("Zucker", 0.20)
        };
        // Kaltgetränke für "Hausmannskost"
        Zutat[] ApfelsaftSchorle = new Zutat[] {
                new Zutat("Apfelsaft", 0.60),
                new Zutat("Mineralwasser", 0.40)
        };

        Zutat[] Fassbrause = new Zutat[] {
                new Zutat("Malzextrakt", 0.50),
                new Zutat("Kohlensäure", 0.10),
                new Zutat("Zitronensaft", 0.30),
                new Zutat("Zucker", 0.30)
        };

        Zutat[] ColaMix = new Zutat[] {
                new Zutat("Cola", 0.40),
                new Zutat("Orangenlimonade", 0.40),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] Rhabarberschorle = new Zutat[] {
                new Zutat("Rhabarbersaft", 0.60),
                new Zutat("Sprudelwasser", 0.40)
        };

// Heißgetränke für "Hausmannskost"
        Zutat[] FilterkaffeeHausmann = new Zutat[] {
                new Zutat("Filterkaffee", 0.50),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] Kräutertee = new Zutat[] {
                new Zutat("Kräutermischung", 0.40),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] HeißeZitrone = new Zutat[] {
                new Zutat("Zitronensaft", 0.40),
                new Zutat("Honig", 0.30),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] KakaoHausmann = new Zutat[] {
                new Zutat("Milch", 0.50),
                new Zutat("Kakaopulver", 0.40),
                new Zutat("Zucker", 0.30)
        };
        Restaurant Hausmannskost = new Restaurant(Kategorien.DEUTSCH, false);
        ArrayList<Hauptspeise> listeHM = new ArrayList<>();
        listeHM.add(new Hauptspeise("Entenbrust auf Orangenspiegel", EntenbrustaufOrangenspiegel));
        listeHM.add(new Hauptspeise("Ziegenkäse im Speckmantel", ZiegenkäseimSpeckmantel));
        listeHM.add(new Hauptspeise("Kalbsrücken in Senfkruste", KalbsrückeninSenfkruste));
        listeHM.add(new Hauptspeise("Zitronenhähnchen mit Rosmarinkartoffeln", ZitronenhähnchenmitRosmarinkartoffeln));
        listeHM.add(new Hauptspeise("Rindergulasch", Rindergulasch));
        listeHM.add(new Hauptspeise("Schweinshaxe mit Krautsalat", SchweinshaxemitKrautsalat));
        listeHM.add(new Hauptspeise("Forelle Müllerin Art", ForelleMüllerinArt));
        listeHM.add(new Hauptspeise("Kalbsleber Berliner Art", KalbsleberBerlinerArt));
        listeHM.add(new Hauptspeise("Wiener Schnitzel", WienerSchnitzel));
        listeHM.add(new Hauptspeise("Schweinebraten mit Kloß", SchweinebratenmitKloß));
        listeHM.add(new Hauptspeise("Hackbraten mit Erbsen", HackbratenmitErbsen));
        Hausmannskost.setHauptspeisenListe(listeHM);
        ArrayList<Nachspeiße> listeNachspeisenHausmannskost = new ArrayList<>();
        listeNachspeisenHausmannskost.add(new Nachspeiße("Apfelstrudel", ApfelstrudelHausmannskost));
        listeNachspeisenHausmannskost.add(new Nachspeiße("Schwarzwälder Kirschtorte", SchwarzwälderKirschtorte));
        listeNachspeisenHausmannskost.add(new Nachspeiße("Birnenkompott", BirnenKompot));
        listeNachspeisenHausmannskost.add(new Nachspeiße("Rote Grütze", RoteGrütze));
        listeNachspeisenHausmannskost.add(new Nachspeiße("Bienenstich", Bienenstich));
        Hausmannskost.setNachspeisenListe(listeNachspeisenHausmannskost);
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksHausmannskost = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksHausmannskost = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksHausmannskost.add(new Kaltgetränk("Apfelsaftschorle", ApfelsaftSchorle, false));
        drinksHausmannskost.add(new Kaltgetränk("Fassbrause", Fassbrause, false));
        drinksHausmannskost.add(new Kaltgetränk("Cola-Mix", ColaMix, false));
        drinksHausmannskost.add(new Kaltgetränk("Rhabarberschorle", Rhabarberschorle, false));

// Heißgetränke hinzufügen
        hotDrinksHausmannskost.add(new Heißgetränk("Filterkaffee", FilterkaffeeHausmann));
        hotDrinksHausmannskost.add(new Heißgetränk("Kräutertee", Kräutertee));
        hotDrinksHausmannskost.add(new Heißgetränk("Heiße Zitrone", HeißeZitrone));
        hotDrinksHausmannskost.add(new Heißgetränk("Kakao", KakaoHausmann));

// Listen zum Restaurant hinzufügen
        Hausmannskost.setKaltgetränkeListe(drinksHausmannskost);
        Hausmannskost.setHeißgetränkeListe(hotDrinksHausmannskost);
        Hausmannskost.setAdresse("Severinstraße 123, 50678 Köln");
        Hausmannskost.setLatitude(50.926015);
        Hausmannskost.setLongitude(6.957669);
        Hausmannskost.setName("Hausmannskost");
        Hausmannskost.setWebsite ("www.Hausmannskost.de");
        Hausmannskost.setBeschreibung ("Echt deutsche Kost zu echten deutschen Preisen – hier gibt es alles, was das Herz begehrt.");
        Hausmannskost.setTelefonnummer ("0511 909090");
        Hausmannskost.setMail ("kontakt@hausmannskost.de");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Hausmannskost.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(22, 0));
        }

        restaurants.add(Hausmannskost);

        // Zutaten und Gerichte für das Restaurant "Veganuss"
        Zutat[] TortellinimitRicottaundSpinat = {
                new Zutat("Tortellini", 2.59),
                new Zutat("Ricotta", 2.45),
                new Zutat("Babyspinat", 1.92),
                new Zutat("Muskatnuss", 0.74)
        };
        Zutat[] KürbissuppemitIngwer = {
                new Zutat("Hokkaido", 1.97),
                new Zutat("Ingwer", 0.84),
                new Zutat("Kokosmilch", 2.01),
                new Zutat("Muskatnuss", 0.73)
        };
        Zutat[] BulgurSalatmitKräutern = {
                new Zutat("Bulgur", 2.36),
                new Zutat("Petersilie", 2.18),
                new Zutat("Zitrone", 1.67),
                new Zutat("Minze", 1.74),
                new Zutat("Olivenöl extra vergine", 1.33)
        };
        Zutat[] CouscousmitGemüse = {
                new Zutat("Couscous", 1.86),
                new Zutat("Paprika", 2.48),
                new Zutat("Zucchini", 1.12),
                new Zutat("Tomate", 0.9)
        };
        Zutat[] QuinoaBowlvegan = {
                new Zutat("Quinoa", 2.97),
                new Zutat("Avocado", 3.15),
                new Zutat("Kichererbsen", 1.53),
                new Zutat("Feldsalat", 2.24),
                new Zutat("Limette", 0.8)
        };
        Zutat[] VeganerSchokoladenkuchen = new Zutat[] {
                new Zutat("Mehl", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Kakaopulver", 0.50),
                new Zutat("Backpulver", 0.20),
                new Zutat("Mandeldrink", 0.40),
                new Zutat("Veganer Butterersatz", 0.60)
        };
        Zutat[] ChiaPudding = new Zutat[] {
                new Zutat("Chiasamen", 1.00),
                new Zutat("Kokosmilch", 0.60),
                new Zutat("Agavendicksaft", 0.40),
                new Zutat("Frische Beeren", 0.80),
                new Zutat("Vanilleextrakt", 0.20)
        };
        Zutat[] ApfelBirnenCrumble = new Zutat[] {
                new Zutat("Äpfel", 0.80),
                new Zutat("Birnen", 0.70),
                new Zutat("Haferflocken", 0.40),
                new Zutat("Zimt", 0.20),
                new Zutat("Kokosöl", 0.50),
                new Zutat("Agavendicksaft", 0.30)
        };
        Zutat[] VeganeZabaione = new Zutat[] {
                new Zutat("Kokoscreme", 0.80),
                new Zutat("Agavendicksaft", 0.40),
                new Zutat("Vanilleextrakt", 0.20),
                new Zutat("Zitronensaft", 0.30)
        };
        Zutat[] VeganerApfelstrudel = new Zutat[] {
                new Zutat("Äpfel", 0.80),
                new Zutat("Blätterteig (vegan)", 0.90),
                new Zutat("Zimt", 0.20),
                new Zutat("Rosinen", 0.40),
                new Zutat("Agavendicksaft", 0.30)
        };
        // Kaltgetränke für "Veganuss"
        Zutat[] IngwerZitronenLimo = new Zutat[] {
                new Zutat("Zitronensaft", 0.50),
                new Zutat("Ingwer", 0.30),
                new Zutat("Agavendicksaft", 0.30),
                new Zutat("Sprudelwasser", 0.30)
        };

        Zutat[] MatchaEistee = new Zutat[] {
                new Zutat("Matcha", 0.50),
                new Zutat("Minze", 0.30),
                new Zutat("Agavendicksaft", 0.30),
                new Zutat("Wasser", 0.30),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] BeerenSmoothie = new Zutat[] {
                new Zutat("Beerenmix", 0.80),
                new Zutat("Bananen", 0.70),
                new Zutat("Haferdrink", 0.60),
                new Zutat("Chiasamen", 0.30)
        };

        Zutat[] GurkenMinzWasser = new Zutat[] {
                new Zutat("Gurkenscheiben", 0.30),
                new Zutat("Minze", 0.20),
                new Zutat("Zitronensaft", 0.30),
                new Zutat("Wasser", 0.20)
        };

// Heißgetränke für "Veganuss"
        Zutat[] HaferCappuccino = new Zutat[] {
                new Zutat("Espressopulver", 0.50),
                new Zutat("Haferdrink", 0.60),
                new Zutat("Milchschaum (vegan)", 0.40)
        };

        Zutat[] KurkumaLatte = new Zutat[] {
                new Zutat("Haferdrink", 0.60),
                new Zutat("Kurkuma", 0.30),
                new Zutat("Ingwer", 0.20),
                new Zutat("Zimt", 0.10),
                new Zutat("Agavendicksaft", 0.30)
        };

        Zutat[] KakaoVegan = new Zutat[] {
                new Zutat("Haferdrink", 0.60),
                new Zutat("Kakaopulver", 0.40),
                new Zutat("Agavendicksaft", 0.30)
        };

        Zutat[] KräuterteeBio = new Zutat[] {
                new Zutat("Kräutermischung (Bio)", 0.40),
                new Zutat("Wasser", 0.10)
        };
        Restaurant Veganuss = new Restaurant(Kategorien.DEUTSCH, true);
        ArrayList<Hauptspeise> listeVeganuss = new ArrayList<>();
        listeVeganuss.add(new Hauptspeise("Tortellini mit Ricotta und Spinat", TortellinimitRicottaundSpinat));
        listeVeganuss.add(new Hauptspeise("Kürbissuppe mit Ingwer", KürbissuppemitIngwer));
        listeVeganuss.add(new Hauptspeise("Bulgur-Salat mit Kräutern", BulgurSalatmitKräutern));
        listeVeganuss.add(new Hauptspeise("Couscous mit Gemüse", CouscousmitGemüse));
        listeVeganuss.add(new Hauptspeise("Quinoa-Bowl vegan", QuinoaBowlvegan));
        Veganuss.setHauptspeisenListe(listeVeganuss);
        ArrayList<Nachspeiße> listeNachspeisenVeganuss = new ArrayList<>();
        listeNachspeisenVeganuss.add(new Nachspeiße("Veganer Schokoladenkuchen", VeganerSchokoladenkuchen));
        listeNachspeisenVeganuss.add(new Nachspeiße("Chia Pudding", ChiaPudding));
        listeNachspeisenVeganuss.add(new Nachspeiße("Apfel-Birnen Crumble", ApfelBirnenCrumble));
        listeNachspeisenVeganuss.add(new Nachspeiße("Veganer Zabaione", VeganeZabaione));
        listeNachspeisenVeganuss.add(new Nachspeiße("Veganer Apfelstrudel", VeganerApfelstrudel));
        Veganuss.setNachspeisenListe(listeNachspeisenVeganuss);
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksVeganuss = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksVeganuss = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksVeganuss.add(new Kaltgetränk("Ingwer-Zitronen-Limo", IngwerZitronenLimo, false));
        drinksVeganuss.add(new Kaltgetränk("Matcha Eistee", MatchaEistee, false));
        drinksVeganuss.add(new Kaltgetränk("Beeren Smoothie", BeerenSmoothie, false));
        drinksVeganuss.add(new Kaltgetränk("Gurken-Minz-Wasser", GurkenMinzWasser, false));

// Heißgetränke hinzufügen
        hotDrinksVeganuss.add(new Heißgetränk("Hafer-Cappuccino", HaferCappuccino));
        hotDrinksVeganuss.add(new Heißgetränk("Kurkuma Latte", KurkumaLatte));
        hotDrinksVeganuss.add(new Heißgetränk("Veganer Kakao", KakaoVegan));
        hotDrinksVeganuss.add(new Heißgetränk("Kräutertee (Bio)", KräuterteeBio));

// Listen zum Restaurant hinzufügen
        Veganuss.setKaltgetränkeListe(drinksVeganuss);
        Veganuss.setHeißgetränkeListe(hotDrinksVeganuss);
        Veganuss.setAdresse("Kettwiger Straße 20, 51103 Köln");
        Veganuss.setLatitude(50.943651);
        Veganuss.setLongitude(7.002304);
        Veganuss.setName("Veganuss");
        Veganuss.setWebsite ("www.Veganuss.de");
        Veganuss.setBeschreibung ("Die leckersten Veganen gerichte - frei von Tierleid, gut für Mensch und Umwelt." +
                "Kommt vorbei und überzeugt euch selbst davon, dass vegan = lecker ist!");
        Veganuss.setTelefonnummer ("0511 909090");
        Veganuss.setMail ("kontakt@Veganuss.de");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Veganuss.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(22, 0));
        }

        restaurants.add(Veganuss);
        // Snackabar "Snack & Chill"
        Zutat[] BriochemitZiegenkäse = {
                new Zutat("Brioche", 1.66),
                new Zutat("Ziegenkäse", 2.35),
                new Zutat("Feigen", 2.89),
                new Zutat("Rucola", 1.54)
        };
        Zutat[] FocacciamitOliven = {
                new Zutat("Focaccia", 2.43),
                new Zutat("Oliven schwarz", 1.26),
                new Zutat("Rosmarin", 0.85),
                new Zutat("Meersalz", 0.73)
        };
        Zutat[] SauerteigbrotmitAvocado = {
                new Zutat("Sauerteigbrot", 1.90),
                new Zutat("Avocado", 2.61),
                new Zutat("Kirschtomaten", 1.15),
                new Zutat("Chili", 0.66)
        };
        Zutat[] Kaviarschnittchen = {
                new Zutat("Blinis", 1.33),
                new Zutat("Crème fraîche", 1.28),
                new Zutat("Kaviar", 5.00),
                new Zutat("Dill", 0.67)
        };
        Zutat[] Schokokekse = new Zutat[] {
                new Zutat("Mehl", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Kakaopulver", 0.50),
                new Zutat("Backpulver", 0.20),
                new Zutat("Veganer Butterersatz", 0.60),
                new Zutat("Veganer Schokoladenchunks", 0.70)
        };
        Zutat[] MiniDonuts = new Zutat[] {
                new Zutat("Mehl", 0.80),
                new Zutat("Zucker", 0.40),
                new Zutat("Backpulver", 0.20),
                new Zutat("Pflanzenmilch", 0.50),
                new Zutat("Vanillezucker", 0.20),
                new Zutat("Zuckerguss", 0.40)
        };
        Zutat[] Schokoladenfondue = new Zutat[] {
                new Zutat("Zartbitterschokolade", 1.00),
                new Zutat("Kokosöl", 0.50),
                new Zutat("Frisches Obst (Erdbeeren, Bananen)", 0.80),
                new Zutat("Marshmallows", 0.60)
        };
        Zutat[] ApfelchipsMitZimt = new Zutat[] {
                new Zutat("Äpfel", 0.80),
                new Zutat("Zimt", 0.20),
                new Zutat("Zucker", 0.30),
                new Zutat("Agavendicksaft", 0.40)
        };
        Zutat[] WaffelnMitBeeren = new Zutat[] {
                new Zutat("Mehl", 0.80),
                new Zutat("Zucker", 0.30),
                new Zutat("Pflanzenmilch", 0.40),
                new Zutat("Vanillezucker", 0.20),
                new Zutat("Frische Beeren (Erdbeeren, Himbeeren)", 0.80),
                new Zutat("Puderzucker", 0.20)
        };
        // Kaltgetränke für "Snack & Chill"
        Zutat[] EisteePfirsich4 = new Zutat[] {
                new Zutat("Schwarzer Tee", 0.30),
                new Zutat("Pfirsichsaft", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] HimbeerLimo = new Zutat[] {
                new Zutat("Himbeersirup", 0.60),
                new Zutat("Zitrone", 0.30),
                new Zutat("Sprudelwasser", 0.30),
                new Zutat("Minze", 0.20)
        };

        Zutat[] KokoswasserMix = new Zutat[] {
                new Zutat("Kokoswasser", 0.80),
                new Zutat("Ananassaft", 0.60),
                new Zutat("Limette", 0.30)
        };

        Zutat[] IcedChaiLatte = new Zutat[] {
                new Zutat("Chai-Gewürz", 0.50),
                new Zutat("Pflanzenmilch", 0.50),
                new Zutat("Zucker", 0.30),
                new Zutat("Eiswürfel", 0.10)
        };

// Heißgetränke für "Snack & Chill"
        Zutat[] ChaiLatteHeiß = new Zutat[] {
                new Zutat("Chai-Gewürz", 0.50),
                new Zutat("Pflanzenmilch", 0.50),
                new Zutat("Zucker", 0.30)
        };

        Zutat[] EspressoSnackChill = new Zutat[] {
                new Zutat("Espressopulver", 0.60),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] HaferCappuccinoChill = new Zutat[] {
                new Zutat("Espressopulver", 0.50),
                new Zutat("Hafermilch", 0.60),
                new Zutat("Milchschaum", 0.40)
        };

        Zutat[] HeißeSchokoladeChill = new Zutat[] {
                new Zutat("Pflanzenmilch", 0.60),
                new Zutat("Kakaopulver", 0.50),
                new Zutat("Zucker", 0.30)
        };

        Restaurant SnackChill = new Restaurant(Kategorien.FASTFOOD, true);
        ArrayList<Hauptspeise> listeSnack = new ArrayList<>();
        listeSnack.add(new Hauptspeise("Brioche mit Ziegenkäse", BriochemitZiegenkäse));
        listeSnack.add(new Hauptspeise("Focaccia mit Oliven", FocacciamitOliven));
        listeSnack.add(new Hauptspeise("Sauerteigbrot mit Avocado", SauerteigbrotmitAvocado));
        listeSnack.add(new Hauptspeise("Kaviarschnittchen", Kaviarschnittchen));
        SnackChill.setHauptspeisenListe(listeSnack);
        ArrayList<Nachspeiße> listeNachspeisenSnackChill = new ArrayList<>();
        listeNachspeisenSnackChill.add(new Nachspeiße("Schokokekse", Schokokekse));
        listeNachspeisenSnackChill.add(new Nachspeiße("Mini Donuts", MiniDonuts));
        listeNachspeisenSnackChill.add(new Nachspeiße("Schokoladenfondue", Schokoladenfondue));
        listeNachspeisenSnackChill.add(new Nachspeiße("Apfelchips mit Zimt", ApfelchipsMitZimt));
        listeNachspeisenSnackChill.add(new Nachspeiße("Waffeln mit Beeren", WaffelnMitBeeren));
        SnackChill.setNachspeisenListe(listeNachspeisenSnackChill);
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksSnackChill = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksSnackChill = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksSnackChill.add(new Kaltgetränk("Eistee Pfirsich", EisteePfirsich4, false));
        drinksSnackChill.add(new Kaltgetränk("Himbeer-Limonade", HimbeerLimo, false));
        drinksSnackChill.add(new Kaltgetränk("Kokoswasser-Ananas-Mix", KokoswasserMix, false));
        drinksSnackChill.add(new Kaltgetränk("Iced Chai Latte", IcedChaiLatte, false));

// Heißgetränke hinzufügen
        hotDrinksSnackChill.add(new Heißgetränk("Chai Latte (heiß)", ChaiLatteHeiß));
        hotDrinksSnackChill.add(new Heißgetränk("Espresso", EspressoSnackChill));
        hotDrinksSnackChill.add(new Heißgetränk("Hafer-Cappuccino", HaferCappuccinoChill));
        hotDrinksSnackChill.add(new Heißgetränk("Heiße Schokolade", HeißeSchokoladeChill));

// Listen zum Restaurant hinzufügen
        SnackChill.setKaltgetränkeListe(drinksSnackChill);
        SnackChill.setHeißgetränkeListe(hotDrinksSnackChill);
        SnackChill.setAdresse("Ehrenstraße 45, 50672 Köln");
        SnackChill.setLatitude(50.938403);
        SnackChill.setLongitude(6.946625);
        SnackChill.setName("Snack & Chill");
        SnackChill.setWebsite( "www.snackandchill.de");
        SnackChill.setBeschreibung ("Kreative Snacks und Fingerfood für jeden Anlass – frisch zubereitet und zum Mitnehmen.");
        SnackChill.setTelefonnummer ("030 123456");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            SnackChill.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(22, 0));
        }
        restaurants.add(SnackChill);

        AppController.getInstance().bildeZuordnungFürAlleRestaurants(context, restaurants);
    }
    public Restaurant[] getRestaurants() {
        return restaurants.toArray(new Restaurant[0]);
    }
}
