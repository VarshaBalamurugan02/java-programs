package javaprogram;
	import java.util.Scanner;
	public class conceptM
	{
		public static void main(String[] args) 
		{
		Scanner scan=new Scanner(System.in);
			System.out.print("Enter n value:");
			int n=scan.nextInt();
			int m=n/2+1;
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=n;j++)
				{
					if(j==1 || j==n || (i==j && i<=m) || (n+1==j+i && i<=m))
					System.out.print(" * ");
					else
					System.out.print("   ");
				}
				System.out.println();
			}
			
		scan.close();	
		}
	
	}			