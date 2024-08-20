package basicprograms;

public class StaticAndNonStatisMethods 

{
	static void add()
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
		add();
		NonStaticMethod n1=new NonStaticMethod();
	    n1.sub();
	}	    		
	 
}
