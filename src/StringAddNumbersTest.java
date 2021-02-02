import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringAddNumbersTest {
	
	private StringAddNumbers obj = new StringAddNumbers();

	@Test
	void testEmptyString() throws Exception {
		assertEquals(0, obj.AddStringNumber(""));
	}

}
