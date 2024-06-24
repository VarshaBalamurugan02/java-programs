package javaprogram;
import java.util.Scanner;
public class reversearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String text=sc.nextLine();
		String[]r=text.split(" ");
		for(int i=r.length-1;i>=0;i--) {
			System.out.println(r[i]+" ");
		}
	}

}
