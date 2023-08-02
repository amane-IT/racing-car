package util.validator;

public class Validator {
	private static final String NULL_ERROR_MESSAGE = "NULL 값은 입력할 수 없습니다.";
	private static final String EMPTY_ERROR_MESSAGE = "빈 값은 입력할 수 없습니다.";

	public static void isNull(String input, String msg) {
		if (input == null) {
			throw new IllegalArgumentException(msg + NULL_ERROR_MESSAGE);
		}
	}

	public static void isEmpty(String input, String msg) {
		if (input.isEmpty() || input.isBlank()) {
			throw new IllegalArgumentException(msg + EMPTY_ERROR_MESSAGE);
		}
	}
}
