package pkg1;

class Card2
{
	String kind;
	int val;
	
	Card2()
	{
		this("Spade",1);
	}
	Card2(String kind, int val)
	{
		this.kind = kind;
		this.val = val;
	}
	
	public String toString()
	{
		return "kind :"+kind+", val :"+val;
	}
	
	public String toString(String a, int b)
	{
		return "kind :"+a+", val :"+b;
	}
}

public class test8 {

	public static void main(String[] args) 
	{
		Card2 c1 = new Card2();
		Card2 c2 = new Card2("Diamond",12);
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c2.toString("Heart",10));
	}

}
