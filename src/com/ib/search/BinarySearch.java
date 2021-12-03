package com.ib.search;

public class BinarySearch {

    /**
     * Compare x with the middle element.
     * If x matches with middle element, we return the mid index.
     * Else If x is greater than the mid element, then x can only lie in right half subarray after the mid element. So we recur for right half.
     * Else (x is smaller) recur for the left half.
     * @param arr
     * @param l
     * @param r
     * @param search
     * @return
     */
    int binarySearch(int [] arr, int l, int r, int search) {
        if (r >= 1) {
            int mid  = l + (r-1) / 2;
            if (arr[mid] == search) {
                return mid;
            }
            if (arr[mid] > search) {
                return binarySearch(arr, l, mid-1, search);
            }
            return binarySearch(arr, mid+1, r, search);
        }
        return -1;
    }

    public static void main(String [] args) {
        BinarySearch bs = new BinarySearch();
        int [] arr = {10, 20 , 30, 40 ,50, 60, 70, 80, 90, 100};
        int x = 50;
        int result = bs.binarySearch(arr, 0, arr.length-1, x);
        System.out.println(result);
    }
}
