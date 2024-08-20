//WAP on constructorOverloading

package basicprograms;
public class ConstructorOverloading 
 {
	ConstructorOverloading()
		{
			System.out.println("This is a constructor");
			
		}
	ConstructorOverloading(int a)
	{
		System.out.println("This is a parametarized constructor");
		
	}
	ConstructorOverloading(int a,double b)
	{
		System.out.println("This is a 2 parametarized constructor");
		
	}

		public static void main(String[] args)
		{
			new ConstructorOverloading(); 
			new ConstructorOverloading(100);
			new ConstructorOverloading(77,7.88);
		}
	}



