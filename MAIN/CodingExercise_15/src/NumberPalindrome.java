public class NumberPalindrome {
    public static boolean isPalindrome(int number)
    {
        int num = 0;
        if (number < 0)
        {
            number = Math.abs(number);
            num = Math.abs(number);
        }
        else
        {
            num = number;
        }
        int lastDigit = 0, reverse = 0;
        while(number != 0)
        {
            lastDigit = number % 10;
            reverse *= 10;
            reverse += lastDigit;
            number /= 10;
        }
        return reverse == num;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(41213));
    }
}
