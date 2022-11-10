import java.util.ArrayList;
import java.util.*;

public class Customize_Exception {

	public static void  checkZeromembererror (int num)throws Exception
	{
		if(num<5)
		{
			throw new Zeromembererror("as a array member"); 
		}
		else
		{
			System.out.println("Invalid entry");
		}
	}
	public static void main(String[] args)
	{
		List l1=new ArrayList();
		
		l1.add(0);
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		int s=(int)l1.get(0);
	
		try
		{
			checkZeromembererror(0);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}