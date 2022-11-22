
public class NumberInWord {
    public static void printNumberInWord(int number)
    {
        switch (number)
        {
            case 1 -> System.out.println("One");
            case 2 -> System.out.println("Two");
            case 3 -> System.out.println("Three");
            case 4 -> System.out.println("Four");
            default -> System.out.println("Greater than 4");
        }
    }

    public static void main(String[] args) {
        printNumberInWord(3);
    }
}
