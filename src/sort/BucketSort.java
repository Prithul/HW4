package sort;

import java.util.Arrays;

public class BucketSort {

    public static void sort(int[] a, int maxVal) {
        int [] bucket=new int[maxVal+1];

        for (int i=0; i<bucket.length; i++) {
            bucket[i]=0;
        }

        for (int i=0; i<a.length; i++) {
            bucket[a[i]]++;
        }

        int outPos=0;
        for (int i=0; i<bucket.length; i++) {
            for (int j=0; j<bucket[i]; j++) {
                a[outPos++]=i;
            }
        }
    }


    public static void main(String[] args) {
        int maxVal=9;
        int [] data= {6,7,2,2,4,9,0,3,8,3,6,4};

        System.out.println("Before Bucket Sort: " + Arrays.toString(data));
        sort(data,maxVal);
        System.out.println("After Bucket Sort :  " + Arrays.toString(data));
    }
}
