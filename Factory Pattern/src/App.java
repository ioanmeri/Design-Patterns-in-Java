
public class App {

	public static void main(String args[]) {
		
		VehicleFactory vehicleFactory = new VehicleFactory();
		
		//Take the Car and call the getVehicle method on it
		Vehicle vehicle = vehicleFactory.getVehicle(VehicleType.CAR);
		vehicle.startEngine();
	}
	
}