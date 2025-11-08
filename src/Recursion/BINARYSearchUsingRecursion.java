package Recursion;

public class BINARYSearchUsingRecursion {
    public static void main(String[] args) {
        int[] arr={2,3,5,7,10,11,56,67,79,82,91,92,94};
        int target=94;
        int ans=binarSearch(arr,target,0,arr.length-1);
        if(ans!=-1){
            System.out.println("Element is present ");
        }
    }

    public static int binarSearch(int[] arr, int target, int l, int h) {
        if (l > h) {
            return -1;
        }
        int mid = (l + h) / 2;
        if (arr[mid] == target)
            return mid;
        else if (target < arr[mid])
            return binarSearch(arr, target, l, mid - 1);
        else
            return binarSearch(arr, target, mid + 1, h);

    }

}
