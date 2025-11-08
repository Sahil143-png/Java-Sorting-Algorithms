package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {98, 850,-10, 88, 250, 701,-50,200};
        selection(arr);
        for(int ele:arr) System.out.print(ele+" ");
    }
    public static void selection(int[] arr){
        for(int i=0;i<arr.length;i++){
            //find the max item in the remaining array and swap with correct index
            int last=arr.length-i-1;
            int maxIndex=getMaxIndex(arr,0,last);
            // max element ka index pata karo aur swap kar do unsorted part ke last element ke saath
            swap(arr,maxIndex,last);
        }
    }
    public static void swap(int[] arr,int maxIndex,int last){
        int temp=arr[maxIndex];
        arr[maxIndex]=arr[last];
        arr[last]=temp;
    }
    public static int getMaxIndex(int[] arr,int start,int end){
        int max=0;
        for(int i=0;i<=end;i++){
            if(arr[i]>arr[max]){
                max=i;
            }
        }
        return max;
    }
}
