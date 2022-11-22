public class TeenNumberChecker {
    public static boolean hasTeen(int age1, int age2, int age3)
    {
        return  (age1 > 12 && age1 < 20) || (age2 > 12 && age2 < 20) || (age3 > 12 && age3 < 20);
    }

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(isTeen(15));
    }

    public static boolean isTeen(int number)
    {
        return ((number >= 13) && (number <= 19));
    }
}
