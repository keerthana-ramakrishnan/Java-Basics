class GetAndReturnArray{
public static void main(String[]args){
int [][]n=getArray();
printArray(n);
}
public static int[][] getArray(){
return new int[][]{{1,2,3},{2,3,4},{8,7,9}};
}
public static void printArray(int n[][]){
for(int i=0;i<n.length;i++)
 for(int j=0;j<n[i].length;j++)
  System.out.print(n[i][j]);
 System.out.println();
}
}