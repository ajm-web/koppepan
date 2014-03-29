public class MyFizzBuzz implements FizzBuzz {
	public String calc(int i) {
		if(i %15 == 0){
			return "Fizz Buzz";
		}else if(i % 5 == 0){
			return "Buzz";
		}else if(i % 3 == 0){
			return "Fizz";
		}else{
			return Integer.toString(i);
		}
	}
}
