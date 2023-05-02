//90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D 그 외는 F를 주는 학점 계산기를 if 문으로 작성하라//

package midterm;

import java.util.Scanner;

public class test7 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("학점을 입력해주세요 : ");
		int score=scan.nextInt();
		
		if (score>100 || score<0)
			System.out.println("점수를 잘못 입력하셨습니다.");
		else if (score>=90)
			System.out.println("A학점입니다.");
		else if (score >=80)
			System.out.println("B학접입니다.");
		else if (score >=70)
			System.out.println("C학접입니다.");
		else if (score >=60)
			System.out.println("D학접입니다.");
		else
			System.out.println("F학접입니다.");
	}
}

