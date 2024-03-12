import static java.lang.Math.*;
import static java.lang.System.*;

public class final2 {

	public static void main(String[] args) {
		double val = 90.7552;
		double mpl = 0;
		double result = 0;
		mpl = val *100;
		result = Math.round(mpl);
		result = result / 100.0;
		System.out.println(result);
	}

}