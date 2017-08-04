package tr.org.linux.kamp.driveableV;

public abstract class Vehicle implements Driveable { // her vasıta sürülebilir oldugundan dolayı

	private String brand;
	private String model;
	private int speed;
	private String capacity;
	private boolean hasAerofoil;
	private boolean hasAutoPilot;

	GaseType gaseType;

	public enum GaseType {

		BENZIN, DIZEL, LPG

	}

	public Vehicle(String brand, String model, int speed, String capacity, boolean hasAerofoil, boolean hasAutoPilot,
			GaseType gaseType) {
		super();
		this.brand = brand;
		this.model = model;
		this.speed = speed;
		this.capacity = capacity;
		this.hasAerofoil = hasAerofoil;
		this.hasAutoPilot = hasAutoPilot;
		this.gaseType = gaseType;
	}

	protected String getGasTypeMessage() {

		switch (this.gaseType) {

		case BENZIN:
			return "Tür Benzin";
		case DIZEL:
			return "Tür Dizel";
		case LPG:
			return "Tür: Lpg";
		default:
			break;
		}
		return null;

	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getCapacity() {
		return capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public void numberOfWhere() {

	}

}
