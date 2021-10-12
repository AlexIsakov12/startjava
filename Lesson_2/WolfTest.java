public class WolfTest {

	public static void main(String[] args) {

		Wolf newWolf = new Wolf();

		System.out.println(newWolf.getName);
		System.out.println(newWolf.color);

		newWolf.walk();
		newWolf.isHunting();
	}

}