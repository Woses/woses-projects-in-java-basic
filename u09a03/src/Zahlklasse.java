
public abstract class Zahlklasse implements ZahlFunktionalitaet{
			private int zahl;
			public Zahlklasse(int zahl){
				this.zahl = zahl;
			}
		public int getZahl(){
			return zahl;
		}
		public String toString(){
			return "" + zahl;
		}
	}
