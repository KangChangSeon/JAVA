import java.util.Scanner;

public class test12 
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("사각형의 한 변의 길이를 입력하시오>>");
		int w = scan.nextInt();
		
		
		Square s = new Square();
		s.width = w;
		
		System.out.println("한 변의 길이가 "+s.width+"인 정사각형의 넓이 :"+s.area());
	}
}

class Square
{
	int width;
	
	int area()
	{
		return width * width;
	}
}
