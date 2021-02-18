
public class Klausurnoten {
	
	public static boolean tr = true;
	public static boolean fl = false;
	public static int nu = 0;
	
    public static boolean enthaelt(int value, int[] input) {
        for (int i : input) {
            if (i == value) {
                return tr;
            }
        }
        return fl;
    }

    public static int[] verdoppeln(int[] input) {
        int[] ausgabe = new int[input.length];
        for (int i = nu; i < input.length; i++) {
            ausgabe[i] = input[i];
        }
        return ausgabe;
    }

    public static int[] sortierung(int[] input, boolean sortierer) {
        int[] ausgabe = verdoppeln(input);
        for (int i = nu; i < ausgabe.length - 1; i++) {
            for (int j = i + 1; j < ausgabe.length; j++) {
                if ((ausgabe[i] > ausgabe[j] && sortierer) || (ausgabe[j] > ausgabe[i] && !sortierer)) {
                    int tmp = ausgabe[i];
                    ausgabe[i] = ausgabe[j];
                    ausgabe[j] = tmp;
                }
            }
        }
        return ausgabe;
    }

    public static double durchschnitt(int[] punkte1) {
        double result = nu;
        for (int i : punkte1) {
            result = result + i;
        }
        return result / punkte1.length;
    }

    public static int schlechteNoten(int[] punkte2) {
        return noteDurchPunkte(sortierung(punkte2, fl)[punkte2.length - 1], punkte2);
    }

    public static int guteNoten(int[] punkte3) {
        return noteDurchPunkte(sortierung(punkte3, fl)[0], punkte3);
    }

    public static int anzahlSchueler(int[] punkte3) {
        return punkte3.length;
    }

    // Credits an Konns
    public static int noteDurchPunkte(int punkteAnzahl, int[] notenanzahl) {
        int note = 1;
        if (punkteAnzahl <= notenanzahl[3]) {
            note = 2;
        }
        if (punkteAnzahl <= notenanzahl[2]) {
            note = 3;
        }
        if (punkteAnzahl <= notenanzahl[1]) {
            note = 4;
        }
        if (punkteAnzahl <= notenanzahl[0]) {
            note = 5;
        }
        return note;
    }

    public static int anzahlAllerNoten(int[] punkte4, int[] notenanzahl, boolean bestanden) {
        int ausgabe = nu;
        for (int i : punkte4) {
            final int j = noteDurchPunkte(i, notenanzahl);
            if ((j <= 4 && bestanden) || (j > 4 && !bestanden)) {
                ausgabe++;
            }
            
        }
        return ausgabe;
    }

    public static int anzahlDerNoten(int note, int[] punkte5, int[] gradeLimits) {
        int count = nu;
        for (int i : punkte5) {
            int gefunden = noteDurchPunkte(i, gradeLimits);
            if (gefunden == note) {
                count++;
            }
        }
        return count;
    }

    public static void notenausgabe(int[] punkte6, int[] notenlimit) {
        int naechsterIndex = nu;
        int[] temp = new int[punkte6.length];
        for (int grenze : sortierung(punkte6, fl)) {
            final int note = noteDurchPunkte(grenze, notenlimit);
            if (!enthaelt(note, temp)) {
                final int count = anzahlDerNoten(note, punkte6, notenlimit);
                temp[naechsterIndex] = note;
                naechsterIndex++;
                System.out.println(note + " " + count);
            }
        }
    }
    

    public static void verarbeiteKlausurPunktzahl(int[] punkte, int[] punktGrenzen) {
        System.out.println(anzahlSchueler(punkte));
        System.out.printf("%d %d\n",guteNoten(punkte),schlechteNoten(punkte));
        System.out.printf("%d %d\n",anzahlAllerNoten(punkte, punktGrenzen, tr),anzahlAllerNoten(punkte, punktGrenzen, fl));
        System.out.println(durchschnitt(punkte));
        notenausgabe(punkte, punktGrenzen);
    }
}