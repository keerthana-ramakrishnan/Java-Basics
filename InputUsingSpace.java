import java.util.Scanner;
public class InputUsingSpace{
   public static void main (String[]args){
      	Scanner sc = new Scanner(System.in);
	double d1=sc.nextDouble();
	char op = sc.next().charAt(0);
	double d2 = sc.nextDouble();
	if(op=='+')
	   System.out.println("result"+(d1+d2));
	else if(op=='-')
	   System.out.println("result"+(d1-d2));
	else if(op=='*')
	   System.out.println("result"+(d1*d2));
	else if(op=='/')
	   System.out.println("result"+(d1/d2));
	else 
	   System.out.println("Enter a valid operator");
}
}