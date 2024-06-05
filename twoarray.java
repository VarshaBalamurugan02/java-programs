package javaprogram;
import java.util.Scanner;

public class twoarray

 {
		
		int n,m,i,j;
		Scanner sc=new Scanner(System.in);
		int empid[][]=new int[3][3];
		

	void get1()
	{
		System.out.println("enter the n and m value is::");
		n=sc.nextInt();
		m=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<n;i++)
		{
			
				for(j=0;j<m;j++)
				{
			        System.out.println("enter the array value is::");
			        empid[i][j]=sc.nextInt();
			
				}
		}
			
	}
	
	void get3()
	{
		for (i=0;i<n;i++)
		{
			for(j=0;j<m;j++)
		
		{
			System.out.println("your value is::"+empid[i][j]);
		}
		}
	}
 
	
	public static void main(String[] args) {
		twoarray g1=new twoarray();
		g1.get1();
		g1.get2();
		g1.get3();
        
	}
	}


