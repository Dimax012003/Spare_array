package hey;

public class Spare_array {
	public static void main(String[] args) {
		 int n=4;
		 int a[][]= {{1,1,1,1},{1,1,1,1},{1,1,0,0},{1,0,0,0}};
		 int i,j;
		 for(i=0;i<n;i++) {
			 for(j=0;j<n;j++) {
				 System.out.print(" "+a[i][j]);
			 }
			 System.out.println(" ");
		 }
		 int count=0,target=n-1;
		 for(i=0;i<n;i++) {
			 for(j=target;j>=0;j--) {
				 if(a[i][j]==1) {
					 target=j;
					 count=count+j+1;
					 break;
				 }
			 }
			 if(a[i][0]==0) {
				 target=0;
				 break;
			 }
		  }
		 System.out.print(" "+count);
		 }
}
