package util.validator;

public class TrialNumberValidator extends Validator {
	private static final int MIN_TRIAL_NUMBER = 1;
	private static final String DEFAULT_MESSAGE = "";
	private static final String UNDER_MIN_TRAIL_NUMBER_ERROR_MESSAGE = "";
	private static final String NOT_NUMBER_ERROR_MESSAGE = "";

	public static void trialNumberValidator(String input) {
		isNull(input, DEFAULT_MESSAGE);
		isEmpty(input, DEFAULT_MESSAGE);
		int trialNumber = isNumber(input, DEFAULT_MESSAGE);
		isRange(trialNumber, DEFAULT_MESSAGE);
	}

	public static int isNumber(String input, String msg) {
		int result;
		try {
			result = Integer.parseInt(input);
		} catch (NumberFormatException e) {
			throw new NumberFormatException(msg + NOT_NUMBER_ERROR_MESSAGE);
		}
		return result;
	}

	public static void isRange(int input, String msg) {
		if (input < MIN_TRIAL_NUMBER) {
			throw new IllegalArgumentException(msg + UNDER_MIN_TRAIL_NUMBER_ERROR_MESSAGE);
		}
	}
}
