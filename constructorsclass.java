package javaprogram;
class product
{
	product()//default constructor
	{
		System.out.println("it is a default constructor....");
	}
	product(int a)//param constructor
	{
		System.out.println("it is a param constructor...."+a);
	}
	void get1()
	{
		System.out.println("this is a constructor...");
	}
}
public class constructorsclass {
	

	public static void main(String[] args) {
		new product();
		product p1=new product(1001);
		p1.get1();
		

	}

}
