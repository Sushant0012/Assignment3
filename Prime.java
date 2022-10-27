public class Prime  
{  
public static void main(String[] args)   
    {  
int ct=0,n=0,i=1,j=1;  
while(n<25)  
{  
j=1;  
ct=0;  
while(j<=i)  
{  
if(i%j==0)  
ct++;  
j++;   
}  
if(ct==2)  
{  
System.out.printf("%d ",i);  
n++;  
}  
i++;  
}    
}  
}  


/*Output:

23 5 7 11 13 17 19 23 29 3137 41 43 47 53 59 61 6771 73 79 83 89 97 

*/