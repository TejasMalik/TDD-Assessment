
public class StringAddNumbers {

	public int AddStringNumber(String nums) throws Exception {

		if (nums.length() == 0) {
			return 0;
		}

		int result = 0;

		String[] allNumbers = nums.split(",");
		for (String str : allNumbers) {
			int number = Integer.parseInt(str);
			result += number;
		}

		return result;

	}

}
