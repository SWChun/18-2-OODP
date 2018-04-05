import java.util.Scanner;

public class ControlPanel {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		VehicleAdaptor transformer = new VehicleAdaptor(new Car());
		BlackBox.getBlackBox();
		boolean isHalt = false;

		do {
			if(transformer.getIsActivated()){			
				transformer.run();				
			}
			System.out.println("Next Vehicle Action:");
			System.out.println("(C)ar (P)lane (S)ubmarine (B)lackbox (H)alt");
			char cmd = kb.next().charAt(0);
			switch(cmd) {
				case 'C':
					transformer.setIsActivated(true);
					transformer.transform(new Car());
					break;
				case 'P':
					transformer.setIsActivated(true);
					transformer.transform(new Plane());
					break;
				case 'S':
					transformer.setIsActivated(true);
					transformer.transform(new Submarine());
					break;
				case 'B':
					transformer.setIsActivated(false);
					BlackBox.getBlackBox().printData();
					break;
				case 'H':
					isHalt = true;
					break;
				default:
					transformer.setIsActivated(false);
					System.out.println("Unrecognizable Command");
					break;
			}
		} while(!isHalt);
		System.out.println("Halting the vehicle...");
		System.out.println("Adjusting the vehicle to the safe condition.");
	}
}