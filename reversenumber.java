package javaprogram;
import java.util.Scanner;
public class reversenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number::");
		int a=sc.nextInt();
		 int reverse=0;
		 int t=a,x;
		 while(t>0)
		 {
			 x=t%10;
			 reverse=reverse*10+x;
			 t=t/10;
		 }
		 System.out.println("your reverse number is::"+reverse);
	}

}
