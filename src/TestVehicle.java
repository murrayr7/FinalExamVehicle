
public class TestVehicle {

	public static void main(String[] args) {
		Person a = new Person();
		Car car = new Car();
		car.transferOwnership(a);
		car.setNumberOfDoors(4);
		
		Truck truck = new Truck();
		truck.transferOwnership(a);
		truck.setNumberOfAxels(2);
		
		Person b= new Person();
		truck.transferOwnership(b);
		
		
		Motorcycle motorcycle = new Motorcycle();
		motorcycle.setHasSideCar(false);
		

	}

}
