package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {98, 850, -707, -200, 88, 250, 701, 200};
        bubble(arr);
        for(int ele:arr) System.out.print(ele+" ");
        }

    private static void bubble(int[] arr) {
        int n = arr.length;
        int i = 0, j = 0;
        for (i = 0; i < n - 1; i++) {
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
    }
        }
    }