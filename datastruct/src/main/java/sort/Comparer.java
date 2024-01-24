package sort;

import java.util.Arrays;

public class Comparer {

    public static void main(String[] args){
        int testTime = 50000;
        int maxSize = 100;
        int maxValue = 100;
        boolean success = true;
        for (int i = 0; i < testTime; i++) {
            int[] arr1  = generateRandomArray(maxSize, maxValue);
            int[] arr2 = copyArray(arr1);
//            InsertSort.insertSort(arr1);
//            MergeSort.mergeSort(arr1,0,arr1.length - 1);
            QuickSort.quickSort(arr1,0,arr1.length - 1);
            comparator(arr2);
            if (!isEqual(arr1,arr2)){
                success = false;
                break;
            }
        }
        System.out.println(success ? "Nice" : "Fuck!");

    }

    public static int[] generateRandomArray(int maxSize, int maxValue){
        int[] arr = new int[(int)((maxSize + 1) * Math.random()) + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)((maxValue + 1) * Math.random()) - (int)((maxValue) * Math.random());
        }
        return arr;
    }

    public static int[] copyArray(int[] arr){
        if (arr == null || arr.length == 0) {
            return null;
        }
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }

    public static void comparator(int[] arr) {
        Arrays.sort(arr);
    }

    public static boolean isEqual(int[] arr1, int[] arr2){
        if (arr1.length != arr2.length){
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void printArray(int[] arr){
        if (arr == null || arr.length == 0) {
            return;
        }
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
