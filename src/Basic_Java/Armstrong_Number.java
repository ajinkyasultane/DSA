package Basic_Java;

import java.util.Scanner;

public class Armstrong_Number {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first no where you want to start");
        int no1 = sc.nextInt();
        System.out.println("Enter a no where you want");
        int no2 = sc.nextInt();

        for (int i = no1 ; i <= no2; i++)
        {
            if (isArmstrong(i))
            {
                System.out.println(i+ " ");
            }
        }

//        boolean ans = isArmstrong(no);
//        System.out.println(ans);


    }
    static boolean isArmstrong(int n)
    {
        int original = n;
        int sum = 0;
        while (n>0)
        {
            int rem = n % 10;
            n = n/ 10;
            sum = sum + rem *rem *rem;
        }
        return  sum == original;
    }

}
