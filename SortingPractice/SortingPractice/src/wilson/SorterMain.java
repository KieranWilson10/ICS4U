package wilson;

import java.util.Scanner;

public class SorterMain {

	public SorterMain() {
		// TODO Auto-generated constructor stub
	}

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
				quickSort(inputList);
				break;
			case "5":
				mergeSort(inputList, Integer.parseInt(size));
				break;

			}

		}

	}

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

	public static int[] bubbleSort(int[] unsorted, int size) {
		for (int j = 0; j <= unsorted.length - 1; j++) {
			for (int i = 0; i <= unsorted.length - 1 - i; i++) {				
				if (unsorted[i] > unsorted [i+1]) {
					int temp = unsorted[i+1];
					unsorted[i+1] = unsorted[i];
					unsorted[i] = temp;
				}
			}
		}
		return unsorted;

	}

	public static void quickSort(int[] unsorted) {
		
		
	}
	public static void mergeSort(int[] unsorted, int size) {

	}

	public static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

}
