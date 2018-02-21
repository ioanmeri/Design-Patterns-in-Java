
public class VehicleFactory {
	
	//this method is calling the getVehicle() on the
	//type (enum) that is passed into this
	public Vehicle getVehicle(VehicleType vehicleType) {
		return vehicleType.getVehicle();
	}
		
}