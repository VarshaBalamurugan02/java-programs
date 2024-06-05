package javaprogram;
import java.util.Scanner;

public class onearray

 {
		int empid[]=new int[5];
		int i,n;
		Scanner sc=new Scanner(System.in);
		

	void get1()
	{
		System.out.println("enter the n value is::");
		n=sc.nextInt();
	}
	void get2()
	{
		for(i=0;i<=n;i++)
		{
			System.out.println("enter the array value is::");
			empid[i]=sc.nextInt();
		}
			
	}
	
	void get3()
	{
		for (i=0;i<=n;i++)
		{
			System.out.println("your value is::"+empid[i]);
		}
	
	}
	
	public static void main(String[] args) {
		onearray f1=new onearray();
		f1.get1();
		f1.get2();
		f1.get3();
        
	}
	
	


	}


