package javaprogram;
class Animal
{
	
	
	void eat()
	{
		System.out.println("this is base class");
	}
}
abstract class Dog extends Animal
{
	
	void bark()
	{
		System.out.println("this is derived class");
		
	}
	
}
 abstract class puppy extends Dog
{
	void wagtail()
	{
		System.out.println("this is derived class");
		
	}
}

public class multilevelinheritance {

	public static void main(String[] args) {
	  puppy mypuppy=new puppy();
	  mypuppy.eat();
	  mypuppy.bark();
	  mypuppy.wagtail();

	}

}
