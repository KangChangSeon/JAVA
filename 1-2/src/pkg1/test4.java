package pkg1;

class A
{
	public void method(I i)
	{
		i.method();
	}
}

interface I
{
	public void method();
}

class B implements I
{
	public void method()
	{
		System.out.println("B 클래스의 메서드");
	}
}

class C implements I
{
	public void method()
	{
		System.out.println("C 클래스의 메서드");
	}
}

public class test4 
{

	public static void main(String[] args) 
	{
		A a = new A();
		a.method(new C());
	}

}
