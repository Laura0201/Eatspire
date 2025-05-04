/**
 * Klasse initialisieren der Daten, basically die "Datenbank",
 * immer nur EINE erstellen, passiert Automatisch über Model/Controller/ MVC
 * @author Julius
 * @version 1.0
 */
package BusinessLogik.Data;

import static BusinessLogik.Nahrung.EssenTypen.COCKTAIL;
import static BusinessLogik.Nahrung.EssenTypen.LIMO;

import java.util.ArrayList;

import BusinessLogik.EssensOrte.Restaurant;
import BusinessLogik.Nahrung.BasisEssen;
import BusinessLogik.Nahrung.Hauptspeiße;
import BusinessLogik.Nahrung.Kaltgetränk;
import BusinessLogik.Nahrung.Zutat;

//import com.google.gson.*;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
public class DataManager {

    public DataManager() {
        initGerichteAlsZutatenArrays();
    }

    public void initGerichteAlsZutatenArrays() {
        Zutat limette = new Zutat("Limette", 2.00);
        Zutat zucker = new Zutat("Zucker", 0.25);
        Zutat orange = new Zutat("Orange", 1.50);
        Zutat minze = new Zutat("Minze", 0.75);
        Zutat wasser = new Zutat("Wasser", 0.10);
        Zutat eis = new Zutat("Eis", 0.50);

        Zutat[] zutatenCaipirinha = {limette, zucker};
        Zutat[] zutatenOrangenlimo = {orange, minze, wasser, eis};
        Zutat[] LachsfiletmitSpargel = {
                new Zutat("Spargel weiß", 3.9),
                new Zutat("Lachsfilet", 2.37),
                new Zutat("Meersalz", 2.14),
                new Zutat("Spaghetti", 4.2)
        };
        Zutat[] VegetarischeLasagne = new Zutat[]{
                new Zutat("Kardamom", 2.67),
                new Zutat("Lasagneblätter", 3.57),
                new Zutat("Estragon", 0.82),
                new Zutat("Tomaten", 3.3),
                new Zutat("Knoblauch", 4.2),
                new Zutat("Trüffel", 2.46)
        };
        Restaurant dönerdeluxe = new Restaurant();
        ArrayList<BasisEssen> listeDönerDeluxe= new ArrayList<BasisEssen>();
        Hauptspeiße VegetarischeLasagneEssen = new Hauptspeiße("Vegetarische Lasagne", VegetarischeLasagne);
        listeDönerDeluxe.add(VegetarischeLasagneEssen);
        dönerdeluxe.setEssenListe(listeDönerDeluxe);
        Zutat[] Trüffelrisotto = {
                new Zutat("Zutat117", 3.95),
                new Zutat("Kerbel", 4.14),
                new Zutat("Blauschimmelkäse", 3.53),
                new Zutat("Olivenöl extra vergine", 1.9),
                new Zutat("Kapern", 2.07),
                new Zutat("Butterschmalz", 0.51)
        };

        Zutat[] PilzGnocchi = {
                new Zutat("Dill", 2.39),
                new Zutat("Steinpilze", 0.78),
                new Zutat("Blauschimmelkäse", 1.1),
                new Zutat("Gnocchi", 4.78)
        };

        Zutat[] HähnchenbrustmitSelleriepüree = {
                new Zutat("Hähnchenbrust", 0.79),
                new Zutat("Zutat114", 4.94),
                new Zutat("Kerbel", 1.68),
                new Zutat("Zutat118", 4.53),
                new Zutat("Selleriepüree", 3.2)
        };
        Zutat[] RinderfiletmitRotweinreduktion = {
                new Zutat("Rinderfilet", 3.81),
                new Zutat("Knoblauch", 3.38),
                new Zutat("Thymian", 2.1),
                new Zutat("Butter", 1.63)
        };

        Zutat[] LammkarreemitKräuterkruste = {
                new Zutat("Lammkarree", 3.12),
                new Zutat("Rosmarin", 1.19),
                new Zutat("Schnittlauch", 1.58),
                new Zutat("Pfeffer schwarz", 4.86)
        };

        Zutat[] ZanderfiletaufsGemüsebeet = {
                new Zutat("Zander", 1.03),
                new Zutat("Mangold", 4.84),
                new Zutat("Chicorée", 3.04),
                new Zutat("Schmand", 0.9),
                new Zutat("Basilikum", 2.8)
        };

        Zutat[] JakobsmuschelnmitSafransauce = {
                new Zutat("Jakobsmuschel", 1.48),
                new Zutat("Sahne", 1.67),
                new Zutat("Zutat118", 1.3),
                new Zutat("Kapern", 2.94)
        };

        Zutat[] ThunfischtatarmitAvocado = {
                new Zutat("Thunfischsteak", 2.69),
                new Zutat("Avocado", 2.12),
                new Zutat("Zitronenzeste", 3.7),
                new Zutat("Sesamöl", 0.61)
        };

        Zutat[] EntenbrustaufOrangenspiegel = {
                new Zutat("Entenbrust", 4.31),
                new Zutat("Orangenzeste", 2.43),
                new Zutat("Honig", 1.58),
                new Zutat("Zimtstange", 1.87)
        };

        Zutat[] SushiVariation = {
                new Zutat("Sushi-Reis", 3.88),
                new Zutat("Wasabi", 2.09),
                new Zutat("Nori", 1.48),
                new Zutat("Lachsfilet", 2.79),
                new Zutat("Sojasauce", 1.37)
        };

        Zutat[] PastamitMeeresfrüchten = {
                new Zutat("Spaghetti", 0.83),
                new Zutat("Garnelen", 3.25),
                new Zutat("Oktopus", 3.86),
                new Zutat("Olivenöl extra vergine", 1.77),
                new Zutat("Knoblauch", 2.34)
        };

        Zutat[] TortellinimitRicottaundSpinat = {
                new Zutat("Tortellini", 2.59),
                new Zutat("Ricotta", 2.45),
                new Zutat("Babyspinat", 1.92),
                new Zutat("Muskatnuss", 0.74)
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

        Zutat[] Garnelenpfanneasiatisch = {
                new Zutat("Garnelen", 4.1),
                new Zutat("Zitronengras", 2.49),
                new Zutat("Sojasauce", 1.92),
                new Zutat("Chili", 0.94)
        };

        Zutat[] RavioliinSalbeibutter = {
                new Zutat("Ravioli", 3.47),
                new Zutat("Butter", 2.63),
                new Zutat("Salbei", 1.35)
        };

        Zutat[] QuinoaBowlvegan = {
                new Zutat("Quinoa", 2.97),
                new Zutat("Avocado", 3.15),
                new Zutat("Kichererbsen", 1.53),
                new Zutat("Feldsalat", 2.24),
                new Zutat("Limette", 0.8)
        };

        Zutat[] FocacciamitOliven = {
                new Zutat("Focaccia", 2.43),
                new Zutat("Oliven schwarz", 1.26),
                new Zutat("Rosmarin", 0.85),
                new Zutat("Meersalz", 0.73)
        };
        Zutat[] Steinpilzrisotto = {
                new Zutat("Steinpilze", 3.72),
                new Zutat("Risottoreis", 2.61),
                new Zutat("Parmesan", 2.89),
                new Zutat("Butter", 1.25)
        };

        Zutat[] ZiegenkäseimSpeckmantel = {
                new Zutat("Ziegenkäse", 2.33),
                new Zutat("Frühstücksspeck", 1.98),
                new Zutat("Honig", 1.56),
                new Zutat("Thymian", 0.67)
        };

        Zutat[] AusternaufEis = {
                new Zutat("Austern", 4.67),
                new Zutat("Limette", 0.94),
                new Zutat("Eiswürfel", 0.50),
                new Zutat("Meersalz", 0.74)
        };

        Zutat[] HummerThermidor = {
                new Zutat("Hummer", 5.0),
                new Zutat("Sahne", 1.72),
                new Zutat("Senf", 0.84),
                new Zutat("Cognac", 2.33)
        };

        Zutat[] OktopusCarpaccio = {
                new Zutat("Oktopus", 4.22),
                new Zutat("Olivenöl extra vergine", 1.95),
                new Zutat("Zitrone", 0.89),
                new Zutat("Pfeffer weiß", 1.11)
        };

        Zutat[] Linsensalatorientalisch = {
                new Zutat("Rote Linsen", 1.76),
                new Zutat("Kreuzkümmel", 0.93),
                new Zutat("Koriander", 0.77),
                new Zutat("Zitrone", 1.22),
                new Zutat("Olivenöl", 1.45)
        };

        Zutat[] RoteBeeteCarpaccio = {
                new Zutat("Rote Beete", 1.34),
                new Zutat("Feta", 2.08),
                new Zutat("Walnüsse", 2.42),
                new Zutat("Balsamico", 1.10)
        };

        Zutat[] KürbissuppemitIngwer = {
                new Zutat("Hokkaido", 1.97),
                new Zutat("Ingwer", 0.84),
                new Zutat("Kokosmilch", 2.01),
                new Zutat("Muskatnuss", 0.73)
        };

        Zutat[] BriochemitZiegenkäse = {
                new Zutat("Brioche", 1.66),
                new Zutat("Ziegenkäse", 2.35),
                new Zutat("Feigen", 2.89),
                new Zutat("Rucola", 1.54)
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

        Zutat[] ChicoréeSalat = {
                new Zutat("Chicorée", 1.42),
                new Zutat("Orange", 1.18),
                new Zutat("Walnüsse", 2.05),
                new Zutat("Joghurt", 0.97)
        };

        Zutat[] ZitronenhähnchenmitRosmarinkartoffeln = {
                new Zutat("Hähnchenschenkel", 2.77),
                new Zutat("Zitrone", 0.88),
                new Zutat("Rosmarin", 0.69),
                new Zutat("Kartoffeln", 1.35)
        };

        Zutat[] KalbsrückeninSenfkruste = {
                new Zutat("Kalbsrücken", 3.84),
                new Zutat("Senf", 1.05),
                new Zutat("Paniermehl", 0.87),
                new Zutat("Estragon", 0.78)
        };

        Zutat[] GnocchimitBlauschimmelkäse = {
                new Zutat("Gnocchi", 2.24),
                new Zutat("Blauschimmelkäse", 2.98),
                new Zutat("Sahne", 1.47),
                new Zutat("Pfeffer", 0.61)
        };

        Zutat[] JakobsmuschelRisotto = {
                new Zutat("Jakobsmuschel", 3.74),
                new Zutat("Risottoreis", 2.66),
                new Zutat("Weißwein", 2.55),
                new Zutat("Parmesan", 1.69)
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

        Zutat[] SpaghettiBolognese = {
                new Zutat("Spaghetti", 1.1),
                new Zutat("Hackfleisch", 2.3),
                new Zutat("Tomaten", 0.92),
                new Zutat("Oregano", 0.44)
        };

        Zutat[] PenneArrabbiata = {
                new Zutat("Penne", 1.15),
                new Zutat("Chili", 0.64),
                new Zutat("Knoblauch", 0.42),
                new Zutat("Tomaten", 1.05)
        };

        Zutat[] Rindergulasch = {
                new Zutat("Rindfleisch", 3.72),
                new Zutat("Paprika", 0.97),
                new Zutat("Zwiebel", 0.33),
                new Zutat("Lorbeerblatt", 0.31)
        };

        Zutat[] TafelspitzmitMeerrettich = {
                new Zutat("Tafelspitz", 4.33),
                new Zutat("Meerrettich", 0.98),
                new Zutat("Karotten", 0.67),
                new Zutat("Sellerie", 0.84)
        };

        Zutat[] SchweinshaxemitKrautsalat = {
                new Zutat("Schweinshaxe", 4.12),
                new Zutat("Krautsalat", 1.55),
                new Zutat("Senf", 0.64),
                new Zutat("Kartoffeln", 1.02)
        };

        Zutat[] PutengeschnetzeltesmitReis = {
                new Zutat("Putenbrust", 2.45),
                new Zutat("Reis", 1.05),
                new Zutat("Paprika", 0.88),
                new Zutat("Sahne", 0.92)
        };

        Zutat[] RehbratenmitPreiselbeeren = {
                new Zutat("Rehbraten", 4.88),
                new Zutat("Preiselbeeren", 1.33),
                new Zutat("Rotkohl", 1.14),
                new Zutat("Semmelknödel", 1.95)
        };

        Zutat[] EntenkeulemitBlaukraut = {
                new Zutat("Entenkeule", 3.79),
                new Zutat("Blaukraut", 1.11),
                new Zutat("Apfel", 0.77),
                new Zutat("Rotwein", 1.55)
        };

        Zutat[] GebrateneLebermitZwiebeln = {
                new Zutat("Leber", 2.15),
                new Zutat("Zwiebel", 0.28),
                new Zutat("Butter", 1.07),
                new Zutat("Petersilie", 0.63)
        };

        Zutat[] FischfiletmitRemoulade = {
                new Zutat("Seelachsfilet", 2.62),
                new Zutat("Remoulade", 1.14),
                new Zutat("Salzkartoffeln", 1.26),
                new Zutat("Zitrone", 0.73)
        };

        Zutat[] Kartoffelsuppe = {
                new Zutat("Kartoffeln", 1.09),
                new Zutat("Porree", 0.88),
                new Zutat("Karotten", 0.67),
                new Zutat("Petersilie", 0.51)
        };

        Zutat[] ErbsensuppemitWurst = {
                new Zutat("Erbsen", 1.42),
                new Zutat("Wiener Würstchen", 1.76),
                new Zutat("Karotten", 0.83),
                new Zutat("Sellerie", 0.92)
        };

        Zutat[] Zucchiniauflauf = {
                new Zutat("Zucchini", 1.04),
                new Zutat("Hackfleisch", 2.26),
                new Zutat("Tomatensauce", 0.98),
                new Zutat("Käse", 1.67)
        };

        Zutat[] Blumenkohlgratin = {
                new Zutat("Blumenkohl", 1.55),
                new Zutat("Sahne", 0.88),
                new Zutat("Käse", 1.42),
                new Zutat("Muskatnuss", 0.41)
        };

        Zutat[] SpinatmitSpiegelei = {
                new Zutat("Rahmspinat", 1.22),
                new Zutat("Ei", 0.33),
                new Zutat("Kartoffeln", 1.07),
                new Zutat("Butter", 0.67)
        };
        Zutat[] Ratatouille = {
                new Zutat("Zucchini", 1.02),
                new Zutat("Aubergine", 1.18),
                new Zutat("Paprika", 0.99),
                new Zutat("Tomaten", 1.07)
        };

        Zutat[] QuicheLorraine = {
                new Zutat("Blätterteig", 1.45),
                new Zutat("Speck", 1.66),
                new Zutat("Eier", 0.89),
                new Zutat("Sahne", 1.11)
        };

        Zutat[] Moussaka = {
                new Zutat("Hackfleisch", 2.28),
                new Zutat("Aubergine", 1.13),
                new Zutat("Tomatensauce", 1.01),
                new Zutat("Béchamel", 1.32)
        };

        Zutat[] FalafelmitHummus = {
                new Zutat("Kichererbsen", 1.08),
                new Zutat("Kreuzkümmel", 0.66),
                new Zutat("Tahini", 1.25),
                new Zutat("Petersilie", 0.55)
        };

        Zutat[] CouscousSalat = {
                new Zutat("Couscous", 1.12),
                new Zutat("Gurke", 0.79),
                new Zutat("Paprika", 0.92),
                new Zutat("Minze", 0.57)
        };

        Zutat[] Paella = {
                new Zutat("Paellareis", 1.67),
                new Zutat("Meeresfrüchte", 3.44),
                new Zutat("Safran", 1.99),
                new Zutat("Paprika", 0.91)
        };

        Zutat[] ThaiCurry = {
                new Zutat("Kokosmilch", 1.55),
                new Zutat("Currypaste", 1.33),
                new Zutat("Hähnchen", 2.19),
                new Zutat("Bambus", 0.98)
        };

        Zutat[] PhoBo = {
                new Zutat("Reisnudeln", 1.22),
                new Zutat("Rindfleisch", 2.88),
                new Zutat("Sojasprossen", 0.66),
                new Zutat("Koriander", 0.55)
        };

        Zutat[] Bibimbap = {
                new Zutat("Reis", 1.14),
                new Zutat("Rindfleisch", 2.72),
                new Zutat("Spinat", 0.84),
                new Zutat("Gochujang", 1.47)
        };

        Zutat[] SushiMaki = {
                new Zutat("Sushireis", 1.45),
                new Zutat("Nori", 1.22),
                new Zutat("Lachs", 2.94),
                new Zutat("Gurke", 0.88)
        };

        Zutat[] Burrito = {
                new Zutat("Weizentortilla", 1.19),
                new Zutat("Bohnen", 1.02),
                new Zutat("Rindfleisch", 2.55),
                new Zutat("Käse", 1.24)
        };

        Zutat[] Tacos = {
                new Zutat("Maistortillas", 1.33),
                new Zutat("Pulled Pork", 2.77),
                new Zutat("Salsa", 0.91),
                new Zutat("Avocado", 1.38)
        };

        Zutat[] ChiliConCarne = {
                new Zutat("Hackfleisch", 2.11),
                new Zutat("Kidneybohnen", 1.02),
                new Zutat("Tomaten", 0.98),
                new Zutat("Mais", 0.82)
        };

        Zutat[] Ramen = {
                new Zutat("Ramen-Nudeln", 1.32),
                new Zutat("Schweinebauch", 2.65),
                new Zutat("Sojasauce", 0.78),
                new Zutat("Ei", 0.44)
        };

        Zutat[] Enchiladas = {
                new Zutat("Tortillas", 1.25),
                new Zutat("Hähnchen", 2.05),
                new Zutat("Käse", 1.55),
                new Zutat("Tomatensauce", 0.89)
        };

        Zutat[] Gulaschsuppe = {
                new Zutat("Rindfleisch", 2.72),
                new Zutat("Paprika", 0.93),
                new Zutat("Zwiebeln", 0.41),
                new Zutat("Tomatenmark", 0.77)
        };

        Zutat[] Labskaus = {
                new Zutat("Corned Beef", 2.88),
                new Zutat("Kartoffeln", 1.02),
                new Zutat("Rote Beete", 0.94),
                new Zutat("Rollmops", 1.29)
        };

        Zutat[] KönigsbergerKlopse = {
                new Zutat("Hackfleisch", 2.42),
                new Zutat("Kapern", 0.97),
                new Zutat("Sahnesauce", 1.11),
                new Zutat("Kartoffeln", 1.13)
        };

        Zutat[] PastaPesto = {
                new Zutat("Pasta", 1.25),
                new Zutat("Basilikumpesto", 1.88),
                new Zutat("Pinienkerne", 2.15),
                new Zutat("Parmesan", 1.66)
        };

        Zutat[] Käsespätzle = {
                new Zutat("Spätzle", 1.39),
                new Zutat("Käse", 1.72),
                new Zutat("Röstzwiebeln", 0.95),
                new Zutat("Butter", 0.87)
        };
        Zutat[] Lasagne = {
                new Zutat("Lasagneplatten", 1.34),
                new Zutat("Hackfleisch", 2.45),
                new Zutat("Tomatensauce", 1.12),
                new Zutat("Béchamel", 1.20)
        };

        Zutat[] RöstiMitSpiegelei = {
                new Zutat("Kartoffeln", 1.08),
                new Zutat("Ei", 0.36),
                new Zutat("Butter", 0.65),
                new Zutat("Salz", 0.15)
        };

        Zutat[] Shakshuka = {
                new Zutat("Tomaten", 1.15),
                new Zutat("Paprika", 0.95),
                new Zutat("Ei", 0.37),
                new Zutat("Kreuzkümmel", 0.44)
        };

        Zutat[] Linsensuppe = {
                new Zutat("Linsen", 1.18),
                new Zutat("Karotten", 0.52),
                new Zutat("Sellerie", 0.66),
                new Zutat("Wiener Würstchen", 1.72)
        };

        Zutat[] SemmelknödelMitPilzrahm = {
                new Zutat("Semmelknödel", 1.46),
                new Zutat("Champignons", 1.09),
                new Zutat("Sahne", 0.89),
                new Zutat("Petersilie", 0.48)
        };

        Zutat[] ReisPfanneAsia = {
                new Zutat("Reis", 1.04),
                new Zutat("Gemüse-Mix", 1.27),
                new Zutat("Sojasauce", 0.79),
                new Zutat("Hähnchen", 2.12)
        };

        Zutat[] BrokkoliAuflauf = {
                new Zutat("Brokkoli", 1.21),
                new Zutat("Sahne", 0.95),
                new Zutat("Käse", 1.45),
                new Zutat("Kartoffeln", 1.02)
        };

        Zutat[] GyrosMitZaziki = {
                new Zutat("Schweinefleisch", 2.38),
                new Zutat("Zaziki", 1.15),
                new Zutat("Zwiebeln", 0.29),
                new Zutat("Reis", 1.00)
        };

        Zutat[] FrikadellenMitKartoffelsalat = {
                new Zutat("Hackfleisch", 2.25),
                new Zutat("Kartoffelsalat", 1.33),
                new Zutat("Senf", 0.45),
                new Zutat("Zwiebel", 0.34)
        };

        Zutat[] SüßSaureEier = {
                new Zutat("Eier", 0.76),
                new Zutat("Essig", 0.38),
                new Zutat("Zucker", 0.24),
                new Zutat("Mehl", 0.42)
        };

        Zutat[] PellkartoffelnMitQuark = {
                new Zutat("Kartoffeln", 1.12),
                new Zutat("Quark", 1.06),
                new Zutat("Schnittlauch", 0.49),
                new Zutat("Butter", 0.62)
        };

        Zutat[] AuberginenCurry = {
                new Zutat("Aubergine", 1.16),
                new Zutat("Kokosmilch", 1.47),
                new Zutat("Currypaste", 1.22),
                new Zutat("Tomaten", 0.89)
        };

        Zutat[] BratwurstMitSauerkraut = {
                new Zutat("Bratwurst", 2.35),
                new Zutat("Sauerkraut", 1.18),
                new Zutat("Kartoffeln", 0.98),
                new Zutat("Senf", 0.56)
        };

        Zutat[] SpaghettiCarbonara = {
                new Zutat("Spaghetti", 1.08),
                new Zutat("Speck", 1.67),
                new Zutat("Ei", 0.37),
                new Zutat("Parmesan", 1.72)
        };

        Zutat[] Kartoffelgratin = {
                new Zutat("Kartoffeln", 1.16),
                new Zutat("Sahne", 0.94),
                new Zutat("Knoblauch", 0.31),
                new Zutat("Käse", 1.40)
        };

        Zutat[] ZanderfiletMitGemüse = {
                new Zutat("Zanderfilet", 3.75),
                new Zutat("Karotten", 0.57),
                new Zutat("Zucchini", 0.88),
                new Zutat("Butter", 0.64)
        };

        Zutat[] RöstiMitLachs = {
                new Zutat("Rösti", 1.49),
                new Zutat("Räucherlachs", 2.94),
                new Zutat("Sauerrahm", 1.07),
                new Zutat("Dill", 0.39)
        };

        Zutat[] Kürbissuppe = {
                new Zutat("Kürbis", 1.26),
                new Zutat("Ingwer", 0.62),
                new Zutat("Zwiebel", 0.33),
                new Zutat("Kokosmilch", 1.21)
        };

        Zutat[] LauchQuiche = {
                new Zutat("Lauch", 1.03),
                new Zutat("Blätterteig", 1.41),
                new Zutat("Sahne", 0.91),
                new Zutat("Ei", 0.34)
        };

        Zutat[] PizzaMargherita = {
                new Zutat("Pizzateig", 1.18),
                new Zutat("Tomatensauce", 0.92),
                new Zutat("Mozzarella", 1.57),
                new Zutat("Basilikum", 0.43)
        };

        Kaltgetränk orangenlimo = new Kaltgetränk("Orangenlimo", 4.5, zutatenOrangenlimo,  0.4, false);
        Kaltgetränk caipirinha = new Kaltgetränk("Caipirinha", 11, zutatenCaipirinha, 0.4, true);

    }

}
