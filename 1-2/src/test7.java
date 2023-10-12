class SmartTv extends DVD
{
	TV t = new TV();
	
	void fast() {
		channel *= 10;
	}
}
class DVD extends TV
{
	void fast() 
	{
		channel *= 10;
	}
	void slow() 
	{
		channel -= 10;
	}
}
class TV
{
	int channel;
	int volume;
	
	void channelup() 
	{
		++channel;
	}
}

public class test7
{
	public static void main(String[] args) 
	{
		SmartTv st = new SmartTv();
		st.channel = 0;
		st.channelup();
		System.out.println(st.channel);
		st.fast();
		System.out.println(st.channel);
	}
}