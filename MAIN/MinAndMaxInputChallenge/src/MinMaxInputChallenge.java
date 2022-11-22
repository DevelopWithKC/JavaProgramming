import java.util.Scanner;

public class MinMaxInputChallenge {
    public static void main(String[] args) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true)
        {
            System.out.println("Enter A Number: ");
            number = scanner.nextInt();

            if (! scanner.hasNextInt())
                break;

            if (number < minimum)
                minimum = number;

            if (number > maximum)
                maximum = number;

        }

        System.out.println("Minimum = " + minimum + " and Maximum = " + maximum);
    }
}
