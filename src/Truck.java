
public class Truck extends Vehicle {
	private int NumberOfAxels;
	
	public Truck (String Name, String Color, double Weight, Person Owner, int NumberOfAxels){
		this.setColor(Color);
		this.setName(Name);
		this.setWeight(Weight);
		this.transferOwnership(Owner);
		this.NumberOfAxels= NumberOfAxels;
	}

	public Truck() {
	}

	public int getNumberOfAxels() {
		return NumberOfAxels;
	}

	public void setNumberOfAxels(int numberOfAxels) {
		NumberOfAxels = numberOfAxels;
	}
	
	
}
