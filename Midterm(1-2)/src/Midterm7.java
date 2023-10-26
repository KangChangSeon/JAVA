class Triangle
{
	int height, base;
	
	void set(int x, int y)
	{
		this.base = x;
		this.height = y;
	}
	
	void cacul()
	{
		System.out.printf("삼각형의 면적은 : %d",base*height/2);
	}
	
}

public class Midterm7 
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.set(5,2);
		t.cacul();
	}
}
