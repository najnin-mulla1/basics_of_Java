//WAP on Accept number from user and calculate AreaofTrapezium
package basicprograms;

import java.util.Scanner;

public class AreaofTrapezium
{

	public static void main(String[] args)
	{
		System.out.println("Please enter the value of a");
		System.out.println("Please enter the value of b");
		System.out.println("Please enter the value of h");

		Scanner s1=new Scanner(System.in);
		double a=s1.nextDouble();
		double b=s1.nextDouble();
		double h=s1.nextDouble();

		double AreaofTrapezium=((a+b)*h)/2;
		System.out.println("Area of the Trapezium is:"+AreaofTrapezium);
		s1.close();

	}

}
