import java.util.Arrays;

public class teststudy4 {
    static class Shuffle {
        int[] original;
        int[] result;

        static int[] shuffle(int[] original) {
            int[] result = Arrays.copyOf(original, original.length);
            for (int i = result.length - 1; i > 0; i--) {
                int j = (int) (Math.random() * (i + 1));
                int temp = result[i];
                result[i] = result[j];
                result[j] = temp;
            }
            return result;
        }
    }

    public static void main(String[] args) {
        int[] original = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(original));

        int[] result = Shuffle.shuffle(original);
        System.out.println(Arrays.toString(result));
    }
}
