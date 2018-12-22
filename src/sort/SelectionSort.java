package sort;

import java.util.Arrays;

public class SelectionSort {


        public static void main(String[] args) {

            int[] array = {100, 58, 19, 71, 11, 45, 68, 9};

            System.out.println("Before Selection Sort:" + Arrays.toString(array));

            selection_sort(array);

            System.out.println("After Selection Sort: " + Arrays.toString(array));
        }

        private static void selection_sort(int[] input) {

            int inputLength = input.length;

            for (int i = 0; i < inputLength - 1; i++) {

                int min = i;

                // find the first, second, third, fourth... smallest value
                for (int j = i + 1; j < inputLength; j++) {
                    if (input[j] < input[min]) {
                        min = j;
                    }
                }

                // swaps the smallest value with the position 'i'
                int temp = input[i];
                input[i] = input[min];
                input[min] = temp;
            }
        }
     }
