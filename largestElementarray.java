package javaprogram;
import java.util.Scanner;
public class largestElementarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<a;i++) {
			arr[i]=sc.nextInt();
		}
		int max=arr[0];
		for (int num:arr) {
			if(num>max) {
				max=num;
			}
		}
		System.out.println(max);
	}

}
