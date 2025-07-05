using System;
using System.Collections.Generic;

public class Solution
{
    public int largest(List<int> arr)
    {
        int max = arr[0];

        for (int i = 1; i < arr.Count; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }

        return max;
    }
}
