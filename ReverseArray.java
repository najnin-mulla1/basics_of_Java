//WAP to reverse an array
package basicprograms;
import java.util.Arrays;
public class ReverseArray {
	public static void main(String[] args)
	{
		int rollno[]=new int[3];
		rollno[0]=55;
		rollno[1]=45;
		rollno[2]=25;
		int reverse_array[]=new int[3];
		/*reverse_array[2]= 	rollno[0];
		reverse_array[1]= 	rollno[1];
		reverse_array[0]= 	rollno[2]; */
				for(int i=0,k=2;i<rollno.length;i++)
		{			 
			reverse_array[k]= 	rollno[i];
			k--;
		}
		/* for(int i=0,k=reverse_array.lenght-1;i<rollno.length;i++)
		  {
		  reverse_array[k]= 	rollno[i];
		  }/*
		 */
	System.out.println(Arrays.toString(rollno));
	System.out.println(Arrays.toString(reverse_array));
	}
}
