package Assign6;

import java.util.HashMap;

public class HashMap_square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<Integer,Integer>data=new HashMap<>();//create HashMap
data.put(1, 1);
data.put(2,4);
data.put(3,9);
data.put(4,16);
data.put(5, 25);
data.put(6, 36);
data.put(7,49);
data.put(8,56);
data.put(9,81);
data.put(10,100);
data.put(11,121);
data.put(12,144);
data.put(13, 169);
data.put(14, 196);
data.put(15, 225);
for(Integer n:data.values())//using for loop
{
		System.out.println(n);//print values
}
  }
}


/*Output:
java -cp /tmp/gACy7zw6e5 HashMap_square
1
4
9
16
25
36
4956
81
100
121
144
169
196
225
*/