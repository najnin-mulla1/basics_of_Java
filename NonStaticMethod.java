//Calling Non-static methods in main method
package basicprograms;
public class NonStaticMethod {
		 void add()
		{
			int a=50;
			int b=60; 
			int sum=a+b;
			System.out.println(sum);
		}
		void sub()
		{
			int a=50;
			int b=60; 
			int subtraction=a-b;
			System.out.println(subtraction);
		}
	public static void main(String[] args)
	{
	    NonStaticMethod n1=new NonStaticMethod();
	    n1.add();
	    n1.sub();
	    }
	}