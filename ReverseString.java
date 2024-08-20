//WAP to reverse a string
package basicprograms;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		
		String input="school";
		String output="";
		for(int i=5;i>=0;i--)
		{
			char c1=input.charAt(i);
			output=output+c1;
		}
			System.out.println("The reverse of the input is:"+output);
		
	}

}
