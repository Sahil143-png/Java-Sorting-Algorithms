package Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public static void bucketSort(float[] arr){
        int n = arr.length;
        // Create  n new empty buckets
        List<Float>[] B=new ArrayList[n];
        for(int i=0;i<n;i++){
            B[i]=new ArrayList<>();
        }
        for(int i=0;i<n;i++){
            int bucketindex=(int)(n*arr[i]);
            B[bucketindex].add(arr[i]); //add elements to bucket
        }
        for(int i=0;i<n;i++){
            Collections.sort(B[i]);
        }
        int index=0;
        for(int i=0;i<n;i++){
            for(float ele :B[i]){
                arr[index++]=ele;
            }
        }

    }
    public static void main(String[] args) {
        float[] arr={0.5f,0.2f,0.1f,0.4f,0.3f};
        System.out.println("Original Array is :-");
        for(float ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println(" ");
        bucketSort(arr);
        System.out.println("After sorting");
        for(float ele: arr){
            System.out.print(ele+" ");
        }
    }
}
