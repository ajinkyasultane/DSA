package Arrays;

public class Linear_Search {
    public static void main(String[] args)
    {
        int[] arr = {1,3,65,76,99,65,45,-43,-3,-422,49};
        int ans = linearseach(arr,45);
        System.out.println(ans+" ");
    }
    static int linearseach(int[] arr , int target)
    {
        if(arr.length == 0)
        {
            return -1;
        }
        for (int index = 0; index < arr.length; index++)
        {
            int element = arr[index];
            if (element == target)
            {
                return index;
            }
         }
        return -1;
    }

}
