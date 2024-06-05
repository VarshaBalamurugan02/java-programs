package javaprogram;
import java.util.Scanner;


public class sample16 {
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		int exp;
		System.out.println("Enter the expression::");
		exp=sc.nextInt();
		switch(exp)
		{
		case 1: 
		   System.out.println("case1");
		break;
		case 2:
			System.out.println("case2");
		break;
		default:
			System.out.println("default case");
		
			
		    
		}
	}

	public static void main(String[] args) {
		sample16 f1=new sample16();
		f1.get1();
		// TODO Auto-generated method stub

	}

}
