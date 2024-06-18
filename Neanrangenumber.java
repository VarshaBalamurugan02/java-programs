package javaprogram;
import java.util.Scanner;
public class Neanrangenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int i=0;
		for(i=n1;i<=n2;i++) {
		int sum=0;
		int b=i*i;
		while(b>0) {
			int c=b%10;
			sum=sum+c;
			b=b/10;
		}
		if(i==sum) {
			System.out.println(i+"");
		}
		
	}

}}
