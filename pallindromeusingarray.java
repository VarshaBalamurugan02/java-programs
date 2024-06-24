package javaprogram;
import java.util.Scanner;
public class pallindromeusingarray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char c[]=s.toCharArray();
		char a[]=new char[s.length()];
		for(int i =s.length()-1,j=0;i>=0&&j<s.length();i--,j++) {
			a[i]=c[j];
		}
        String str=new String(a);
        System.out.println((str.equals(s)?" pallindrome":"Not pallindrome"));
	}
	
}
