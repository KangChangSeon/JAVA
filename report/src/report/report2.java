package report;

import java.util.Scanner;

public class report2 
{

	public static void main(String[] args) 
	{		
		Scanner scanner = new Scanner(System.in);
		System.out.print("점수를 입력하시오>");
		int num = scanner.nextInt();
		
		if (num>100 || num<0)
			System.out.println("점수를 잘못 입력하셨습니다.");
		else if (num>=90)
			System.out.println("A 학점입니다.");
		else if (num>=80)
			System.out.println("B 학점입니다.");
		else if (num>=70)
			System.out.println("C 학점입니다.");
		else if (num>=60)
			System.out.println("D 학점입니다.");
		else
			System.out.println("F 학점입니다");
	}

}
