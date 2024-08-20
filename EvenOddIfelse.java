//WAP to check number is even or odd using if else statement:
package basicprograms;
import java.util.Scanner;

public class EvenOddIfelse {

	public static void main(String[] args)
	{
		System.out.println("Please enter the number:");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is Even");
		}
		else
		{
			System.out.println("The number is Odd");

		}
		s1.close();

	}

}
