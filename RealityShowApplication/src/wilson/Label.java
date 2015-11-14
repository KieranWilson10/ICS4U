
package wilson;

/**
 * Label class formats the information to be outputted in the main
 * 
 * @author Kieran Wilson
 *
 */
public class Label {

	ContestantInformation ci;
	String formatOutput;
	String lastName;
	String firstName;
	String streetNumber;
	String streetName;
	String city;
	String province;
	String postalCode;
	String phoneNumber;

	private String nameOutput;
	private String addressOutput;
	private String phoneNumberOutput;

	public Label(ContestantInformation ci) {
		this.ci = ci;
	}

	/**
	 * Returns formatName
	 * @return formatName
	 */
	private String formatName() {
		lastName = ci.getLastName();
		firstName = ci.getName();

		nameOutput = lastName + ", " + firstName;
		return nameOutput;
	}

	/**
	 * Returns formatAddress
	 * @return formatAddress
	 */
	private String formatAddress() {
		streetNumber = ci.getStreetNumber();
		streetName = ci.getStreetAddress();
		city = ci.getCity();
		province = ci.getProvince();
		postalCode = ci.getPostalCode();

		addressOutput = streetNumber + " " + streetName + " \n" + city + ", " + province + " \n" + postalCode;
		return addressOutput;

	}

	/**
	 * Returns formatNumber
	 * @return formatNumber
	 */
	private String formatNumber() {
		phoneNumber = ci.getPhoneNumber();

		phoneNumberOutput = phoneNumber;
		return phoneNumberOutput;
	}

	/**
	 * Formats the label
	 * @return formatOutput
	 */
	public String toString() {

		formatOutput = formatName() + "\n" + formatAddress() + "\n" + formatNumber();

		return formatOutput;

	}

}
