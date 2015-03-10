
public class Car {
	// Instance Variables or fields
	   private String manufacturer;
	   private String color;
	   private int odometerReading;
	      
	// Constructor method
	   public Car (String m, String c, int odometer)
	   {
	      this.manufacturer = m;
	      this.color = c;
	      this.odometerReading = odometer;
	   }
	      
	//Return the Car's manufacturer
	   public String getManufacturer(){
		   return this.manufacturer;
	   }
	   
	 //Return the Car's odometer reading
	   public int getOdometerReading(){
		   return this.odometerReading;
	   }
	   
	 //Return the Car's odometer reading
	   public void setOdometerReading(int odometerReading){
		   this.odometerReading = odometerReading;
	   }
	   
	// Change the Car's color
	   public void rePaint(String newColor)
	   {
	      this.color = newColor;
	   }
	   
	// Returns the Car's current color
	   public String getColor()
	   {
	      return this.color;
	   }
}
