public class Palindromzahl2 {

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
        int turned = spiegeln(input);
        for (int i = 0; i < counter; i++) {
            final int first = tmp % 10;
            final int second = turned % 10;
            if (first != second) {
                return false;
            }
            tmp /= 10;
            turned /= 10;
        }
        return true;
    }

    public static int spiegeln(int zahl) {
        int tmp = zahl;
        int counter = 0;
        int powerOfTen = 1;
        int turnedNumber = 0;

        while (tmp > 0) {
            tmp = tmp / 10;
            counter++;
        }

        for (int i = 1; i < counter; i++) {
            powerOfTen = powerOfTen * 10;
        }

        tmp = zahl;
        while (tmp > 0) {
            turnedNumber = (tmp % 10) * powerOfTen + turnedNumber;
            tmp /= 10;
            powerOfTen /= 10;
        }
        return turnedNumber;
    }
}