
public class Parasitenzahl {
	public static long zahl = 10;
	
    public static void main(String[] args) {
    	
        long m = Integer.parseInt(args[0]);
        parasitengedoedel(m);
    }

    public static long parasitengedoedel(long m){
        long ergebnis = 0;
        for(long i = 0; i <= m; i++){
            ergebnis = (i % zahl) * i;
            if(ergebnis == (i - (i%zahl))/zahl+(i%zahl)*laengengedoedel(i) && i > 0){
                System.out.println(i);
            }
        }
        return ergebnis;
    }

    public static long laengengedoedel(long menge){
        long ergebnis = 1;
        while(menge != 0){
            menge = menge / zahl;
            ergebnis = ergebnis * zahl;
        }
        return ergebnis/zahl;
    }
}
