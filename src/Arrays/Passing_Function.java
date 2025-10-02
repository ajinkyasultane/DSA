package Arrays;
import java.util.Arrays;

public class Passing_Function {
    public static void main(String[] agrs)
    {
        int[] arr = {3 ,5, 6,7,8,2,65,76,78};
        System.out.println(Arrays.toString(arr));
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] arr)
    {
        arr[0] = 21;
    }


}
