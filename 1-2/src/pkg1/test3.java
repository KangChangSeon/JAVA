package pkg1;

abstract class Unit2
{
	int x,y;
	abstract void move(int x, int y);
	
	void stop()
	{
		System.out.println("멈춤");
	}
}

interface Fightable
{
	void move(int x, int y);
	public abstract void attack(Fightable f);
}

class Fighter extends Unit2 implements Fightable
{
	public void move(int x, int y) 
	{
		System.out.println("["+x+","+y+"]");
	}
	
	public void attack(Fightable f)
	{
		System.out.println(f+"를 공격");
	}
}

public class test3 
{

	public static void main(String[] args) 
	{
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
	}

}
