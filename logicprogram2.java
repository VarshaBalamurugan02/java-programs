package javaprogram;
import java.util.Scanner;
public class logicprogram2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int input1=sc.nextInt();
		int input2=sc.nextInt();
		int input3=sc.nextInt();
		int key=(input1/100%10)*((input2/10)%10);
		int max=0;
		while(input3!=0) {
			int r=input3%10;
        	if(r>max) {
        		max=r;
        	}
        		input3=input3/10;
        	}
        
        System.out.println(key-max); 
	}
}

