import java.util.Scanner;

public class test12 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("사각형의 한 변의 길이를 입력하시오>>");
		int width = scan.nextInt();
		
		
		Square s = new Square();
		s.setWidth(width);
		
		System.out.println("한 변의 길이가 "+s.getWidth()+"인 정사각형의 넓이 :"+s.area());
	}
}

class Square
{
	private int width;
	
	public void setWidth(int width)
	{
		this.width = width;
	}
	
	public int getWidth()
	{
		return this.width;
	}
	
	public int area()
	{
		return this.width*this.width;
	}
}

