package javaprogram;
import java.util.Scanner;
public class sample18 {
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		int n,i,sum = 0,product=1;
		System.out.println("Enter the value of n is::");
		n=sc.nextInt();
		
		for(i=0;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.println("Its even::"+i);
				sum+=i;
			}
			else
			{
				System.out.println("its odd::"+i);
				product*=i;
			}
			
		}
		System.out.println("sum::"+sum);
		System.out.println("product::"+product);
	}
    	public static void main(String[] args) {
		sample18 f1=new sample18();
		f1.get1();
				
	}

}
