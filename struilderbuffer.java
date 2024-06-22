package javaprogram;

public class struilderbuffer {

	public static void main(String[] args) {
		String str="varsha";
		int l=str.length();
		System.out.println(l);
		char charAtIndex=str.charAt(5);//accessing particular character at string
		System.out.println(charAtIndex);
		String substring=str.substring(4);
		System.out.println(substring);
		String substringwithindices=str.substring(2,4);
		System.out.println(substringwithindices);
		int indexofChar=str.indexOf('a');
		System.out.println(indexofChar);
		int v=str.indexOf('v',3);
		System.out.println(v);
		int s=str.lastIndexOf('s');		
		String newStr=str.concat("::how are you?");
		System.out.println(newStr);
		String replacestr=str.replace('v', 'V');
		System.out.println(replacestr);
		String lowercaseStr=str.toLowerCase();
		System.out.println(lowercaseStr);
		String uppercaseStr=str.toUpperCase();
		System.out.println(uppercaseStr);
		String a=" hello world".trim();
		System.out.println(a);
		String[] splitStr=str.split("r");
		for(String m: splitStr) {
			System.out.println(m);
		}
		boolean startswithhello=str.startsWith("v");
		System.out.println(startswithhello);
		boolean endswithhello=str.endsWith("sha");
		System.out.println(endswithhello);
		String anotherstr="varsha";
		boolean isequal=str.equals(anotherstr);
		System.out.println(isequal);
		boolean isEqualIgnore=str.equalsIgnoreCase("varsha");
		System.out.println(isEqualIgnore);
		System.out.println( str.replaceFirst("a", ":)"));
		System.out.println( str.replaceAll("varsha", "varshabalamurugan:)"));
		
		String s1="varsha";
		int com=str.compareTo(s1);
		System.out.println(com);
		String s2="sha";
		int comp=str.compareToIgnoreCase(s2);
		System.out.println(comp);
	}

}
