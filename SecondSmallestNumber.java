//Write a program that reads in a list of integers and finds the second smallest number.
import java.util.Arrays;
import java.util.Scanner;

public class SecondSmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the integers:");

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        Arrays.sort(array);

        int secondSmallest = array[1];

        System.out.println("The second smallest number is " + secondSmallest + ".");
    }
}
