//WAP on Accept number from user and calculate Area of circle (formula πr square, PI=3.14) 
package basicprograms;

import java.util.Scanner;

public class AreaofCircle
{
final static double pi=3.14;
	public static void main(String[] args)
	{
		System.out.println("Please enter the value of r");
		Scanner s1=new Scanner(System.in);
		double r=s1.nextDouble();
		double area=pi*r*r;
		System.out.println("Area of the circle is:"+area);
		s1.close();

	}

}
