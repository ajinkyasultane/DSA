package Arrays;
import  java.util.*;
import java.util.Scanner;

public class ArrayList {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Arraylist element");
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>(5);
//
//        list.add(2);
//        list.add(3);
//        list.add(4);
//
//        System.out.println(list.contains(4));
//        System.out.println(list);
//        list.remove(1);
//        System.out.println(list);

        for (int i = 0 ; i < 5 ; i++)
        {
            list.add(sc.nextInt());
        }

       // System.out.println(list);

        for (int i = 0 ; i < 5 ; i++)
        {
            System.out.println(list.get(i));
        }
    }
}
