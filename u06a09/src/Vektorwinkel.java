
public class Vektorwinkel {
	public static double pi = 3.14159265358979323846;

    public static double radiantenNachGrad(double eingabe) {
        return ((eingabe * 180)/ pi);
    }

    public static double skalarProdukt(double[] eins, double[] zwei) {
        if (eins.length != zwei.length) {
            return 0.0;
        }
        
        double ergebniss = 0;
        for (int i = 0; i < eins.length; i++) {
            ergebniss = ergebniss + (eins[i] * zwei[i]);
        }
        return ergebniss;
    }

    public static double leangeDesVektors(double[] input) {
        double ergebniss2 = 0;
        for (double vektor : input) {
            ergebniss2 = ergebniss2 + (vektor * vektor);
        }
        
        return Math.sqrt(ergebniss2);
    }

    public static double winkel(double[] a, double[] b) {
        return radiantenNachGrad(Math.acos(skalarProdukt(a, b) / (leangeDesVektors(a) * leangeDesVektors(b))));
    }
}