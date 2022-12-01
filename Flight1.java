package Assign8;
import java.util.Scanner;
 public class Flight1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("Enter the no. of Rows");//User Input
    Scanner sc=new Scanner(System.in);
    int r=sc.nextInt();
    //declare data member
    boolean flag=true;
    int sum=0;
    if(r<0)//check condition
    {
    	System.out.println("Invalid Input");//print
    }
    else
    {
    	for(int i=0;i<r;i++)//for loop
    	{
    		int people=sc.nextInt();
    		//if condition
    		if(people<0)
    		{
    			System.out.println("Invalid Input");//print
    			flag=false;
    			break;
    		}
    		else
    		{
    			sum+=people;//calculate
    			System.out.println(people);//print
    		}
    	}
    	//condition
    	if(flag==true)
    	{
    		//print sum 
    		System.out.println("Total number of pacenger in flite:- "+sum);
    	}
    }
    sc.close();
	}
}