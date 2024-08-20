//WAP on Method Overloading
package basicprograms;
public class MethodOverloading 
{	static void add(int a)
	{		System.out.println("1");   }
	static void add()
	{
		System.out.println("2");
	}
	static void add(String a,char b,double c)
	{
		System.out.println("3");
	}
	static void add(String a)
	{
		System.out.println("4");
	}
	static void add(boolean a)
	{
		System.out.println(a);
	}
	public static void main(String[] args)
	{	add();
		add(100);
		add("Najnin");
		add("Aafia",'M',1.11);
		add(true);}}
