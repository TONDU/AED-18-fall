
public class Cookie extends DessertItem {

	int cookieNumber;
	int cookiePrice;

	public Cookie() {

	}

	public Cookie(String name) {
		super(name);
	}

	public Cookie(String name, int cookieNumber, int cookiePrice) {
		this.name = name;
		this.cookieNumber = cookieNumber;
		this.cookiePrice = cookiePrice;

	}

	@Override
	public int getCost() {
		return (int) Math.round(cookieNumber * cookiePrice / 12);
	}

	@Override
	public String toString() {
		String s = "";
		s += "\n" + cookieNumber + " @ " + DessertShoppe.cents2dollarsAndCentsmethod(cookiePrice) + " /dz.";
		s += "\n" + name;
		s += " " + DessertShoppe.cents2dollarsAndCentsmethod(getCost());
		return s;
	}

}
