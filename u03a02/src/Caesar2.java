import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;


public class Caesar2 {
    //Teste Programm mit main Funktion
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int buchstabenwert = 0;
        int value = sc.nextInt();
        char buchstaben = sc.next().toUpperCase().charAt(0);
        
        buchstabenwert = ((buchstaben-'A'+value)%26)+65;
        
        System.out.println((char)buchstabenwert+ "\n");
        sc.close();
    }
}