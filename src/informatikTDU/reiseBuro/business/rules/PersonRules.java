package informatikTDU.reiseBuro.business.rules;

import java.util.regex.Pattern;

import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;
import informatikTDU.reiseBuro.exceptions.*;

public class PersonRules {

	public static void checkBuergerID(String identityNumber) throws BuergerIdFormatException {
		String regex = "[0-9]{7}";

		if (!Pattern.matches(regex, identityNumber)) {
			throw new BuergerIdFormatException(Messages.FormatExceptionMessages.BUERGER_ID_WRONG);
		}
	}

	public static void checkLengthOfFirstName(String firstName) throws BuergerIdFormatException {
		if (firstName.length() < 2) {
			throw new BuergerIdFormatException(Messages.FormatExceptionMessages.FIRSTNAME_SIZE_ERROR);
			
		}
		
	}

	public static void checkFirstName(String firstName) throws FirstNameFormatException {
		String regex = "[a-zA-Z.\\s]{2,}";

		if (!Pattern.matches(regex, firstName)) {
			throw new FirstNameFormatException(Messages.FormatExceptionMessages.FIRSTNAME_NOT_CORRECT);

		}
	}

	public static void checkLengthOfLastName(String lastName) throws LastNameFormatException {
		if (lastName.length() < 2) {
			throw new LastNameFormatException(Messages.FormatExceptionMessages.LASTNAME_SIZE_ERROR);
			
		}
		
	}
	
	public static void checkLastName(String lastName) throws LastNameFormatException {
		String regex = "[a-zA-Z]{2,}";

		if (!Pattern.matches(regex, lastName)) {
			throw new LastNameFormatException(Messages.FormatExceptionMessages.LASTNAME_NOT_CORRECT);

		}
	}

}
