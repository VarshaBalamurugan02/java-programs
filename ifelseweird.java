package javaprogram;
import java.util.Scanner;

public class ifelseweird {
	void get1() {
		
	Scanner sc=new Scanner (System.in);
			
	int n;
	System.out.println("Enter the n value is::");
	n=sc.nextInt();
	if(n%2==1)
	{
		System.out.println(" weird");
	}
	
	else if(n%2<=5)
	{
		System.out.println("not weird");
	}
	else if(n%6<=20)
	{
		System.out.println("weird");
	}
	else if(n<=20) {
		System.out.println("not weird");
	}
	else
	{
		System.out.println("weird");
	}
	}
	

	public static void main(String[] args) {
		ifelseweird obj1=new ifelseweird();
		obj1.get1();
     
	}

}
