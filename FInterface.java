package Assign4;
import java.util.ArrayList;
import java.util.List;

// functional interface
interface Addition  // 
{
	public int Adder(int x, int y);
}

public class FInterface 
{

	public static void main(String[] args) 
	{
			List<String> name=new ArrayList<String>(); // array list
		name.add("Sushant");
		
		name.forEach((m)->  // lambda expression
		{
			System.out.println(m.toUpperCase());  // use UpperCase method
			
		});
		
		Addition a=(n,m)->  // lambda expression
		{
			return n+m;
		};
		
		System.out.println(a.Adder(3, 6));
		
		
	}

}

/*Output:

Sushant
9
*/