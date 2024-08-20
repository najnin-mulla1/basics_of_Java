//WAP on Accept number from user and calculate CircumferenceofRectangle 
package basicprograms;

import java.util.Scanner;

public class CircumferenceofRectangle
{
	public static void main(String[] args)
	{
		System.out.println("Please enter the value of a");
		System.out.println("Please enter the value of b");

		Scanner s1=new Scanner(System.in);
		double a=s1.nextDouble();
		double b=s1.nextDouble();
	
		double CircumferenceofRectangle=2*(a+b);
		System.out.println("Area of the circle is:"+CircumferenceofRectangle);
		s1.close();

	}

}
