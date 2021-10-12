public class Wolf {

	private String sex = "male";
	private String name = "Chief";
	private String color = "gray";

	private int weight = 50;
	private int age = 5;


	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}


	void setAge(int age) {
		if (age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public void walk() {
		System.out.println("walking");
	}

	public void sit() {
		System.out.println("sitting");
	}

	public void howl() {
		System.out.println("howling");
	}

	public boolean isHunting() {
		return true;
	}
}