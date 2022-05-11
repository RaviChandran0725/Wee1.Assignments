package assignments;

public class Car {
	public void switchOnAc() {
		System.out.println("Turning On Ac...");		
	}
	
	public void applyBreak() {
		System.out.println("Applying Brake...");
		
	}
	
	public void applyGear() {
		System.out.println("Applying Gear...");
				
	}
	
	public void appyAccelerate() {
		System.out.println("Applying Acceleration...");
		
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.switchOnAc();
		car.applyBreak();
		car.applyGear();
		car.appyAccelerate();

	}

}
