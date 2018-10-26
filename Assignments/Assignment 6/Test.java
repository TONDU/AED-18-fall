
public class Test {
	
	 public static void main(String[] args) {
	  // TODO Auto-generated method stub
	  Dog dog = new Dog("dog","Kate","white","30");
	  dog.setSex(4);
	  System.out.println(dog);
	  dog.setBoardStart(6, 2, 2018);
	  dog.setBoardEnd(9, 3, 2018);
	  System.out.println(""+dog.boarding(8, 28, 2018));
	 }

	}

