package javaprogram;
class B
{
	int rollno=52;
	String Yname="3";
	void get1()
	{
		System.out.println("Muthayammal Engineering College");
	}
	
}
class D1 extends  B
{
	void get2()
	{
		System.out.println("varsha::"+rollno);
	}
}
class D2 extends B
{
	void get3()
	{
		System.out.println("she is studying IT");
	}
}
class D3 extends B
{
	void get4()
	{
		System.out.println("In the year of::"+Yname);
	}
}

public class hierarichicalInheritance {

	public static void main(String[] args) {
		D1 f1=new D1();
		f1.get1();
		f1.get2();
		
		D2 f2=new D2();
		f2.get1();
		f2.get3();
		
		
		D3 f3=new D3();
		f3.get1();
		f3.get4();
		

	}

}
