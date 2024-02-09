public class Sorting {

    public static void main(String[] args) {

        int arr[] = { 1,3,5,7,9 };
        int num = arr.length;

        int arr2[] = { 0, 2,4,6,8,10 };
        int num2 = arr2.length;

        for(int value : arr){
            System.out.print(value + " ,");
        }
        System.out.println("");

        for(int value : arr2){
            System.out.print(value + " ,");
        }
        System.out.println("");

        // selectionSort(arr, num);
        // bubbleSort(arr, num);
        // insertionSort(arr, num);
        int temp[] = mergeSortedArrays(arr, num, arr2, num2);
        
        for(int value : temp){
            System.out.print(value + " ,");
        }

    }
    
    private static void selectionSort(int[] arr, int n){
        // select minimum element at keep at start
        for(int i=0;i<n-1;i++){
            int minValueIndex = i;
            boolean swapNeeded = false;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minValueIndex]){
                    minValueIndex = j;
                    swapNeeded = true;
                }
            }
            if(swapNeeded)
                swap(arr,i,minValueIndex);
        }
        
    }

    private static void bubbleSort(int[] arr, int n){
        // adjacent swaps only if left element is bigger than right element
        for(int i = 0 ; i< n-1; i++){
            boolean swapDone = false;
            for(int j=0;j <n-i-1 ;j++){
                if(arr[j] > arr[j+1]){
                    swap(arr,j,j+1);
                    swapDone = true;
                }
            }
            if(!swapDone){
                break;
            }
        }
    }

    private static void insertionSort(int[] arr, int n){
        for(int i=1;i<n;i++){
            int j=i-1;
            int value = arr[i];
            while(j>=0 && arr[j]>value){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = value;
        }
    }

    private static int[] mergeSortedArrays(int[] arr1, int m, int[] arr2, int n){
        int i=0, j=0, k=0;
        int[] temp = new int[m+n];
        while(i<m && j<n){
            
            if(arr1[i] <= arr2[j]){
                temp[k++] = arr1[i++];
            }else{
                temp[k++] = arr2[j++];
            }
        }
        while(i<m){
            temp[k++] = arr1[i++];
        }
        while(j<n){
            temp[k++] = arr2[j++];
        }
        return temp;
    }

    private static void swap(int[] arr, int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
