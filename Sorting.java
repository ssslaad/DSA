public class Sorting {

    public static void main(String[] args) {

        int arr[] = { 1, 3, 5, 7, 9, 0, 2, 4, 6, 8, 10 };
        int n = arr.length - 1;

        for (int value : arr) {
            System.out.print(value + " ,");
        }
        System.out.println("");

        // selectionSort(arr, num);
        // bubbleSort(arr, num);
        // insertionSort(arr, num);
        // mergeSortedArrays(arr, num, arr2, num2);
        // mergeSortedSubArrays2(arr, 2, 4, 7);
        mergeSort(arr, 0, n);

        for (int value : arr) {
            System.out.print(value + " ,");
        }

    }

    private static void selectionSort(int[] arr, int n) {
        // select minimum element at keep at start
        for (int i = 0; i < n - 1; i++) {
            int minValueIndex = i;
            boolean swapNeeded = false;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minValueIndex]) {
                    minValueIndex = j;
                    swapNeeded = true;
                }
            }
            if (swapNeeded)
                swap(arr, i, minValueIndex);
        }

    }

    private static void bubbleSort(int[] arr, int n) {
        // adjacent swaps only if left element is bigger than right element
        for (int i = 0; i < n - 1; i++) {
            boolean swapDone = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                    swapDone = true;
                }
            }
            if (!swapDone) {
                break;
            }
        }
    }

    private static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int value = arr[i];
            while (j >= 0 && arr[j] > value) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = value;
        }
    }

    private static void mergeSort(int[] arr, int low, int high) {
        if (high > low) {
            int mid = low + (high - low) / 2;
            mergeSort(arr, low, mid);
            mergeSort(arr, mid + 1, high);
            mergeSortedSubArrays2(arr, low, low, high);
        }
    }

    // Merge Sort 2 arrays
    private static int[] mergeSortedArrays(int[] arr1, int m, int[] arr2, int n) {
        int i = 0, j = 0, k = 0;
        int[] temp = new int[m + n];
        while (i < m && j < n) {

            if (arr1[i] <= arr2[j]) {
                temp[k++] = arr1[i++];
            } else {
                temp[k++] = arr2[j++];
            }
        }
        while (i < m) {
            temp[k++] = arr1[i++];
        }
        while (j < n) {
            temp[k++] = arr2[j++];
        }
        return temp;
    }

    // merge sort single array or part of single array
    private static void mergeSortedSubArrays2(int[] arr, int low, int mid, int high) {
        int m = mid - low + 1;
        int n = high - mid;

        int[] left = new int[m];
        int[] right = new int[n];
        for (int i = 0; i < m; i++) {
            left[i] = arr[low + i];
        }
        for (int i = 0; i < n; i++) {
            right[i] = arr[mid + 1 + i];
        }

        int i = 0, j = 0, k = low;
        while (i < m && j < n) {

            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < m) {
            arr[k++] = left[i++];
        }
        while (j < n) {
            arr[k++] = right[j++];
        }
    }

    // should be used only if low, mid and high are not too big
    private static void mergeSortedSubArrays(int[] arr, int low, int mid, int high) {
        int i = low, j = mid + 1, k = 0;
        int[] temp = new int[high + 1];
        while (i <= mid && j <= high) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        while (j <= high) {
            temp[k++] = arr[j++];
        }
        arr = temp;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
