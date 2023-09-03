import java.util.Scanner;
class Palindrome{
 public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string");
    String str=sc.nextLine();
    Boolean isPalindrome = true;
    for(int i=0,j=str.length();i<j;i++,j--){
        if(str.charAt(i)==str.charAt(j))
            continue;
        System.out.print("not Palindrome")
        break;
    }
    System.out.print(isPalindrome?"Palindrome":"not Palindrome");
    }
}