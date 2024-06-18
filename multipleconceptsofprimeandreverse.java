package javaprogram;
import java.util.Scanner;
public class multipleconceptsofprimeandreverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int count=0,rev=0,x,t=a,c=0;
		for(int i=2;i<a;i++)
		{
			if(t%i==0) {
				count++;
			}
		}
		System.out.println((count==0)?"prime":"not a prime");
		if(count==0) {
			while(t>0) {
				rev=rev*10;
				t=t/10;
			}
			System.out.println("rev of a+"+a+" is "+rev);
			for(int i=2;i<rev;i++) {
				if(rev%i==0) {
					c++;
				}
			}
			if(c==0) {
				System.out.println("twisted prime");
			}
			else {
				System.out.println("not an twisted prime");
			}
		}
	}

}
