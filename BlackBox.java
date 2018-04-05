import java.util.ArrayList;

public class BlackBox {
	private static BlackBox b;

	private ArrayList<String> functions = new ArrayList<String>();
	private ArrayList<Integer> energyLevels = new ArrayList<Integer>();
	private ArrayList<Integer> temperatures = new ArrayList<Integer>();
	private ArrayList<Integer> humidities = new ArrayList<Integer>();

	private BlackBox() {
	}

	public static getBlackBox() {
		if(b == null) {
			b = new BlackBox();
			return b;
		}
		else
			return b;
	}
	public void storeData(Vehicle v) {
		functions.add(v.getName());
		energyLevels.add(v.getEnergyLevel());
		temperatures.add(v.getTemperature());
		humidities.add(v.getHumidity());
	}
	public void printData() {
		System.out.Print("Function: ");
		printWithArrow(functions);
		System.out.Print("\nEnergyLevel: ");
		printWithArrow(energyLevels);
		System.out.Print("\nTemperature: ");
		printWithArrow(temperatures);
		System.out.Print("\nHumidity: ");
		printWithArrow(humidities);
	}
	private void printWithArrow(ArrayList<T> al) {
		for(int i = 0; i < al.length(); i++) {
			if(i == 0)
				System.out.Print(al[i] + "");
			else 
				System.out.Print("->" + l[i]);
		}
	}
}