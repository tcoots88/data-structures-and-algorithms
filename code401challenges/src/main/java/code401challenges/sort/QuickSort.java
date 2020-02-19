package code401challenges.sort;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right){
        if (left < right) {
            int position = partition(arr, left, right);
            quickSort(arr, left, position - 1);
            quickSort(arr, position + 1, right);
        }
    }
    public static int partition(int[] arr, int left, int right){
        int pivot = arr[right];
        int low = left - 1;

        for (int i = left; i < right; i ++) {
            if (arr[i] <= pivot){
                low++;
                swap(arr, low, i);
            }
        }

        swap(arr, low + 1, right);
        return low + 1;
    }

    public static void swap(int[] arr, int first, int last){
        int temp;
        temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;
    }

    public static void toString(int arr[]) {
        for (int i=0; i < arr.length; i++ ) {
        }
    }
}
