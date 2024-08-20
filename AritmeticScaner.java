//WAP o accept 2 nos from user and perform ll arithmatic operations:
package basicprograms;
import java.util.Scanner;
public class AritmeticScaner
{
		public static void main(String[] args) 
		{
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the vlue of a");
		int a= s1.nextInt();
		System.out.println("Please enter the vlue of b");
		int b= s1.nextInt();
		int sum=a+b;
		int sub=a-b;
		int mul=a*b;
		int div=a/b;
		int mod=a%b;
		System.out.println("Addition is:"+sum);
		System.out.println("Subtraction is:"+sub);
		System.out.println("Multiplication is:"+mul);
		System.out.println("Division is:"+div);
		System.out.println("Remainder is:"+mod);
		s1.close();
	}
}
