
public class Course {
	String name;
	int numberOfStudent;
	Student[] students;
	
	public Course(String name, int numberOfStudent) {
		this.name = name;
		this.numberOfStudent = numberOfStudent;
		students = new Student[10];
	}


	public String getName() {
		return name;
	}

	public int getNumberOfStudent() {
		return numberOfStudent;
	}

	public Student[] getStudents() {
		return students;
	}
	
	public boolean isFull() {
		if (numberOfStudent >= 10) {
			return true;
		} else {
			return false;
		}
	}
	
	public void registerStudent(Student student) {	
		if (!isFull()) {
			students[numberOfStudent] = student;
			numberOfStudent++;
		} 
	}
}
	
        
	

