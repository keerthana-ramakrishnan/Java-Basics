import java.util.Scanner;
class LuckyNumber{
 public static void main(String[]args){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter a Four digit number");
  int n = sc.nextInt();
  if(n>999){
  int digit_4=n%10;
  int digit_3=(n/10)%10;
  int digit_2=(n/100)%10;
  int digit_1=(n/1000)%10;
  if(digit_1+digit_2 ==digit_3+digit_4)
   System.out.println("Lucky Number");
  else
   System.out.println("Not a lucky number");
  }
  else{
   System.out.println(n+" is not a four digit number!");
}
}