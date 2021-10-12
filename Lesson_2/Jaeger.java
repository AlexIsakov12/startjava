public class Jaeger {

	private String modelName, origin;
	private String class;

	private float height = 70.7f;
	private float weight = 2.1f;

	private int strength = 100;
	private int armor = 200;

	boolean isReady() {
		return true;
	}

	void setName (String modelName) {
		this.modelName = modelName;
	}

	void setStats (float height, float weight, int strength, int armor) {
		this.height = height;
		this.weight = weight;
		this.strength = strength;
		this.armor = armor;
	}

	public String getName() {
		return name;
	}

	public String getStats() {
		return height, weight, strength, armor;
	}

	public String checkStats() {
		System.out.println(modelName, height, weight, strength, armor);
	}

	void move() {
		System.out.println(modelName + "is moving");
	}

	String scanEnemy() {
		System.out.println(modelName + "has been scanned the area successfully");
	}


	void useCannon() {
		System.out.println(modelName + "has activated the cannon");
	}

}