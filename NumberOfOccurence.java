import java.util.Scanner;
class NumberOfOccurence{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
int []n= new int[5];
for(int i=0;i<5;i++){
Scanner a = new Scanner(System.in);
n[i]=a.nextInt();
}
System.out.print("Enter the number to search: ");
int Search_Num=sc.nextInt();
int count=0;
for(int i=0;i<5;i++){
if(n[i]==Search_Num)
 count+=1;
}
System.out.print("Number of occurence of "+Search_Num+" is "+count);
}
}