package javaprogram;
import java.util.Scanner;

public class sample15 {
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		int age,salary,bns;
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=61)
		{
			System.out.println("Enter the salaary is::");
			salary=sc.nextInt();
			if(salary>=2000)
			{
				bns=salary+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low");
		}
		
		
		
	}

	public static void main(String[] args) {
		sample15 f1=new sample15();
		f1.get1();
		// TODO Auto-generated method stub

	}

}
