package javaprogram;
import java.util.Scanner;
public class leapyear {
    int year;
    Scanner sc=new Scanner(System.in);
    void get1() {
    	System.out.println("enter a year");
    	year=sc.nextInt();
    }
    void get2() {
    	if((year%400==0)||(year %100!=0) && (year%4==0)){
    		System.out.println("Given"+year+" is an year");
    	}
    	else {
    		System.out.println("Given year is non-leapyear");
    	}
    }
	public static void main(String[] args) {
		leapyear f1=new leapyear();
		f1.get1();
		f1.get2();

	}

}
