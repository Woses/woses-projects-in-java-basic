
public class MessDatum {
	private int u;
	private double t;
	private double d;
	
	public MessDatum(int umdrehungszahl, double oeltemperatur, double ladedruck){
		u = umdrehungszahl;
		t = oeltemperatur;
		d = ladedruck;
	}
	
	
	public int getUmdrehungszahl() {
		return u;
	}

	public double getOeltemperatur() {
		return t;
	}

	public double getLadedruck() {
		return d;
	}

}
