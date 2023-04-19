package informatikTDU.reiseBuro.business.rules;

import java.util.regex.Pattern;

import informatikTDU.reiseBuro.business.constants.systemMessages.Messages;

public class PersonRules {

	public static void checkBuergerID(String identityNumber) throws Exception {
		String regex = "[0-9]{7}";

		if (!Pattern.matches(regex, identityNumber)) {
			throw new Exception(Messages.BUERGER_ID_WRONG);
		}
	}

	public static void checkLengthOfFirstName(String firstName) throws Exception {
		if (firstName.length() < 2) {
			throw new Exception(Messages.FIRSTNAME_SIZE_ERROR);
			
		}
		
	}

	public static void checkFirstName(String firstName) throws Exception {
		String regex = "[a-zA-Z.\\s]{2,}";

		if (!Pattern.matches(regex, firstName)) {
			throw new Exception(Messages.FIRSTNAME_NOT_CORRECT);

		}
	}

	public static void checkLengthOfLastName(String lastName) throws Exception {
		if (lastName.length() < 2) {
			throw new Exception(Messages.LASTNAME_SIZE_ERROR);
			
		}
		
	}
	
	public static void checkLastName(String lastName) throws Exception {
		String regex = "[a-zA-Z]{2,}";

		if (!Pattern.matches(regex, lastName)) {
			throw new Exception(Messages.LASTNAME_NOT_CORRECT);

		}
	}

}
