package sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String a[]){
        int[] arr1 = {11,44,55,66,77,22,99,33,88};
        System.out.println("Before Insertion Sort :"  + Arrays.toString(arr1));
        int[] arr2 = doInsertionSort(arr1);
        System.out.print("After Insertion Sort: " );
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }

    public static int[] doInsertionSort(int[] input){

        int temp;
        for (int i = 1; i < input.length; i++) {
            for(int j = i ; j > 0 ; j--){
                if(input[j] < input[j-1]){
                    temp = input[j];
                    input[j] = input[j-1];
                    input[j-1] = temp;
                }
            }
        }
        return input;
    }
}

