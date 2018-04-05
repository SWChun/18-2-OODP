public class VehicleAdaptor {
	private Vehicle v;
	private boolean isActivated = true;

	public VehicleAdaptor(Vehicle v) {
		this.v = v;
	}
	public void transform(Vehicle v) {
		this.v = v;
	}
	public void run() {
		v.run();
	}
	public boolean getIsActivated() {
		return this.isActivated;
	}
	public void setIsActivated(boolean b) {
		this.isActivated = b;
	}
	public Vehicle getVehicle() {
		return this.v;
	}

}