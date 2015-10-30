/**
 * 
 */
package wilson;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Kieran Wilson
 *
 */
public class main {

	/**
	 * 
	 */
	public main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		int contestantNumber = 1;
		ContestantInformation c = new ContestantInformation();
		ArrayList<ContestantInformation> contestantHolder = new ArrayList<ContestantInformation>();
		for (int i = 0; i < contestantNumber; i++) {
			System.out.println("Enter 1 to add a new entry.");
			System.out.println("Enter 2 to display the last contestant.");
			System.out.println("Enter 3 to search for a contestant.");
			System.out.println("Enter 4 to remove a contestant.");
			System.out.println("Enter 5 to remove all contestants");
			System.out.println("Enter 6 to exit the program.");
			String entry = Scanner.nextLine();
			switch (entry) {
			case "1":
				contestantHolder.add(c);
				addContestantInformation(contestantHolder.get(i));
				break;

			case "2":
				System.out.print(contestantHolder.get(i - 1));
				break;

			case "3":
				System.out.println("Please enter the first name of the contestant.");
				String fName = Scanner.nextLine();
				System.out.println("Please enter the last of the contestant.");
				String lName = Scanner.nextLine();
				if (SequentialSorting.searchNames(contestantHolder, fName, lName) == 0) {
					int index = SequentialSorting.searchNamesIndex(contestantHolder, fName, lName);
					Label contestantLabel = new Label(contestantHolder.get(index));
					System.out.println(contestantLabel.toString());
				} else {
					System.out.println("Contestant not found");
				}
				break;

			case "4":
				System.out.println("Please enter the first name of the contestant.");
				String dFName = Scanner.nextLine();
				System.out.println("Please enter the last of the contestant.");
				String dLName = Scanner.nextLine();
				if (SequentialSorting.searchNames(contestantHolder, dFName, dLName) == 0) {
					int index = SequentialSorting.searchNamesIndex(contestantHolder, dFName, dLName);
					contestantHolder.remove(index);
					System.out.println("Contestant deleted.");
				}
				break;
			case "5":
				System.out.println("All contestants cleared.");
				contestantHolder.removeAll(contestantHolder);
				break;

			case "6":
				return;

			}

		}
	}

	public static void addContestantInformation(ContestantInformation contestant1) {
		boolean flag = false;
		Scanner Scanner = new Scanner(System.in);

		do {
			try {
				flag = false;
				System.out.println("Please enter your first name.");
				String firstName = Scanner.nextLine();

				contestant1.setName(firstName);

			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
				flag = true;
			}
		} while (flag);

		do {
			try {
				flag = false;
				System.out.println("Please enter your last name.");
				String lastName = Scanner.nextLine();

				contestant1.setLastName(lastName);

			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
				flag = true;
			}
		} while (flag);

		do {
			try {
				flag = false;
				System.out.println("Please enter your street number.");
				String streetNumber = Scanner.nextLine();

				contestant1.setStreetNumber(streetNumber);

			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
				flag = true;
			}
		} while (flag);

		do {
			try {
				flag = false;
				System.out.println("Please enter your street address.");
				String streetAddress = Scanner.nextLine();

				contestant1.setStreetAddress(streetAddress);

			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
				flag = true;
			}
		} while (flag);

		do {
			try {
				flag = false;

				System.out.println("Please enter your city.");
				String city = Scanner.nextLine();

				contestant1.setCity(city);

			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
				flag = true;
			}
		} while (flag);

		do {
			try {
				flag = false;
				System.out.println("Please enter your province.");
				String province = Scanner.nextLine();

				contestant1.setProvince(province);

			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
				flag = true;
			}
		} while (flag);

		do {
			try {
				flag = false;
				System.out.println("Please enter your postal code.");
				String postalCode = Scanner.nextLine();

				contestant1.setPostalCode(postalCode);

			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
				flag = true;
			}
		} while (flag);

		do {
			try {
				flag = false;

				System.out.println("Please enter your phone number.");
				String phoneNumber = Scanner.nextLine();

				contestant1.setPhoneNumber(phoneNumber);

			} catch (InvalidInputException e) {
				System.out.println(e.getMessage());
				flag = true;
			}
		} while (flag);

		Label label1 = new Label(contestant1);
		System.out.print(label1.toString());
	}

}