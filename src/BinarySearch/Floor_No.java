package BinarySearch;

public class Floor_No {
    //floor no = a no is return a greaterst smaller no;
  // return greatest no <= target

    public static void main(String[] args)
    {
        int[] arr = {2,3,6,8,9,76,98};
        int[] arr2 = {200,25,12,9,7,5};
        int ans = fllorno(arr2,305);
        System.out.println(ans);
    }
    static int fllorno(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length -1;
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
                    end = mid - 1;
                }
                else {
                    start = mid +1;
                }
            }
            else {
                if (target > arr[mid])
                {
                    end  = mid - 1;
                }
                else {
                    start = mid + 1;
                }

            }
        }
        return end;
    }


}
