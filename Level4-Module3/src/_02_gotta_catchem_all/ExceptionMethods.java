package _02_gotta_catchem_all;

public class ExceptionMethods {
	public double divide(double numerator, double denominator){
		if(denominator == 0.0) {
			throw new IllegalArgumentException();
		}
		return numerator/denominator;
	}
	
	public String reverseString(String input){
		if(input.equals("")) {
			throw new IllegalStateException();
		}
		String output = "";
		for (int i = input.length()-1; i >= 0; i--) {
			output += input.charAt(i);
		}
		return output;
	}
	
	public String shorterReverseString(String input){
		if(input.equals("")) {
			throw new IllegalStateException();
		}
		return new StringBuilder(input).reverse().toString();
	}
}
