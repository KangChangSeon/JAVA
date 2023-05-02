
import java.util.Scanner;
public class test2 
{
	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("점수를 입력하시오>");
		String score=scan.nextLine();
		int num=Integer.parseInt(score);
		
		
		if(num>80)
		{
			if(num>=95)
				System.out.println("A+");
			else
				System.out.println("A");
		}
		else if(num>70)
			System.out.println("B");
		else if(num>60)
		{
			if(num>=65)
				System.out.println("C+");
			else
				System.out.println("C");
		}
		else
		System.out.println("F");
	}
}
