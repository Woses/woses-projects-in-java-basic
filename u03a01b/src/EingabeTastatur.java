import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class EingabeTastatur {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int i = sc.nextInt();
		int o = sc.nextInt();
		
		System.out.println(i+o);
		sc.close();

	}

}
