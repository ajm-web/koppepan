import junit.framework.*;

public class SundayCountTest extends TestCase {
	public SundayCountTest(String s) {
		super(s);
	}

	public void test() throws Exception {

		SundayCount sundayCount = new SundayCount();

		assertTrue(sundayCount.sundaycount(1988));	// 4で割り切れるためTrue
		assertTrue(sundayCount.sundaycount(2000));	// 400で割り切れるためTrue
		assertFalse(sundayCount.sundaycount(1959));	// 4で割り切れないためFalse
		assertFalse(sundayCount.isLeapYear(1990));	// 400で割り切れず、100で割り切れるためFalse

	}
}
