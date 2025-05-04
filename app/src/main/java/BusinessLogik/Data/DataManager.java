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
import BusinessLogik.Nahrung.Hauptspeiße;
import BusinessLogik.Nahrung.Heißgetränk;
import BusinessLogik.Nahrung.Kaltgetränk;
import BusinessLogik.Nahrung.Vorspeise;
import BusinessLogik.Nahrung.Zutat;
public class DataManager {
    public DataManager() {
        initGerichteAlsZutatenArrays();
    }
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

        BellaNapoli.setKaltgetränkeListe(drinksBellaNapoli);
        BellaNapoli.setHeißgetränkeListe(hotDrinksBellaNapoli);
        listeBellaNapoliHauptspeisen.add(VegetarischeLasagneEssen);
        BellaNapoli.setHauptspeisenListe(listeBellaNapoliHauptspeisen);
        BellaNapoli.setVorspeisenListe(listeBellaNapoliVorspeisen);
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
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Ratatouille", Ratatouille));
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Quiche Lorraine", QuicheLorraine));
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Bouillabaisse", Bouillabaisse));
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Coq au Vin", CoqAuVin));
        listeLaProvenceHauptspeisen.add(new Hauptspeiße("Tarte Tatin", TarteTatin));
        LaProvence.setHauptspeisenListe(listeLaProvenceHauptspeisen);
        //Liste der Hauptspeisen übertragen

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
        Restaurant BarLounge1 = new Restaurant(Kategorien.SPIRITUOSEN, false);
        ArrayList<Kaltgetränk> drinksBarLounge1 = new ArrayList<>();

        drinksBarLounge1.add(new Kaltgetränk("Mojito", Mojito , true));
        drinksBarLounge1.add(new Kaltgetränk("Tequila Sunrise", TequilaSunrise, true));
        drinksBarLounge1.add(new Kaltgetränk("Whiskey Sour", WhiskeySour, true));
        drinksBarLounge1.add(new Kaltgetränk("Pina Colada", PinaColada,true));
        drinksBarLounge1.add(new Kaltgetränk("Blue Lagoon", BlueLagoon,true));
        drinksBarLounge1.add(new Kaltgetränk("Gin Tonic", GinTonic,true));
        drinksBarLounge1.add(new Kaltgetränk("Espresso Martini", EspressoMartini,true));

        BarLounge1.setKaltgetränkeListe(drinksBarLounge1);
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

        // Kaltgetränke für "SnackHaus 1"
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

        speisenSnackHaus1.add(new Hauptspeiße("Schinken Baguette", SchinkenBaguette));
        speisenSnackHaus1.add(new Hauptspeiße("Chicken Wrap", ChickenWrap));
        speisenSnackHaus1.add(new Hauptspeiße("Veggie Toast", VeggieToast));
        speisenSnackHaus1.add(new Hauptspeiße("Spiegelei Sandwich", SpiegeleiSandwich));
        speisenSnackHaus1.add(new Hauptspeiße("Tuna Snack", TunaSnack));
        speisenSnackHaus1.add(new Hauptspeiße("Mozzarella Ciabatta", MozzarellaCiabatta));
        speisenSnackHaus1.add(new Hauptspeiße("Snackplatte", Snackplatte));
// Listen zum Restaurant hinzufügen
        SnackHaus1.setKaltgetränkeListe(drinksSnackHaus1);
        SnackHaus1.setHeißgetränkeListe(hotDrinksSnackHaus1);
        SnackHaus1.setHauptspeisenListe(speisenSnackHaus1);
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

        // Erstellen des Restaurants und Befüllen der Gerichte-Liste
        Restaurant TokyoZen = new Restaurant(Kategorien.ASIATISCH, true);
        ArrayList<Hauptspeiße> listeTokyoZenHauptspeisen = new ArrayList<Hauptspeiße>();
        listeTokyoZenHauptspeisen.add(SushiPlatter);
        listeTokyoZenHauptspeisen.add(GemüseTempura);
        listeTokyoZenHauptspeisen.add(MisoSuppe);

        TokyoZen.setHauptspeisenListe(listeTokyoZenHauptspeisen);
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

        Restaurant RistoranteAmore = new Restaurant(Kategorien.ITALIENISCH, true);
        ArrayList<Hauptspeiße> listeAmore = new ArrayList<>();
        listeAmore.add(new Hauptspeiße("Penne Arrabbiata", PenneArrabbiata));
        listeAmore.add(new Hauptspeiße("Caprese", Caprese));
        RistoranteAmore.setHauptspeisenListe(listeAmore);
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

