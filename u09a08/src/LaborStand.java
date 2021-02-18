import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class LaborStand {

	public static void main(String[] args) {
		
		int maxAnzahlDatensaetze = Integer.parseInt(args[0]);
		MessReihe messReihe = new MessReihe(maxAnzahlDatensaetze);
		Scanner sc = null;
		
		try {
			sc = new Scanner(new File(args[1]));
			while(sc.hasNext()){
			   	try{
			  		messReihe.neueMessung(sc.nextInt(),sc.nextDouble(),sc.nextDouble());
			   	}catch (TooMuchData e) {
			   		System.out.println("Fehler: Mehr Werte als erwatet! Wahrscheinlich ein Comma falsch platziert.");
			   	}catch (IllegalValue e) {
			   		System.out.println("Fehler: Wert aushalb des Messbereichs! System auf Fehler prüfen.");
			   	}catch (CriticalValue e) {
			   		System.out.println("Fehler: Kritischer Wert erreicht!");
			   		System.exit(1);
			   	}
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fehler: Keine Datei gefunden! Gib vielleicht vorher mal die Anzahl der Werte an.");
			System.exit(1);
		} catch (NumberFormatException e) {
			System.out.println("Fehler: Bitte nur Zahlen angeben!");
		} catch (Exception e) {
			System.out.println("Fehler: Das ist ein Spezialfall selbst für Java!");
		}
		
		sc.close();
		
		double [] mittelwerte = messReihe.ermittleMittelwerte();
		System.out.println("Durchschnitt von Umdrehungszahl: "+ mittelwerte[0]);
		System.out.println("Durchschnitt von Temperatur: "+ mittelwerte[1]);
		System.out.println("Durchschnitt von Ladedruck: "+ mittelwerte[2]);

	}

}
