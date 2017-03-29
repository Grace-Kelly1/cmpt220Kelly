import java.util.ArrayList;

public class NewCourse {
	//11.5
	class Course {
		//Variables created
	    private String courseName;
	    private ArrayList<String> students = new ArrayList<>();

	    public Course(String courseName) {
	        this.courseName = courseName;
	    }
	    //Add Student
	    public void addStudent(String student) {

	        students.add(student);
	    }
	    //Get Student
	    public String[] getStudents() {
	        return students.toArray(new String[students.size()]);
	    }
	    //Get number of students
	    public int getNumberOfStudents() {
	        return students.size();
	    }
	    //Get course name
	    public String getCourseName() {
	        return courseName;
	    }
	    //Remove student
	    public void dropStudent(String student) {
	        students.remove(student);
	    }
	    // Clear the students
	    public void clear(){
	        students.clear();
	    }

	}
}
