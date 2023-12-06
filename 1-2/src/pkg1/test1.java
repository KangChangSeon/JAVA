package pkg1;

class Tv
{
	public void power()
	{
		System.out.println(1);
	}
}

class SmartTv extends Tv
{
	public void power()
	{
		System.out.println(2);
	}
}

public class test1 
{

	public static void main(String[] args) 
	{
		Tv t = new SmartTv();
		t.power();
	}

}
