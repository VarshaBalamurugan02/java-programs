package javaprogram;
import java.util.Scanner;
public class sample14 {
	int salary;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the salary is::");
		salary=sc.nextInt();
	}
	void get2()
	{
		if (salary>=2000)
		{
			System.out.println("good");
		}
		else
		{
			System.out.println("better");
		}
			
	}
	

	public static void main(String[] args) {
		sample14 f1=new sample14();
		f1.get1();
		f1.get2();
		
		// TODO Auto-generated method stub

	}

}
