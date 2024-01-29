
class HelloWorld {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60};
        int num = 45;
        //int indexOfElement = binarySearchRecursive(arr,0,arr.length-1,num);
        int indexOfElement = binarySearchIterative(arr,num);
        if(indexOfElement == -1){
            System.out.printf("Element %d not found\n", num);
        }else{
            System.out.printf("Element found at index %d\n", indexOfElement);
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
            high = mid-1;
            return binarySearchRecursive(arr,low,high,num);
        }else if(arr[mid] < num){
           low = mid+1;
           return binarySearchRecursive(arr,low,high,num);
        } 
        return -1;
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
}