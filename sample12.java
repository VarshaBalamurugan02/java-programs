package javaprogram;
import java.util.Scanner;
public class sample12 
    {
		String Fruit;
		int price;
		Scanner sc=new Scanner(System.in);

	void input()
	{
		System.out.println("Enter The fruit and price is::");
		
		Fruit= sc.next();
		price= sc.nextInt();
		
		
		
	}
	void display()
	{
		System.out.println("Your value is::"+Fruit+""+price);
	}

	public static void main(String[] args) {
		sample12 f1= new sample12();
		f1.input();
		f1.display();
		// TODO Auto-generated method stub

	}

}
