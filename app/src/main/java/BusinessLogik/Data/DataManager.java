/**
 * Klasse initialisieren der Daten, basically die "Datenbank",
 * immer nur EINE erstellen, passiert Automatisch über Model/Controller/ MVC
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Data;

import android.os.Build;
import java.time.LocalTime;
import java.util.ArrayList;
import BusinessLogik.EssensOrte.Kategorien;
import BusinessLogik.EssensOrte.Restaurant;
import BusinessLogik.Nahrung.BasisEssen;
import BusinessLogik.Nahrung.BasisGetränk;
import BusinessLogik.Nahrung.Hauptspeiße;
import BusinessLogik.Nahrung.Heißgetränk;
import BusinessLogik.Nahrung.Kaltgetränk;
import BusinessLogik.Nahrung.Nachspeiße;
import BusinessLogik.Nahrung.Vorspeise;
import BusinessLogik.Nahrung.Zutat;
public class DataManager {
    public DataManager() {
        initGerichteAlsZutatenArrays();
    }
    private ArrayList<Restaurant> listeAllerRestaurants = new ArrayList<Restaurant>();
    public Restaurant[] getListeAllerRestaurants() {
        Restaurant[] listeRestaurants = new Restaurant[listeAllerRestaurants.size()];
        for (int i = 0; i < listeAllerRestaurants.size(); i++) {
            listeRestaurants[i] = listeAllerRestaurants.get(i);
        }
        return listeRestaurants;
    }
    //Liste mit allen Gerichten, sodass man diese durchsuchen könnte, wenn die nötige Logik
    // implementiert wäre
    //dazu muss man nochmal durch alle restaurants und die entsprechenden Gerichte und Getränke
    //in die Listen aufnehmen
    private ArrayList<BasisEssen> gerichte = new ArrayList<BasisEssen>();
    private ArrayList<BasisGetränk> getränke = new ArrayList<BasisGetränk>();
    public void initGerichteAlsZutatenArrays() {

        //Initialisierung Bella Napoli
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

        // Listen erstellen und Getränke hinzufügen
        ArrayList<Kaltgetränk> drinksBellaNapoli = new ArrayList<>();
        drinksBellaNapoli.add(new Kaltgetränk("San Pellegrino", SanPellegrino, false));
        drinksBellaNapoli.add(new Kaltgetränk("Aranciata", Aranciata, false));
        drinksBellaNapoli.add(new Kaltgetränk("Chinotto", Chinotto, false));
        drinksBellaNapoli.add(new Kaltgetränk("Eistee Pfirsich", EisteePfirsich, false));

        ArrayList<Heißgetränk> hotDrinksBellaNapoli = new ArrayList<>();
        hotDrinksBellaNapoli.add(new Heißgetränk("Espresso", Espresso));
        hotDrinksBellaNapoli.add(new Heißgetränk("Cappuccino", Cappuccino));
        hotDrinksBellaNapoli.add(new Heißgetränk("Latte Macchiato", LatteMacchiato));
        hotDrinksBellaNapoli.add(new Heißgetränk("Heiße Schokolade", HeißeSchokolade));
        Restaurant BellaNapoli = new Restaurant(Kategorien.FASTFOOD, true);
        ArrayList<Hauptspeiße> listeBellaNapoliHauptspeisen= new ArrayList<Hauptspeiße>();
        ArrayList<Vorspeise> listeBellaNapoliVorspeisen= new ArrayList<Vorspeise>();
        listeBellaNapoliVorspeisen.add(new Vorspeise("Käseplatte", Käseplatte));
        listeBellaNapoliVorspeisen.add(new Vorspeise("Bruschetta", Bruschetta));
        listeBellaNapoliVorspeisen.add(new Vorspeise("Carpaccio", Carpaccio));
        listeBellaNapoliVorspeisen.add(new Vorspeise("Vitello Tonnato", VitelloTonnato));
        listeBellaNapoliVorspeisen.add(new Vorspeise("Antipasti Misto", AntipastiMisto));
        listeBellaNapoliVorspeisen.add(new Vorspeise("Crostini Funghi", CrostiniFunghi));
        listeBellaNapoliVorspeisen.add(new Vorspeise("Prosciutto Melone", ProsciuttoMelone));
        Hauptspeiße VegetarischeLasagneEssen = new Hauptspeiße("Vegetarische Lasagne", VegetarischeLasagne);
        listeBellaNapoliHauptspeisen.add(VegetarischeLasagneEssen);
        BellaNapoli.setHauptspeisenListe(listeBellaNapoliHauptspeisen);
        BellaNapoli.setVorspeisenListe(listeBellaNapoliVorspeisen);
        // Listen zum Restaurant hinzufügen
        BellaNapoli.setKaltgetränkeListe(drinksBellaNapoli);
        BellaNapoli.setHeißgetränkeListe(hotDrinksBellaNapoli);

        BellaNapoli.setName("Bella Napoli");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            BellaNapoli.setOeffnungszeiten(LocalTime.of(9, 30), LocalTime.of(22, 00));
        }
        BellaNapoli.website= "www.bellanapoli.de";
        BellaNapoli.beschreibung= "Das Beste italienische Restaurant der Stadt mit einem großen Angebot weit über Pizza und Pasta hinaus." +
                "Unser freundliches Personal freut sich auf Ihren Besuch und kann sie auch in Bezug auf unsere Große Weinkarte gut beraten!";
        BellaNapoli.telefonnummer= "0123 456789";
        BellaNapoli.mail= "bella@napoli.com";

// Restaurant „La Provence“ Initialisierung
        Zutat[] Ratatouille = new Zutat[] {
                new Zutat("Aubergine", 2.10),
                new Zutat("Zucchini", 1.80),
                new Zutat("Paprika", 1.50),
                new Zutat("Tomaten", 2.30),
                new Zutat("Thymian", 0.90)
        };

        Zutat[] QuicheLorraine = new Zutat[] {
                new Zutat("Blätterteig", 2.00),
                new Zutat("Schinken", 2.50),
                new Zutat("Ei", 0.80),
                new Zutat("Sahne", 1.60),
                new Zutat("Lauch", 1.20)
        };

        Zutat[] Bouillabaisse = new Zutat[] {
                new Zutat("Fischfilet", 4.50),
                new Zutat("Fenchel", 1.20),
                new Zutat("Safran", 3.00),
                new Zutat("Tomaten", 2.00),
                new Zutat("Weißwein", 2.70)
        };

        Zutat[] CoqAuVin = new Zutat[] {
                new Zutat("Hähnchenkeule", 3.20),
                new Zutat("Rotwein", 2.80),
                new Zutat("Champignons", 1.30),
                new Zutat("Zwiebeln", 0.60),
                new Zutat("Thymian", 0.80)
        };

        Zutat[] TarteTatin = new Zutat[] {
                new Zutat("Äpfel", 1.50),
                new Zutat("Blätterteig", 2.10),
                new Zutat("Zucker", 0.70),
                new Zutat("Butter", 1.10),
                new Zutat("Zimt", 0.60)
        };
        Zutat[] Zwiebelsuppe = new Zutat[] {
                new Zutat("Zwiebeln", 0.80),
                new Zutat("Butter", 0.50),
                new Zutat("Weißwein", 1.20),
                new Zutat("Rinderbrühe", 0.90),
                new Zutat("Baguette", 1.00),
                new Zutat("Gruyère", 1.50)
        };

        Zutat[] QuicheLorraine1 = new Zutat[] {
                new Zutat("Blätterteig", 1.20),
                new Zutat("Sahne", 0.80),
                new Zutat("Eier", 0.60),
                new Zutat("Speck", 1.00),
                new Zutat("Emmentaler", 1.10)
        };
        Zutat[] Ratatouille1 = new Zutat[] {
                new Zutat("Zucchini", 0.70),
                new Zutat("Aubergine", 0.80),
                new Zutat("Paprika", 0.90),
                new Zutat("Tomaten", 0.80),
                new Zutat("Knoblauch", 0.30),
                new Zutat("Olivenöl", 0.50)
        };
        Zutat[] CoquillesSaintJacques = new Zutat[] {
                new Zutat("Jakobsmuscheln", 4.50),
                new Zutat("Weißwein", 1.30),
                new Zutat("Butter", 0.60),
                new Zutat("Sahne", 0.90),
                new Zutat("Petersilie", 0.20)
        };
        Zutat[] SaladeNicoise = new Zutat[] {
                new Zutat("Thunfisch", 1.80),
                new Zutat("Oliven", 0.60),
                new Zutat("Tomaten", 0.70),
                new Zutat("Eier", 0.50),
                new Zutat("Grüne Bohnen", 0.90),
                new Zutat("Kartoffeln", 0.60)
        };
        Zutat[] TarteTatinSavory = new Zutat[] {
                new Zutat("Blätterteig", 1.10),
                new Zutat("Zwiebeln", 0.80),
                new Zutat("Ziegenkäse", 1.60),
                new Zutat("Honig", 0.40),
                new Zutat("Thymian", 0.20)
        };
        Zutat[] CroqueMonsieur = new Zutat[] {
                new Zutat("Toastbrot", 0.70),
                new Zutat("Kochschinken", 1.00),
                new Zutat("Emmentaler", 1.20),
                new Zutat("Béchamelsauce", 0.90)
        };
        Zutat[] TerrineDeCampagne = new Zutat[] {
                new Zutat("Schweinefleisch", 2.00),
                new Zutat("Leber", 1.30),
                new Zutat("Pistazien", 1.00),
                new Zutat("Thymian", 0.30),
                new Zutat("Cognac", 1.50)
        };
        Zutat[] LachsTatar = new Zutat[] {
                new Zutat("Räucherlachs", 2.80),
                new Zutat("Schalotten", 0.40),
                new Zutat("Zitronensaft", 0.30),
                new Zutat("Dill", 0.20),
                new Zutat("Crème fraîche", 0.70)
        };
        Zutat[] Käseauswahl = new Zutat[] {
                new Zutat("Brie", 1.50),
                new Zutat("Roquefort", 1.70),
                new Zutat("Comté", 1.80),
                new Zutat("Baguette", 1.00),
                new Zutat("Trauben", 0.60)
        };

        // Kaltgetränke für "La Provence"
        Zutat[] Perrier = new Zutat[] {
                new Zutat("Mineralwasser", 0.50),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] Orangina = new Zutat[] {
                new Zutat("Orangensaft", 0.80),
                new Zutat("Zitronensaft", 0.30),
                new Zutat("Zucker", 0.20),
                new Zutat("Kohlensäure", 0.10)
        };

        Zutat[] CassisLimonade = new Zutat[] {
                new Zutat("Johannisbeersirup", 0.60),
                new Zutat("Zitronenlimonade", 0.80),
                new Zutat("Wasser", 0.30),
                new Zutat("Eiswürfel", 0.10)
        };

        Zutat[] EisteeLavendel = new Zutat[] {
                new Zutat("Schwarzer Tee", 0.40),
                new Zutat("Lavendelsirup", 0.50),
                new Zutat("Zucker", 0.20),
                new Zutat("Eiswürfel", 0.10)
        };

// Heißgetränke für "La Provence"
        Zutat[] CaféCrème = new Zutat[] {
                new Zutat("Kaffeebohnen", 0.50),
                new Zutat("Milch", 0.40)
        };

        Zutat[] ChocolatChaud = new Zutat[] {
                new Zutat("Milch", 0.50),
                new Zutat("Kakaopulver", 0.40),
                new Zutat("Zucker", 0.20)
        };

        Zutat[] ThéVert = new Zutat[] {
                new Zutat("Grüner Tee", 0.30),
                new Zutat("Wasser", 0.10)
        };

        Zutat[] CaféAuLait = new Zutat[] {
                new Zutat("Kaffeebohnen", 0.50),
                new Zutat("Milch", 0.60)
        };
        Restaurant LaProvence = new Restaurant(Kategorien.FRANZÖSISCH, true);
        ArrayList<Hauptspeiße> listeLaProvenceHauptspeisen = new ArrayList<>();
        ArrayList<Vorspeise> listeLaProvenceVorspeisen = new ArrayList<>();
        listeLaProvenceVorspeisen.add(new Vorspeise("Zwiebelsuppe", Zwiebelsuppe));
        listeLaProvenceVorspeisen.add(new Vorspeise("Coquilles Saint Jacques", CoquillesSaintJacques));
        listeLaProvenceVorspeisen.add(new Vorspeise("Salade Niçoise", SaladeNicoise));
        listeLaProvenceVorspeisen.add(new Vorspeise("Tarte Tatin Savory", TarteTatinSavory));
        listeLaProvenceVorspeisen.add(new Vorspeise("Croque Monsieur", CroqueMonsieur));
        listeLaProvenceVorspeisen.add(new Vorspeise("Terrine de Campagne", TerrineDeCampagne));
        listeLaProvenceVorspeisen.add(new Vorspeise("Lachs Tatar", LachsTatar));
        listeLaProvenceVorspeisen.add(new Vorspeise("Käseauswahl", Käseauswahl));
        LaProvence.setVorspeisenListe(listeLaProvenceVorspeisen);
        //Liste der Vorspeisen übertragen
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Ratatouille", Ratatouille1));
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Quiche Lorraine", QuicheLorraine1));
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Bouillabaisse", Bouillabaisse));
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Coq au Vin", CoqAuVin));
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Tarte Tatin", TarteTatin));
        LaProvence.setHauptspeisenListe(listeLaProvenceHauptspeisen);
        //Liste der Hauptspeisen übertragen
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksLaProvence = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksLaProvence = new ArrayList<>();

        // Kaltgetränke hinzufügen
        drinksLaProvence.add(new Kaltgetränk("Perrier", Perrier, false));
        drinksLaProvence.add(new Kaltgetränk("Orangina", Orangina, false));
        drinksLaProvence.add(new Kaltgetränk("Cassis Limonade", CassisLimonade, false));
        drinksLaProvence.add(new Kaltgetränk("Eistee Lavendel", EisteeLavendel, false));

        // Heißgetränke hinzufügen
        hotDrinksLaProvence.add(new Heißgetränk("Café Crème", CaféCrème));
        hotDrinksLaProvence.add(new Heißgetränk("Chocolat Chaud", ChocolatChaud));
        hotDrinksLaProvence.add(new Heißgetränk("Thé Vert", ThéVert));
        hotDrinksLaProvence.add(new Heißgetränk("Café au Lait", CaféAuLait));


        // Listen zum Restaurant hinzufügen
        LaProvence.setKaltgetränkeListe(drinksLaProvence);
        LaProvence.setHeißgetränkeListe(hotDrinksLaProvence);
        LaProvence.setName("La Provence");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            LaProvence.setOeffnungszeiten(LocalTime.of(11, 0), LocalTime.of(23, 0));
        }
        LaProvence.website = "www.laprovence.fr";
        LaProvence.beschreibung = "Ein charmantes französisches Bistro im Herzen der Stadt – genießen Sie klassische Spezialitäten und erlesene Weine in stilvollem Ambiente.";
        LaProvence.telefonnummer = "0456 789012";
        LaProvence.mail = "info@laprovence.fr";

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
        Restaurant BarLounge1 = new Restaurant(Kategorien.SPIRITUOSEN, false);
        ArrayList<Hauptspeiße> drinksBarLounge1 = new ArrayList<>();
        ArrayList<Vorspeise> drinksBarLounge1Vorspeisen = new ArrayList<>();
        drinksBarLounge1Vorspeisen.add(new Vorspeise("Mini Burger Slider", MiniBurgerSlider));
        drinksBarLounge1Vorspeisen.add(new Vorspeise("Nacho Platte", NachoPlatte));
        drinksBarLounge1Vorspeisen.add(new Vorspeise("Garnelen Cocktail", GarnelenCocktail));
        drinksBarLounge1Vorspeisen.add(new Vorspeise("Chicken Wings", ChickenWings));
        drinksBarLounge1Vorspeisen.add(new Vorspeise("Falafel Bällchen", FalafelBällchen));
        drinksBarLounge1Vorspeisen.add(new Vorspeise("Mozzarella Sticks", MozzarellaSticks));
        drinksBarLounge1Vorspeisen.add(new Vorspeise("Trüffel Pommes", TrüffelPommes));
        drinksBarLounge1Vorspeisen.add(new Vorspeise("Veggie Wraps", VeggieWraps));
        BarLounge1.setVorspeisenListe(drinksBarLounge1Vorspeisen);
        drinksBarLounge1.add(new Hauptspeiße("Mojito", Mojito));
        drinksBarLounge1.add(new Hauptspeiße("Tequila Sunrise", TequilaSunrise));
        drinksBarLounge1.add(new Hauptspeiße("Whiskey Sour", WhiskeySour));
        drinksBarLounge1.add(new Hauptspeiße("Pina Colada", PinaColada));
        drinksBarLounge1.add(new Hauptspeiße("Blue Lagoon", BlueLagoon));
        drinksBarLounge1.add(new Hauptspeiße("Gin Tonic", GinTonic));
        drinksBarLounge1.add(new Hauptspeiße("Espresso Martini", EspressoMartini));
        BarLounge1.setHauptspeisenListe(drinksBarLounge1);
        BarLounge1.setName("BarLounge 1");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            BarLounge1.setOeffnungszeiten(LocalTime.of(18, 0), LocalTime.of(2, 0));
        }
        BarLounge1.website = "www.barlounge1.de";
        BarLounge1.beschreibung = "Die stilvolle Cocktailbar im Herzen der Stadt mit Signature Drinks und entspannter Atmosphäre.";
        BarLounge1.telefonnummer = "040 9876543";
        BarLounge1.mail = "info@barlounge1.de";

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
        ArrayList<Kaltgetränk> drinksSnackHaus1 = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksSnackHaus1 = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksSnackHaus1.add(new Kaltgetränk("Cola", Cola, false));
        drinksSnackHaus1.add(new Kaltgetränk("Apfelschorle", Apfelschorle, false));
        drinksSnackHaus1.add(new Kaltgetränk("Eistee Pfirsich", EisteePfirsich1, false));
        drinksSnackHaus1.add(new Kaltgetränk("Zitronenlimonade", Zitronenlimonade, false));

// Heißgetränke hinzufügen
        hotDrinksSnackHaus1.add(new Heißgetränk("Kaffee", Kaffee));
        hotDrinksSnackHaus1.add(new Heißgetränk("Kakao", Kakao));
        hotDrinksSnackHaus1.add(new Heißgetränk("Tee Kamille", TeeKamille));
        hotDrinksSnackHaus1.add(new Heißgetränk("Cappuccino", Cappuccino1));

        Restaurant SnackHaus1 = new Restaurant(Kategorien.SNACKS, true);
        ArrayList<Hauptspeiße> speisenSnackHaus1 = new ArrayList<>();
        ArrayList<Nachspeiße> snackHaus1Nachspeisen = new ArrayList<>();
        speisenSnackHaus1.add(new Hauptspeiße("Schinken Baguette", SchinkenBaguette));
        speisenSnackHaus1.add(new Hauptspeiße("Chicken Wrap", ChickenWrap));
        speisenSnackHaus1.add(new Hauptspeiße("Veggie Toast", VeggieToast));
        speisenSnackHaus1.add(new Hauptspeiße("Spiegelei Sandwich", SpiegeleiSandwich));
        speisenSnackHaus1.add(new Hauptspeiße("Tuna Snack", TunaSnack));
        speisenSnackHaus1.add(new Hauptspeiße("Mozzarella Ciabatta", MozzarellaCiabatta));
        speisenSnackHaus1.add(new Hauptspeiße("Snackplatte", Snackplatte));
        SnackHaus1.setHauptspeisenListe(speisenSnackHaus1);
        snackHaus1Nachspeisen.add(new Nachspeiße("Brownie",Brownie));
        snackHaus1Nachspeisen.add(new Nachspeiße("Donut", Donut));
        snackHaus1Nachspeisen.add(new Nachspeiße("Waffel mit Kirschen", WaffelMitKirschen));
        snackHaus1Nachspeisen.add(new Nachspeiße("Cookie Sandwich", CookieSandwich));
        snackHaus1Nachspeisen.add(new Nachspeiße("Muffin", Muffin));
        snackHaus1Nachspeisen.add(new Nachspeiße("Eisbecher", Eisbecher));
        snackHaus1Nachspeisen.add(new Nachspeiße("Milchreis mit Zimt und Zucker", MilchreisZimtZucker));
        snackHaus1Nachspeisen.add(new Nachspeiße("Apfeltasche", Apfeltasche));
        snackHaus1Nachspeisen.add(new Nachspeiße("Mini Pancakes", MiniPancakes));
        snackHaus1Nachspeisen.add(new Nachspeiße("Churros mit Schokosauce", ChurrosMitSchokosauce));
        SnackHaus1.setNachspeisenListe(snackHaus1Nachspeisen);
        SnackHaus1.setKaltgetränkeListe(drinksSnackHaus1);
        SnackHaus1.setHeißgetränkeListe(hotDrinksSnackHaus1);
        SnackHaus1.setName("SnackHaus 1");
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            SnackHaus1.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(20, 0));
        }
        SnackHaus1.website = "www.snackhaus1.de";
        SnackHaus1.beschreibung = "Knackige Snacks, frisch belegt und ideal für unterwegs. Bei uns trifft Genuss auf Geschwindigkeit!";
        SnackHaus1.telefonnummer = "030 11122233";
        SnackHaus1.mail = "kontakt@snackhaus1.de";

        // Zutaten und Gerichte für das Asiatische Restaurant "Tokyo Zen"
        // 1. Sushi Platter
        Zutat[] SushiZutaten = new Zutat[]{
                new Zutat("Reis", 2.50),
                new Zutat("Nori", 1.50),
                new Zutat("Lachs", 5.00),
                new Zutat("Gurke", 0.80),
                new Zutat("Avocado", 1.20)
        };
        Hauptspeiße SushiPlatter = new Hauptspeiße("Sushi Platter", SushiZutaten);

        // 2. Gemüse Tempura
        Zutat[] TempuraZutaten = new Zutat[]{
                new Zutat("Garnelen", 3.75),
                new Zutat("Zucchini", 1.80),
                new Zutat("Aubergine", 2.00),
                new Zutat("Tempura-Teig", 0.90),
                new Zutat("Dip-Sauce", 0.50)
        };
        Hauptspeiße GemüseTempura = new Hauptspeiße("Gemüse Tempura", TempuraZutaten);

        // 3. Miso Suppe
        Zutat[] MisoZutaten = new Zutat[]{
                new Zutat("Miso Paste", 1.25),
                new Zutat("Tofu", 2.10),
                new Zutat("Frühlingszwiebeln", 0.65),
                new Zutat("Seetang", 1.10)
        };
        Hauptspeiße MisoSuppe = new Hauptspeiße("Miso Suppe", MisoZutaten);
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
        ArrayList<Hauptspeiße> listeTokyoZenHauptspeisen = new ArrayList<Hauptspeiße>();
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
        TokyoZen.setName("Tokyo Zen");
        // Öffnungszeiten setzen (mit API Level Überprüfung)
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            TokyoZen.setOeffnungszeiten(LocalTime.of(11, 0), LocalTime.of(23, 0));
        }
        TokyoZen.website = "www.tokyozen.jp";
        TokyoZen.beschreibung = "Erleben Sie authentische japanische Küche in modernem Ambiente. Unser Angebot umfasst frisches Sushi, knackige Tempura und traditionelle Miso Suppe. Wir freuen uns auf Ihren Besuch!";
        TokyoZen.telefonnummer = "0987 654321";
        TokyoZen.mail = "info@tokyozen.jp";

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
        ArrayList<Hauptspeiße> listeHauptspeisenAmore = new ArrayList<>();
        ArrayList<Vorspeise> listeVorspeisenAmore = new ArrayList<>();
        ArrayList<Nachspeiße> listeNachspeisenAmore = new ArrayList<>();
        listeHauptspeisenAmore.add(new Hauptspeiße("Penne Arrabbiata", PenneArrabbiata));
        listeHauptspeisenAmore.add(new Hauptspeiße("Caprese", Caprese));
        listeHauptspeisenAmore.add(new Hauptspeiße("Spaghetti Bolognese", SpaghettiBolognese));
        listeHauptspeisenAmore.add(new Hauptspeiße("Pizza Margherita", PizzaMargherita));
        listeHauptspeisenAmore.add(new Hauptspeiße("Lasagne", Lasagne));
        listeHauptspeisenAmore.add(new Hauptspeiße("Tagliatelle Alfredo", TagliatelleAlfredo));
        listeHauptspeisenAmore.add(new Hauptspeiße("Risotto ai Funghi", RisottoAiFunghi));
        listeHauptspeisenAmore.add(new Hauptspeiße("Gnocchi Sorrentina", GnocchiSorrentina));
        listeHauptspeisenAmore.add(new Hauptspeiße("Frittierte Auberginen", FrittierteAuberginen));
        listeHauptspeisenAmore.add(new Hauptspeiße("PolloAllaCacciatora", PolloAllaCacciatora));
        listeHauptspeisenAmore.add(new Hauptspeiße("SaltimboccaAllaRomana", SaltimboccaAllaRomana));
        listeHauptspeisenAmore.add(new Hauptspeiße("Branzino al Forno", BranzinoAlForno));
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
        RistoranteAmore.setName("Ristorante Amore");
        RistoranteAmore.website = "www.ristorante-amore.it";
        RistoranteAmore.beschreibung = "Klassische italienische Küche mit Leidenschaft gekocht. Besonders bekannt für unsere hausgemachten Nudelgerichte.";
        RistoranteAmore.telefonnummer = "030 112233";
        RistoranteAmore.mail = "info@amore.it";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            RistoranteAmore.setOeffnungszeiten(LocalTime.of(12, 0), LocalTime.of(22, 0));
        }

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
        ArrayList<Hauptspeiße> listeHauptspeisenRoma = new ArrayList<>();
        ArrayList<Vorspeise> listeVorspeisenRoma = new ArrayList<>();
        ArrayList<Nachspeiße> listeNachspeisenRoma = new ArrayList<>();
        // Getränke-Listen anlegen
        ArrayList<Kaltgetränk> drinksRistoranteAmore = new ArrayList<>();
        ArrayList<Heißgetränk> hotDrinksRistoranteAmore = new ArrayList<>();

// Kaltgetränke hinzufügen
        drinksRistoranteAmore.add(new Kaltgetränk("San Pellegrino", SanPellegrino, false));
        drinksRistoranteAmore.add(new Kaltgetränk("Aranciata Rossa", AranciataRossa, false));
        drinksRistoranteAmore.add(new Kaltgetränk("Chinotto", Chinotto, false));
        drinksRistoranteAmore.add(new Kaltgetränk("Limonata", Limonata, false));

// Heißgetränke hinzufügen
        hotDrinksRistoranteAmore.add(new Heißgetränk("Espresso", Espresso));
        hotDrinksRistoranteAmore.add(new Heißgetränk("Cappuccino", Cappuccino));
        hotDrinksRistoranteAmore.add(new Heißgetränk("Latte Macchiato", LatteMacchiato));
        hotDrinksRistoranteAmore.add(new Heißgetränk("Caffè Corretto", CaffèCorretto));
        listeHauptspeisenRoma.add(new Hauptspeiße("Penne Arrabbiata", PenneArrabbiata));
        listeHauptspeisenRoma.add(new Hauptspeiße("Pizza Quattro Stagioni", PizzaQuattroStagioni));
        listeHauptspeisenRoma.add(new Hauptspeiße("Fettuccine Alfredo", FettuccineAlfredo));
        listeHauptspeisenRoma.add(new Hauptspeiße("Risotto alla Pescatora", RisottoAllaPescatora));
        listeHauptspeisenRoma.add(new Hauptspeiße("Pizza Diavola", PizzaDiavola));
        listeHauptspeisenRoma.add(new Hauptspeiße("Gnocchi Burro Salvia", GnocchiBurroSalvia));
        listeHauptspeisenRoma.add(new Hauptspeiße("Pollo alla Parmigiana", PolloAllaParmigiana));
        listeHauptspeisenRoma.add(new Hauptspeiße("Lasagne alla Bolognese", LasagneAllaBolognese));
        listeHauptspeisenRoma.add(new Hauptspeiße("Saltimbocca alla Romana", SaltimboccaAllaRomana));
        listeHauptspeisenRoma.add(new Hauptspeiße("Frittura di Pesce", FritturaDiPesce));
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
        RistoranteAmore.setKaltgetränkeListe(drinksRistoranteAmore);
        RistoranteAmore.setHeißgetränkeListe(hotDrinksRistoranteAmore);
        TrattoriaRoma.setName("Trattoria Roma");
        TrattoriaRoma.website = "www.trattoria-roma.it";
        TrattoriaRoma.beschreibung = "Traditionelle Trattoria mit Holzofenpizza und mediterranem Flair.";
        TrattoriaRoma.telefonnummer = "040 998877";
        TrattoriaRoma.mail = "kontakt@trattoriaroma.it";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            TrattoriaRoma.setOeffnungszeiten(LocalTime.of(11, 30), LocalTime.of(23, 0));
        }
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
        ArrayList<Hauptspeiße> listeHauptspeisenSakura = new ArrayList<>();
        ArrayList<Vorspeise> listeVorspeisenSakura = new ArrayList<>();
        ArrayList<Nachspeiße> listeNachspeisenSakura = new ArrayList<>();
        listeHauptspeisenSakura.add(new Hauptspeiße("Maki mit Lachs", MakiLachs));
        listeHauptspeisenSakura.add(new Hauptspeiße("Edamame", Edamame1));
        listeHauptspeisenSakura.add(new Hauptspeiße("Thunfischtatar mit Avocado", ThunfischtatarmitAvocado));
        listeHauptspeisenSakura.add(new Hauptspeiße("Sushi Variation", SushiVariation));
        listeHauptspeisenSakura.add(new Hauptspeiße("Sushi Maki", SushiMaki));
        listeHauptspeisenSakura.add(new Hauptspeiße("California Roll", CaliforniaRoll));
        listeHauptspeisenSakura.add(new Hauptspeiße("Nigiri Lachs", NigiriLachs));
        listeHauptspeisenSakura.add(new Hauptspeiße("Teriyaki Hähnchen", TeriyakiHähnchen));
        listeHauptspeisenSakura.add(new Hauptspeiße("Ramen Shoyu", RamenShoyu));
        listeHauptspeisenSakura.add(new Hauptspeiße("Tempura Shrimps", TempuraShrimps));
        listeHauptspeisenSakura.add(new Hauptspeiße("Yakimeshi", Yakimeshi));
        listeHauptspeisenSakura.add(new Hauptspeiße("Ebi Sushi", EbiSushi));
        listeHauptspeisenSakura.add(new Hauptspeiße("Sashimi Lachs", SashimiLachs));
        listeHauptspeisenSakura.add(new Hauptspeiße("Unagi Don", UnagiDon));
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
        SakuraSushi.setName("Sakura Sushi Bar");
        SakuraSushi.website = "www.sakura-sushi.de";
        SakuraSushi.beschreibung = "Frisches Sushi in modernem Ambiente. Unsere Spezialität: kreative Maki-Rollen.";
        SakuraSushi.telefonnummer = "089 334455";
        SakuraSushi.mail = "info@sakura.de";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            SakuraSushi.setOeffnungszeiten(LocalTime.of(12, 0), LocalTime.of(22, 30));
        }
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
        ArrayList<Hauptspeiße> listeWok = new ArrayList<>();
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
        listeWok.add(new Hauptspeiße("Gebratener Reis mit Gemüse", WokGemüseReis));
        listeWok.add(new Hauptspeiße("Thai-Curry mit Hähnchen", ThaiCurry));
        listeWok.add(new Hauptspeiße("Jakobsmuscheln mit Safransauce", JakobsmuschelnmitSafransauce));
        listeWok.add(new Hauptspeiße("Oktopus-Carpaccio", OktopusCarpaccio));
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
        WokDynasty.setName("Wok Dynasty");
        WokDynasty.website = "www.wokdynasty.de";
        WokDynasty.beschreibung = "Authentische asiatische Wok-Gerichte – frisch und schnell zubereitet.";
        WokDynasty.telefonnummer = "0711 223344";
        WokDynasty.mail = "kontakt@wokdynasty.de";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            WokDynasty.setOeffnungszeiten(LocalTime.of(10, 30), LocalTime.of(21, 30));
        }

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
        ArrayList<Hauptspeiße> listeHauptspeisenBurger = new ArrayList<>();
        listeHauptspeisenBurger.add(new Hauptspeiße("Cheeseburger", Cheeseburger));
        listeHauptspeisenBurger.add(new Hauptspeiße("Veggie Burger", VeggieBurger));
        ArrayList<Nachspeiße> listeNachspeisenBurger = new ArrayList<>();
        listeHauptspeisenBurger.add(new Hauptspeiße("Classic Cheeseburger", ClassicCheeseburger));
        listeHauptspeisenBurger.add(new Hauptspeiße("Bacon Cheeseburger", BaconCheeseburger));
        listeHauptspeisenBurger.add(new Hauptspeiße("Veggie Burger", VeggieBurger));
        listeHauptspeisenBurger.add(new Hauptspeiße("Chicken Burger", ChickenBurger));
        listeHauptspeisenBurger.add(new Hauptspeiße("BBQ Burger", BBQBurger));
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
        BurgerFactory.setHauptspeisenListe(listeHauptspeisenBurger);
        // Listen zum Restaurant hinzufügen
        BurgerFactory.setKaltgetränkeListe(drinksBurgerFactory);
        BurgerFactory.setHeißgetränkeListe(hotDrinksBurgerFactory);
        BurgerFactory.setName("Burger Factory");
        BurgerFactory.website = "www.burgerfactory.de";
        BurgerFactory.beschreibung = "Handgemachte Burger mit hochwertigen Zutaten – klassisch oder vegan!";
        BurgerFactory.telefonnummer = "0201 556677";
        BurgerFactory.mail = "info@burgerfactory.de";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            BurgerFactory.setOeffnungszeiten(LocalTime.of(11, 0), LocalTime.of(23, 0));
        }
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
        ArrayList<Hauptspeiße> listeHauptspeisenFrittenkönig = new ArrayList<>();
        ArrayList<Nachspeiße> listeNachspeisenFrittenkönig = new ArrayList<>();
        listeHauptspeisenFrittenkönig.add(new Hauptspeiße("Currywurst mit Pommes", CurrywurstPommes));
        listeHauptspeisenFrittenkönig.add(new Hauptspeiße("Chili Cheese Fries", ChiliCheeseFries));
        listeHauptspeisenFrittenkönig.add(new Hauptspeiße("Pommes Frites Classic", PommesFritesClassic));
        listeHauptspeisenFrittenkönig.add(new Hauptspeiße("Pommes Frites mit Currywurst", PommesFritesCurrywurst));
        listeHauptspeisenFrittenkönig.add(new Hauptspeiße("Pommes Frites mit Cheddar", PommesFritesCheese));
        listeHauptspeisenFrittenkönig.add(new Hauptspeiße("Fritten mit Pulled Pork", FrittenMitPulledPork));
        listeHauptspeisenFrittenkönig.add(new Hauptspeiße("Fritten mit Hähnchen", FrittenMitHähnchen));
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
        Frittenkoenig.setName("Frittenkönig");
        Frittenkoenig.website = "www.frittenkoenig.de";
        Frittenkoenig.beschreibung = "Deftiges Fastfood mit Kultcharakter – schnell, günstig, lecker.";
        Frittenkoenig.telefonnummer = "0511 909090";
        Frittenkoenig.mail = "kontakt@frittenkoenig.de";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Frittenkoenig.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(22, 0));
        }
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
        ArrayList<Hauptspeiße> listeHM = new ArrayList<>();
        listeHM.add(new Hauptspeiße("Entenbrust auf Orangenspiegel", EntenbrustaufOrangenspiegel));
        listeHM.add(new Hauptspeiße("Ziegenkäse im Speckmantel", ZiegenkäseimSpeckmantel));
        listeHM.add(new Hauptspeiße("Kalbsrücken in Senfkruste", KalbsrückeninSenfkruste));
        listeHM.add(new Hauptspeiße("Zitronenhähnchen mit Rosmarinkartoffeln", ZitronenhähnchenmitRosmarinkartoffeln));
        listeHM.add(new Hauptspeiße("Rindergulasch", Rindergulasch));
        listeHM.add(new Hauptspeiße("Schweinshaxe mit Krautsalat", SchweinshaxemitKrautsalat));
        listeHM.add(new Hauptspeiße("Forelle Müllerin Art", ForelleMüllerinArt));
        listeHM.add(new Hauptspeiße("Kalbsleber Berliner Art", KalbsleberBerlinerArt));
        listeHM.add(new Hauptspeiße("Wiener Schnitzel", WienerSchnitzel));
        listeHM.add(new Hauptspeiße("Schweinebraten mit Kloß", SchweinebratenmitKloß));
        listeHM.add(new Hauptspeiße("Hackbraten mit Erbsen", HackbratenmitErbsen));
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

        Hausmannskost.setName("Hausmannskost");
        Hausmannskost.website = "www.Hausmannskost.de";
        Hausmannskost.beschreibung = "Echt deutsche Kost zu echten deutschen Preisen – hier gibt es alles, was das Herz begehrt.";
        Hausmannskost.telefonnummer = "0511 909090";
        Hausmannskost.mail = "kontakt@hausmannskost.de";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Hausmannskost.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(22, 0));
        }

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
        ArrayList<Hauptspeiße> listeVeganuss = new ArrayList<>();
        listeVeganuss.add(new Hauptspeiße("Tortellini mit Ricotta und Spinat", TortellinimitRicottaundSpinat));
        listeVeganuss.add(new Hauptspeiße("Kürbissuppe mit Ingwer", KürbissuppemitIngwer));
        listeVeganuss.add(new Hauptspeiße("Bulgur-Salat mit Kräutern", BulgurSalatmitKräutern));
        listeVeganuss.add(new Hauptspeiße("Couscous mit Gemüse", CouscousmitGemüse));
        listeVeganuss.add(new Hauptspeiße("Quinoa-Bowl vegan", QuinoaBowlvegan));
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

        Veganuss.setName("Veganuss");
        Veganuss.website = "www.Veganuss.de";
        Veganuss.beschreibung = "Die leckersten Veganen gerichte - frei von Tierleid, gut für Mensch und Umwelt." +
                "Kommt vorbei und überzeugt euch selbst davon, dass vegan = lecker ist!";
        Veganuss.telefonnummer = "0511 909090";
        Veganuss.mail = "kontakt@Veganuss.de";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            Veganuss.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(22, 0));
        }

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
        ArrayList<Hauptspeiße> listeSnack = new ArrayList<>();
        listeSnack.add(new Hauptspeiße("Brioche mit Ziegenkäse", BriochemitZiegenkäse));
        listeSnack.add(new Hauptspeiße("Focaccia mit Oliven", FocacciamitOliven));
        listeSnack.add(new Hauptspeiße("Sauerteigbrot mit Avocado", SauerteigbrotmitAvocado));
        listeSnack.add(new Hauptspeiße("Kaviarschnittchen", Kaviarschnittchen));
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

        SnackChill.setName("Snack & Chill");
        SnackChill.website = "www.snackandchill.de";
        SnackChill.beschreibung = "Kreative Snacks und Fingerfood für jeden Anlass – frisch zubereitet und zum Mitnehmen.";
        SnackChill.telefonnummer = "030 123456";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            SnackChill.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(22, 0));
        }




    }

}
