package Basic_Java;

import java.util.Scanner;

public class Sum_Function {
    public static void main(String[] args)
    {
        System.out.println(sum());

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no a ");
        int a = sc.nextInt();
        System.out.print("Enter no b ");
        int b = sc.nextInt();

        System.out.println(sum1(a,b));
    }
    static int sum()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First no ");
        int num1 = sc.nextInt();
        System.out.println("ENter Second no");
         int num2 = sc.nextInt();
         int ans = num1 + num2;
         return ans;
    }

    static int sum1(int a , int b)
    {
        int ans = a + b ;
        return ans;
    }
}
