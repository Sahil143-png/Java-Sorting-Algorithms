package Sorting;

public class RadixSort {
    public static void main(String[] args) {
        int[] arr={170,45,75,90,302,2};
        int max=getmax(arr);
        radixSort(arr);
        for(int ele : arr){
            System.out.print(ele+" ");
        }
     // NOTE :- Time complexities=d(n+k)=dn=O(n)
        // Space comlexities=n+10 !!
    }
    public static void radixSort(int[] arr){
        int max=getmax(arr);
        //applying counting sort to sort elements based on place value
        for(int place=1;max/place>0;place*=10){ // maximum number of digits time d times
            countSort(arr,place);
        }
    }
    public static int getmax(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){ // n times
                max=arr[i];
            }

        }
        return max;
    }
    public static void countSort(int[] arr,int place){
        int max=getmax(arr);
        int[] count=new int[10]; // 10 spaces
        for(int i=0;i<arr.length;i++){
            count[(arr[i]/place)%10]++; // n times
        }
        for(int i=1;i<count.length;i++){
            count[i]=count[i]+count[i-1]; // 10 times
        }
        int[] b=new int[arr.length]; // n spaces
        for(int i=arr.length-1;i>=0;i--){
            int index=--count[(arr[i]/place)%10]; // n times
            b[index]=arr[i];
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=b[i];     // n times
        }
    }

}
