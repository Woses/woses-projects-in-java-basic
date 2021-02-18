import java.util.Scanner;

public class Lauflaengenkodierung {

	public static void main(String[] args) {
		Scanner kopierergedoedels = new Scanner(System.in);
		
		int wievielegedoedels = 1;
		int vorgedoedel = kopierergedoedels.nextInt();
		
		while(kopierergedoedels.hasNextInt()) {
			int i = kopierergedoedels.nextInt();
			if (vorgedoedel == i) {
				wievielegedoedels++;
			} else {
				System.out.print(wievielegedoedels+ "x" + vorgedoedel + ".");
				wievielegedoedels = 1;
				vorgedoedel = i;
			}
		}
		kopierergedoedels.close();
		System.out.print(wievielegedoedels+ "x" + vorgedoedel + ".");

	}

}
