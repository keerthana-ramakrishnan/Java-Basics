//Write a program that reads in two strings and checks if they are anagrams (contain the same letters in a different order).
import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        string1 = string1.toLowerCase().replaceAll("\\s+", "");
        string2 = string2.toLowerCase().replaceAll("\\s+", "");

        if (string1.length() != string2.length()) {
            System.out.println("The two strings are not anagrams.");
            return;
        }

        char[] string1Array = string1.toCharArray();
        char[] string2Array = string2.toCharArray();
        Arrays.sort(string1Array);
        Arrays.sort(string2Array);

        if (Arrays.equals(string1Array, string2Array)) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }
    }
}
