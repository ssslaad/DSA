
class HelloWorld {
    public static void main(String[] args) {

        int arr[] = { 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 30, 0, 1, 2, 3, 4, 5 };
        int num = 4;

        /*
         * int low = 0, high = arr.length-1;
         * int indexOfElementRec = binarySearchRecursive(arr, num, 0, arr.length-1);
         * int indexOfElementIte = binarySearchIterative(arr, num, 0, arr.length-1);
         * int firstOcc = binarySearchFirstOcc(arr, num, 0, arr.length-1);
         * int sqRoot = squareRoot(num);
         * int elementInInfiniteArray = findElementInInfiniteArray(arr, num);
         */
        System.out.println(findElementInSortedRotatedArray(arr, num, 0, arr.length - 1));

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
    private static int binarySearchRecursive(int arr[], int num, int low, int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;
        if (arr[mid] == num) {
            return mid;
        } else if (arr[mid] > num) {
            return binarySearchRecursive(arr, low, mid - 1, num);
        } else {
            return binarySearchRecursive(arr, mid + 1, high, num);
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
    private static int binarySearchIterative(int arr[], int num, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                return mid;
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /**
     * Binary Search First Occurrence
     * 
     * Start searching element in mid of sorted array
     * if mid element is searched element ->
     * check if previous element is also the searched element
     * -> if yes, search left sub array
     * -> else return mid as result
     * else if mid element > searched element -> search left sub array
     * else search right subarray
     * 
     **/
    /**
     * Binary Search First Occurrence
     * 
     * Start searching element in mid of sorted array
     * if mid element is searched element ->
     * check if previous element is also the searched element
     * -> if yes, search left sub array
     * -> else return mid as result
     * else if mid element > searched element -> search left sub array
     * else search right subarray
     * 
     * @param arr
     * @param num
     * @param low
     * @param high
     * @return
     */
    private static int binarySearchFirstOcc(int arr[], int num, int low, int high) {
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num) {
                /*
                 * Approach 1: backtrack and search for first occurrence of the element
                 * while(mid-1 >= 0 && arr[mid-1] == num){
                 * mid = mid-1;
                 * }
                 */
                /*
                 * Approach 2: check if previous element is same, if yes, go to left half
                 */
                if (mid - 1 >= 0 && arr[mid - 1] == num) {
                    high = mid - 1;
                } else {
                    return mid;
                }
            } else if (arr[mid] > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    /*
     * Square root using binary search
     * 
     * we know that square of any number will be either half or less than half of
     * the number
     * so use binary search on 0 to num/2 and try to find the number which is
     * closest using difference
     */
    private static int squareRoot(int num) {
        if (num <= 0) {
            return -1;
        }

        if (num == 1) {
            return 1;
        }

        int low = 0;
        int high = num / 2;
        int result = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int sq = mid * mid;
            if (sq > num) {
                high = mid - 1;
            } else if (sq < num) {
                low = mid + 1;
                result = mid;
            } else {
                return mid;
            }
        }

        return result;
    }

    /**
     * Find the sub-array between which our number lies, if present in array
     * 
     * @param arr - input array
     * @param num - element to find
     * @return
     */
    private static int findElementInInfiniteArray(int arr[], int num) {
        if (arr[0] == num) {
            return 0;
        }
        int index = 1;
        while (arr[index] <= num) {
            if (arr[index] == num) {
                return index;
            }
            index *= 2;
        }
        return binarySearchIterative(arr, num, index / 2 + 1, index);

    }

    /**
     * use binary search and identify the half in which our number is present, if
     * present
     * 
     * @param arr
     * @param num
     * @param low
     * @param high
     * @return
     */
    private static int findElementInSortedRotatedArray(int arr[], int num, int low, int high) {

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == num)
                return mid;
            else if (arr[mid] >= arr[low]) {
                // left half is sorted
                // check if number lies in the sorted half
                if (arr[mid] > num && arr[low] <= num) {
                    // number lies in this half
                    if (arr[low] == num)
                        return low;
                    low = low + 1;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // right half is sorted
                if (arr[mid] < num && arr[high] >= num) {
                    // number lies in this half
                    if (arr[high] == num)
                        return high;
                    low = mid + 1;
                    high = high - 1;
                } else {
                    // number lies in other half
                    high = mid - 1;
                }
            }
        }
        return -1;
    }
}