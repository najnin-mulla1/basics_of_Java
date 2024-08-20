//WAP to check if the 2 arrays are equals to each other:
package basicprograms;

import java.util.Arrays;

public class Equals2Array {

	public static void main(String[] args)
	{
		int rollno[]=new int[4];
		int rollno1[]=new int[4];
		rollno[0]=11;
		rollno[1]=78;
		rollno[2]=35;
		rollno[3]=91;
		rollno1[0]=11;
		rollno1[1]=78;
		rollno1[2]=35;
		rollno1[3]=91;
		
		boolean b1=Arrays.equals(rollno, rollno1);
		System.out.println(b1);		
	}	
	}		
