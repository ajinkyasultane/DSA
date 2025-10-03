package Arrays;

import java.util.Scanner;

public class Max_no {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("The output is a ");

        for (int num : arr)
        {
            System.out.println(num);
        }
        System.out.println("The maximum element is a ");
        System.out.println(max(arr));

        System.out.println("The Maximum value within range ");
        System.out.println("ENter the start value of range");
        int start = sc.nextInt();
        System.out.println("Enter the end index of range");
        int end = sc.nextInt();
        System.out.println(maxinrange(arr, start , end));
    }
    static int max(int[] arr)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        int maxval = arr[0];
        for (int i = 0 ; i < arr.length; i++)
        {
            if (arr[i] > maxval)
            {
                maxval = arr[i];
            }
        }
        return maxval;
    }
    static int maxinrange(int[] arr , int start , int end)
    {
        if (end > start)
        {
            return -1;
        }
        if (arr == null)
        {
            return -1;
        }

        int maxval = arr[0];
        for (int i = start;  i < end; i++)
        {
            if (arr[i] > maxval)
            {
                maxval = arr[i];
            }
        }
        return maxval;
    }

}
