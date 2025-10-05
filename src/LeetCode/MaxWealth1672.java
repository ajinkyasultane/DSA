package LeetCode;

public class MaxWealth1672 {
    public static void main(String[] args)
    {
        int[][] arr = {{3,2,1},{4,2,4},{7,5,3}};
        int ans = maximumwealth(arr);
        System.out.println(ans);

    }
    static int maximumwealth(int[][] accounts)
    {
        // row = person
        //col = ac
        int ans = accounts[0][0];
        for(int person = 0; person < accounts.length; person++)
        {
            int sum = 0;
            for (int ac = 0; ac <accounts[person].length; ac++)
            {
                sum = sum +accounts[person][ac];
                if (sum > ans)
                {
                    ans = sum;
                }
            }
        }
        return ans;
    }
}
