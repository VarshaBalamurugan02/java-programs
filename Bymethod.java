package javaprogram;


	class Student{
		int rollno;
		String name;
		void insertRecord(int i,String n) {
			rollno=i;
			name=n;}
			void displayoinformation() 
			{
				System.out.println(rollno+" "+name);
		}
	}
	public class Bymethod{
	public static void main(String args[]) {
		Student s1=new Student();
		s1.insertRecord(52, "varsha");
		s1.displayoinformation();
	}
}