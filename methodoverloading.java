package javaprogram;
class variable
{
	void get1(int p1,int p2)
	{
		System.out.println("your value is::"+p1+""+p2);
	}
	void get1(int s1,float s2)
	{
		System.out.println("your value is::"+s1+""+s2);
		
	}
}

public class methodoverloading {

	
	public static void main(String[] args) {
		variable f1=new variable();
		f1.get1(1001, 1002);
		
		f1.get1(1003,1.25f);
	}

}
