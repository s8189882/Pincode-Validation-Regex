package regex.pincode.validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PinCodeValidation {

	public static void main(String[] args) {
		System.out.println("Welcome to Regular Expressions program to validate PIN code!\n");
		PinCodeValidation validate = new PinCodeValidation(); 
		
		String pin1 = "400088";
		String pin2 = "A40008";
		String pin3 = "400088B";
		String pin4 = "400 088";		
		validate.validatePinCode(pin1);
		validate.validatePinCode(pin2);
		validate.validatePinCode(pin3);
		validate.validatePinCode(pin4);

	}
	
	public void validatePinCode(String input) {
		
		String pinCode = "^[0-9]{3}[\s]{0,1}[0-9]{3}$";
		
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
