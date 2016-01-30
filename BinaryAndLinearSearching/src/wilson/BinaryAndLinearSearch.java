package wilson;

import java.util.Scanner;
/**
 * This class is utilized to identify index's at which the users input matches the predefined arrays.
 * This class can handle Strings, int and double and the user is able to identify which method they use.
 * This class uses both linear and binary search types for all of the data types listed above.
 * @author Kieran Wilson
 * 
 *
 */
public class BinaryAndLinearSearch {
	//Declaration of all of the arrays used for testing
	static int[] intArray = {1,2,3,4,5,6,7,8};
	static String[] stringArray = {"a","b","c","d","e"};
	static double[] doubleArray = {1,2,3,4,5,6,7,8};
	static Scanner Scanner = new Scanner(System.in);

	public BinaryAndLinearSearch() {
	
	}
	//Main method used to test the searching methods
	public static void main(String[] args) {
		//Gives the user an instruction message
		System.out.println("Please pick which sort you would like to use. \nInput 1 to use the linear int search method."
				+ "\nInput 2 to use the linear double search method. \nInput 3 to use the linear String search method. \nInput 4 to use the binary int search method."
				+ "\nInput 5 to use the binary double search method. \nInput 6 to use the binary String search method.") ;
		String entry = Scanner.nextLine();
		//Case and switch to change what method is being called based on user input
		switch (entry) {
		case "1":
			System.out.println("Please enter the int value you would like to find.");
			String linearInt = Scanner.nextLine();
			System.out.println(linearSearchInt(intArray, Integer.parseInt(linearInt)));
			break;
		case "2":
			System.out.println("Please enter the double value you would like to find.");
			String linearDouble = Scanner.nextLine();
			System.out.println(linearSearchDouble(doubleArray, Integer.parseInt(linearDouble)));
			break;
		case "3":
			System.out.println("Please enter the String value you would like to find.");
			String linearString = Scanner.nextLine();
			System.out.println(linearSearchString(stringArray, linearString));
			break;
		case "4":
			System.out.println("Please enter the int value you would like to find.");
			String binaryInt = Scanner.nextLine();
			System.out.println(binarySearchInt(intArray, Integer.parseInt(binaryInt)));
			break;
		case "5":
			System.out.println("Please enter the double value you would like to find.");
			String binaryDouble = Scanner.nextLine();
			System.out.println(binarySearchDouble(doubleArray, Integer.parseInt(binaryDouble)));
			break;
		case "6":
			System.out.println("Please enter the String value you would like to find.");
			String binaryString = Scanner.nextLine();
			System.out.println(binarySearchString(stringArray, binaryString));
			break;
		}
	}
	/**
	 * This is a linear search method, it moves through index by index to identify if the user input matches an element in the array.
	 * This method returns a message depending on if or not it was found inside the array and what index it is in.
	 * @param x
	 * Passed an int array called x inside the method.
	 * @param y
	 * Passed the user value called y inside the method.
	 * @return
	 * Returns either "Not found" if the user input does not match an element in the array, or it returns "Found at index" and the index of the matching element.
	 */
	public static String linearSearchInt(int[] x, int y){
		//This loop checks all the index's of the array and identifies whether or not it matches the user input.
		for(int i = 0; i < x.length; i++){
			if(x[i] == y){
				return "Found at index " + i;
			}
		}		
		return "Not found";		
	}
	
	/**
	 * This is a linear search method, it moves through index by index to identify if the user input matches an element in the array.
	 * This method returns a message depending on if or not it was found inside the array and what index it is in.
	 * @param x
	 * Passed a double array called x inside the method.
	 * @param y
	 * Passed the user value called y inside the method.
	 * @return
	 * Returns either "Not found" if the user input does not match an element in the array, or it returns "Found at index" and the index of the matching element.
	 */
	public static String linearSearchDouble(double[] x, double y){
		//This loop checks all the index's of the array and identifies whether or not it matches the user input.
		for(int i = 0; i < x.length; i++){
			if(x[i] == y){
				return "Found at index " + i;
			}
		}		
		return "Not found";		
	}
	
