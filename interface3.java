package javaprogram;
interface drawable{
	void draw();
		
	}
class rectangle implements drawable{
	public void draw() {
		System.out.println(" it is a rectangle");
	}
}
class circle implements drawable{
	public void draw() {
		System.out.println(" it is a circle");
	}
}
class triangle implements drawable{
	public void draw() {
		System.out.println(" it is a triangle");
	}
}
public class interface3 {

	public static void main(String[] args) {
		triangle f1=new triangle();
		f1.draw();
		circle f2=new circle();
		f2.draw();
		circle f3=new circle();
		f3.draw();
		

	}
	

}
