package Assign7;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class File_h1
{
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
     File obj=new File("C:\\new\\Sushh.txt");
     System.out.println("Print words whos length greater than 5");
     Scanner sc=new Scanner(obj);
     String str="";
     String s=sc.nextLine();
     //for loop
     for(int i=0;i<s.length();i++)
     {
    	 if(s.charAt(i)!=' ') //if condition for checking space
    	 {
    		 str+=s.charAt(i);
    	 }
    	 else
    	 {
    		if(str.length()>5)//condition for length is greater then 5
    			System.out.println(str+" ");//pritn words
    		str=" "; 
    	 }
     }
     sc.close();
	}
}