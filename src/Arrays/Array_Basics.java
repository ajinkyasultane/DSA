package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Basics {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the element of array");
        for (int i = 0 ; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("The output is a ");
//        for (int i = 0 ; i < arr.length; i++)
//        {
//            System.out.println(arr[i]);
//    }

        for (int j : arr)
        {
            System.out.println(j + " ");
        }
        System.out.println(Arrays.toString(arr));
    }
}
