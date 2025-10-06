package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args)
    {
int[] arr = {1,2,3,4,5,6,7,8};
int[] arr2 = {32,21,11,10,9,7,6,4,3};
int target = 43;
int ans = orderagnosticbs(arr2,target);
        System.out.println(ans);
    }
    static int orderagnosticbs(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end)
        {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target)
            {
                return mid;
            }
            if (isAsc)
            {
                if (target < arr[mid])
                {
                    end = mid -1;
                }
                else
                {
                    start = mid +1;
                }
            }
            else {
                if (target > arr[mid])
                {
                    end = mid -1;
                }
                else
                {
                    start = mid +1;
                }
            }
        }
        return -1;
    }
}
