import junit.framework.*;

public class LatticleMultipleTest extends TestCase {
	public LatticleMultipleTest(String s) {
		super(s);
	}

	public void test() throws Exception {

	LatticleMultiple sundayCount = new LatticleMultiple();

		assertTrue(sundayCount.latticlemultiple(1988));	// 4で割り切れるためTrue
	//	assertTrue(sundayCount.sundaycount(2000));	// 400で割り切れるためTrue
	//	assertFalse(sundayCount.sundaycount(1959));	// 4で割り切れないためFalse
	//	assertFalse(sundayCount.isLeapYear(1990));	// 400で割り切れず、100で割り切れるためFalse

	}
}
