
public class Student {
	 // Instance Variables
    private String fullName;
    private int studentId;
    private String major;
    private double gpa;
    private String coursesTaken;
 
	 /** 
	  * Constructor method.
	  * Create a new student with a name and ID 
	  * @param name The student's full name
	  * @param id The student's ID
	  */
	    public Student(String name, int id)
	    {
	       this.fullName = name;
	       this.studentId = id;
	       this.major = "undeclared";
	       this.gpa = 0.0;
	       this.coursesTaken = "";   
	    } 
	    
	 /**
	  * Change a student's major. 
	  * @param newMajor The student's new major
	  */
	    public void setMajor(String newMajor)
	    {
	       this.major = newMajor;
	    }
	    
	 /** 
	  * Returns the student's full name. 
	  * @return The student's full name
	  */
	    public String getName()
	    {
	       return this.fullName;
	    }
	 
	 /**
	  * Set the student's name. 
	  * @param name The student's full name
	  */
	    public void setName(String name) 
	    {
	       this.fullName = name;
	    }
	    
	 /** 
	  * Returns the student's ID. 
	  * @return The student's ID
	  */
	    public int getId()
	    {
	       return this.studentId;
	    }
	 
	 /** 
	  * Adds a course to the list of courses taken. 
	  * @param course The course to be added
	  */
	    public void addCourse(String course) {
	       this.coursesTaken += " " + course;
	    }
	    
	 /** 
	  * Returns the list of courses taken by student. 
	  * @return The courses taken by the student
	  */
	    public String getCoursesTaken() {
	       return this.coursesTaken;
	    }
}
