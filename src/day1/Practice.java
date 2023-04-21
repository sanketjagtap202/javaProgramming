package day1;

import java.lang.invoke.StringConcatException;

public class Practice {

	public static void main(String[] args) {

		// Reverse the string:

//		String str = "Welcome";
//		String reverStr = "";
//		for (int i = 0; i < str.length(); i++) {
//			reverStr = str.charAt(i) + reverStr;
//		}
//		System.out.println(reverStr);

//Swapping strings:

		String str1 = "codegram";
		String str2 = "welcome to";
		String str3 = "Youtube";
		str1 = str1 + str2;
		str2 = str1.substring(0, str1.length() - str2.length());
		System.out.println(str2);
		str1 = str1.substring(str2.length());
		System.out.println(str1);
		System.out.println(str1 + "" + "" + str2);

	
	}

}
