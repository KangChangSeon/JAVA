import java.util.Scanner;

public class test3 {

	public static void main(String[] args) 
	{
		String[] words = { "television","computer","mouse","phone"};
		
		Scanner scan = new Scanner(System.in);
		
		for (int i = 0; i < words.length; i++)
		{
			char [] question = words[i].toCharArray();
			
			
			for (int j =0; j < question.length; j++)
			{
				int rand = (int)(Math.random()* question.length);
				//question[?] ?에 들어갈 랜덤값을 얻기 위해 int rand 선언//
				char tmp = question[j];
				question[j] = question[rand];
				question[rand] = tmp;
				
			}
			
			
			System.out.printf(":Q%d, %s의 정답을 입력하세요>",i+1,new String(question));
			
			String answer = scan.nextLine();
			
			if (words[i].equals(answer.trim()))
			{
				System.out.println("정답");
			}
			else
			{
				System.out.println("오답");
			}
		}
	}

}
