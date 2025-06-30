import java.util.Scanner;

public class Problem1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The 1st Value : ");
		double a = sc.nextDouble();

		System.out.println("Enter The 2nd Value : ");
		double b = sc.nextDouble();

		System.out.println("Enter Operation (+, -, *, /) : ");
		String operation = sc.next().toString();

		double result = 0;

		switch (operation) {
		case "+":
			result = a + b;
			break;
		case "-":
			result = a - b;
			break;
		case "*":
			result = a * b;
			break;
		case "/":
			if (b != 0) {
				result = a / b;
			} else {
				System.out.println("Error : Cannot divide by Zero");
				return;
			}
			break;
		default:
			System.out.println("Invalid Operation");
			return;
		}
		System.out.println("Result : " + result);
	}
}
