public class Submarine extends Vehicle{
    private int depth; 
    
    public Submarine() {
        super("Submarine");
        this.speed = new Speed(0, 60);
        this.depth = RNGenerator.generate(10, 100);
        this.hasSpecialCondition = true;
    }

    @Override
    protected void printSpecialCondition(){
        System.out.println("Depth: " + depth + "m");
    }
}