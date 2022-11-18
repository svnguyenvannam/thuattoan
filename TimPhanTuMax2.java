package pk1;

import java.util.Arrays;

public class TimPhanTuMax2 {
    public static final int A[]= {1, 4, 5, 7, 4, 9, 5,7,4,9};


/*    public static void selectionSort(int [] array){

        for (int i = 0; i < array.length-1; i++) {
            int min = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] > array[min]){
                    int temp = 0;
                    temp = array[min];
                    array[min] = array[j];
                    array[j]= temp;

                }

            }

        }

        System.out.println(Arrays.toString(array)+"SelectionSort");
    }*/
    public static void bubbleSort(int [] array){
        int temp =0;
        for(int i = 0; i< array.length-1; i++){
            for (int j = 0; j < array.length-1-i;j++) {
                if(array[j]<array[j+1]){
                    temp= array[j];
                    array[j]= array[j+1];
                    array[j+1]= temp;
                }
            }

        }
        System.out.println(Arrays.toString(array)+"BubbleSort");
    }

    public static void main(String[] args) {
        TimPhanTuMax2 timPhanTuMax2 = new TimPhanTuMax2();
        timPhanTuMax2.bubbleSort(A);
        int max2 = 0;

        for (int i = 0; i <= A.length; i++) {
            if (A[i] != A[i+1]) {
                System.out.printf("Phan tu lon thu 2: " + A[i+1]);
                return;
            }
        }

    }
}
