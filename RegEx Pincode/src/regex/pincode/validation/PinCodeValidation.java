package regex.pincode.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeValidation {

	public static void main(String[] args) {
		System.out.println("Welcome to Regular Expressions program to validate PIN code!\n");
		PinCodeValidation validate = new PinCodeValidation(); 
		
		String pin = "400088";
		if (validate.validatePinCode(pin))
			System.out.println("\n" + pin + "\tVALID");
		else
			System.out.println("\n" + pin + "\tINVALID");
	}
	
	public boolean validatePinCode(String input) {
		
		String pinCode = "^[0-9]{6}$";
		
		Pattern pattern = Pattern.compile(pinCode);
		Matcher match = pattern.matcher(input);
		
		return match.matches();
	}
}
