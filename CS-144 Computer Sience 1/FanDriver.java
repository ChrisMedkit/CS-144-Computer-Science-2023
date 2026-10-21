
public class FanDriver {

	public static void main(String[] args) {
		Fan fan1 = new Fan();
		System.out.println("fan1 speed: " + fan1.getSpeed());	
		System.out.println("fan1 power: " + fan1.togglePower());
		System.out.println("fan1 speed: " + fan1.increaseSpeed());
		System.out.println("fan1 speed: " + fan1.decreaseSpeed());

		Fan fan2 = new Fan(5);
		System.out.println("fan2 speed: " + fan2.getSpeed());	
		System.out.println("fan2 power: " + fan2.togglePower());
		System.out.println("fan2 speed: " + fan2.increaseSpeed());
		System.out.println("fan2 speed: " + fan2.decreaseSpeed());
	}

}
