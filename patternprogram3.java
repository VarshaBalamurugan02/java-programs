package javaprogram;

public class patternprogram3 {

	public static void main(String[] args) {
		int n=4,i,j;
		for (i=0;i<n;i++){
			for (j=0;j<n;j++) {
				if(i==0||j==0||i==n-1||j==n-1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println("");
		}

	}

}
