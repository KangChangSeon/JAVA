//2번 문제 학점 입력 프로그램 if 문으로 작성//
package midterm_test;

import java.util.Scanner;

public class number2 
{

	public static void main(String[] args) 
	{
		//0~100의 정수를 입력 받아 score에 값을 저장//
		Scanner scan = new Scanner(System.in);
		System.out.print("0~100까지의 정수 값을 입력하시오 : ");
		int score = scan.nextInt();
		
		//100점을 넘어서거나 0점 미만이면 예외처리로 프로그램 종료//
		if (score>100 || score<0)
		{
			System.out.println("점수를 잘못 입력하셨습니다.");
			return;
		}
		
		
		//score 점수를 받아 A~F 학점 출력 프로그램 시작//
		if (score>=90)
			System.out.println("A학점 입니다.");
		else if (score>=80)
			System.out.println("B학점 입니다.");
		else if (score>=70)
			System.out.println("C학점 입니다.");
		else if (score>=60)
			System.out.println("D학점 입니다.");
		else
			System.out.println("F학점 입니다.");
		
	}

}
