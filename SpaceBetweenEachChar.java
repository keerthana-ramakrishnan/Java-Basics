import java.util.Scanner;
class SpaceBetweenEachChar{
public static void main (String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("Enter a String: ");
String str=sc.nextLine();
for(int i=0; i<str.length();i++){
System.out.print(str.charAt(i)+" ");
}
}
}