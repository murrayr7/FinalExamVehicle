
public class Car extends Vehicle{
	private int NumberOfDoors;
	
	public Car (String Name, String Color, double Weight, Person Owner, int NumberOfDoors){
		this.setColor(Color);
		this.setName(Name);
		this.setWeight(Weight);
		this.transferOwnership(Owner);
		this.NumberOfDoors=NumberOfDoors;
	}

	public Car() {
	}

	public int getNumberOfDoors() {
		return NumberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		NumberOfDoors = numberOfDoors;
	}
	
	
}