	/**
	 * This is a linear search method, it moves through index by index to identify if the user input matches an element in the array.
	 * This method returns a message depending on if or not it was found inside the array and what index it is in.
	 * @param x
	 * Passed a String array called x inside the method.
	 * @param y
	 * Passed the user value called y inside the method.
	 * @return
	 * Returns either "Not found" if the user input does not match an element in the array, or it returns "Found at index" and the index of the matching element.
	 */
	public static String linearSearchString(String[] x, String y){
		//This loop checks all the index's of the array and identifies whether or not it matches the user input.
		for(int i = 0; i < x.length; i++){
			if(x[i].equals(y)){
				return "Found at index " + i;
			}
		}		
		return "Not found";		
	}

	/**
	 * This is a binary search method, it uses an algorithm to eliminate values of the sorted list and eventually finds whether or not the user input matches an element in the array.
	 * This method returns a message depending on if or not it was found inside the array and what index it is in.
	 * @param x
	 * Passed an int array called x inside the method.
	 * @param y
	 * Passed the user value called y inside the method.
	 * @return
	 * Returns either "Not found" if the user input does not match an element in the array, or it returns "Found at index" and the index of the matching element.
	 */
	public static String binarySearchInt(int[] x, int y){
		//These variables are used to find the middle of the array.
		int middle = x.length / 2;
		int midValue = x[middle];
		int searchNumber = midValue;
		//This loop checks a specific index in the array and determines whether or not it needs to change its pivot point and in which direction.
		//The pivot point is always half way between the remaining possible index's to ensure that all index's are checked.
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] > y) {
				searchNumber = searchNumber / 2;
			}
			if (x[i] < y) {
				searchNumber = searchNumber + searchNumber / 2;
			}
			if (x[i] == y) {
				return "Found at index " + i;				
			}
		}
		return "Not found";		
	}
	
	/**
	 * This is a binary search method, it uses an algorithm to eliminate values of the sorted list and eventually finds whether or not the user input matches an element in the array.
	 * This method returns a message depending on if or not it was found inside the array and what index it is in.
	 * @param x
	 * Passed an String array called x inside the method.
	 * @param y
	 * Passed the user value called y inside the method.
	 * @return
	 * Returns either "Not found" if the user input does not match an element in the array, or it returns "Found at index" and the index of the matching element.
	 */
	public static String binarySearchString(String[] x, String y){
		//These variables are used to find the middle of the array.
		int start = 0;
		int end = x.length - 1;
		int middle = (start + end) / 2;
		String midValue = x[middle];
		//This loop checks a specific index in the array and determines whether or not it needs to change its pivot point and in which direction.
		//The pivot point is always half way between the remaining possible index's to ensure that all index's are checked.
		for (int i = 0; i < x.length - 1; i++) {
			middle = (start + end) / 2;
			midValue = x[middle];

			if (x[i].compareTo(y) == 1) {
				middle = middle - 1;
			} else if (x[i].compareTo(y) == -1) {
				middle = middle + 1;
			} else if (x[i].compareTo(y) == 0) {
				return "Found at index " + i;
			}
		}
		return "Not found";
	}
	
	/**
	 * This is a binary search method, it uses an algorithm to eliminate values of the sorted list and eventually finds whether or not the user input matches an element in the array.
	 * This method returns a message depending on if or not it was found inside the array and what index it is in.
	 * @param x
	 * Passed an double array called x inside the method.
	 * @param y
	 * Passed the user value called y inside the method.
	 * @return
	 * Returns either "Not found" if the user input does not match an element in the array, or it returns "Found at index" and the index of the matching element.
	 */
	public static String binarySearchDouble(double[] x, double y){
		//These variables are used to find the middle of the array.
		int middle = x.length / 2;
		int midValue = (int) x[middle];
		int searchNumber = midValue;
		//This loop checks a specific index in the array and determines whether or not it needs to change its pivot point and in which direction.
		//The pivot point is always half way between the remaining possible index's to ensure that all index's are checked.
		for (int i = 0; i < x.length - 1; i++) {
			if (x[i] > y) {
				searchNumber = searchNumber / 2;
			}
			if (x[i] < y) {
				searchNumber = searchNumber + searchNumber / 2;
			}
			if (x[i] == y) {
				return "Found at index " + i;				
			}
		}
		return "Not found";		
	}
}
