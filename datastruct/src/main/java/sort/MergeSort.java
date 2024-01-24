package sort;

public class MergeSort {


    public static void mergeSort(int[] arr,int l, int r){
        if (l == r) {
            return;
        }
        int mid = l + ((r - l) >> 1);
        mergeSort(arr,l,mid);
        mergeSort(arr,mid + 1,r);
        merge(arr,l,mid,r);
    }

    public static void merge(int[] arr,int l,int mid, int r){
        int x= 0,i = l, j = mid + 1;
        int[] help = new int[r - l + 1];
        while (i <= mid && j <= r) {
            help[x++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid ){
            help[x++] = arr[i++];
        }
        while (j <= r) {
            help[x++] = arr[j++];
        }
        for (int k = 0; k < help.length; k++) {
            arr[l+k] = help[k];
        }
    }


    //扩展，求逆序对小和
    public static void mergeSortExtern(int[] arr, int l, int mid,int r) {
        int x= 0,i = l, j = mid + 1;
        int res =  0;
        int[] help = new int[r - l + 1];
        while (i <= mid && j <= r) {
//            此处因为：左侧有序，右侧也有序，则当左侧小于右侧时，这时右侧当前位置到r的个数为大于左侧当前数的个数，
//            若左侧大于右侧，则证明无逆数对，则右侧++，继续比较，比较玩则当前区间上逆序对取完。
            res += arr[i] < arr[j] ? arr[i] * (r - j + 1) : 0;
            help[x++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
        }
        while (i <= mid ){
            help[x++] = arr[i++];
        }
        while (j <= r) {
            help[x++] = arr[j++];
        }
        for (int k = 0; k < help.length; k++) {
            arr[l+k] = help[k];
        }
    }
}
