package edu.nashcc.ohms;

public class OhmsLaw {

/* TODO: 
 * 		- E = IR, I = E/R, R = E/I
 * 		- loop (do while?)
 * 		- move main() to separate class
 * 		- 
 * 
 */
	
	private double voltage, amperage, resistance;

	public double getVoltage() {
		return voltage;
	}

	public void setVoltage(double voltage) {
		this.voltage = voltage;
	}

	public double getAmperage() {
		return amperage;
	}

	public void setAmperage(double amperage) {
		this.amperage = amperage;
	}

	public double getResistance() {
		return resistance;
	}

	public void setResistance(double resistance) {
		this.resistance = resistance;
	}

	public OhmsLaw(){
		
	}
	
	public static void main(String[] args) {

		//move into separate method
		StringBuilder sb = new StringBuilder();
		sb.append("Choose the value you wish to calculate: \n");
		sb.append("1 - Voltage\n");
		sb.append("2 - Current\n");
		sb.append("3 - Resistance\n");
		sb.toString();
	}

	
	
}
