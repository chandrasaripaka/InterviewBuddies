package com.ib.codesarr;

/**
 * Initialize:
 *     max_so_far = 0
 *     max_ending_here = 0
 *
 * Loop for each element of the array
 *   (a) max_ending_here = max_ending_here + a[i]
 *   (b) if(max_so_far < max_ending_here)
 *             max_so_far = max_ending_here
 *   (c) if(max_ending_here < 0)
 *             max_ending_here = 0
 * return max_so_far
 */

public class ContiguousSubArray {

    static int maxSubArraySum(int a[], int size)
    {
        int max_so_far = a[0];
        int curr_max = a[0];

        for (int i = 1; i < size; i++)
        {
            curr_max = Math.max(a[i], curr_max+a[i]);
            max_so_far = Math.max(max_so_far, curr_max);
        }
        return max_so_far;
    }

    /* Driver program to test maxSubArraySum */
    public static void main(String[] args)
    {
        int a[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        int n = a.length;
        int max_sum = maxSubArraySum(a, n);
        System.out.println("Maximum contiguous sum is "
                + max_sum);
    }
}
