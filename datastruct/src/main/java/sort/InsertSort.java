package sort;

public class InsertSort {
    public static void main(String[] args) {
      int[] arr = {25, 27, 30, -32, 2 ,-30, 1, -65, -29, 73 ,87 };
      insertSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void insertSort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0 && arr[j] > arr[j + 1]; j --) {
                swap(arr,j,j + 1);
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
