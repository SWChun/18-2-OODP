import java.util.Scanner;

public class ControlPanel {
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		VehicleAdaptor transformer = new VehicleAdaptor(new Car());
		BlackBox.getBlackBox();
		boolean isHalt = false;

		do {
			if(transformer.isActivated()){			
				transformer.run();
				BlackBox.getBlackBox().storeData(transformer.getVehicle());
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
				case 'H'
					isHalt = true;
					break;
				default:
					System.out.println("Unrecognizable Command. Activating the previous mode.");
					break;
			}
		} while(!isHalt);
		System.out.println("Halting the vehicle...");
		System.out.println("Adjusting the vehicle to the safe condition.");
	}
}