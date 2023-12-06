package pkg1;

public class report 
{

	public static void main(String[] args) 
	{
		ActionMovie am = new ActionMovie("범죄도시");
		HorrorMovie hm = new HorrorMovie("여고괴담");
		ComedyMovie cm = new ComedyMovie("극한직업");
		int sum = 0;
		sum += am.discountedPrice();
		sum += hm.discountedPrice();
		sum += cm.discountedPrice();
		System.out.printf("총 예매 금액: %d원",sum);
	}

}

abstract class Movie
{
	String name;
	int price = 10000;
	int discountRate = price/10;
	
	int discountedPrice()
	{
		return price-discountRate;
	}
}

class ActionMovie extends Movie
{
	public ActionMovie(String name) {this.name=name;}

	int discountedPrice()
	{
		return price-discountRate-1000;
	}	
}
class HorrorMovie extends Movie
{
	public HorrorMovie(String name) {this.name=name;}

	int discountedPrice()
	{
		return price-discountRate-800;	
	}
}
class ComedyMovie extends Movie
{
	public ComedyMovie(String name) {this.name=name;}

	int discountedPrice()
	{
		return price-discountRate-1500;
		
	}
}
