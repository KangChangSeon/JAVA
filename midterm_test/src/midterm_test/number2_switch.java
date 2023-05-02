package midterm_test;

import java.util.Scanner;

public class number2_switch 
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
		
		//switch 구문을 사용하기 위해 result 값에 score/10으로 처리//
		int result = score/10;
		
		
		//switch문 result 값으로 실행 및 출력//
		switch(result)
		{
		case 10:
		case 9:
			{
				System.out.println("A학점 입니다.");
				break;
			}
		case 8:
			{
				System.out.println("B학점 입니다.");
				break;
			}
		case 7:
			{
				System.out.println("C학점 입니다.");
				break;
			}
		case 6:
			{
				System.out.println("D학점 입니다.");
				break;
			}
		default:
				System.out.println("F학점 입니다.");
		}
	}

}
