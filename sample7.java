package javaprogram;

public class sample7 {
	void logicaloperator()
	{
		int a3=3,b3=2;
		System.out.println("LogicalAND::"+((a3>b3)&&(b3<a3)));
		System.out.println("LogicalOR::"+((a3<b3)||(b3<a3)));
		System.out.println("LogicalNOT::"+(!(a3>b3)));
    }

	public static void main(String[] args) {
		sample7 f1=new sample7();
		f1.logicaloperator();
		// TODO Auto-generated method stub

	}

}
