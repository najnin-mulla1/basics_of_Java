// WAP to check if given 2 strings are anagram of each other. 
package basicprograms;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args)
	{
		String name="madam";
		String name1="madam";
		if(name.length()!=name1.length())
		{
			System.out.println("Given word is not a anagram");
		}
		else
		{
			char []c1=name.toCharArray();
			char []c2=name1.toCharArray();
			//Arrays.sort(c1);
		//	Arrays.sort(c2);
			System.out.println(Arrays.toString(c1));
			System.out.println(Arrays.toString(c2));
			boolean answer=Arrays.equals(c1, c2);
			System.out.println(answer);
	}
	}
}
