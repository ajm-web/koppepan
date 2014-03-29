public class SundayCount{
	public Boolean sundaycount(String ch){
		if (ch.length() < 10) { return false; }

		if (   !ch.matches(".*[A-Z].*")
			|| !ch.matches(".*[a-z].*")
			|| !ch.matches(".*[0-9].*"))
		{
			return false;
		}

		return true;
	}
}
