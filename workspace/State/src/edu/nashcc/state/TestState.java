package edu.nashcc.state;


public class TestState {

	public static void main(String[] args) {

		
		State state1 = new State("North Carolina", 10054192, "Raleigh", 431746, "Charlotte", 792862);
		State state2 = new State("False Carolina", 4832000, "Columbia", 129272, "Columbia", 129272);
		String stateString1 = state1.getStateData();
		String stateString2 = state2.getStateData();
		
		System.out.println(stateString1);
		System.out.println();
		System.out.println(stateString2);
	// City("Raleigh", 431746);
	// ("Charlotte", 792862);
	// ("Columbia", 129272, "Columbia", 129272);
		
	}

}
