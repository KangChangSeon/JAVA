import java.util.Scanner;

class Triangle
{
	int height, width;
	
	void set()
	{
		Scanner scan = new Scanner(System.in);
		this.width = scan.nextInt();
		this.height = scan.nextInt();
	}
	
	void cacul()
	{
		float result = width*height/2;
		System.out.printf("삼각형의 가로길이는:%d 높이는:%d 입니다.\n",width,height);
		System.out.printf("삼각형의 넓이는 : %.1f",result);
	}
	
}

public class num1 
{
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.set();
		t.cacul();
	}
}
