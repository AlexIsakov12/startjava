import java.util.Scanner;

public class GuessTheNumber {

	Player p1;
	Player p2;
	String continueTheGame;

	void Start() {
		p1 = new Player();
		p2 = new Player();

		int guessp1;
		int guessp2; 

		boolean isP1Right = false;
		boolean isP2Right = false;

		int targetNumber = (int) (Math.random() * 10);

		Scanner console = new Scanner(System.in);

		System.out.println("Thinking bout the number.. ");


		while (true) {
			System.out.println("Let's start the game! The target number is " + targetNumber);

			p1.guess();
			p2.guess();

			guessp1 = p1.number;
			System.out.println("First player thinks it is number " + guessp1);

			guessp2 = p2.number;
			System.out.println("Second player thinks it is number " + guessp2);

			if (guessp1 == targetNumber) {
				isP1Right = true;
			}

			if (guessp2 == targetNumber) {
				isP2Right = true;
			}


			if (isP1Right || isP2Right) {
				System.out.println("We have a winner!");
				System.out.println("Is Player 1 is a winner? " + isP1Right);
				System.out.println("Is Player 2 is a winner? " + isP2Right);
				break;
			} else {
				System.out.println("We don't have any winner, end of a game!");
				break;
			}
		}
	}

}