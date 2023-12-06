package pkg2;
import pkg1.MyParent;

class MyChild extends MyParent
{
	private int prv;
	int dft;
	protected int prt;
	public int pub;
	
	public void printMembers()
	{
		prt = 23;
		System.out.println(prv);
		System.out.println(dft);
		System.out.println(prt);
		System.out.println(pub);
	}
}

public class MyParentTest2
{

	public static void main(String[] args) 
	{
//		MyParent p = new MyParent();
//		System.out.println(p.prv);
//		System.out.println(p.dft);
//		System.out.println(p.prt);
//		System.out.println(p.pub);
		MyChild c = new MyChild();
		c.printMembers();
	}
}
