package Arrays;

public class Min_no {
    public static void main(String[] args)
    {
        int[] arr = { 1,34,-34,-32,-35, 32};
        int ans = min(arr);
        System.out.println(ans);
    }
    static int min(int[] arr)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        int ans = arr[0];
        for (int i = 0; i<arr.length; i++)
        {
           if (arr[i] < ans)
           {
               ans = arr[i];

           }
        }
        return ans;
    }
}
