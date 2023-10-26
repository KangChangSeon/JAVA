import java.util.Random;
import java.util.Scanner;

public class Midterm8 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		int ran = r.nextInt(100)+1;
		int count = 0;
		int n = 0;
		
		do
		{
			try
			{
				System.out.print("100 이하의 숫자만 입력하세요 : ");
				n = new Scanner(System.in).nextInt();
			}
			
			catch(Exception e)
			{
				System.out.println("숫자만 입력하세요");
				continue;
			}
			
			if(ran>n)
			{
				count++;
				System.out.println("up");
			}
			else if(ran<n)
			{
				count++;
				System.out.println("down");
			}
			else
			{
				System.out.println("정답!");
				
				System.out.println("시도 횟수 : "+(count+1));
				break;
			}
		}
		while(true);
	}

}
