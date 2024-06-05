package javaprogram;
import java.util.Scanner;

public class primenumber {
int n,i;

void get1() {
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the n::");
	 n=sc.nextInt();
	 
}
}
void get2() {
	for(int i=2;i<=Math.sqrt(n);i++) {
		if(n%i==0) {
			return false;
			
		}
	}
			
		
	}
void get3() {
if(i%2==0)
{
	System.out.println("Given number is not a prime number");
}
else
{
	System.out.println("Given number is a primenumber");

		
	}}
public static void main(String[] args) {
	primenumber f1=new primenumber();
	f1.get1();
	f1.get2();
	

	}

}
