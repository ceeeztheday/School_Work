
//Lecture 2
import java.util.*;

public class SortingAlgs {
    public static void main(String[] args) {
        int[] myArray = { 10, 20, 5, 3, 17, 14, 25, 18, 9, 6, 15, 4, 13 };

        System.out.println("The original array is " + Arrays.toString(myArray));

        int[] testArray = myArray.clone();
        mergeSort(testArray);
        System.out.println("The array after performing Merge Sort is " + Arrays.toString(testArray));

        testArray = myArray.clone();
        quickSort(testArray);
        System.out.println("The array after performing Quick Sort is " + Arrays.toString(testArray));
    }

    // merge two halves into one sorted arra\y
    public static void merge(int[] numArray, int low, int high) {
        int midIndex = (low + high) / 2; // calculate the index of the element in the middle
        int n = high - low + 1; // size of the region to be merged
        int[] tempArray = new int[n]; // merge both halves into a temporary array

        int i1 = low; // next element to consider in the first half
        int i2 = midIndex + 1; // next element to consider in the second half
        int j = 0; // next open position in the temp array

        // as long as neither i1 nor i2 is past the end, move the smaller element into
        // the temp array
        while (i1 <= midIndex && i2 <= high) {
            if (numArray[i1] < numArray[i2]) {
                tempArray[j] = numArray[i1];
                i1++;
            } else {
                tempArray[j] = numArray[i2];
                i2++;
            }

            j++;
        }

        // Note that the body of only one of the two while loops below is executed.

        // copy any remaining elements of the first half
        while (i1 <= midIndex) {
            tempArray[j] = numArray[i1];
            i1++;
            j++;
        }

        // copy any remaining elements of the second half
        while (i2 <= high) {
            tempArray[j] = numArray[i2];
            i2++;
            j++;
        }

        // copy back from the temp array
        for (j = 0; j < n; j++)
            numArray[low + j] = tempArray[j];
    }

    // recursive helper method for mergeSort
    public static void mergeSortRec(int[] numArray, int low, int high) {
        if (low < high) {
            int midIndex = (low + high) / 2;
            mergeSortRec(numArray, low, midIndex);
            mergeSortRec(numArray, midIndex + 1, high);
            merge(numArray, low, high);
        }
    }

    // merge sort
    public static void mergeSort(int[] numArray) {
        mergeSortRec(numArray, 0, numArray.length - 1);
    }

    // partition an array into two sections, with all the elements less than the
    // pivot in the
    // left section and all the elements greater than the pivot in the right section
    public static int partition(int[] numArray, int low, int high) {
        // set the first element as the pivot
        int pivotPoint = low;
        int pivot = numArray[pivotPoint]; // can also use numArray[(int)(Math.random() * numArray.length)]
        int j = low;

        for (int i = low + 1; i <= high; i++) {
            // swap the elements that are not in correct places
            if (numArray[i] < pivot) {
                j++;

                int temp = numArray[i];
                numArray[i] = numArray[j];
                numArray[j] = temp;
            }
        }

        // update the pivot index
        pivotPoint = j;

        // swap the pivot with the element at index pivotPoint
        int temp = numArray[low];
        numArray[low] = numArray[pivotPoint];
        numArray[pivotPoint] = temp;

        return pivotPoint;
    }

    // recursive helper method for quickSort
    public static void quickSortRec(int[] numArray, int low, int high) {
        if (high > low) {
            int pivotPoint;

            // partition the array
            pivotPoint = partition(numArray, low, high);

            // sort the left subsection
            quickSortRec(numArray, low, pivotPoint - 1);

            // sort the right subsection
            quickSortRec(numArray, pivotPoint + 1, high);
        }
    }

    // quick sort
    public static void quickSort(int[] numArray) {
        quickSortRec(numArray, 0, numArray.length - 1);
    }
}