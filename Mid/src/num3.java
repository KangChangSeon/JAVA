class Rect
{
	private int width, height;
	private char fillChar;
	public Rect()
	{
		this(1,10);
	}
	
	public Rect(int height, int width)
	{
		this.width = width;
		this.height = height;
	}
	public void draw()
	{
		for(int i =0; i<height; i++)
		{
			for(int j=0; j<width; j++)
			{
				System.out.print(this.fillChar);
			}
			System.out.println();
		}
	}
	
	public void fill(char c)
	{
		this.fillChar = c;
	}
	
}
public class num3
{
	public static void main(String[]args)
	{
		Rect a = new Rect();
		Rect b = new Rect(2,10);
		a.fill('%');
		b.fill('$');
		a.draw();
		b.draw();
	}
}	
