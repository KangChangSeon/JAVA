package report;

import java.util.Scanner;

public class report3 
{

	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		System.out.print("점수를 입력하시오>");
		int num = scanner.nextInt();
		
		if (num>100 || num<0)
		{
			System.out.println("점수를 잘못 입력하셨습니다.");
			return;
		}
		
		int val = num/10;
		
		
		switch (val)
		{
		case 10:
		case 9:
			System.out.println("A 학점입니다.");
			break;
		case 8:
			System.out.println("B 학점입니다.");
			break;
		case 7:
			System.out.println("C 학점입니다");
			break;
		case 6:
			System.out.println("D 학점입니다.");
			break;
		default:
			System.out.println("F 학점입니다.");
			break;
		}
	}

}
