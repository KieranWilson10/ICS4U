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
		ArrayList <ContestantInformation> contestantHolder = new ArrayList<ContestantInformation>();
		for(int i = 0 ; i < contestantNumber; i++)
		{			
			System.out.print("Enter Add New Contestant to add a new entry.");
			System.out.print("Enter Display Contestant to display the last contestant.");
			String entry = Scanner.nextLine();
			switch(entry){
			case "Add New Contestant":
				contestantHolder.add(c);
				addContestantInformation(contestantHolder.get(i));
				break;
			case "Display Contestant":
				System.out.print(contestantHolder.get(i-1));
				break;
				
				
				
			case "Exit":
			return;
			
			}
			
		
		
		
		
		
		}
	}

	
	public static void addContestantInformation( ContestantInformation contestant1)
	{
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