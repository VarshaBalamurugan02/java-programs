package javaprogram;
import java.util.Scanner;
public class arraysortmiddlevaluefind {

	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr[]=new int[n];
			int temp,i,j;
			for(i=0;i<n;i++)
			{
				arr[i]=sc.nextInt();
			}
			
			for(i=0;i<n;i++) {
				for(j=i+1;j<n;j++) {
					if(arr[i]>arr[j]) {
						temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
					}
					}
			}
				for(i=0;i<n/2;i++) {
					System.out.println(arr[i]+" ");
				}
				for(i=n-1;i>=n/2;i--) {
					System.out.println(arr[i]+" ");
				
			}
		}

	}
