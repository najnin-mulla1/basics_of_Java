//WAP on Switchcase
package basicprograms;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args)
	{
		System.out.println("Select the correct option:");
		Scanner s1=new Scanner(System.in);
		int option_selection=s1.nextInt();
		switch(option_selection)
		{
		case 1: System.out.println("value is 1");
		break;
		case 2: System.out.println("value is 2");
		break;
		case 3: System.out.println("value is 3");
		break;
		default: System.out.println("None of the above");
		}
		s1.close();

	}

}
