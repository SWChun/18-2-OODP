public class Vehicle{
	protected String name;
	protected Speed speed;
	protected int energyLevel;
	protected int temperature;
	protected int humidity;	
	protected boolean hasSpecialCondition;

	public Vehicle(String name) {
		this.name = name;
		this.energyLevel = RNGenerator.generate(10, 100);
		this.temperature = RNGenerator.generate(10, 80);
		this.humidity = RNGenerator.generate(10, 80);
		BlackBox.getBlackBox().storeData(this);
	}

	private void printName() {
		System.out.println("Current Function: " + name);
	}
	protected void printSpeed() {
		System.out.print("Speed: " + speed.getValue() + " Km/Hour ");
		for(int i = 0; i < 4; i++) {
			int s = speed.getValue();
			speed.setValue(s + RNGenerator.generate(0, speed.getMax() - s));
			System.out.print(speed.getValue() + " Km/Hour ");
		}
		System.out.println();
	}
	private void printEnergyLevel() {		
		System.out.println("Energy: " + energyLevel + "%");
	}
	private void recharge() {
		System.out.print("Now Charging ");
		while(energyLevel < 100) {
			energyLevel += RNGenerator.generate(0, 100 - energyLevel);
			System.out.print(energyLevel + "% ");
		}
		System.out.println();
	}
	private void printConditions() {
		System.out.println("Temperature: " + temperature + " degree");
		System.out.println("Humidity: " + humidity + "%");
	}
	protected void printSpecialCondition(){};

	// template method
	public final void run() {
		printName();
		printSpeed();
		printEnergyLevel();
		if(energyLevel < 50)
			recharge();
		printConditions();
		if(hasSpecialCondition)
			printSpecialCondition();
	}

	public String getName(){
		return this.name;
	}	
	public int getEnergylevel(){
		return this.energyLevel;
	}
	public int getTemperature(){
		return this.temperature;
	}
	public int getHumidity	(){
		return this.humidity	;
	}
}