package javaprogram;

public class nativeConcept {
	public native void get1();
	 static{
	  	System.loadLibrary("HII guys");
	}
	 void get2()
	 {
		 System.out.println("hey guys");
	 }

	public static void main(String[] args) {
		nativeConcept f1=new nativeConcept();
		f1.get1();
		f1.get2();
		
		
	}

}
