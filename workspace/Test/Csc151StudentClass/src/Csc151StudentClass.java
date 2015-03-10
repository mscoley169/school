/**
 * 
 */

/**
 * @author Gary Blackburn
 *
 */
public class Csc151StudentClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 // Declare object reference variables for two students
	      Student student1;
	      Student student2;
	      
	   // Create (instantiate) the actual objects
	      student1 = new Student("John Smith", 100232);
	      student2 = new Student("Jane Doe", 1122334);
	      
	   // Call some methods   
	      student1.setMajor("Computer Engineering");
	      student2.addCourse("Csc151");

	}

}
