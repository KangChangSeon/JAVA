class Circle
{
	double pi = (float) Math.PI;
	double r;
	
	void set(double r)
	{
		this.r = r;
	}
	
	void circum()
	{
		System.out.printf("원의 둘레는: %.3f\n",2*pi*r);
	}
	
	void area()
	{
		System.out.printf("원의 면적은: %.3f",pi*Math.pow(r, 2));
	}
}


public class Midterm6 
{
	public static void main(String[]args)
	{
		Circle c = new Circle();
		c.set(3.0);
		c.circum();
		c.area();
	}
}
