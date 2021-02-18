
public class Vertauschen {

	public static void main(String[] args) {
	}
	
	public static String[] vertauscheInhalt(String[] s) {	
		String[] temp = new String[s.length];
		for (int i=s.length; i>0; i--) {
			temp[s.length-i] = s[i-1] + "";
		}
		return temp;
	}
	
	public static String[] vertauscheReferenz(String[] s) {
		String[] temp = new String[s.length];
		for (int i=s.length; i>0; i--) {
			temp[s.length-i] = s[i-1];
		}
		return temp;
	}
	
	public static boolean testInhaltGleich(String[] arg1, String[] arg2) {
		for (int i=0; i<arg1.length; i++) {
			if (!arg1[i].equals(arg2[i])) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean testReferenzGleich(String[] arg1, String[] arg2) {
		for (int i=0; i<arg1.length; i++) {
			if (arg1[i] != arg2[i]) {
				return false;
			}
		}
		return true;
	}

}