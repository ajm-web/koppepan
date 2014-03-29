public class CheckIo{
	public Boolean checkio(String ch){
		return ch.matches("^(?=.{10,})(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9]).*$")?true:false;
	}
}
