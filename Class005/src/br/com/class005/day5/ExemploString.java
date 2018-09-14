package br.com.class005.day5;

public class ExemploString {

	public static void main(String[] args) {
		String course = "Java Web TranspoBrasil";
		
		//length() return the quantity of characters
		System.out.println(course.length());
		//chatAt return the character in the position
		System.out.println(course.charAt(21));
		for (int i = 0; i < course.length(); i++) {
			System.out.println(course.charAt(i));
		}
		
		//indexOf return the first position of a substring, accept as a second parameter the 
		//position of the string it should start looking for
		System.out.println(course.indexOf("Web"));
		System.out.println(course.indexOf("a", 3));
		
		//replace return a string raplacing the first parameter with the second one 
		System.out.println(course.replace("Web", "Desktop"));
		System.out.println(course);
		course = course.replace("Web", "Desktop");
		System.out.println(course);
		
		String a = "bola";
		String b = "bola";
		String c = new String("bola");
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a.equals(b));
		System.out.println(a.equals(c));
		System.out.println(course.substring(4, 12));
		System.out.println(course.substring(7));
	}

}
