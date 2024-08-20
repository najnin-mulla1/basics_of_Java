//WAP on Accept number from user and calculate Area of Rectangle
package basicprograms;

import java.util.Scanner;

public class AreaofRectangle
{
	public static void main(String[] args)
	{
		System.out.println("Please enter the value of l");
		System.out.println("Please enter the value of b");

		Scanner s1=new Scanner(System.in);
		double l=s1.nextDouble();
		double b=s1.nextDouble();

		double area=l*b;
		System.out.println("Area of the Rectangle is:"+area);
		s1.close();

	}

}
