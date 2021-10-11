import java.util.Scanner;

public class Calculator { 
	public static void main(String[] args) {
		int i = 0, result = 1;
		Scanner console = new Scanner(System.in);
		System.out.print("Input first number: ");
		int a = console.nextInt();

		System.out.print("Input second number: ");
		int b = console.nextInt();

		System.out.print("Input operation symbol: ");
		String symbol = console.next();

		if (symbol.equals("+")) {
			System.out.println(a + b);
		} else if (symbol.equals("-")) {
			System.out.println(a - b);
		} else if (symbol.equals("*")) {
			System.out.println(a * b);
		} else if (symbol.equals("/")) {
			System.out.println(a / b);
		} else if (symbol.equals("^")) {
			while (i < b) {
				result = result * a;
				i++;
			}
			System.out.println(result);
		} else if (symbol.equals("%")) {
			System.out.println(a % b);
		}
	}
}