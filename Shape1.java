package Javapro;

class Shape
{
	void Display() 
	{
		System.out.println("Shape...");
	} 	
}
class Circle extends Shape
{
	void area( )
		{
		double p = 3.76;
		int r = 4;
		double a = p*r*r;
		System.out.println("Area of Circle= "+a+" sq.m");
		}
	
}
class Square extends Circle
{
	void area1( )
	{
		int S = 7;
		
		double a = S*S;
		System.out.println("Area of Square= " +a +"sq.m");
	
	}
	public static void main(String[] args) 
	{
		Square s = new Square();
		s.area();
		s.area1();
	
		
	

	}


}

/*Output:
Area of Circle= 240.64 sq.m
Area of Square= 49.0sq.m

*/