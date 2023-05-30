import java.util.Scanner;

public class test13 
{

	public static void main(String[] args) 
	{
		BankAccount BA = new BankAccount();
		BA.Allmoney = 0;
		BA.name = "강창선";
		BA.account = "111-111-111";
		
		Scanner scan = new Scanner(System.in);
		System.out.print("예금주 이름을 작성해 주세요 :");
		String name = scan.nextLine();
		if (name.equals(BA.name))
		{
			System.out.print("계좌 번호를 입력해 주세요:");
			String account = scan.nextLine();
			if (account.equals(BA.account))
			{
				System.out.print("예금은 1번 출금은 2번을 눌러주세요:");
				int num = scan.nextInt();

				switch(num)
					{
					case 1:
					{
						System.out.print("입금할 금액을 입력하세요:");
						int money = scan.nextInt();
						
						BA.money = money;
						System.out.println("현재 잔액은 :"+BA.Inmoney());
					}
					case 2:
					{
						System.out.print("출금할 금액을 입력하세요:");
						int money = scan.nextInt();
						
						BA.money = money;
						System.out.println("현재 잔액은 :"+BA.Outmoney());
					}
					default:
					{
						System.out.println("잘못 입력하셨습니다.");
						return;	
					}
				}
			}
			else
			{
				System.out.println("계좌 번호가 틀립니다.");
			}
		}
		else
		{
			System.out.println("예금주 이름이 동일하지 않습니다.");
		}
		
	}

}

class BankAccount
{
	String name; //예금주
	String account; //계좌번호
	static int money; //금액
	static int Allmoney; //잔액

	int Inmoney()
	{
		Allmoney += money;
		return Allmoney;
	}
	int Outmoney()
	{
		Allmoney -= money;
		return Allmoney;
	}
}


// 예금주 이름과 계좌번호가 확인이 되면 인출하기 예금하기 고르기//