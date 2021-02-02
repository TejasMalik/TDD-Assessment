
public class StringAddNumbers {

	public int AddStringNumber(String nums) throws Exception {

		if (nums.length() == 0) {
			return 0;
		}

		int result = 0;

		
		for (int i = 0; i<nums.length(); i++) {
			int number = Integer.parseInt(String.valueOf(nums.charAt(i)));
			result += number;
		}

		return result;

	}

}
