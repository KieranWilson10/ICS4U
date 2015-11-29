package wilson;

import java.util.Arrays;
import java.util.Scanner;
/**
 * @author Kieran Wilson
 * Controls application
 */

public class SorterMain {

	public SorterMain() {
		// TODO Auto-generated constructor stub
	}
/**
 * Main method
 * @param args
 */
	public static void main(String[] args) {

		Scanner Scanner = new Scanner(System.in);

		while (true) {
			System.out.println("How many numbers are to be sorted.");
			String size = Scanner.nextLine();
			int[] inputList = new int[Integer.parseInt(size)];

			for (int i = 0; i < Integer.parseInt(size); i++) {
				System.out.println("Please enter the number.");
				String value = Scanner.nextLine();
				inputList[i] = Integer.parseInt(value);
			}

			System.out.println("Enter 1 to use insertion sort.");
			System.out.println("Enter 2 to use selction sort.");
			System.out.println("Enter 3 to use bubble sort.");
			System.out.println("Enter 4 to use quick sort.");
			System.out.println("Enter 5 to use merge sort.");

			String type = Scanner.nextLine();

			switch (type) {
			case "1":
				printArray(insertSort(inputList, Integer.parseInt(size)));
				break;
			case "2":
				printArray(selectionSort(inputList, Integer.parseInt(size)));
				break;
			case "3":
				printArray(bubbleSort(inputList, Integer.parseInt(size)));
				break;
			case "4":
				printArray(quickSort(inputList));
				break;
			case "5":
				printArray(mergeSort(inputList));
				break;

			}

		}

	}
/**
 * Selection sort algorithm
 * Runs Selecetion sort 
 * @param unsorted
 * @param size
 * @return sorted(unsorted) int array
 */
	public static int[] selectionSort(int[] unsorted, int size) {

		for (int k = 0; k < size - 1; k++) {
			int first = k;
			for (int i = k + 1; i < size; i++) {
				if (unsorted[i] < unsorted[first]) {
					first = i;
				}
			}
			int temp = unsorted[first];
			unsorted[first] = unsorted[k];
			unsorted[k] = temp;
		}
		return unsorted;
	}
/**
 * Insert sort algorithm
 * Runs Insert sort
 * @param unsorted
 * @param size
 * @return sorted(unsorted) int array
 */
	public static int[] insertSort(int[] unsorted, int size) {

		for (int i = 1; i < unsorted.length; i++) {
			int comparedIndex = unsorted[i];
			int currentIndex = i - 1;

			while (currentIndex >= 0 && unsorted[currentIndex] > comparedIndex) {
				unsorted[currentIndex + 1] = unsorted[currentIndex];
				currentIndex--;
			}
			unsorted[currentIndex + 1] = comparedIndex;

		}
		return unsorted;

	}
	/**
	 * Bubble sort algorithm
	 * Runs Bubble Sort
	 * @param unsorted
	 * @param size
	 * @return sorted(unsorted) int array
	 */
	public static int[] bubbleSort(int[] unsorted, int size) {
		for (int j = 0; j <= unsorted.length - 1; j++) {
			for (int i = 0; i <= unsorted.length - 1 - i; i++) {
				if (unsorted[i] > unsorted[i + 1]) {
					int temp = unsorted[i + 1];
					unsorted[i + 1] = unsorted[i];
					unsorted[i] = temp;
				}
			}
		}
		return unsorted;

	}
/**
 * Recursive quick sort method
 * @param unsorted
 * @return sorted(unsorted) int array
 */
	public static int[] quickSort(int[] unsorted) {
		if (unsorted == null || unsorted.length == 0) {
			return null;
		}
		quickSort(unsorted, 0, unsorted.length - 1);
		return unsorted;
	}
/**
 * Quick Sort sorting algorithm
 * Sorts unsorted list
 * @param array
 * @param origLow
 * @param origHigh
 */
	public static void quickSort(int[] array, int origLow, int origHigh) {

		int low = origLow;
		int high = origHigh;
		int pivot = array[origLow + (origHigh - origLow) / 2];

		while (low <= high) {
			while (array[low] < pivot) {
				low++;
			}
			while (array[high] > pivot) {
				high--;
			}
			if (low <= high) {
				int temp = array[low];
				array[low] = array[high];
				array[high] = temp;
				low++;
				high--;
			}
		}
		if (origLow < high) {
			quickSort(array, origLow, high);
		}
		if (low < origHigh) {
			quickSort(array, low, origHigh);
		}
	}
	/**
	 * Merge sort display return
	 * @param array
	 * @return sorted(array) int array
	 */
	public static int[] mergeSort(int[] array){		
		mergeSortSplit(array);
		return array;
	}
/**
 * Merge sort splitting recursive splitting algorithm
 * @param unsorted
 */
	public static void mergeSortSplit(int[] unsorted) {

		if (unsorted.length > 1) {		
			
		int[] array1 = Arrays.copyOfRange(unsorted, 0, unsorted.length / 2);
		int[] array2 = Arrays.copyOfRange(unsorted, unsorted.length / 2, unsorted.length);
		mergeSortSplit(array1);
		mergeSortSplit(array2);
		merge(unsorted, array1, array2);
		}		

	}
/**
 * Merge sort sorting algorithm
 * @param original
 * @param array1
 * @param array2
 */
	public static void merge(int original[], int[] array1, int[] array2) {
		int totalLength = array1.length + array2.length;
		int i = 0;
		int array1Index = 0;
		int array2Index = 0;

		while (i < totalLength) {
			if ((array1Index < array1.length) && (array2Index < array2.length)) {
				if (array1[array1Index] < array2[array2Index]) {
					original[i] = array1[array1Index];
					array1Index++;
					i++;
				} else {
					original[i] = array2[array2Index];
					array2Index++;
					i++;
				}
			} else {
				if (array1Index >= array1.length) {
					while (array2Index < array2.length) {
						original[i] = array2[array2Index];
						array2Index++;
						i++;
					}
				} else if (array2Index >= array2.length) {
					while (array1Index < array1.length) {
						original[i] = array1[array1Index];
						array1Index++;
						i++;
					}
				}
			}
		}
	}
/**
 * Prints array list passed to it
 * @param array
 */
	public static void printArray(int[] array) {

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}
}
