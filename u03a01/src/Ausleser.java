import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ausleser {

	   public static void main(String[] args) throws FileNotFoundException {
	        int a, b, c;

	        Scanner sc = new Scanner(new File("X:\\Workspace\\u03a01\\src\\text.txt"));

	        a = sc.nextInt();
	        b = sc.nextInt();
	        c = a + b;

	        System.out.println("Ergebniss: " + c);

	        sc.close();
	    }

	}
