//In an Array of int data type of size four the values are 100,200, 300 and 400.Check if the given number is a part of Array or not?
package basicprograms;

public class PartOfArray_Not {

	public static void main(String[] args)
{
		int rollno[]=new int[4];
		rollno[0]=100;
		rollno[1]=200;
		rollno[2]=300;
		rollno[3]=400;
		int givennumber=400;
		
		for(int i=0;i<rollno.length;i++)
		{
			if(givennumber==rollno[i])
			{
				System.out.println("Given number is a part of the array, at the index position= "+i);
			}
			else
			{
				System.out.println("Sorry Not Found");
			}
		}
	}

}
