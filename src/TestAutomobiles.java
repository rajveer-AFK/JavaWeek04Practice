import javax.swing.JOptionPane;

public class TestAutomobiles {

	public static void main(String[] args) {
		
		// Creates the first Automobile object using user input and displays the details
		JOptionPane.showMessageDialog(null, "Enter the details of the first automobile");
		Automobile automobile1 = createAutomobileObject();
		displayAutomobileDetails(automobile1);
		
		// Creates the second Automobile object using user input and displays the details
		JOptionPane.showMessageDialog(null, "Enter the details of the second automobile");
		Automobile automobile2 = createAutomobileObject();
		displayAutomobileDetails(automobile2);
		
	}
	
	public static Automobile createAutomobileObject() {
		
		int automobileId = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the ID of the automobile"));
		String automobileMake = JOptionPane.showInputDialog(null, "Enter the make of the automobile");
		String automobileModel = JOptionPane.showInputDialog(null, "Enter the model of the automobile");
		int automobileYear = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the year of the automobile"));
		String automobileColor = JOptionPane.showInputDialog(null, "Enter the color of the automobile");
		int automobileMilesPerGallon = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter MPG of the automobile"));
		
		return new Automobile(automobileId, automobileYear, automobileMilesPerGallon, automobileMake, automobileModel, automobileColor);
	}
	
	public static void displayAutomobileDetails(Automobile automobile) {
		
		JOptionPane.showMessageDialog(null, "ID: " + automobile.getId() + "\nMake: " + automobile.getMake() +
									  "\nModel: " + automobile.getModel() + "\nColor: " + automobile.getColor() +
									  "\nYear: " + automobile.getYear() + "\nMPG: " + automobile.getMilesPerGallon(),
									  "Automobile Details", 1);
	}
}
