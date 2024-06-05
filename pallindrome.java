package javaprogram;
import java.util.Scanner;
public class pallindrome {

	public static void main(String[] args) {
		int number;
		int reverse=0;
		int temp;
		int rem;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		number=sc.nextInt();
		temp=number;
		
		while(temp>0)
		{
			rem=temp%10;
			reverse=reverse*10+rem;
			temp=temp/10;
		};
		if(number==reverse)

	{
		System.out.println("True");	
	}
		else
		{
			System.out.println("False");
		}
	}
	}


