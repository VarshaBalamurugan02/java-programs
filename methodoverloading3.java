package javaprogram;

public class methodoverloading3 {
    void get1(String s1,String s2) {
    	System.out.println(s1);
    	System.out.println(s2);
    	
    }
    void get1(String s3) {
    	System.out.println(s3);
    }
	public static void main(String[] args) {
		methodoverloading3 f1=new methodoverloading3();
		f1.get1("Grill free", "bucketbiriyani,icecream,chikengravy");
        f1.get1("Happy Independence Day All");
	}

}
