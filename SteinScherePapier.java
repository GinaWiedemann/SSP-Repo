package Stein_Schere_Papier;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Diese Klasse realisiert ein Stein-Schere-Papier Spiel. Das klassische Spiel wurde um ein weiteres Symbol ergaenzt und folgt den Standardregeln. 
 * Der Benutzer waehlt ueber die Konsole eines der vier Symbole. Gespielt wird gegen den Computer,
 * fuer diesen wird ein Symbol automatisch festgelegt. Der Gewinner des Matches
 * wird ermittelt und auf der Konsole ausgegeben.
 * Beim Erzeugen eines Objektes wird die Anzahl der Matches oder Runden
 * festgelegt.
 *
 * @author Gina-Marie Wiedemann (s87521@bht-berlin.de)
 * @version 11.0.12, 20.06.2024
 *
 */

public class SteinScherePapier {
	// alle SteinScherePapier Objekte teilen diese 3 Attribute
	private static final int STEIN = 1;
	private static final int SCHERE = 2;
	private static final int PAPIER = 3;
	private static final int BRUNNEN = 4;

	private int anzahlRunden;

	private static Scanner sc = new Scanner(System.in);
  
	/**
	 * Erzeugt ein SteinScherePapier-Objekt, das einem Mensch gegen dem Computer
	 * anzahlRunden Mal zu spielen.
	 *
	 * @param anzahlRunden
	 *            Anzahl der Runden die Mensch und Computer spielen
	 */
	public SteinScherePapier(int anzahlRunden) {
		this.anzahlRunden = anzahlRunden;
	}

	/**
	 * Diese Methode ermittelt den Gewinner anhand der Symbol-Auswahl des Benutzers und des Computers. 
	 * Haben beide das gleiche Symbol gewaehlt, so wird "Unentschieden" ausgegeben. 
	 * Schlaegt der Computer den Benutzer, wird "Sie haben leider verloren!" ausgegeben. 
	 * Hat der Benutzer den Computer geschlagen, wird entsprechend "Herzlichen Glueckwunsch! Sie haben gewonnen!" ausgegeben.
	 *
	 * @param benutzerAuswahl		numerischer Wert der Auswahl des Benutzers bspw. 1 fuer Stein
	 * @param computerAuswahl		numerischer Wert der Auswahl des Computers bspw. 2 fuer Schere
	 */
	
	private void gewinnerErmitteln(int benutzerAuswahl, int computerAuswahl) {
		String auswahl = benutzerAuswahl+","+computerAuswahl;
		switch (auswahl) {
			case "1,1":
			case "2,2":
			case "3,3":
			case "4,4": System.out.println("Unentschieden"); break;
			case "1,2":
			case "2,3":
			case "3,1":
			case "3,4":
			case "4,1":
			case "4,2": System.out.println("Herzlichen Glueckwunsch! Sie haben gewonnen!"); break;
			case "1,3":
			case "1,4":
			case "2,1":
			case "2,4":
			case "3,2": 
			case "4,3": System.out.println("Sie haben leider verloren!"); break;
			default: System.out.println("Eingabe muss 1, 2 oder 3 sein. Bitte versuchen Sie es erneut!"); break;
		}
	}

	/**
	 * Startet das SteinScherePapier Spiel. Die Anzahl der Runden die gespielt werden, ist ueber ein Konstruktor-Argument festgelegt. 
	 * Der Benutzer wird um eine Auswahl gebeten. Danach wird ueber einen Zufallszahlen-Generator eine Auswahl fuer den Computer bestimmt. 
	 * Ein Aufruf von gewinnerErmitteln(int benutzerAuswahl, int computerAuswahl) bestimmt, wer die jeweilige Runde gewonnen hat.
	 */
	private void start() {
		int gespielteRunden = 0;
		while (gespielteRunden < anzahlRunden) {

			// Auswahl des Benutzers
			int benutzerAuswahl = intGanzzahl("\nBitte waehlen Sie Stein(1), Schere(2), Papier(3), Brunnen(4): ");

			// Auswahl des Computers
			int computerAuswahl = new Random().nextInt(4) + 1;

			// Ausgabe der gewahlten Symbole
			System.out.println("\nIhre Auswahl: " + auswahlErmitteln(benutzerAuswahl));
			System.out.println("Computer Auswahl: " + auswahlErmitteln(computerAuswahl));

			// Ermittlung des Gewinners
			gewinnerErmitteln(benutzerAuswahl, computerAuswahl);

			System.out.println("\n--------------------------------------------------");

			// Inkrementieren des Zaehlers fuer die Rundenanzahl
			gespielteRunden++;
		}
	}

	/**
	 * Ermittelt die Auswahl des jeweiligen Symbols anhand des Wertes des Symbols.
	 *
	 * @param auswahl	numerischer Wert der jeweiligen Auswahl bspw. 1
	 * @return Beschreibung der jeweiligen Auswahl bspw. Stein (1)
	 */
	private String auswahlErmitteln(int auswahl) {
		if (auswahl == STEIN) {
			return "Stein (1)";
		} 
		else if (auswahl == SCHERE) {
			return "Schere (2)";
		} 
		else if (auswahl == PAPIER) {
			return "Papier (3)";
		}
		else if (auswahl == BRUNNEN) {
			return "Brunnen (4)";
		}
		else {
			return "Ungueltige Auswahl (" + auswahl + ")";
		}
	}

	// Start des Spiels
	public static void main(String[] args) {
		SteinScherePapier steinScherePapier = new SteinScherePapier(4);
		steinScherePapier.start();
	}

}
