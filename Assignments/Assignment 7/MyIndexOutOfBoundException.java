//1
public class MyIndexOutOfBoundException extends Exception {
	int lowerBound;
	int upperBound;
	int index;
	// String[n] stringArray;

	public String toString(int lowerBound, int upperBound, int index) {
		if (index < lowerBound) {
			return "Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: "
					+ upperBound;
		} else if (index > upperBound) {
			return "Error Message: Index: " + index + ", but Lower bound: " + lowerBound + ", Upper bound: "
					+ upperBound;
		} else
			return "true";
	}

	public static void main(String[] args) {
		MyIndexOutOfBoundException e = new MyIndexOutOfBoundException();
		System.out.println(e.toString(10, 0, 12));
	}

}
