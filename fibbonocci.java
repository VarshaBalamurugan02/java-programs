package javaprogram;
import java.util.Scanner;


public class fibbonocci {
	void fibbo()
	{ 
		int n,first=0,second=1,next,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::"); 
		n=sc.nextInt();
		for(c=0;c<=n;c++)
		{
			if(c<=1)
				next=c;
			else
			{
				next=first+second;
				first=second;
				second=first;
			}
			System.out.println(next);
		}
		
	}

	   
	public static void main(String[] args) {
		fibbonocci f1=new fibbonocci();
		f1.fibbo();
		// TODO Auto-generated method stub

	}

}
