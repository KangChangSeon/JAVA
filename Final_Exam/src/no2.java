import java.util.Scanner;

public class no2 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Box b = new Box();
		System.out.print("가로의 길이를 입력하시오:");
		b.width = scan.nextInt();
		System.out.print("세로의 길이를 입력하시오:");
		b.height = scan.nextInt();
		System.out.print("높이의 길이를 입력하시오:");
		b.depth = scan.nextInt();
		
		System.out.println("박스의 부피는"+b.getVolume()+"입니다.");
	}

}



class Box
{
	int width;
	int height;
	int depth;
	
	int getVolume()
	{
		return width*height*depth;
	}
}