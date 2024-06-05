package javaprogram;

public class StringvsobjectString {

	

	public static void main(String[] args) {
		//String s1="welcome";
		//String s2="welcome";
		
		String s3=new String("welcome");
		String s4=new String("welcome");
		System.out.println("withcreatingobject::"+s3.equals(s4));
	    System.out.println("withoutcreatingobject::"+s3==s4);
	}

}
