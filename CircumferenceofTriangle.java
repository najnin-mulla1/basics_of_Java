//WAP on Accept number from user and calculate Circumference of triangle 
package basicprograms;

import java.util.Scanner;

public class CircumferenceofTriangle
{
	public static void main(String[] args)
	{
		System.out.println("Please enter the value of a");
		System.out.println("Please enter the value of b");
		System.out.println("Please enter the value of c");

		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		int b=s1.nextInt();
		int c=s1.nextInt();
		int c1=a+b+c;	
		
		System.out.println("Circumference of the Triangle is:"+c1);
		s1.close();

	}

}
