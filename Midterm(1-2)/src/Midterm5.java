class TV
{
	boolean power;
	int channel;
	
	void power() { power = !power; }
	void channelUp() { ++channel; }
	void channelDown() { --channel; }
}

class SmartTv extends TV
{
	boolean caption;
	void displayCaption(String text)
	{
		if(caption)
		{
			System.out.println(text);
		}
	}
}


public class Midterm5
{

	public static void main(String[] args) 
	{
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		System.out.println(stv.channel);
		stv.displayCaption("Hello World");
		stv.caption = true;
		stv.displayCaption("Hello World");
	}

}
