package _07_years_alive;

public class YearsAlive {
public static void main(String[] args) {
	//example for a person born in 1995
	int startYear = 1995;
	int endYear = 2019;
	for (int i = startYear; i < endYear + 1; i++) {
		System.out.println("I was alive in the year " + i);
	}
}
}
