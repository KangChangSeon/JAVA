class MyPoint extends Object
{
	int x;
	int y;
}

class Circle extends Object
{
	MyPoint p;
	int r;
}


public class test8
{

	public static void main(String[] args) 
	{
		Circle c = new Circle();
		System.out.println(c.toString());
		Circle c2 = new Circle();
		System.out.println(c2.toString());
		System.out.println(c2);
	}
}
