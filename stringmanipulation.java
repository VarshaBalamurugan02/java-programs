package javaprogram;

public class stringmanipulation {

	public static void main(String[] args) {
		String s1="admin";
		String s2= new String("admin");
		System.out.println("startswith::"+s1.startsWith("s"));
		System.out.println("endswith::"+s1.endsWith("x"));
		System.out.println("Indexof::"+s1.indexOf('n'));
		System.out.println("Indexof::"+s1.concat(s2));
		System.out.println("lastindexof::"+s1.lastIndexOf('y'));
		System.out.println("trim::"+s1.trim());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
}
}