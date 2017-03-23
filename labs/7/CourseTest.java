public class CourseTest {

	public static void main(String[] args) {
		// 10.9
		Course SoftwareDev = new Course("SoftwareDev");
     		// Add three students
     		SoftwareDev.addStudent("James");
     		SoftwareDev.addStudent("Matt");
     		SoftwareDev.addStudent("Mary");
     		//Remove one student
     		SoftwareDev.dropStudent("James");
     		// Displays students
     		System.out.println("\nThe students in the course " + SoftwareDev.getCourseName() + ":");
     		String[] students = SoftwareDev.getStudents();
     		for (int i = 0; i < SoftwareDev.getNumberOfStudents(); i++) {
     			System.out.print(students[i] + " ");
     		}
     		System.out.println();
     	}

     }
