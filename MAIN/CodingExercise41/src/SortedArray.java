import java.util.Scanner;

public class SortedArray {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num;

        System.out.println("How many Array elements: ");
        num = scanner.nextInt();

        int [] mainArray = getIntegers(num);
        int [] sortedArray = sortArray(mainArray);

        printArray(sortedArray);

    }

    public static int[] getIntegers(int number)
    {
        int [] toReturnArray = new int[number];
        System.out.println("Enter " + number + " array elements: \r");

        for (int i = 0; i < number; i++)
        {
            toReturnArray[i] = scanner.nextInt();
        }

        return toReturnArray;
    }

    public static int[] sortArray(int [] sortThisArray)
    {
        // Sort the given array in descending order
        int [] descendingArray = new int[sortThisArray.length];

        //copy array elements into another array
        for (int i = 0; i < sortThisArray.length; i++)
        {
            descendingArray[i] = sortThisArray[i];
        }

        int temp;

        //sorting the array

        for (int i = 0; i < descendingArray.length; i++)
        {
            for (int j = i+1; j < descendingArray.length; j++)
            {
                if (descendingArray[j] > descendingArray[i])
                {
                    temp = descendingArray[i];
                    descendingArray[i] = descendingArray[j];
                    descendingArray[j] = temp;
                }
            }
        }

        return descendingArray;
    }

    public static void printArray(int [] printThisArray)
    {
        System.out.println("Descending order: ");

        for (int i = 0; i < printThisArray.length; i++)
        {
            System.out.print(printThisArray[i] + " ");
        }
    }
}
