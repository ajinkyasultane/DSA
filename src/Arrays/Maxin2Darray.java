package Arrays;

public class Maxin2Darray {
    public static void main(String[] args)
    {
        int[][] arr = {{3,43,65,76,2},
                {45,675,34,54,432,21},
                {323,545,67,56,32}};

        int ans = max(arr);
        System.out.println(ans);

    }
    static int max(int[][] arr)
    {
        if (arr.length==0)
        {
            return -1;
        }
        int max = arr[0][0];
        for(int row = 0; row < arr.length; row++)
        {
            for (int col = 0 ; col <arr[row].length; col++)
            {
                if (arr[row][col] > max)
                {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

}
