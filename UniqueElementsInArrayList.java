import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
class UniqueElementsInArrayList{
public static void main(String[]args){
Scanner sc = new Scanner(System.in);
		ArrayList<Integer> n=new ArrayList<>();
		for(int i=0; i<10;i++){
		System.out.print("Enter integer "+(i+1));
		int temp=sc.nextInt();
		if(!n.contains(temp))
		 n.add(temp);
		}
		Collections.sort(n);
		System.out.print(n);
}
}