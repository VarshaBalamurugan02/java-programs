package javaprogram;
import java .util.Scanner;
public class harshadnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int sum=0,r;
	    while(a>0) {
	    	r=a%10;
	    	sum=sum+r;
	    	a=a/10;
	    }
	    if(a%sum==0)
	    {
	    	System.out.println("Harshad Number");
	    }
	    else {
	    	System.out.println("not an harshad number");
	    }
	}

}
