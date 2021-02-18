import java.util.*;

public class LaengsteKette {

	public static void main(String[] args) {
		Scanner kopierergedoedels = new Scanner(System.in);
		
		int wievielegedoedels = 1;
		int rekordgedoedels = 0;
		int vorgedoedel = kopierergedoedels.nextInt();
		
		while(kopierergedoedels.hasNextInt()) {
			int i = kopierergedoedels.nextInt();
			if (vorgedoedel == i) {
				wievielegedoedels++;
			} else {
				
				wievielegedoedels = 1;
				vorgedoedel = i;
			}
			if(wievielegedoedels >= rekordgedoedels) {
				rekordgedoedels = wievielegedoedels;
			}
		}
		kopierergedoedels.close();
		System.out.println(rekordgedoedels);
	}

}
