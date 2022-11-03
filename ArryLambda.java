package Asign4;
import java.util.ArrayList;
import java.util.List;
public class ArryLambda 
{

	public static void main(String[] args) 
	{
		List<Integer> number = new ArrayList<Integer>();
		
		number.add(11);
		number.add(44);
		number.add(31);
		number.add(1);
		number.add(66);
		number.add(69);
		
		number.forEach((n)->
		{
			if(n%2==0) 
			{
				System.out.println("Number is Even :"+n);
			}
			else 
			{
				System.out.println("Number is Odd :"+n);
			}
		});
		
		
	}

}

/*Output:
Number is Odd :11
Number is Even :44
Number is Odd :31
Number is Odd :1
Number is Even :66
Number is Odd :69
*/