
public class MessBereich {

	private double min;
	private double max;
	private double critical;
	
	MessBereich(double min, double max, double critical) {
		this.min = min;
		this.max = max;
		this.critical = critical;
	}
	
	void pruefen(double wert)throws CriticalValue, IllegalValue{
		if (wert < min || wert > max) {
			throw new IllegalValue();
		}
		if (wert >= critical) {
			throw new CriticalValue();
		}
	}
}
