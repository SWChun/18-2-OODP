public class Plane extends Vehicle{
    private int altitude;
    private int airDensity;   
    
    public Plane() {
        super("Plane");
        this.speed = new Speed(0, 200);
        this.altitude = RNGenerator.generate(500, 2000);
        this.airDensity = RNGenerator.generate(50, 100);
        this.hasSpecialCondition = true;
    }

    @Override
    protected void printSpecialCondition(){
        System.out.println("Altitude: " + altitude + "m");
        System.out.println("Air Density: " + airDensity + "%");
    }
}