
public class Sundae extends IceCream {
	int topping;
	String toppingName;

	public Sundae() {

	}

	public Sundae(String name) {
		super(name);
	}

	public Sundae(String IceCream, int IceCreamCost, String toppingName, int topping) {
		super(IceCream);
		this.topping = topping;
		this.toppingName = toppingName;
		super.IceCreamCost = IceCreamCost;

	}

	// override
	public int getCost() {

		return IceCreamCost + topping;
	}

	@Override
	public String toString() {
		String s = "";
		s += "\n" + toppingName + " Sundae with " + super.name;
		s += " " + DessertShoppe.cents2dollarsAndCentsmethod(getCost());
		return s;
	}

}