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

		boolean flag = false;
		ContestantInformation contestant1 = new ContestantInformation();
		Scanner Scanner = new Scanner(System.in);
		ArrayList <String> contestantHolder = new ArrayList(); 
		 
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
				String phoneNumber 
				= Scanner.nextLine();

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