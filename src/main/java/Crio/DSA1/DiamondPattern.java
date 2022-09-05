package Crio.DSA1;

public class DiamondPattern {

	public static void main(String[] args) {
		
		int n=10;
	
		for(int count=1,i=1,k=3;k>=-1;k--,count++) {
			for(int j=1;j<=n;j++) {
				if(j==2*i+k && i<=count) {
					System.out.print("*");
					i++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			i=1;
		}
		
		for(int count=4,i=1,k=0;k<=3;k++,count--) {
			for(int j=1;j<=n;j++) {
				if(j==2*i+k && i<=count) {
					System.out.print("*");
					i++;
				}
				else
					System.out.print(" ");
			}
			System.out.println();
			i=1;
		}
			
	}

}
