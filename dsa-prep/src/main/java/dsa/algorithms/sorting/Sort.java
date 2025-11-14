package dsa.algorithms.sorting;

public class Sort {

    public void mergeSort(int a[], int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(a, low, mid);
            mergeSort(a, mid + 1, high);
            merge(a, low, mid, high);
        }else{
            return;
        }
    }

    public void merge(int a[], int low, int mid, int high) {
        int[] temp = new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;

        // while there are elements in both array
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                temp[k] = arr[i];
                i++;
                k++;
            }else {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }

        // if either of array item finishes, copy remaining elements to temp array
        while(i<mid+1){
            temp[k] = arr[i];
            i++;k++;
        }
        while(j<=high){
            temp[k] = arr[j];
            j++;k++;
        }

        //copy temp content to actual array 'arr'
        for(int p =0;p<k;p++){
            arr[low+p] = temp[p];
        }
    }

}