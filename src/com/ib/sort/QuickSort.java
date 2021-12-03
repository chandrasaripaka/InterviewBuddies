package com.ib.sort;// Class name must be "Main"
// Libraries included:
// json simple, guava, apache commons lang3, junit, jmock

class QuickSort {


    /**

     */
    public void quickSort(int []input , int beginIndex, int endIndex) {
        if (beginIndex < endIndex ){
            int partitionInd = partCalculation(input, beginIndex, endIndex );

            // call quickSort Recursively based on PartitionInd

            quickSort(input, beginIndex, partitionInd-1 ); // First Sort from begin till partitionInd
            quickSort(input, partitionInd+1, endIndex); // Sort from parttionInd to endIndex.
        }
    }

    public int partCalculation(int []arr, int begin, int end) {

        // start from end.
        int piv = arr[end];

        // variable for iteration
        int i = begin - 1;

        for (int j=begin; j<end; j++ ){
            if (arr[j] <= piv ){
                i++;

                //swapping the values.
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // To get the I+1 position for the partitionIndex
        int temp = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = temp;

        return i+1;

    }

    public static void Test1() {
        int [] input = {21,3,44,20,6,49,1,96};
        QuickSort m = new QuickSort();
        m.quickSort(input, 0, input.length-1);
        System.out.println("TEST1 Results");
        for (int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }

    public static void Test2() {
        int [] input = {-9,3,7,-20,6,-49,1,-96};
        QuickSort m = new QuickSort();
        m.quickSort(input, 0, input.length-1);
        System.out.println("TEST1 Results");
        for (int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }

    public static void Test3() {
        int [] input = {1,1,1,1,1,1};
        QuickSort m = new QuickSort();
        m.quickSort(input, 0, input.length-1);
        System.out.println("TEST1 Results");
        for (int i=0; i<input.length; i++){
            System.out.println(input[i]);
        }
    }

    public static void main(String[] args) {
        Test1();
        Test2();
        Test3();
    }
}
