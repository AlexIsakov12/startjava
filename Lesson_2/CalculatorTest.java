import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {
		int firstDigit, secondDigit, symbol;

		Scanner console = new Scanner(System.in);
		Calculator newCalculator = new Calculator();

		System.out.print("Input first number: ");
		firstDigit = console.nextInt();

		System.out.print("Input an operation sign: ");
		symbol = console.nextLine();

		System.out.print("Input second number: ");
		secondDigit = console.nextInt();

		newCalculator.Start(firstDigit, symbol, secondDigit);
	}
}