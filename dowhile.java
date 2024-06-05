package javaprogram;
import java.util.Scanner;


public class dowhile {
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the N values::");
		n=sc.nextInt();
	}
	void get2()
	{
	   i=2;
	   do
	{
		System.out.println("I value is::"+i);
		
		i=i+2;
	}
	    
		while (i<=n);
	   
		
		}
     public static void main(String[] args) {
		dowhile f1=new dowhile();
		f1.get1();
		f1.get2();
	}

}
