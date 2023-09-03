import java.util.Scanner;
import java.util.Arrays;
class ArrayOfInput{
 public static void main(String[]args){
  Scanner sc =new Scanner(System.in);
  System.out.print("How many elements? Max is 20 and Min is 1: ");
  int n=sc.nextInt();
  if(n>20||n<0){
   System.out.print("Enter a number between 1 and 20! ");
   n=sc.nextInt();
  }
  int[] ArrayNumbers=new int[n];
  fillArrayOfIntrgers(ArrayNumbers);
  printArrayOfIntegers(ArrayNumbers);
  }
public static void fillArrayOfIntrgers(int[] n){
 Scanner sc = new Scanner(System.in);
   for(int i=0;i<n.length;i++)
      n[i]=sc.nextInt();
}
  
public static void printArrayOfIntegers(int[] ArrayNumbers){
   System.out.print(Arrays.toString(ArrayNumbers));
}
}
