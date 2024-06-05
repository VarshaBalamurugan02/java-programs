package javaprogram;
import java.io.DataInputStream;
import java.io.IOException;


public class sample8 {
	int empid,salary;
	String empname;
	DataInputStream dis=new DataInputStream(System.in);
	void get1()throws IOException
	{
		System.out.println("Enter The Empid::");
		empid=Integer.parseInt(dis.readLine());
		System.out.println("Enter The Salary::");
		salary=Integer.parseInt(dis.readLine());
		System.out.println("Enter The empname::");
		empname=dis.readLine();
		
	}
	void get2()
	{
		System.out.println("Your Empid is::"+empid);
		System.out.println("Your Empname is::"+empname);
		System.out.println("Your salary is::"+salary);

	}
	
	

	public static void main(String[] args) throws IOException{
		
		sample8 f1=new sample8();
		f1.get1();
		f1.get2();
		           
	}
		// TODO Auto-generated method stub

	} 


