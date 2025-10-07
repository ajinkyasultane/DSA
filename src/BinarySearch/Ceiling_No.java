package BinarySearch;

public class Ceiling_No {
    public static void main(String[] args)
    {
int[] arr = {1,2,3,4,5,6,9,18};
int[] arr2 = {25,15,12,10,1};
int ans = binarysearch(arr,88);
        System.out.println(ans);
    }
    static int binarysearch(int[] arr , int target)
    {
        int start = 0;
        int end = arr.length -1;
        boolean isAsc = arr[start] < arr[end];

        if (target > arr[arr.length -1])
        {// this is for when we find a ceiling no of last no
            return -1;
        }
        while (start <= end)
        {
          int mid = start + (end - start) /2;

          if (arr[mid] == target)
          {
              return mid;
          }
          if (isAsc)
          {
              if (arr[mid] < target)
              {
                  start = mid +1;
              }
              else
              {
                  end = mid -1;
              }
          }
          else {
              if (arr[mid] > target)
              {
                  start = mid +1;
              }
              else {
                  end = mid -1;
              }
          }
        }
        return start;
    }

}
