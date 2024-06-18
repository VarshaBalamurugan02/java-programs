package javaprogram;
import java.util.Scanner;
public class convertdatattypes {

	public static void main(String[] args) {
		//decimal to binary
		Scanner sc=new Scanner(System.in);
		int a=10;
		System.out.println(Integer.toBinaryString(a));
		//binary to decimal
		int b=1101;
		String v=Integer.toString(b);
		System.out.println(Integer.parseInt(v,2));
		//decimal to octal
		int c=52;
		System.out.println(Integer.toOctalString(c));
		//octal to decimal
		int d=23;
		String s=Integer.toString(d);
		System.out.println(s);
		//decimal to hexadecimal
		int x=1234;
		System.out.println(Integer.toHexString(x));
		//hexadecimal to decimal 
		String s1="4d2";
		System.out.println(Integer.parseInt(s1,16));
	}

}
