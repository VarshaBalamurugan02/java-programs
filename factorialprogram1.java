package javaprogram;
import java.util.Scanner;

public class factorialprogram1 {
	 int i,n,f=1;
	 Scanner sc= new Scanner(System.in);
	
	 
    void  factorial()
    {
     
        System.out.println("enter the n ::");
        n=sc.nextInt();
        
    
     
    		for (i=1;i<=n;i++)
    		{
    			f=f*i;
    		}
    		System.out.println("enter the value of i::"+f);
    	}
    

	public static void main(String[] args) {
		factorialprogram1 f1= new factorialprogram1();
		f1.factorial();
				
		// TODO Auto-generated method stub

	}

}
