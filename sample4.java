package javaprogram;
import java.util.Scanner;
public class sample4 {
	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid and empname is::");
		empid= sc.nextInt();
		empname= sc.next();
	}
	void display()
	{
		System.out.println("your value is::"+empid+""+empname);
	}
    public static void main(String[] args) {
    	sample4 f1=new sample4();
    	f1.input();
    	f1.display();
    	
		

	}

}
