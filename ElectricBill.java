package Assign8;
import java.util.Scanner;
 class ElectricBill
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Unit");//User Input
    //declare data member
    int unit=0;
    double TotalCharges;
    unit=sc.nextInt();
    if(unit>0 && unit<=100)//check condition
    {
    	TotalCharges=unit*1.20;//calculate
    	System.out.println("Your Electricity Bill is:- "+TotalCharges);//print
    }
    else if(unit>100 && unit<=300)//check condition
    {
    	TotalCharges=unit*2.0;//calculate
    	System.out.println("Your Electricity Bill is:- "+TotalCharges);//print
    }
    else if(unit>300)//check condition
    {
    	TotalCharges=unit*3.0;//calculate
    	System.out.println("Your Electricity Bill is:- "+TotalCharges);//print
    }
    else
    {
    	//Invalid Input
    	System.out.println("Invalid Inpu0t");
    }
    sc.close();
	}
}

