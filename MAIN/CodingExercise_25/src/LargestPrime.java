
public class LargestPrime {
    public static int getLargestPrime(int number)
    {
        if (number < 0)
            return -1;

        int largestPrimeNumber = 1;
        for (int i = 2; i < number; i++)
        {
            if (number % i == 0)
                largestPrimeNumber = i;

        }
        return largestPrimeNumber;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(217));
    }
}
