import java.util.*;
public class Spattern 
{
	public static void main(String[] args) 
	{
		int r1,r,c,d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the rows");
		r1=sc.nextInt();
		for(r=0;r<r1;r++)
		{
			System.out.println("*");
			for(c=0;c<=r1;c++)
			{
				if(r==r1-1)
					System.out.print("*");
				else
				System.out.print("");
			}
			System.out.print("\n");
		}	
}
}


/*Output:

Enter the rows4
*

*

*

*
*****

*/