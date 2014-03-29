public class MyFizzBuzz implements FizzBuzz {
	public String calc(int i) {
		if (i==0) return "0";
		return i%3==0?"Fizz"+(i%5==0?" Buzz":""):i%5==0?"Buzz":Integer.toString(i);
	}
}
