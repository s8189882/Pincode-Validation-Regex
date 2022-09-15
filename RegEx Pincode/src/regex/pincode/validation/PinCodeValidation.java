package regex.pincode.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeValidation {

	public static void main(String[] args) {
		System.out.println("Welcome to Regular Expressions program to validate PIN code!\n");
		PinCodeValidation validate = new PinCodeValidation(); 
		
		String pin1 = "400088";
		String pin2 = "A40008";
		validate.validatePinCode(pin1);
		validate.validatePinCode(pin2);
	}
	
	public void validatePinCode(String input) {
		
		String pinCode = "^[0-9]{6}$";
		
		Pattern pattern = Pattern.compile(pinCode);
		Matcher match = pattern.matcher(input);
		
		printResult(match.matches(), input);
	}
	
	public void printResult(boolean isOkay, String pin) {
		if (isOkay)
			System.out.println("\n" + pin + "\tVALID");
		else
			System.out.println("\n" + pin + "\tINVALID");
	}
}
