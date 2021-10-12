public class Calculator {

	private int firstDigit, secondDigit, result;
	private String symbol;

	void Start(int firstDigit, String symbol, int secondDigit) {

		this.firstDigit = firstDigit;
		this.symbol = symbol;
		this.secondDigit = secondDigit;

		switch (symbol) {
			case (symbol.equals("+")):
				System.out.println(firstDigit + secondDigit);
				break;
			case (symbol.equals("-")):
				System.out.println(firstDigit - secondDigit);
				break;
			default:
				System.out.println("Incorrect symbol");
				break;
		}	
	}


}