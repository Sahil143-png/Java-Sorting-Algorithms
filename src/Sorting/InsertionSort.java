package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {98, 850,-10, 88, 250, 701,-50,200};
        insertion(arr);
    }
    public static void insertion(int[] arr){
        int i=0;
        int n=arr.length;
        for(i=1;i<n;i++){
            int j=i;
            while(j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
