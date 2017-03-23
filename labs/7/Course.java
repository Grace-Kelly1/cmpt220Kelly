public class Course {
	//Data Fields
	private String courseName;
	private String[] students = new String[1];
	private int numberOfStudents;

	public Course(String courseName) {
		this.courseName = courseName;
	}

	public void addStudent(String student) {
		//Make array size bigger
		if (numberOfStudents == students.length) {
			String[] a = new String[students.length + 1];
			for (int i = 0; i < numberOfStudents; i++) {
				a[i] = students[i];
			}
			students = a;
		}
		students[numberOfStudents] = student;
		numberOfStudents++;
	}
	//Get Students
	public String[] getStudents() {
		return students;
	}
	// Get Number 
	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	//Get Course Name
	public String getCourseName() {
		return courseName;
	}

	//Remove students 
	public void dropStudent(String student) {
		int index = findStudent(student);
		if (index >= 0) {
			dropStudent(index);
		}
		else {
			System.out.println(student + " is not in the course: " + courseName);
		}
	}

	//Deletes student
	private void dropStudent(int index) {
		String[] s = new String[students.length - 1];
		for (int i = 0, j = 0; i < s.length; i++, j++) {
			if (i == index) {
				j++;
			}
			s[i] = students[j];
		}
		this.students = s;
		numberOfStudents--;
	}

	//Removes all students 
	public void clear() {
		students = new String[1];
		numberOfStudents = 0;
	}

	//Returns the index 
	private int findStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				return i;
			}
		}
		return -1;
	}

}
