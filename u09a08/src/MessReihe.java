
public class MessReihe {
	private MessDatum[] messWerte;
	private static MessBereich umdrehungsMessBereich = new MessBereich( 0, 12000, 8000);
	private MessBereich oeltemperaturMessBereich = new MessBereich(0, 200, 150);
	private MessBereich ladedruckMessBereich = new MessBereich(0, 6, 5);
	private int counter = 0;
	
	public MessReihe(int n) {
		messWerte = new MessDatum[n];
	}
	
	void neueMessung(int u, double t, double d) throws CriticalValue, IllegalValue, TooMuchData{
		if (counter < messWerte.length) {
			umdrehungsMessBereich.pruefen(u);
			oeltemperaturMessBereich.pruefen(t);
			ladedruckMessBereich.pruefen(d);
			messWerte[counter] = new MessDatum( u, t, d);
			counter++;
		} else {
			throw new TooMuchData();
		}
	}
	
	double[] ermittleMittelwerte(){
		double mittelwertUmdrehung = 0;
		double mittelwertOeltemperatur = 0;
		double mittelwertLadedruck = 0;
		for (int i = 0; i < counter; i++) {
			mittelwertUmdrehung += messWerte[i].getUmdrehungszahl();
			mittelwertOeltemperatur += messWerte[i].getOeltemperatur();
			mittelwertLadedruck += messWerte[i].getLadedruck();
		}
		
		return new double[] {
				mittelwertUmdrehung/counter,
				mittelwertOeltemperatur/counter,
				mittelwertLadedruck/counter
		};
		
	}
	
}
