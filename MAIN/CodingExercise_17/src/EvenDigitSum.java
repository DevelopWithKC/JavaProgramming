public class EvenDigitSum {
    public static int getEvenDigitSum(int number)
    {
        int sum = 0;
        int remainder = 0;
        while (number > 0)
        {
            remainder = number % 10;

            if (remainder % 2 == 0)
                sum += remainder;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
    }
}
