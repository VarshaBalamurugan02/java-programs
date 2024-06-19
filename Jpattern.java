package javaprogram;

public class Jpattern {

	public static void main(String[] args) {
		int n=6,i,j;
		for (i=0;i<n;i++) {
			for(j=0;j<n;j++) {
				if(i==0||j==n/2||i==n-1&&j<=n/2) {
					System.out.print("*");
				}
				else
				{
				System.out.print(" ");
			}
		}
		System.out.println("");
	}

}}
