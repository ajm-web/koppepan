import junit.framework.*;

public class CheckIoTest extends TestCase {
	public CheckIoTest(String s) {
		super(s);
	}

	public void test() throws Exception {

		CheckIo checkIo = new CheckIo();

		assertFalse(checkIo.checkio("A1213pok1"));
		assertTrue(checkIo.checkio("bAse730onE"));
		assertFalse(checkIo.checkio("asasasasasasasaas"));
		assertFalse(checkIo.checkio("QWERTYqwerty"));
		assertFalse(checkIo.checkio("123456123456"));
		assertTrue(checkIo.checkio("QwErTy911poqqqq"));

	}
}
