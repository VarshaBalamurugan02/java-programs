package javaprogram;
class employee
{
	
	int empid;
	String empname;
	void get1(int empid,String empname)
	{
		this.empid=empid;
		this.empname=empname;
		System.out.println("your get1 value is::"+empid);
		System.out.println("your get1 value is::"+empname);

		
	
}
	void get2()
	{
		System.out.println("your get2 value is::"+empid+""+empname);
	}
	 
		
	}

public class thisconcepts {

	public static void main(String[] args) {
		employee f1=new employee();
		String azar = null;
		f1.get1(1001,azar);
		f1.get2();
		
	}

}
