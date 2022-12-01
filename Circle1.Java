public class Circle1 
    {
    	//Data member
    double pi=3.14;
	int r;
	double area;
	//Constructor
	public Circle1(int r) 
	{
		super();
		this.r = r;
	}
	//Area method
	public double Area()
	{
		return area=pi*r*r;
	}
	public static void main(String[] args) {
	// TODO Auto-generated method stub
   Circle1 c1=new Circle1(4);//first object creation
   System.out.println("Area Of First Circle:- "+c1.Area());//calling method
   Circle1 c2=new Circle1(20);//second object creation
   System.out.println("Area Of Second Circle:- "+c2.Area());//calling method
    }
  }

/*Output:

Area Of First Circle:- 50.24
Area Of Second Circle:- 1256.0

*/