
package basicprograms;
public class Assignmet_IIB 
{
	static    //SIB
	{
		System.out.println("SIB");
	}
	Assignmet_IIB()       //constructor
	{
		System.out.println("Constructor");
	}
	Assignmet_IIB(int a)       //constructor
	{
		System.out.println("Constructor 1");
	}
	{                    //IIB
		System.out.println("IIB");
	}
	{                    //IIB
		System.out.println("IIB 2");
	}
public static void main(String[] args) 
{
	System.out.println("main method");
	new Assignmet_IIB();
	new Assignmet_IIB(1);
}
}