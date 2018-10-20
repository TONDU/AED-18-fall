
public class IceCream extends DessertItem {
	int IceCreamCost;

	public IceCream() {

	}

	public IceCream(String name) {
		super(name);
	}

	public IceCream(String name, int IceCreamCost) {
		super(name);
		this.IceCreamCost = IceCreamCost;

	}

	@Override
	public int getCost() {
		return IceCreamCost;

	}

	@Override
	public String toString() {
		String s = "";
		s += "\n" + name;
		s += " " + DessertShoppe.cents2dollarsAndCentsmethod(getCost());
		return s;
	}

}
