import java.util.Scanner;

public class test4 {

	public static void main(String[] args) 
	{
//		Scanner sc1 = new Scanner(System.in);
//		System.out.print("사각형의 가로 세로 높이의 길이를 입력하시오 :");
//		int len = sc1.nextInt();
//		int hei = sc1.nextInt();
//		int wid = sc1.nextInt();
//		//
//		
//		Square s = new Square();
//		s.length = len;
//		s.height = hei;
//		s.width = wid;
//		
//		System.out.println("사각형의 부피는 : " + s.area());
		
		Scanner scan = new Scanner(System.in);
		int height = scan.nextInt();
		int width = scan.nextInt();
		int length = scan.nextInt();
		
		Sqaure s = new Sqaure();
//		s.getheight(height);
//		s.getlength(length);
//		s.getwidth(width);
		s.Square(height, length, width);
		
		
		System.out.println(s.getresult());
	}

}

//class Square
//{
//	int height;
//	int length;
//	int width;
//	
//	int area()
//	{
//		return height * length * width;
//	}
//	
//}

class Sqaure
{
	private int height, length, width;
	
	public void Square(int height, int length, int width)
	{
		this.height = height;
		this.width = width;
		this.length = length;
	}

//	public void getheight(int height)
//	{
//		this.height = height;
//	}
//	public void getwidth(int width)
//	{
//		this.width = width;
//	}
//	public void getlength(int length)
//	{
//		this.length = length;
//	}
	public int getresult()
	{
		return this.length * this.height * this.width;
	}
}