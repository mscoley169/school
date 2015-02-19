public class Csc151CarClass {

	public static void main(String[] args) {
		Car yourcar;
		Car mycar = new Car("Ford", "blue", 92321);
		yourcar = new Car("Toyota", "red", 22319);
		System.out.println( "My car is a " + mycar.getColor() + " " +
				mycar.getManufacturer() + " with " + mycar.getOdometerReading() + " miles." );
		mycar.rePaint("green");
		System.out.println("After repaint my car is " + mycar.getColor());
		mycar.setOdometerReading(100321);
		
		System.out.println("The currnemt mileage is " + mycar.getOdometerReading());
		System.out.println( "My car is a " + mycar.getColor() + " " +
				mycar.getManufacturer() + " with " + mycar.getOdometerReading() + " miles." );
		printCarInfo(yourcar.getManufacturer(), yourcar.getColor(), yourcar.getOdometerReading());
	}
	
	private static void printCarInfo( String make, String color, int odometer ){
		System.out.println( "The car is a " + color + " " +
				make + " with " + odometer + " miles." );
	}

}
