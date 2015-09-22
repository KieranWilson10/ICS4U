
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
	private String name, birthDate, streetNumber, streetAddress, city, province, postalCode, phoneNumber;
	private Calendar userBirthDate = new GregorianCalendar();

	public ContestantInformation(String name, String age, String streetNumber, String streetAddress, String city,
			String province, String postalCode, String phoneNumber, String birthDate) {
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
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 */
	public void setStreetNumber(String streetNumber) {
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
	public void setStreetAddress(String streeAddresss) {
		this.streetAddress = streeAddresss;
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
	 */
	public void setCity(String city) {
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
	 */
	public void setProvince(String province) {
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
	 */
	public void setPhoneNumber(String phoneNumber) {
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
	 */
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String toString() {
		return (name + " " + birthDate + " " + streetNumber + " " + streetAddress + " " + city + " " + province + " "
				+ postalCode + " " + phoneNumber + " " + birthDate);

	}

}
