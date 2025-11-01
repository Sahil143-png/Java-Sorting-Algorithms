package Sorting;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,10,11,56,67,79,82,91,92,94};
        int target=94;
        int ans=binarySearch(arr,target);
        for(int i=0;i<arr.length;i++){
            if(arr[i]==arr[ans]){
                System.out.println("Element is present ");
            }
        }
    }

    private static int binarySearch(int[] arr, int target) {
        int n=arr.length;
        int l=0,h=n-1;
        while(l<=h){
            int mid=(l+h)/2;
            if(target==arr[mid]) return mid;
            if(target<arr[mid]) h=mid-1;
            if(target>arr[mid]) l=mid+1;
        }
        return -1;
    }
}
