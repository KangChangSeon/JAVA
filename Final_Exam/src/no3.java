
public class no3 
{

	public static void main(String[] args) 
	{
		Bank b = new Bank();
		b.owner = "강창선";
		b.accountNumber = 1111;
		b.balance = 30000;
		b.deposit(20000);
		System.out.println(b.owner+"님의"+" 계좌번호는:"+b.accountNumber+" 잔액은:"+b.balance);
		b.withdraw(10000);
		System.out.println(b.owner+"님의"+" 계좌번호는:"+b.accountNumber+" 잔액은:"+b.balance);
		
	}

}

class Bank
{
	String owner;
	int accountNumber;
	int balance;
	
	
	void deposit(int amount) { balance = balance + amount; }
	void withdraw(int amount) { balance = balance - amount; }
}
