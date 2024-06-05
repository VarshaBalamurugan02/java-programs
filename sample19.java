package javaprogram;
import java.util.Scanner;
public class sample19 {
	void get() {
		Scanner sc=new Scanner(System.in);
		int mark;
		System.out.println("Enter the mark::");
		mark=sc.nextInt();
		if(mark>=90)
		{
			System.out.println("A grade::");
		}
		else if(mark>=80)
		{
			System.out.println("B grade::");
		}
		else if(mark>=70)
		{
			System.out.println("C grade::");
		}
		else
		{
			System.out.println("improve::");
		}
		
		
		
		
	}
	

	public static void main(String[] args) {
		sample19 obj1=new sample19();
		obj1.get();
		// TODO Auto-generated method stub

	}

}
