package javaprogram;
import java.util.Scanner;
public class duplicatesremovearray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		char ch[]=new char[s.length()];
		ch=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				if(ch[i]==ch[j]) {
					ch[j]=0;
				}
			}
			if(ch[i]!=0) {
				System.out.println(ch[i]);
			}
			
		}
	}

}
