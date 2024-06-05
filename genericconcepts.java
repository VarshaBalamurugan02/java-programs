package javaprogram;
class Demo1<M>
{
	public M B;
	public void get1(M B)
	{
		System.out.println("your value is::"+B);
		
	}
}

public class genericconcepts {
	

	public static void main(String[] args) {
		Demo1<Integer>f1=new Demo1();
		f1.get1(1001);
		Demo1<String>f2=new Demo1();
		f2.get1("varshabalamurugan");

	}

}
