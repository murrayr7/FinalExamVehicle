
public abstract class Vehicle implements VehicleInterface {
	private String Name;
	private String Color;
	private double Weight;
	private Person Owner;
	
	public void transferOwnership(Person newOwner){
		Owner = newOwner;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getWeight() {
		return Weight;
	}

	public void setWeight(double weight) {
		Weight = weight;
	}

	public Person getOwner() {
		return Owner;
	}
	
	
	

}
