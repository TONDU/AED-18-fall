
public class  Test{
	public static void main(String[] args){
		Student tom = new Student("Tom", "000");
		Student tina = new Student("Tina", "001");
		Student bob = new Student("Bob", "002");
		Course math = new Course("math", 0);
		math.registerStudent(tom);
		math.registerStudent(tina);
		math.registerStudent(bob);
		System.out.println("There are "+math.getNumberOfStudent()+" students in "+ math.getName() + " class");
		for (int i = 0; i < math.getNumberOfStudent(); i++) {
			System.out.println(math.getStudents()[i].getName());
		}
	}

}
