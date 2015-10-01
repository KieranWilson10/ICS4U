

package wilson;
/**
 * Reality show application
 * This receives information from the contestant including name, age, street number, city,
 * province, postal code, phone number an birth date of the user.
 * @author Kieran Wilson
 *
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ContestantInformation {
	private String firstName, lastName, birthDate, streetNumber, streetAddress, city, province, postalCode, phoneNumber;
	private Calendar userBirthDate = new GregorianCalendar();

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

	public ContestantInformation() {

	}

	/**
	 * @return the name
	 */
	public String getName() {
		return firstName + lastName;
		
	}

	/**
	 * @param name
	 *            the name to set
	 * @throws InvalidInputException 
	 */
	public void setName(String name) throws InvalidInputException {
		name = name.toUpperCase();		
		for(int i = 0; i < name.length(); i++)
		{
			if(!Character.isLetter(name.charAt(i))){
			 throw new InvalidInputException("Please only enter letters in your name.");
		 }
		}
		this.firstName = name;
	}

	/**
	 * @return the age
	 */
	public String getAge() {
		return birthDate;

	}

	/**
	 * @param yyyy
	 *            mm dd
	 * 
	 */
	public void setAge(int yyyy, int mm, int dd) {
		this.userBirthDate.set(yyyy, mm, dd);
		this.birthDate = userBirthDate.toString();
	}

	/**
	 * @return the streetNumber
	 */
	public String getStreetNumber() {
		return streetNumber;
	}

	/**
	 * @param streetNumber
	 *            the streetNumber to set
	 * @throws InvalidInputException 
	 */
	public void setStreetNumber(String streetNumber) throws InvalidInputException {
		for(int i = 0; i < streetNumber.length(); i++){
		if(Character.isDigit(streetNumber.charAt(i)) == false)
		throw new InvalidInputException("Please enter numbers only.");
		}
		
		this.streetNumber = streetNumber;
		
	}
	/**
	 * @return the streeAddresss
	 */
	public String getStreetAddress() {
		return streetAddress;
	}

	/**
	 * @param streeAddresss
	 *            the streeAddresss to set
	 */
	public void setStreetAddress(String streetAddress)throws InvalidInputException {
		streetAddress = streetAddress.toUpperCase();
		this.streetAddress = streetAddress;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 * @throws InvalidInputException 
	 */
	public void setCity(String city) throws InvalidInputException {
		city = city.toUpperCase();
		for(int i = 0; i < city.length(); i++)
		{
		 if(!Character.isLetter(city.charAt(i))){
			 throw new InvalidInputException("Please only enter letters for the city you live in.");
		 }	
		}

		this.city = city;
	}

	/**
	 * @return the province
	 */
	public String getProvince() {
		return province;
	}

	/**
	 * @param province
	 *            the province to set
	 * @throws InvalidInputException 
	 */
	public void setProvince(String province) throws InvalidInputException {
		if(false)
		{
			throw new InvalidInputException("Please enter the abriviation of your province.");
		}
			
		this.province = province;
	}

	/**
	 * @return the postalCode
	 */
	public String getPostalCode() {
		return postalCode;
	}

	/**
	 * @param postalCode
	 *            the postalCode to set
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
             if(!Character.isDigit(postalCode.charAt(i)))
             {
            	 throw new InvalidInputException("On character " + i + ", you have inputted a letter.");            	 
             }
             
			}
			else{
				if(!Character.isLetter(postalCode.charAt(i))){
					throw new InvalidInputException("On character" + i + ", you have inputted a number");
				}
				
			}
		}
		this.postalCode = postalCode;
	}
	

	

	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber
	 *            the phoneNumber to set
	 * @throws InvalidInputException 
	 */
	public void setPhoneNumber(String phoneNumber) throws InvalidInputException {
		for(int i = 1; i < phoneNumber.length() ; i++){
			if(!Character.isDigit(phoneNumber.charAt(i))){
				throw new InvalidInputException("Please only enter numbers for your phone number.");
			}
			
		}
		if(phoneNumber.length() > 9){			
			throw new InvalidInputException("Please only enter the 9 digits for your phone number.");
		}
		this.phoneNumber = phoneNumber;
	}

	/**
	 * @return the birthDate
	 */
	public String getBirthDate() {
		return birthDate;
	}

	/**
	 * @param birthDate
	 *            the birthDate to set
	 * @return 
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String toString() {
		return (firstName + " " + birthDate + " " + streetNumber + " " + streetAddress + " " + city + " " + province + " "
				+ postalCode + " " + phoneNumber + " " + birthDate);

	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) throws InvalidInputException{
		this.lastName = lastName;
	}

}
