package javaprogram;
import java.util.Scanner;
public class NeanNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		int sum=0,r=0;
		input=input*input;
		System.out.println("Enter the value::"+input);
		while(input>0){
					input=input%10;
					sum=sum+input;
					r=input/10;
					
	}
		if(sum==input) {
			System.out.println("Neon Number");
			
		}
		else {
			System.out.println("Not An Neon Number");
		}
	}
}
