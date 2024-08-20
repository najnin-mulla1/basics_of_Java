/*WAP on if condition Male and Female: If female, travelling is free; 
If Male and less than or equals to 12 then half ticket;
More than12 till 59 then full ticket;
else more than 60 then senior citizen ticket*/
package basicprograms;
public class NestedIfElse
{
		public static void main(String[] args)
		{
		char gender1 = 'M';
		char gender2 = 'F';
		int a=54;
		if(gender1=='F')
			{
			System.out.println("Travelling is Free");
			}	
		else {
			if(a<=12)
			{
					System.out.println("Male Traveller-Half Ticket");
			}
			else if(a>=12 && a<=59) 
		{
			System.out.println("Male Traveller-Full Ticket");
		}
		else
		{
			System.out.println("Male Traveller-Senior citizen Ticket");
		}
			}
		}
}		


