public abstract class Vehicle{
	protected String name;
	protected int speed;
	protected int energyLevel;
	protected int temperature;
	protected int humidity;
	
	protected boolean hasSpecialCondition;

	public Vehicle(String name) {
		this.name = name;
	}

	private void printName() {
		System.out.println("Current Function: " + this.name);
	}
	protected abstract void printSpeed();
	private void printEnergyLevel() {
		this. energyLevel = RNGenerator.generate(10, 100);
		System.out.println("Energy: " + this.energyLevel +"%");
	}
	private void checkEnergyLevel() {
		if(this.energyLevel < 50)
			recharge();
	}
	private void printConditions() {

	}
	protected void printSpecialCondition(){};


	// template method
	public final void run() {
		printName();
		printSpeed();
		printEnergyLevel();
		checkEnergyLevel();
		printConditions();
		if(hasSpecialCondition)
			printSpecialCondition();
	}


}