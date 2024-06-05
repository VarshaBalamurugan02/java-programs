package javaprogram;
import java.util.Scanner;

public class armstrong {
	void get1()
	{
		Scanner sc=new Scanner(System.in);
	int n,arm=0,rem,c;
	System.out.println("enter the number::");
	n=sc.nextInt();
	c=n;
	while(n>0)
	{
		rem=n%10;
		arm=(rem*rem*rem)+arm;
		n=n/10;
	}
	if(n==arm)
	{
		System.out.println("Armstrong number");
		
	}
	else
	{
		System.out.println("not an Armstrong Number");
	}
		
	}

	public static void main(String[] args) {
		armstrong f1=new armstrong();
		f1.get1();
		
		// TODO Auto-generated method stub

	}

}