        Restaurant TrattoriaRoma = new Restaurant(Kategorien.ITALIENISCH, true);
        ArrayList<Hauptspeiße> listeRoma = new ArrayList<>();
        listeRoma.add(new Hauptspeiße("Pizza Quattro Formaggi", PizzaQuattroFormaggi));
        listeRoma.add(new Hauptspeiße("Gnocchi al Pesto", GnocchiAlPesto));
        listeRoma.add(new Hauptspeiße("Pasta mit Meeresfrüchten", PastamitMeeresfrüchten));
        TrattoriaRoma.setHauptspeisenListe(listeRoma);
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

        Zutat[] Edamame = new Zutat[] {
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

        Restaurant SakuraSushi = new Restaurant(Kategorien.ASIATISCH, true);
        ArrayList<Hauptspeiße> listeSakura = new ArrayList<>();
        listeSakura.add(new Hauptspeiße("Maki mit Lachs", MakiLachs));
        listeSakura.add(new Hauptspeiße("Edamame", Edamame));
        listeSakura.add(new Hauptspeiße("Thunfischtatar mit Avocado", ThunfischtatarmitAvocado));
        listeSakura.add(new Hauptspeiße("Sushi Variation", SushiVariation));
        SakuraSushi.setHauptspeisenListe(listeSakura);
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
        Restaurant WokDynasty = new Restaurant(Kategorien.ASIATISCH, true);
        ArrayList<Hauptspeiße> listeWok = new ArrayList<>();
        listeWok.add(new Hauptspeiße("Gebratener Reis mit Gemüse", WokGemüseReis));
        listeWok.add(new Hauptspeiße("Thai-Curry mit Hähnchen", ThaiCurry));
        listeWok.add(new Hauptspeiße("Jakobsmuscheln mit Safransauce", JakobsmuschelnmitSafransauce));
        listeWok.add(new Hauptspeiße("Oktopus-Carpaccio", OktopusCarpaccio));
        WokDynasty.setHauptspeisenListe(listeWok);
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

        Restaurant BurgerFactory = new Restaurant(Kategorien.FASTFOOD, true);
        ArrayList<Hauptspeiße> listeBurger = new ArrayList<>();
        listeBurger.add(new Hauptspeiße("Cheeseburger", Cheeseburger));
        listeBurger.add(new Hauptspeiße("Veggie Burger", VeggieBurger));
        BurgerFactory.setHauptspeisenListe(listeBurger);
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

        Restaurant Frittenkoenig = new Restaurant(Kategorien.FASTFOOD, true);
        ArrayList<Hauptspeiße> listeFritten = new ArrayList<>();
        listeFritten.add(new Hauptspeiße("Currywurst mit Pommes", CurrywurstPommes));
        listeFritten.add(new Hauptspeiße("Chili Cheese Fries", ChiliCheeseFries));
        Frittenkoenig.setHauptspeisenListe(listeFritten);
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
        Restaurant Veganuss = new Restaurant(Kategorien.DEUTSCH, true);
        ArrayList<Hauptspeiße> listeVeganuss = new ArrayList<>();
        listeVeganuss.add(new Hauptspeiße("Tortellini mit Ricotta und Spinat", TortellinimitRicottaundSpinat));
        listeVeganuss.add(new Hauptspeiße("Kürbissuppe mit Ingwer", KürbissuppemitIngwer));
        listeVeganuss.add(new Hauptspeiße("Bulgur-Salat mit Kräutern", BulgurSalatmitKräutern));
        listeVeganuss.add(new Hauptspeiße("Couscous mit Gemüse", CouscousmitGemüse));
        listeVeganuss.add(new Hauptspeiße("Quinoa-Bowl vegan", QuinoaBowlvegan));
        Veganuss.setHauptspeisenListe(listeVeganuss);
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
        Restaurant SnackChill = new Restaurant(Kategorien.FASTFOOD, true);
        ArrayList<Hauptspeiße> listeSnack = new ArrayList<>();
        listeSnack.add(new Hauptspeiße("Brioche mit Ziegenkäse", BriochemitZiegenkäse));
        listeSnack.add(new Hauptspeiße("Focaccia mit Oliven", FocacciamitOliven));
        listeSnack.add(new Hauptspeiße("Sauerteigbrot mit Avocado", SauerteigbrotmitAvocado));
        listeSnack.add(new Hauptspeiße("Kaviarschnittchen", Kaviarschnittchen));
        SnackChill.setHauptspeisenListe(listeSnack);
        SnackChill.setName("Snack & Chill");
        SnackChill.website = "www.snackandchill.de";
        SnackChill.beschreibung = "Kreative Snacks und Fingerfood für jeden Anlass – frisch zubereitet und zum Mitnehmen.";
        SnackChill.telefonnummer = "030 123456";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            SnackChill.setOeffnungszeiten(LocalTime.of(10, 0), LocalTime.of(22, 0));
        }




    }

}
