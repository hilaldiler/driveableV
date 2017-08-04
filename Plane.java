package tr.org.linux.kamp.driveableV;

public class Plane extends Vehicle {
	
	
	public Plane(String brand, String model, int speed, String capacity, boolean hasAerofoil, boolean hasAutoPilot,
			GaseType gaseType) {
		super(brand, model, speed, capacity, hasAerofoil, hasAutoPilot, gaseType);
		// TODO Auto-generated constructor stub
	}

	private String flightCode;
	private boolean isAutoPilotActive;
	private int maximumFeat; 
	
	LiftOfType liftTYpe;
	
	enum LiftOfType{
		LIFT_OF_HORIZONTAL , LIFT_OF_VERTICAL
	}
	
	
	
	
	public Plane(String brand, String model, int speed, String capacity, boolean hasAerofoil, boolean hasAutoPilot,
			GaseType gaseType, String flightCode, boolean isAutoPilotActive, int maximumFeat) {
		super(brand, model, speed, capacity, hasAerofoil, hasAutoPilot, gaseType);
		this.flightCode = flightCode;
		this.isAutoPilotActive = isAutoPilotActive;
		this.maximumFeat = maximumFeat;
	}
	
	public String liftOffMessage() {
		
		switch(this.liftTYpe){
		
		case LIFT_OF_HORIZONTAL:
			return "yatay şekilde kalkıyor";
			
		case LIFT_OF_VERTICAL:
			return "dikey şekilde kalkıyor";
			
		
			
		}
		return "bilinmiyor";
		
	}
	
	
	@Override
	public void executeMotor() {
		// TODO Auto-generated method stub
		System.out.println("PLane execute Motor");
		
	}

	public String getFlightCode() {
		return flightCode;
	}

	public void setFlightCode(String flightCode) {
		this.flightCode = flightCode;
	}

	public boolean isAutoPilotActive() {
		return isAutoPilotActive;
	}

	public void setAutoPilotActive(boolean isAutoPilotActive) {
		this.isAutoPilotActive = isAutoPilotActive;
	}

	public int getMaximumFeat() {
		return maximumFeat;
	}

	public void setMaximumFeat(int maximumFeat) {
		this.maximumFeat = maximumFeat;
	}

	public LiftOfType getLiftTYpe() {
		return liftTYpe;
	}

	public void setLiftTYpe(LiftOfType liftTYpe) {
		this.liftTYpe = liftTYpe;
	}

	@Override
	public void processGaz() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setGear(int g) {
		// TODO Auto-generated method stub
		
	
		
		
	}
	
	
	

}
