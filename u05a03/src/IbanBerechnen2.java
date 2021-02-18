/*
 * @author tmansf2s
 */

import java.util.*;

public class IbanBerechnen2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String laendercode = sc.next();
		String bankleitzahl = sc.next();
		String kontonummer = sc.next();
		String laendercodeup = laendercode.toUpperCase();

		erzeugeIban(laendercodeup, bankleitzahl, kontonummer);
		System.out.println(erzeugeIban(laendercodeup, bankleitzahl, kontonummer));
	}
	
	public static String kontonummerscheisse(String nummer) {
		String nummer1 = "";
		for (int i = nummer.length(); i < 10; i++) {
			nummer1 = "0"+ nummer1;
		}
		return (nummer1+nummer);
		
	}
	
	public static String leanderkennungmistkacke(String laenderkennung) {
		if(laenderkennung.length() != 2) {
			System.out.println("Die Eingabe war Falsch versuchen sie es nochmal!");
			System.exit(1);
		}
		
		int buchstabe1 = laenderkennung.charAt(0)-64+9;
		int buchstabe2 = laenderkennung.charAt(1)-64+9;
		return buchstabe1+""+buchstabe2+"00";
	}
	
	public static int lifemudolo(String mudolo) {
		int temp = Integer.parseInt(mudolo.substring(0,9))%97; //123456780 0-9
		int temp2 = Integer.parseInt(String.valueOf(temp)+mudolo.substring(9,16))%97; //0001234 9-16
		int temp3 = Integer.parseInt(String.valueOf(temp2)+mudolo.substring(16,23))%97; //5613140
		int temp4 = Integer.parseInt(String.valueOf(temp3)+mudolo.substring(23,24))%97; //0
		int con = 98-temp4;
		return con;
	}
	
	public static String erzeugeIban (String laenderkennung, String blz, String nummer) {
		
		
		
		String iban = laenderkennung
				+""+lifemudolo
				(blz+""+kontonummerscheisse(nummer)+""
				+leanderkennungmistkacke(laenderkennung)+"")+""+blz+kontonummerscheisse(nummer);
		
		return iban;
	}
}


