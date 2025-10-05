package LeetCode;

public class FindNum1295 {
    public static void main(String[] args)
    {
int[] num = {12,32,545,-6768,454};
        System.out.println(findNumbers(num));
        System.out.println(digits(-5459685));
    }
    static int findNumbers(int[] nums)
    {
        int count = 0;
        for (int num : nums)
        {
            if(even(num))
            {
                count++;
            }
        }

        return count;
    }
    static boolean even(int n)
    {
        int numofdigits = digits(n);
        if (numofdigits % 2 == 0)
        {
            return true;
        }
return false;
    }

    static int digits(int num)
    {
        if (num < 0)
        {
            num = num * -1;
        }
        int count = 0 ;
        while (num > 0)
        {
            count++;
            num /= 10;
        }
        return count;
    }



}
