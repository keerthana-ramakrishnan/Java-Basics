class MinMaxInArray{
public static void main(String[]args){
int[] n={76,54,23,98,100};
int min=n[i];
int max=0;
for(int i=0;i<5;i++){
if(n[i]>max)
 max=n[i];
if(n[i]<min){
min=n[i];
}
}
System.out.print("Min="+min+" Max="+max);

}
}