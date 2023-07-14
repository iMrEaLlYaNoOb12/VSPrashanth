package com.vastpro.corejavalabassignmentmain;

public class StringHandlingMain {

	public static void main(String[] args) {
		String strObj = new String("Hello World");
		System.out.println(strObj);
		System.out.println("Length of the String :" + strObj.length());

		String conCat = strObj.concat(" people...");
		System.out.println("\nConcatenation of two strings : " + conCat);

		System.out.println("\nLower case to Upper case : ");
		conCat = conCat.toUpperCase();
		System.out.println(conCat);

		System.out.println("\nUpper case to Lower case : ");
		conCat = conCat.toLowerCase();
		System.out.println(conCat);

		System.out.println("\nSubstring method from index 0 to 11... : ");
		System.out.println(conCat.substring(0, 11));

		System.out.println("\nReplacing characters using replace method from 'e' to 'i' ");
		System.out.println(conCat.replace('e', 'i'));

		String s1 = "helloworld";
		String s2 = "helloworld";
		String s3 = "hello world";

		System.out.println("\n" + s1.equals(s2));
		System.out.println(s1.equals(s3));

		String name1 = "Aarry";
		String name2 = "Allen";
		System.out.println(name2.compareTo(name1));
		
	}

}
