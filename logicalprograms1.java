package javaprogram;
import java.util.Scanner;
public class logicalprograms1 {

	public static void main(String[] args) {
		        Scanner sc=new Scanner(System.in);
		        int input1=sc.nextInt();
		        int input2=sc.nextInt();
		        int input3=sc.nextInt();
				int min=10;
				int key=(input1/1000)*((input2/100)%10);
				    while(input3!=0) {      
				        	int r=input3%10;
				        	if(r<min) {
				        		min=r;
				        		input3=input3/10;
				        	}
				        }
				        System.out.println(key+min);
			}
		}
				       


