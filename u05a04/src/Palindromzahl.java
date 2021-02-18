public class Palindromzahl {

    public static void main(String[] args) {
        int input = Integer.parseInt(args[0]);
        System.out.println(spiegeln(input));
        System.out.println(spiegelAddieren(input));
        while (!palindromTest(input)) {
            input = spiegelAddieren(input);
        }
        System.out.println(input);
    }

    public static int spiegelAddieren(int input) {
        return input + spiegeln(input);
    }

    public static boolean palindromTest(int input) {
        int tmp = input;
        int counter = 0;
        while (tmp != 0) {
            tmp /= 10;
            counter++;
        }
        tmp = input;
        int gespiegelt = spiegeln(input);
        for (int i = 0; i < counter; i++) {
            final int first = tmp % 10;
            final int second = gespiegelt % 10;
            if (first != second) {
                return false;
            }
            tmp /= 10;
            gespiegelt /= 10;
        }
        return true;
    }

    public static int spiegeln(int temp) {
        int counter = 0;
        int hochzehn = 1;
        int temp2 = temp;
        int gespielgeltenummer = 0;

        while (temp > 0) {
            temp = temp / 10;
            counter++;
        }

        for (int i = 1; i < counter; i++) {
            hochzehn = hochzehn * 10;
        }
        
        while (temp2 > 0) {
            gespielgeltenummer = (temp2 % 10) * hochzehn + gespielgeltenummer;
            temp2 /= 10;
            hochzehn /= 10;
        }
        return gespielgeltenummer;
    }
}