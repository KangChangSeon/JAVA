
public class test7 
{
	public static void main(String[] args)
	{
		Circle cc = new Circle();
		cc.radius = 3;
		System.out.println(cc.circleDim(cc.radius));
	}

}

class Circle
{
	int radius;
	double circleDim(int radius)
	{
		double result = 3.14 * radius * radius;
		return result;
	}
}
