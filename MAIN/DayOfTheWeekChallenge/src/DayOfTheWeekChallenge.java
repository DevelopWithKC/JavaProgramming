public class DayOfTheWeekChallenge {
    public static void printDayOfTheWeek(int day)
    {
        switch (day) {
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            default -> System.out.println("Saturday");
        }
    }

    public static void main(String[] args) {
        printDayOfTheWeek(15);
    }
}
