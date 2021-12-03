package com.ib.search;

import java.util.Arrays;

public class CountingSort {

    static char[] countSort(char seq[]) {
        int n = seq.length;
        // The output character array that will have sorted arr
        char output[] = new char[n];
        // Create a count array to store count of inidividul
        // characters and initialize count array as 0
        int count[] = new int[256];
        Arrays.fill(count,0);

        for (int i=0; i<n;i++) {
            ++count[seq[i]];
        }
        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i=1; i<=255; ++i) {
            count[i] += count[i-1];
            System.out.print(count[i]);
        }


        for (int i = 0; i<n; ++i) {
            output[count[seq[i]]-1] = seq[i];
            --count[seq[i]];
            System.out.print(output[i]);
            System.out.print(count[i]);
        }

        // Copy the output array to arr, so that arr now
        // contains sorted characters
        for (int i = 0; i<n; ++i)
            seq[i] = output[i];
        return seq;
    }

    public static void main(String [] args) {
        String a1 = "chandrasekhar";
        char [] out = CountingSort.countSort(a1.toCharArray());
        System.out.println(out);
    }
}
