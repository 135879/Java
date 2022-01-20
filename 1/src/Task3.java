import java.util.*;
import java.io.*;
public class Task3 {
    public static boolean isAvgWhole(int[] array_nums)
    {

        System.out.println("Original Array: "+Arrays.toString(array_nums));

        float sum = array_nums[0];
        for(int i = 1; i < array_nums.length; i++)
        {
            sum  += array_nums[i];

        }
        float x = ((sum) / (array_nums.length));

            return (x % 1 == 0);



    }
}
