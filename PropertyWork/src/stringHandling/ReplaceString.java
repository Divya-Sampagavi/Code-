package stringHandling;

import java.lang.invoke.MethodHandles.Lookup.ClassOption;

public class ReplaceString {

	public static void main(String[] args) {
		String s1="This is a good Practice time";
		String replaceString = s1.replace(" ", "");
//		length() method is used to find length of String
		int result = s1.length() - replaceString.length();
		System.out.println("spaces = "+ result);
		System.out.println(replaceString);
		String [] words = s1.split(" ");
//		length method is used to find length of array
		int wordsCount = words.length;
		System.out.println("no of words = " + wordsCount);
		System.out.println("Value of String is: " + words[3]);
		String subString1 = s1.substring(5, 12);
		System.out.println("substring is :" + 	subString1);
		
	}
}
