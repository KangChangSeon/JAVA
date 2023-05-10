public class test8 
{
    public static void main(String[] args)
    {
        int [][] score = new int[4][3];
        //int score [][] = new int [4][3];//
        //int [] score [] = new int [4][3]; 셋 다 같은 의미//
        score[2][2] = 100;
        System.out.println(score[2][2]);

        int [][] arr = new int [][]{{1,2,3},{4,5,6}};
        //int [][] arr = {{1,2,3},{4,5,6}}; 같은 의미//
        System.out.println(arr[1][2]);

        int [][] score2 = 
        {
            {100,100,100},
            {20,20,20},
            {30,30,30},
            {40,40,40}
        };

        System.out.println(score2[2][2]);
    }
    
}
