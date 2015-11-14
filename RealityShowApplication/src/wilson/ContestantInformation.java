
package wilson;
/**
 * Reality show application
 * This receives information from the contestant including name, age, street number, city,
 * province, postal code, phone number an birth date of the user.
 * @author Kieran Wilson
 *
 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;


@SuppressWarnings("rawtypes")
/**
 * Declares used variables to store a contestants information
 * @author Kieran Wilson
 *
 */
public class ContestantInformation implements Comparable {
	private String firstName, lastName, streetNumber, streetAddress, city, province, postalCode, phoneNumber, age;



	public ContestantInformation(String name, String age, String streetNumber, String streetAddress, String city,
			String province, String postalCode, String phoneNumber, String birthDate) throws InvalidInputException {
		this.setName(name);
		this.setBirthDate(birthDate);
		this.setStreetNumber(streetNumber);
		this.setStreetAddress(streetAddress);
		this.setCity(city);
		this.setProvince(province);
		this.setPostalCode(postalCode);
		this.setPhoneNumber(phoneNumber);

	}
/**
 * sets all Contestant parameters to blank or null
 */
	public ContestantInformation() {
		firstName = "";
		lastName = "";
		age = "";
		streetNumber = "";
		streetAddress = "";
		city = "";
		province = "";
		postalCode = "";
		phoneNumber = "";
	}

	/**
	 * Returns the name
	 * @return the name
	 */
	public String getName() {
		return firstName;

	}

	/**
	 * @param name
	 * Sets the name parameter requirements
	 * @throws InvalidInputException
	 */
	public void setName(String name) throws InvalidInputException {
		name = name.toUpperCase();
		for (int i = 0; i < name.length(); i++) {
			if (!Character.isLetter(name.charAt(i))) {
				throw new InvalidInputException("Please only enter letters in your name.");
			}
		}
		this.firstName = name;
	}

	/**
	 * @return the streetNumber
	 * returns the street number
	 */
	public String getStreetNumber() {
		return streetNumber;
	}

	/**
	 * @param streetNumber
	 * Sets the streetNumber parameter requirements
	 * @throws InvalidInputException
	 */
	public void setStreetNumber(String streetNumber) throws InvalidInputException {
		for (int i = 0; i < streetNumber.length(); i++) {
			if (Character.isDigit(streetNumber.charAt(i)) == false)
				throw new InvalidInputException("Please enter numbers only.");
		}

		this.streetNumber = streetNumber;

	}

