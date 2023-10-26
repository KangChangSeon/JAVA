import java.util.Scanner;
class Rect
{
	int width, height;
	String text;
	
	void set(int width, int height)
	{
		this.width = width;
		this.height = height;
	}
	
	void Show()
	{
		for(int i=0; i<height; i++)
		{
			for(int j=0; j<width; j++)
			{
				System.out.print(text);
			}
			System.out.println();
		}
	}
	
	void fill(String text)
	{
		this.text = text;
	}
	
}

public class Midterm1 
{

	public static void main(String[] args) 
	{
		Rect r = new Rect();
		r.set(4,3);
		r.fill("*");
		r.Show();
	}

}
