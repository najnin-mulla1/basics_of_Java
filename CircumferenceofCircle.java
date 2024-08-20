//WAP on Accept number from user and calculate Circumference of circle
package basicprograms;

import java.util.Scanner;

public class CircumferenceofCircle
{
final static double pi=3.14;
	public static void main(String[] args)
	{
		System.out.println("Please enter the value of r");
		Scanner s1=new Scanner(System.in);
		double r=s1.nextDouble();
		double area=2*pi*r;
		System.out.println("Circumference of the circle is:"+area);
		s1.close();

	}

}