import java.util.ArrayList;

public class BlackBox {
	private static BlackBox b;

	private ArrayList<String> functions = new ArrayList<String>();
	private ArrayList<Integer> energyLevels = new ArrayList<Integer>();
	private ArrayList<Integer> temperatures = new ArrayList<Integer>();
	private ArrayList<Integer> humidities = new ArrayList<Integer>();

	private BlackBox() {
	}

	public static BlackBox getBlackBox() {
		if(b == null) {
			b = new BlackBox();
			return b;
		}
		else
			return b;
	}
	public void storeData(Vehicle v) {
		functions.add(v.getName());
		energyLevels.add(v.getEnergylevel());
		temperatures.add(v.getTemperature());
		humidities.add(v.getHumidity());
	}
	public void printData() {
		System.out.print("Function: ");
		printWithArrow(functions);
		System.out.print("\nEnergyLevel: ");
		printWithArrow(energyLevels);
		System.out.print("\nTemperature: ");
		printWithArrow(temperatures);
		System.out.print("\nHumidity: ");
		printWithArrow(humidities);
		System.out.println();
	}
	private <T> void printWithArrow(ArrayList<T> al) {
		for(int i = 0; i < al.size(); i++) {
			if(i == 0)
				System.out.print(al.get(i) + "");
			else 
				System.out.print("->" + al.get(i));
		}
	}
}