package javaprogram;
import java.util.Scanner;


public class sample17 {
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		int a;
		System.out.println("Enter the value of a is::");
		a=sc.nextInt();
		if (a%2==0)
		{
			System.out.println("its even::"+a);
		}
		else
		{
			System.out.println("its odd::"+a);
		}
	}

	public static void main(String[] args) {
		sample17 f1=new sample17();
		f1.get1();
		
		
		// TODO Auto-generated method stub

	}

}
