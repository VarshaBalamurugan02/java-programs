package javaprogram;
enum Employee{
	mohamed(31), azar(15), raja(24);
	 int age;
	 
	 
     Employee(int p){
		age=p;
		
	}
    int getAge() {
 		return age;
 	
}
}
public class enumage {
	public static void main(String[]args) {
		Employee p =Employee.azar;
		
		System.out.println(p.getAge());
		
	
		
	}

}
