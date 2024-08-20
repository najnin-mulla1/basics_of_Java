//WAP to count alphabets,numbers and spaces in the given string.
package basicprograms;
public class CountofAlphaNume {
static int count_of_alphabet=0;
static int count_of_numeric=0;
static int count_of_space=0;
	public static void main(String[] args) {		
String input="kv no 8976 bangalore";
char []c1=input.toCharArray();
//System.out.println(Arrays.toString(c1));
System.out.println("Finding Alphabet:");
for(int i=0;i<input.length();i++)
{	boolean answer1=Character.isAlphabetic(c1[i]);
	//System.out.println(answer1);
	if(answer1==true)
	{
		count_of_alphabet++;
	}
	}
System.out.println("The total Aphabets are-> " +count_of_alphabet);
System.out.println("Finding Numeric:");
for(int i=0;i<input.length();i++)
{	boolean answer1=Character.isDigit(c1[i]);
//	System.out.println(answer1);
	if(answer1==true)
	{
		count_of_numeric++;
	}
	}
System.out.println("The total Numeric are-> " +count_of_numeric);
System.out.println("Finding Spaces:");
for(int i=0;i<input.length();i++)
{	boolean answer1=Character.isSpaceChar(c1[i]);
//	System.out.println(answer1);
	if(answer1==true)
	{
		count_of_space++;
	}
	}
System.out.println("The total Spaces are-> " +count_of_space);}}
