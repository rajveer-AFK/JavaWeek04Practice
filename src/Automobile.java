
public class Automobile {
	
	private int id;
	private int year;
	private double milesPerGallon;
	private String make;
	private String model;
	private String color;
	
	public Automobile(int id, int year, double milesPerGallon, String make, String model, String color) {
		setId(id);
		setYear(year);
		setMilesPerGallon(milesPerGallon);
		setMake(make);
		setModel(model);
		setColor(color);
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		if(id < 0 || id > 9999) {
			id = 0;
		}
		this.id = id;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if(year < 2005 || year > 2024) {
			year = 0;
		}
		this.year = year;
	}
	public double getMilesPerGallon() {
		return milesPerGallon;
	}
	public void setMilesPerGallon(double milesPerGallon) {
		if(milesPerGallon < 10 || milesPerGallon > 60) {
			milesPerGallon = 0;
		}
		this.milesPerGallon = milesPerGallon;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
