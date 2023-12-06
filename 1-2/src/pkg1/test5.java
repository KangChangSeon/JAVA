package pkg1;

public class test5 
{
    public static void main(String[] args) 
    {
    	int i = 0;
        int[] array = {5,3,8,4,9,1,6,2,7};
        Original(array, i+1);
        selectionSort(array);
    }

    public static void Original(int[] arr, int val)
    {
    	System.out.print("Original = ");
        for (int value : arr) 
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
    public static void selectionSort(int[] arr) 
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) 
        {
            int least = i;
            for (int j = i + 1; j < n; j++) 
            {
                if (arr[j] < arr[least]) 
                {
                    least = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[least];
            arr[least] = temp;

            printStep(arr, i + 1);
        }
    }

    public static void printStep(int[] arr, int val) 
    {
        System.out.print("Step " + val + "   = ");
        for (int value : arr) 
        {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
