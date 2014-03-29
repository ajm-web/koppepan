import junit.framework.*;

public class SundayCountTest extends TestCase {
	public SundayCountTest(String s) {
		super(s);
	}

	public void test() throws Exception {

		SundayCount sundayCount = new SundayCount();

		assertFalse(sundayCount.sundaycount("A1213pok1"));
		assertTrue(sundayCount.sundaycount("bAse730onE"));
		assertFalse(sundayCount.sundaycount("asasasasasasasaas"));
		assertFalse(sundayCount.sundaycount("QWERTYqwerty"));
		assertFalse(sundayCount.sundaycount("123456123456"));
		assertTrue(sundayCount.sundaycount("QwErTy911poqqqq"));
		assertFalse(sundayCount.sundaycount("aaaaaaaaaaaaaaa1"));

	}
}
