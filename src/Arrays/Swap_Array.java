package Arrays;

import java.util.Arrays;

public class Swap_Array {
    public static void main(String[] agrs)
    {
        int[] arr = {1, 2,43,5,67,8,65,86};
        System.out.println(Arrays.toString(arr));
        swap(arr , 1,3);
        System.out.println(Arrays.toString(arr));

    }
    static void swap(int[] arr, int index1,int index2)
    {
     int temp = arr[index1];
     arr[index1] = arr[index2];
     arr[index2]= temp;
    }

}
