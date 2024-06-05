package javaprogram;
import java.io.DataInputStream;
import java.io.IOException;

public class sample13 {
	int customerid,bill;
	String sweets;
	DataInputStream dis=new DataInputStream(System.in);
	void get1()throws IOException
	{
		System.out.println("enter the customerid ::");
		customerid=Integer.parseInt(dis.readLine());
		System.out.println("enter the sweets ::");
		sweets=(dis.readLine());
		System.out.println("enter the bill ::");
		bill=Integer.parseInt(dis.readLine());
		
	}
	void get2()throws IOException
	{
		System.out.println("your customerid is::"+customerid);
		System.out.println("your sweets is::"+sweets);
		System.out.println("your bill is::"+bill);
	}

	public static void main(String[] args)  throws IOException{
		sample13 f1=new sample13();
		f1.get1();
		f1.get2();
		// TODO Auto-generated method stub

	}

}
