public class FirstLastDigitSum {

    public static int sumFirstAndLastDigits(int number)
    {
        int firstDigit = 0, lastDigit = number % 10;
        while (number != 0)
        {
            firstDigit = number % 10;
            number /= 10;
        }
        return firstDigit + lastDigit;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigits(25));
    }
}
