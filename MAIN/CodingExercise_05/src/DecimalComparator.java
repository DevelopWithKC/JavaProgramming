public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2)
    {
        int x = (int)(num1 * 1000);
        int y = (int)(num2 * 1000);

        return x == y;
    }

    public static void main(String[] args) {
        System.out.println("Two values are: " + areEqualByThreeDecimalPlaces(-3.1756,-3.175));
    }
}
