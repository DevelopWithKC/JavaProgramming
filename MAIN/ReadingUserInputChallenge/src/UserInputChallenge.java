import java.util.Scanner;

public class UserInputChallenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < 10; i++)
        {
            int userInput = scanner.nextInt();
            scanner.nextLine();

            sum += userInput;
        }

        System.out.println("Sum of entered Numbers: " + sum);
    }
}
