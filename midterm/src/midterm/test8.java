//90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D 그 외는 F를 주는 학점 계산기를 switch 문으로 작성하라//

package midterm;

import java.util.Scanner;

public class test8 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("학점을 입력해주세요 : ");
		int score=scan.nextInt();
		if (score>100 || score<0)
		{
			System.out.println("점수를 잘못 입력하셨습니다.");
			return;
		}
		
		
		int sw=(int)score/10;
		
		switch(sw)
		{
		case 10:
		case 9:
			System.out.println("A학점입니다.");
			break;
		case 8:
			System.out.println("B학점입니다.");
			break;
		case 7:
			System.out.println("C학점입니다.");
			break;
		case 6:
			System.out.println("D학점입니다.");
			break;
		default:
			System.out.println("F학점입니다.");
			
		}
	}
}

