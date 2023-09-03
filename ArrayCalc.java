class ArrayCalc{
public static void main(String[]args){
int[] n={1,2,3,4,5,6};
int sum=0;
int product=1;
double avg=0;
for(int i=0;i<n.length;i++){
sum+=n[i];
product*=n[i];
}
avg=(double)sum/n.length;
System.out.println("sum"+sum+"product"+product+"average"+avg);
}
}