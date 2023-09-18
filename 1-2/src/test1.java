class AddSub
{
	public int add(int x, int y)
	{
		int add = x+y;
		return add;
	}
	
	public int sub(int x, int y)
	{
		int sub = x-y;
		return sub;
	}
}



public class test1 
{

	public static void main(String[] args) 
	{
		AddSub as = new AddSub();
		
		int add4 = as.add(5, 3);
		System.out.println("두개의 값의 합은 "+ add4+"입니다.");
		int sub4 = as.sub(6, 3);
		System.out.println("두개의 값의 차는 "+ sub4+"입니다.");
	}

}
