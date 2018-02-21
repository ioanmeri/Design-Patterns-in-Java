
public enum VehicleType {
	
	//define abstract methods in enum
	//because enum type instances cannot be instantiated
	TRUCK{
		public Vehicle getVehicle() {
			return new Truck();
		}
	},
	CAR{
		public Vehicle getVehicle() {
			return new Car();
		}
	},
	ELECTRIC{
		public Vehicle getVehicle() {
			return new ElectricCar();
		}
	};
	
	//the implementation of the abstract method
	//is in the above predefined constants
	abstract Vehicle getVehicle();
}