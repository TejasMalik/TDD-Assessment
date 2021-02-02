
public class StringAddNumbers {

	public int AddStringNumber(String nums) throws Exception {

		if (nums.length() == 0) {
			return 0;
		}

		int result = 0;

		String delimiter = "";

		if (nums.charAt(0) == '/' && nums.charAt(1) == '/') {
			delimiter += nums.charAt(2);
			nums = nums.substring(4);
		} else {
			delimiter = ",|\n";
		}

		String[] allNumbers = nums.split(delimiter);
		for (String str : allNumbers) {
			int number = Integer.parseInt(str);
			if (number < 0) {
				throw new Exception("Negative numbers like " + Integer.toString(number) + " are not allowed.");
			}
			result += number;
		}

		return result;

	}

}
