package util.generator;

public class NameGenerator {
	private static final String SPLIT_POINT = ",";

	public String[] generateCarNames(String input) {
		return input.split(SPLIT_POINT);
	}
}
