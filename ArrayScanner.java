//WAP to create an array by using scanner class with double datatpe
package basicprograms;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayScanner
{

	public static void main(String[] args)
	{
//int rollno[]=new int[4];
double rollno[]=new double[4];

Scanner s1=new Scanner(System.in);
for(int i=0;i<rollno.length;i++)
{
	rollno[i]=s1.nextDouble();
}
System.out.println(Arrays.toString(rollno));

s1.close();
	}

}
