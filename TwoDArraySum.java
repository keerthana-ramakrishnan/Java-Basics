class TwoDArraySum{
public static void main(String[]args){
int[][] n={{1,2,3,4,5},{3,4,5},{7,8,9,0}};
		int rowsum=0;
		int colsum=0;
		for(int i=0;i<n.length;i++){
		for(int j=0;j<n[i].length;j++){
		rowsum+=n[i][j];
		}
		System.out.println("Sum of Row "+i+" is "+rowsum);
		}
		int maxColumns=0;
		 for (int i = 0; i < n.length; i++) {
	            if (n[i].length > maxColumns) {
	                maxColumns = n[i].length;
	            }
		 }
		for(int k=0;k<maxColumns;k++){
		for(int j=0;j<n.length;j++){
			if(k<n[j].length) {
		colsum+=n[j][k];}
		}
		System.out.println("Sum of Column "+k+" is "+colsum);
		colsum=0;}
}}