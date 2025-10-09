package Arrays;

public class FInd_Secondlarger {
    /*find second largest no in array if 10 , 9 , 8 is in array and 10 is repeating
    // manytime so return -1 else the another number is given array so print them
    */
    public static void main(String[] args)
    {
        int[] arr = {20,34,65,754,754,754,43};
        int[] arr1 = {10,10,10};
        int ans = findsecondlargest(arr1);
        System.out.println(ans);
    }
    static int findsecondlargest(int[] arr)
    {
        int largest = -1;
        int secondlargest = -1;

        for(int i = 0; i< arr.length; i++)
        {
            if(arr[i] > largest)
            {
              // largest = secondlargest;
                secondlargest = largest;
                //secondlargest = arr[i];
                largest = arr[i];

            }
            else if (arr[i] < largest && arr[i] > secondlargest)
            {
                secondlargest = arr[i];
            }
        }
        return secondlargest;
    }

}
