package midterm;

import java.util.Scanner;

public class test3 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.print("변수 ch의 값을 입력하시오 : ");
		String ch = scan.nextLine();
		
        if (ch.equals(" ") || ch.equals("\t")) 
        {
            System.out.printf("True");
        } 
        else 
        {
            System.out.println("False");
        }
	}
}

