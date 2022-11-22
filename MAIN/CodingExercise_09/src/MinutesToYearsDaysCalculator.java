public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes)
    {
        if (minutes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {

            long noOfYears = minutes / (365 * 24 * 60);
            long noOfMinutesLeft = minutes % (365 * 24 * 60);
            long noOfDays = noOfMinutesLeft / (24 * 60);

            System.out.println(minutes + " min = " + noOfYears + " y and " + noOfDays + " d");
        }
    }

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }
}
