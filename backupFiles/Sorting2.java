package backupFiles;
public class Sorting2 {

    public static void intersectionOfTwoSortedArrays(int arr1[], int n1, int arr2[], int n2) {
        int i = 0, j = 0;
        // either array is finished
        while (i < n1 && j < n2) {

            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
    }

    public static void unionOfTwoSortedArrays(int arr1[], int n1, int arr2[], int n2) {
        int i = 0, j = 0;
        // either array is finished
        while (i < n1 && j < n2) {

            if (i > 0 && arr1[i] == arr1[i - 1]) {
                i++;
                continue;
            }

            if (j > 0 && arr2[j] == arr2[j - 1]) {
                j++;
                continue;
            }

            if (arr1[i] < arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else if (arr1[i] > arr2[j]) {
                System.out.print(arr2[j] + " ");
                j++;
            } else {
                // common element
                System.out.print(arr1[i] + " ");
                i++;
                j++;
            }
        }
        while (i < n1) {
            if (i > 0 && arr1[i] != arr1[i - 1]) {
                System.out.print(arr1[i] + " ");
            }
            i++;
        }

        while (j < n2) {
            if (j > 0 && arr2[j] != arr2[1]) {
                System.out.print(arr2[j] + " ");
            }
            j++;
        }
    }
}
