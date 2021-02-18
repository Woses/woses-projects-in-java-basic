
public class TestKlasse2{
	public static int nu = 0;
	public static void main(String[]args){
		System.out.println(gibZahl(4711));
	     
	}
	//in dieser Methode duerfen Sie Ergaenzungen vornehmen
	/*
	 * 	public static String gibZahl(int wert){
	 * 		ZahlKlasse z = new ZahlKlasse(wert);
	 * 		return  z.toString();
	 * 	}
	 */	
	public static String gibZahl(int wert) {
		nu += nu;
	    Zahlklasse z = new Zahlklasse(wert) {
	        public String toString() {
	            return "" + (nu+2*getZahl());
	        }
	    };
	    return  z.toString();
	}
	
	
		
}
