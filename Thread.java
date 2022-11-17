package Assign6;

public class Thread_que extends Thread
{  
	public void run()
	{
		//declare array
		int arr[]= {10,15,20,25,30};
		int square=1;
		for(int i=0;i<arr.length;i++)
		{
			square=arr[i]*arr[i];//find square
			System.out.println("Square "+arr[i]+" "+square);//print square
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Thread_que obj=new Thread_que();//creating object
   float avg=0;
   int sum=0;
   obj.start();//calling method
   for(int i=1;i<=50;i++)
   {
	   System.out.println(i);//print elements
	   sum+=i;//find sum
   }
   System.out.println("Sum:-"+sum);
   avg=sum/50;
   System.out.println("Average:-"+avg);//print average
	}
}

/*Output:
java -cp /tmp/gACy7zw6e5 Thread_que
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
19
20
21
22
23
24
25
26
27
28
29
30
31
32
33
34
35
36
37
38
39
40
41
42
43
44
45
46
47
48
49
50
Sum:-1275
Average:-25.0
Square 10 100Square 15 225
Square 20 400
Square 25 625
Square 30 900
*/