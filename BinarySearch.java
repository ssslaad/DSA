
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {0,10,10,10};
        int num = 0;
        /* 
        int indexOfElement = binarySearchRecursive(arr,0,arr.length-1,num);
        int indexOfElement = binarySearchIterative(arr,num);
        if(indexOfElement == -1){
            System.out.printf("Element %d not found\n", num);
        }else{
            System.out.printf("Element found at index %d\n", indexOfElement);
        }
        */
        int firstOcc = binarySearchFirstOcc(arr, num);
        if(firstOcc == -1){
            System.out.printf("Element %d not found\n", num);
        }else{
            System.out.printf("First occurrence of element found at index %d\n", firstOcc);
        }
    }
    
    /**
     * Binary Search Recursive
     * 
     * Start searching element in mid of sorted array
     * if mid element is searched element -> return mid as result
     * else if mid element > searched element -> search left sub array
     * else search right subarray
     * 
     **/
    private static int binarySearchRecursive(int arr[],int low, int high, int num){
        if (low > high){
            return -1;
        }
        int mid = (low+high)/2;
        if(arr[mid] == num){
            return mid;
        }else if(arr[mid] > num){
            return binarySearchRecursive(arr,low,mid-1,num);
        }else{
           return binarySearchRecursive(arr,mid+1,high,num);
        }
    }
    
    /**
     * Binary Search Iterative
     * 
     * Start searching element in mid of sorted array
     * if mid element is searched element -> return mid as result
     * else if mid element > searched element -> search left sub array
     * else search right subarray
     * 
     **/
    private static int binarySearchIterative(int arr[], int num){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == num){
                return mid;
            }else if(arr[mid] > num){
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }

    /**
     * Binary Search First Occurrence
     * 
     * Start searching element in mid of sorted array
     * if mid element is searched element -> return mid as result
     * else if mid element > searched element -> search left sub array
     * else search right subarray
     * 
     **/
    private static int binarySearchFirstOcc(int arr[], int num){
        int low = 0, high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid] == num){
                /*
                Approach 1: backtrack and search for first occurrence of the element
                while(mid-1 >= 0 && arr[mid-1] == num){
                    mid = mid-1;
                }
                */
                /*
                Approach 2: check if previous element is same, if yes, go to left half
                */
                if(mid-1 >= 0 && arr[mid-1] == num){
                    high = mid-1;
                }else{
                    return mid;
                }
            }else if(arr[mid] > num){
                high = mid-1;
            }else if(arr[mid] < num){
                low = mid+1;
            }
        }
        return -1;
    }
}