package midterm;

import java.util.Scanner;

public class test2 {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("변수 X의 값을 입력하시오 : ");
		int x = scan.nextInt();
		
		if (x>20 || x>10)
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}

}
