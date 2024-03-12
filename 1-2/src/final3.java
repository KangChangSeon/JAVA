import java.util.*;

public class final3 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("올 해의 년도 : " + today.get(Calendar.YEAR));
		System.out.println("올 해의 몇 번째 주 : "+ today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇 번째 주 : "+ today.get(Calendar.WEEK_OF_MONTH));
		
	}

}