	/**
	 * @return the streetAddress
	 * Returns the streetAddress
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streeAddresss
	 *  Sets the streetAddress parameter requirements
	 */
	public void setStreetAddress(String streetAddress) throws InvalidInputException {
		streetAddress = streetAddress.toUpperCase();
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the city
	 * Returns the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *  Sets the city parameter requirements
	 * @throws InvalidInputException
	 */
	public void setCity(String city) throws InvalidInputException {
		city = city.toUpperCase();
		for (int i = 0; i < city.length(); i++) {
			if (!Character.isLetter(city.charAt(i))) {
				throw new InvalidInputException("Please only enter letters for the city you live in.");
			}
		}

		this.city = city;
	}

	/**
	 * @return the province
	 * Returns the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province
	 * Sets the province parameter requirements
	 * @throws InvalidInputException
	 */
	public void setProvince(String province) throws InvalidInputException {
		if (province.equalsIgnoreCase("Alberta") || province.equalsIgnoreCase("AB")) {
			this.province = "AB";
		}

		else if (province.equalsIgnoreCase("British Columbia") || province.equalsIgnoreCase("BritishColumbia")
				|| province.equalsIgnoreCase("BC")) {
			this.province = "BC";
		}

		else if (province.equalsIgnoreCase("Manitoba") || province.equalsIgnoreCase("MB")) {
			this.province = "MB";
		}

		else if (province.equalsIgnoreCase("New Brunswick") || province.equalsIgnoreCase("NewBrunswick")
				|| province.equalsIgnoreCase("NB")) {
			this.province = "NB";
		}

		else if (province.equalsIgnoreCase("Newfoundland and Labrador")
				|| province.equalsIgnoreCase("NewfoundlandandLabrador") || province.equalsIgnoreCase("NL")) {
			this.province = "NL";
		}

		else if (province.equalsIgnoreCase("Nova Scotia") || province.equalsIgnoreCase("NS")) {
			this.province = "NS";
		}

		else if (province.equalsIgnoreCase("Northwest Territories") || province.equalsIgnoreCase("NorthwestTerritories")
				|| province.equalsIgnoreCase("NT")) {
			this.province = "NT";
		}

		else if (province.equalsIgnoreCase("Nunavut") || province.equalsIgnoreCase("NU")) {
			this.province = "NU";
		}

		else if (province.equalsIgnoreCase("Ontario") || province.equalsIgnoreCase("ON")) {
			this.province = "ON";
		}

		else if (province.equalsIgnoreCase("Prince Edward Island") || province.equalsIgnoreCase("PrinceEdwardIsland")
				|| province.equalsIgnoreCase("PE") || province.equalsIgnoreCase("PEI")) {
			this.province = "PE";
		}

		else if (province.equalsIgnoreCase("Quebec") || province.equalsIgnoreCase("Q")) {
			this.province = "QC";
		}

		else if (province.equalsIgnoreCase("Saskatchewan") || province.equalsIgnoreCase("SK")) {
			this.province = "SK";
		}

		else if (province.equalsIgnoreCase("Yukon") || province.equalsIgnoreCase("Yukon")) {
			this.province = "YT";
		} else {
			throw new InvalidInputException("Please the province full name or abbreviation.");
		}
	}

	/**
	 * @return the postalCode
	 * Returns the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 * Sets the postalCode parameter requirements
	 * @throws InvalidInputException
	 */
	public void setPostalCode(String postalCode) throws InvalidInputException {
		if (postalCode.length() > 6) {
			throw new InvalidInputException("This postal code is too long, please type your 6 digit postal code.");
		} else if (postalCode.length() < 6) {
			throw new InvalidInputException("This postal code is too short, please type your 6 digit postal code.");
		}
		for (int i = 0; i < 5; i++) {
			if ((i % 2) == 1) {
				if (!Character.isDigit(postalCode.charAt(i))) {
					throw new InvalidInputException("On character " + (i + 1) + ", you have inputted a letter.");
				}

			} else {
				if (!Character.isLetter(postalCode.charAt(i))) {
					throw new InvalidInputException("On character " + (i + 1) + ", you have inputted a number");
				}

			}
		}
		this.postalCode = postalCode;
	}

	/**
	 * @return the phoneNumber
	 * Returns the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *  Sets the phoneNumber parameter requirements
	 * @throws InvalidInputException
	 */
	public void setPhoneNumber(String phoneNumber) throws InvalidInputException {
		for (int i = 1; i < phoneNumber.length(); i++) {
			if (!Character.isDigit(phoneNumber.charAt(i))) {
				throw new InvalidInputException("Please only enter numbers for your phone number.");
			}

		}
		if (phoneNumber.length() > 10) {
			throw new InvalidInputException("Please only enter the 10 digits for your phone number.");
		}
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the birthDate
	 * Returns the birthDate
	 */
	public String getBirthDate() {
		return age;
	}

	/**
	 * @param birthDate
	 * Sets the birthDate parameter requirements
	 * @throws InvalidInputException 
	 */
	public void setBirthDate(String birthDate) throws InvalidInputException{
		try{
		int userYear = Integer.parseInt(birthDate.substring(0,4));
		int userMonth = Integer.parseInt(birthDate.substring(5,7));
		int userDay = Integer.parseInt(birthDate.substring(8,10));
		Calendar current = Calendar.getInstance();
		Calendar userBDay = Calendar.getInstance();
		userBDay.set(userYear, userMonth, userDay);
			
		int minAge = current.get(Calendar.YEAR) - userYear - 1;	
		if(userBDay.after(current)){		
			throw new Exception();			
		}
		LocalDate.of(userYear, userMonth,userDay);
		
			if(current.get(Calendar.MONTH) > userMonth || current.get(Calendar.MONTH) == userMonth && current.get(Calendar.DAY_OF_MONTH) >= userDay){
			minAge++;
			}
			this.age = minAge + "";
		}

		catch(Exception e){
			throw new InvalidInputException("Please enter it in the yyyy/mm/dd format or input a valid birthdate.");
		}
		
	}

	public String toString() {
		return (firstName + " " + age + " " + streetNumber + " " + streetAddress + " " + city + " " + province + " "
				+ postalCode + " " + phoneNumber);

	}
/**
 * Returns lastName
 * @return lastName
 */
	public String getLastName() {
		return lastName;
	}
/**
 * Sets the name parameter requirements
 * @param lastName
 * @throws InvalidInputException
 */
	public void setLastName(String lastName) throws InvalidInputException {
		lastName = lastName.toUpperCase();
		for (int i = 0; i < lastName.length(); i++) {
			if (!Character.isLetter(lastName.charAt(i))) {
				throw new InvalidInputException("Please only enter letters in your name.");
			}
		}
		this.lastName = lastName;
	}
/**
 * Compares firstName
 * @param ci
 * @return
 */
	public int compareFirstName(ContestantInformation ci) {
		return this.getName().compareToIgnoreCase(ci.getName());

	}
/**
 * Compares lastName
 * @param ci
 * @return
 */
	public int compareLastName(ContestantInformation ci) {
		return this.getLastName().compareToIgnoreCase(ci.getLastName());

	}
/**
 * 
 */
	public int compareTo(Object arg0) {
		ContestantInformation ci = (ContestantInformation) arg0;
		return 0;
	}

}
