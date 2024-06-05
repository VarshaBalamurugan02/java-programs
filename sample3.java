package javaprogram;

public class sample3 {
	String pname="apple";
	void get1()
	{
		int pid=1001;
		System.out.println(pid);
	}
	void get2()
	{
		System.out.println(pname);
	}

	public static void main(String[] args) {
		sample3 d1=new sample3();
		sample3 d2=new sample3();
		d1.get1();
		d2.get2();
		
	}

}
