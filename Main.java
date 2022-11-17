package Assign6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Main {
       public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Agent>data=new ArrayList<>();//create arraylist
data.add(new Agent("Sushant",102,"Satara"));
data.add(new Agent("Nimbalkar",101,"Pune"));
data.add(new Agent("Anuj",103,"Mumbai"));
data.add(new Agent("Akash",107,"Punjab"));
data.add(new Agent("ram",106,"Delhi"));
Collections.sort(data);//for sorting
for(Agent a:data)//used for loop
{
 System.out.println("Agent Name:-"+a.getName()+" ID:-"+a.getId()+" Area:-"+a.getArea());//printing data
}
}
}
class Agent implements Comparable<Agent>
{
	//declare private data member
  private String name;
  private int id;
  private String area;
  //getter and setter method
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
//constructor with fields
public Agent(String name, int id, String area) {
	super();
	this.name = name;
	this.id = id;
	this.area = area;
}
//compareTo method
@Override
public int compareTo(Agent o) {
	// TODO Auto-generated method stub
	return area.compareToIgnoreCase(o.area);
} 
}
/*Output:

java -cp /tmp/gACy7zw6e5 Main
Agent Name:-ram ID:-106 Area:-Delhi
Agent Name:-Anuj ID:-103 Area:-Mumbai
Agent Name:-Nimbalkar ID:-101 Area:-Pune
Agent Name:-Akash ID:-107 Area:-Punjab
Agent Name:-Sushant ID:-102 Area:-Satara

*/