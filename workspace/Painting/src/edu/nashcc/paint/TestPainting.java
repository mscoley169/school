package edu.nashcc.paint;

public class TestPainting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Painting paint1 = new Painting("", "", "");
		Painting paint2 = new Painting("", "", "", 0.0);
		Painting paint3 = new Painting("Starry Night", "Van Gogh", "oil",
				100000000);

		paint1.getUserInput(paint1);
		//paint2.getUserInput(paint2);
		
		
		// testing stuff
		//System.out.println(paint1.getTitle() + paint1.getArtist()
		//		+ paint1.getMedium() + paint1.getPrice()
		//		+ paint1.getCommission());
		//System.out.println(paint2);
		//System.out.println(paint3);
		
		paint1.formatData();
		//System.out.println(paint2.formatData());
		//System.out.println(paint3.formatData());
	}

}
