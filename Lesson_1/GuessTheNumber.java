import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
	public static void main(String[] args) {
		Random rand = new Random();
		int randomNumber = rand.nextInt(100);

		Scanner console = new Scanner(System.in);
		System.out.print("Please input alleged number:");
		int allegedNumber = console.nextInt();

		while (allegedNumber != randomNumber) {
			if (allegedNumber > randomNumber) {
				System.out.println("This number is greater than the number you guessed");
		}	else {
				System.out.println("This number is less than the number you guessed");
		}	
			allegedNumber = console.nextInt();
	}	
		System.out.println("Congratulation, the number have been exposed!");
}
}