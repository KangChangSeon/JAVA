class Rectangle
{
	int x1,x2,y1,y2;
	
	public Rectangle()
	{
		set(0,0,0,0);
	}
	
	public Rectangle(int a, int b, int c, int d)
	{
		set(a,b,c,d);
	}
	
	void set(int x1,int y1,int x2,int y2)
	{
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public int square()
	{
		return (x2 - x1) * (y2 - y1);
	}
	void show()
	{
		System.out.println(x1+","+y1+","+x2+","+y2+" / "+square());
	}
	
	boolean equals(Rectangle r)
	{
		return this.square() == r.square();
	}
	
}
public class exam2 
{

	public static void main(String[] args)
	{
		Rectangle r = new Rectangle();
		Rectangle s = new Rectangle(1,1,2,3);
		
		r.show();
		s.show();
		System.out.println(s.square());
		
		r.set(-2, 2, -1, 4);
		r.show();
		System.out.println(r.square());
		
		if(r.equals(s))
		{
			System.out.println("두 사각형은 같습니다.");
		}
	}

}
