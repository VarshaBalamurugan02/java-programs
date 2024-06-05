package javaprogram;
enum empname{varsha,balamurugan,jeswanth};
public class enumarations {
	public static void main(String[]args) {

		for(empname e1:empname.values())
		{
			System.out.println("your emp details is::"+e1);
		}
}
}
