class SortingAlgorithms {

    public static void classicInsertionSort(int[] arr, int startIndex, int endIndex) {
        for (int i = startIndex + 1; i <= endIndex; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= startIndex && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

}