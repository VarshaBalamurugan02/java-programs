package javaprogram;
interface B1
{
	int pid=1001;
	void get1();
	
}
interface B2 extends B1
{
	String pname="apple";
	void get2();
class D implements B2
{
	public void get1()
	{
		System.out.println("Your productid is::"+pid);
	}
    public void get2()
    {
    	System.out.println("your pname is::"+pname);
    }
    public void get3()
    {
    	System.out.println("it is normal method");
    }
	
	}
	


public class interfacein {

	public static void main(String[] args) {
	
		D f1=new D();
		f1.get1();
		f1.get2();
		f1.get3();
	}
}
}