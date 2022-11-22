public class SumDigitChallenge {

    public static int sumDigits(int number)
    {
        int sum = 0;
        int temp;
        while (number != 0)
        {
            temp = number % 10;
            number /= 10;
            sum += temp;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumDigits(354));
    }
}
