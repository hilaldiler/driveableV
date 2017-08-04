package tr.org.linux.kamp.driveableV;

public class Car extends Vehicle {
	
	private int gear;

	public Car(String brand, String model, int speed, String capacity, boolean hasAerofoil, boolean hasAutoPilot,
			GaseType gaseType) {
		super(brand, model, speed, capacity, hasAerofoil, hasAutoPilot, gaseType);
		// TODO Auto-generated constructor stub
	}

	private int driveCode;
	private boolean isAutoPilotActive;
	
	
	
	public int getDriveCode() {
		return driveCode;
	}
	public void setDriveCode(int driveCode) {
		this.driveCode = driveCode;
	}
	public boolean isAutoPilotActive() {
		return isAutoPilotActive;
	}
	public void setAutoPilotActive(boolean isAutoPilotActive) {
		this.isAutoPilotActive = isAutoPilotActive;
	}
	@Override
	public void executeMotor() {
		// TODO Auto-generated method stub
		System.out.println("Car execute Motor");

		
	}
	@Override
	public void processGaz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGear(int gear) {
		// TODO Auto-generated method stub
		
		
		if(gear>0 && gear<6)
			this.gear=gear;
		
	}

	
	
	
	
	
	
	

}
