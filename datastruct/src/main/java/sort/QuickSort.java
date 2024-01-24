package sort;

public class QuickSort {

    public static void quickSort(int[] arr, int l, int r){
        if (l >= r) {
            return;
        }
        int i = l - 1, j = r + 1;
        int x = arr[l + (r - l >> 2)];
        while (i < j) {
            do i ++; while(arr[i] < x);
            do j --; while(arr[j] > x);
            if (i < j) {
                swap(arr,i,j);
            }
        }
        quickSort(arr,l,j);
        quickSort(arr,j + 1,r);


    }


    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
