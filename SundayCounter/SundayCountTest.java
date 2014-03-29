import junit.framework.*;

public class SundayCountTest extends TestCase {
	public SundayCountTest(String s) {
		super(s);
	}

	public void test() throws Exception {

		SundayCount sundayCount = new SundayCount();

		assertTrue(sundayCount.isLeapYear(1988));	// 4で割り切れるためTrue
		assertTrue(sundayCount.isLeapYear(2000));	// 400で割り切れるためTrue
		assertFalse(sundayCount.isLeapYear(1959));	// 4で割り切れないためFalse
		assertFalse(sundayCount.isLeapYear(1990));	// 400で割り切れず、100で割り切れるためFalse

		sundayCount.sundaycount(1901, 1, 1, 2000, 12, 31);
	}
}
