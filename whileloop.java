package javaprogram;
import java.util.Scanner;

public class whileloop {
	int i,n;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
	}
	void get2()
	{
		i=0;
		while(i<=n)
		{
		System.out.println("Enter the i value is::"+i);
		i++;
		}
	}
	

	public static void main(String[] args) {
		whileloop t1=new whileloop();
		t1.get1();
		t1.get2();
		
		


	}

}
