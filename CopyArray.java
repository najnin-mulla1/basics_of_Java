//WAP on how to copy the value of one array to another array
package basicprograms;

import java.util.Arrays;

public class CopyArray
{

	public static void main(String[] args)
	{
		double Esalary[]=new double[3];
		Esalary[0]=89563.45;
		Esalary[1]=57863.45;
		Esalary[2]=82483.45;
		double Msalary[]=new double[3];
		
		for(int i=0;i<Esalary.length;i++)
		{
			Msalary[i]=Esalary[i];
		}
System.out.println(" Old Array is-> ");
System.out.println(Arrays.toString(Esalary));
System.out.println(" Copy of an existed Array is-> ");
System.out.println(Arrays.toString(Msalary));

	}

}
