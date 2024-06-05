package javaprogram;

public class swapprogram2 {
	
	void sample()
	{
		int a=10,b=20;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Swap without 3rd variable is::"+a+""+b);
	}

	public static void main(String[] args) {
		swapprogram2 f1=new swapprogram2();
		f1.sample();
		// TODO Auto-generated method stub

	}

}
