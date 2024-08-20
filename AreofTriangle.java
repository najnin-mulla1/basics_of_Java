//WAP on Accept number from user and calculate Area of Triangle
package basicprograms;

import java.util.Scanner;

public class AreofTriangle
{
	public static void main(String[] args)
		{
		
		System.out.println("Please enter the value of b");
		System.out.println("Please enter the value of h");

		Scanner s1=new Scanner(System.in);
		int b=s1.nextInt();
		int h=s1.nextInt();
		double area=(b*h)/2;
		System.out.println("Area of the Triangle is:"+area);
		s1.close();

	}

}
