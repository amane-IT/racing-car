package util.validator;

import java.util.Arrays;

public class NameValidator extends Validator {
	public static final String SPLIT_POINT = ",";
	public static final String DEFAULT_MESSAGE = "";
	public static final String DUPLICATE_ERROR_MESSAGE = "중복된 이름이 존재합니다.";
	public static final String OUT_OF_LENGTH_ERROR_MESSAGE = "글자수를 초과했습니다.";
	public static final int MAX_LENGTH = 5;
	public static final int MIN_LENGTH = 1;

	public static void validateNames(String input) {
		isNull(input, DEFAULT_MESSAGE);
		isEmpty(input, DEFAULT_MESSAGE);
		isDuplicated(input, DEFAULT_MESSAGE);
	}

	public static void validateName(String input) {
		isNull(input, DEFAULT_MESSAGE);
		isEmpty(input, "이름에 ");
		isRange(input, DEFAULT_MESSAGE);
	}

	public static void isDuplicated(String input, String msg) {
		String[] names = input.split(SPLIT_POINT);
		long distinctNames = Arrays.stream(names).distinct().count();

		if (names.length != distinctNames) {
			throw new IllegalArgumentException(msg + DUPLICATE_ERROR_MESSAGE);
		}
	}

	public static void isRange(String input, String msg) {
		if (input.length() > MAX_LENGTH || input.length() < MIN_LENGTH) {
			throw new IllegalArgumentException(msg + OUT_OF_LENGTH_ERROR_MESSAGE);
		}
	}
}
