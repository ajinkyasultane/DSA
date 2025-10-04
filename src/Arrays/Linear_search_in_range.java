package Arrays;

public class Linear_search_in_range {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,65,76,89,788,54,65,90};
        int start = 3;
        int end = 9;
        int target = 788;
        int ans = linearsearch(arr,start,end,target);
        System.out.println(ans);
    }
    static int linearsearch(int[] arr , int start , int end , int target)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        for (int index = start; index <= end ; index++)
        {
            int element = arr[index];
            if(element == target)
            {
                return index;
            }
        }
        return -1;
    }
}
