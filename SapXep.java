package pk1;

import java.util.Arrays;

public class SapXep {


    public static final int A[]= {1,3,5,9,4,2,15,19,30,11,6,7,99,45,43,77,42};

    public static void bubbleSort(int [] array){
        int temp = 0;
        for(int i = 0; i< array.length-1; i++){
            for (int j = 0; j < array.length-1-i;j++) {
                if(array[j]>array[j+1]){
                   temp= array[j];
                   array[j]= array[j+1];
                   array[j+1]= temp;
                }
            }

        }
        System.out.println(Arrays.toString(array)+"BubbleSort");
    }

    public static void selectionSort(int [] array){

        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j]< array[min]){
                    int temp = 0;
                    temp = array[min];
                    array[min] = array[j];
                    array[j]= temp;

                }

            }

        }
        System.out.println(Arrays.toString(array)+"SelectionSort");
    }

    public static void insertionSort(int [] array){
        for  ( int  i =  1 ; i <array.length; i ++) {
            int  key = array [i];
            int  j = i -  1 ;
            while (j >= 0 && array[j] > key)
            {
                array[j+1] = array[j];
                j = j-1;
            }
            array[j+1] = key;
        }
        System.out.println (Arrays.toString (array) +  "insertionSort" );
    }

    public static void  mergingSort ( int [] array) {
        sort (array,  0 , array.length -  1 );
        System.out.println (Arrays.toString (array) +  "MergingSort" );
    }

    private static void  sort ( int [] data,  int  left,  int  right) {
        if  (left <right) {
            int  center = (left + right) /  2 ;
            sort (data, left, center);
            sort (data, center +  1 , right);
            merge (data, left, center, right);
        }
    }

    private static void  merge ( int [] data,  int  left,  int  center,  int  right) {
        int [] tmpArr =  new int [data.length];
        int  mid = center +  1 ;
        int  third = left;
        int  tmp = left;
        while  (left <= center && mid <= right) {
            if  (data [left] <= data [mid]) {
                tmpArr [third ++] = data [left ++];
            }  else  {
                tmpArr [third ++] = data [mid ++];
            }
        }

        while  (mid <= right) {
            tmpArr [third ++] = data [mid ++];
        }

        while  (left <= center) {
            tmpArr [third ++] = data [left ++];
        }

        while  (tmp <= right) {
            data [tmp] = tmpArr [tmp ++];
        }
    }

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* This function takes last element as pivot, places
       the pivot element at its correct position in sorted
       array, and places all smaller (smaller than pivot)
       to left of pivot and all greater elements to right
       of pivot */
    static int partition(int[] arr, int low, int high)
    {

        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for (int j = low; j <= high - 1; j++) {

            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {

                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    /* The main function that implements QuickSort
              arr[] --> Array to be sorted,
              low --> Starting index,
              high --> Ending index
     */
    static void Sort(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            Sort(arr, low, pi - 1);
            Sort(arr, pi + 1, high);
        }
    }

    public static void  quickSort ( int [] array) {
        Sort(array,  0 , array.length -  1 );
        System.out.println (Arrays.toString (array) +  "QuickSort" );
    }

    public static void main(String[] args) {
        SapXep sapXep = new SapXep();
        sapXep.bubbleSort(A);
        sapXep.selectionSort(A);
        sapXep.insertionSort(A);
        sapXep.mergingSort(A);
        sapXep.quickSort(A);
    }

}

