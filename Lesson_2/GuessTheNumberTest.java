import java.util.Scanner;

public class GuessTheNumberTest {

	public static void main(String[] args) {

		String restart;

		Scanner console = new Scanner(System.in);

		GuessTheNumber game = new GuessTheNumber();
		game.Start();

		System.out.println("Do you want to start a new game? [yes/no] ");
		restart = console.next();

		while (restart.equals("yes")) {
			game.Start();
			System.out.println("Do you want to start a new game? [yes/no] ");
			restart = console.next();
		}
	}	
}
