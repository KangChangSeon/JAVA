class Operation
{
	int a,b;
	
	void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	
}

class Add extends Operation
{	
	int calculate()
	{
		return this.a + this.b;
	}
}

class Sub extends Operation
{
	int calculate()
	{
		return this.a - this.b;
	}
}

class Mul extends Operation
{	
	int calculate()
	{
		return this.a * this.b;
	}
}

class Div extends Operation
{	
	int calculate()
	{
		return this.a / this.b;
	}
}


public class exam1 {

	public static void main(String[] args)
	{
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		
		add.setValue(1, 3);
		sub.setValue(2, 3);
		mul.setValue(2, 5);
		div.setValue(6, 3);
		System.out.println(add.calculate());
		System.out.println(sub.calculate());
		System.out.println(mul.calculate());
		System.out.println(div.calculate());
	}

}
