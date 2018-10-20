
public class DessertShoppe {
	static String Storename = "M & M Dessert Shoppe";
	final static double taxrate = 0.065;
	final static int nameSizeMax = 20;
	final static int costLen = 10;

	public DessertShoppe() {

	}

	public static String cents2dollarsAndCentsmethod(int i) {
		double d = (double) i;
		return "" + d / 100;
	}
}
