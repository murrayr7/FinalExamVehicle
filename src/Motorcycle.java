
public class Motorcycle extends Vehicle {
	private Boolean hasSideCar;

	public Motorcycle(String Name, String Color, double Weight, Person Owner, Boolean hasSideCar){
		this.setColor(Color);
		this.setName(Name);
		this.setWeight(Weight);
		this.transferOwnership(Owner);
		this.hasSideCar=hasSideCar;
	}

	public Motorcycle() {
	}

	public Boolean getHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(Boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
	
	
	
	
}
