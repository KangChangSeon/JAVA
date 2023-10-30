import java.util.Scanner;

class Sqaure
{
	int width, height;
	
	void set()
	{
		Scanner scan = new Scanner(System.in);
		this.width = scan.nextInt();
		this.height = scan.nextInt();
	}
	
	void calculate()
	{
		System.out.printf("가로, 세로의 길이가 %d와 %d인\n",width,height);
		System.out.printf("직사각형의 둘레 : %d\n",width*2+height*2);
		System.out.printf("직사각형의 면적 : %d",width*height);
	}
}

public class num2 
{
	public static void main(String[] args)
	{
		Sqaure s = new Sqaure();
		s.set();
		s.calculate();
	}
}
