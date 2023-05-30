public class teststudy2
{
	public static void main(String[] args)
	{
		PlayingCard card = new PlayingCard(1,1);
	}
}

class PlayingCard
{
	//Instance
	int kind;
	int num;
	
	//Static
	static int width;
	static int height;
	
	PlayingCard(int k , int n)
	{
		//Local
		kind = k;
		num = n;
	}
}