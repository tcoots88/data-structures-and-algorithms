package code401challenges.sort;

public class MergeSort {

    public static void mergeSort(int[] arr){
        int n = arr.length;

        if (n > 1){
            int mid = n/2;
            int[] left;
            left = new int[mid];
            int[] right;
            right = new int[arr.length - mid];

            for (int i = 0 ; i < left.length; i ++ ){
                left[i] = arr [i];
            }
            for (int i = 0 ; i < right.length; i ++ ){
                right[i] = arr [i+ mid];
            }


            MergeSort.toString(left);
            MergeSort.toString(right);


            mergeSort(left);
            mergeSort(right);
//            Bring it back together
            merge(left, right, arr, n , mid);
        }
    }
    public static void merge(int[] left, int[] right, int[] arr, int n, int mid){
        int i =0;
        int j = 0;
        int k = 0;

        while (i < left.length && j < right.length ) {
            if (left[i] <= right[j]){
                arr[k] = left[i];
                i = i + 1;
            }
            else{
                arr[k] = right[j];
                j = j + 1;
            }
            k = k + 1;

        }
        if (i == left.length){
            while (j < right.length) {
                arr[k] = right[j];
                j++;
                k++;
            }

        }
        else {
            while ( i < left.length) {
                arr[k] = left[i];
                i++;
                k++;
            }
        }

    }
    public static void toString(int arr[]) {
        for (int i=0; i < arr.length; i++ ) {
            System.out.println("Array at " + i + ": " +arr[i]);
        }
    }
}