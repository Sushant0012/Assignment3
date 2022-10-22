package com.code;

public class Hcf {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	       int a=60;
	       int b=36;
	       int hcf=0;
	       for(int i=1;i<=a || i<=b;i++)
	       {
	    	   if(a%i==0 && b%i==0)
	    	   {
	    		   hcf=i;
	    	   }
	       }
	       System.out.println(hcf);
		}

	}
	
/*Output:
12

*/