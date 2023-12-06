package pkg1;

abstract class Player // 추상 클래스(미완성 클래스, 미완성 설계도)
{
		abstract void play(int pos); // 추상 메서드(미완성 메서드)
		abstract void stop(); // 추상 메서드(몸통{}이 없는 미완성 메서드)
}

// 추상 클래스는 상속을 통해 완성해야 객체 생성 가능
class AudioPlayer extends Player
{
		void play(int pos) { System.out.println(pos+"위치부터 play합니다."); }; // 추상 메서드를 구현
		void stop() { System.out.println("재생을 멈춥니다."); }; // 추상 메서드를 구현
}


public class PlayerTest 
{

	public static void main(String[] args) 
	{
//		Player p = new Player();
		AudioPlayer ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
	}

}
