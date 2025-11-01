package Sorting;

public class CountSort {
    public static void main(String[] args) {
        int[] arr={1,2,5,1,1,4,8,0,4,4,2,1,0,7};
        countSort(arr);
       // for(int ele:arr) System.out.print(ele+" ");
    }
    // Total time complexities = n+n+k+n+n=4n+k=n=O(n+k) !!
    public static int getmax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];  // n times
            }
        }
        return max;
    }
    public static void countSort(int[] arr){
        //count
        int max=getmax(arr);
        int count[]=new int[max+1]; //size=8
        // 0 0 0 0 0 0 0 0
        for(int i=0;i<arr.length;i++){ // n times
            //counting or frequency of elements i arrays
            // 2 4 2 0 3 1 0 1 1  ......2(0 to 8)
            count[arr[i]]++; // count[2]=count[2]+1;
        }
        for(int i=1;i<=max;i++) {
            // 2 6 8 8 11 12 12 13 14
            //
            //
            //
            //
            // ye ek tarike ka updated index hai
            // ..... updated count array
            //count prefix sum !!
            count[i]=count[i]+count[i-1]; // max times Say k times
        }
        for(int ele: count) System.out.print(ele+" ");
        int[] b=new int[arr.length];
        for(int i= arr.length-1;i>=0;i--){
            int index=--count[arr[i]]; // n times
            b[index]=arr[i];

        // here original array behaves like index for count
//        count[arr[i]] will behave as index for b !!
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=b[i]; // n times
        }
    }
}
