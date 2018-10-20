public class Candy extends DessertItem {

	double candyWeight;
	int candyPrice;

	public Candy() {

	}

	public Candy(String name) {
		super(name);
	}

	public Candy(String name, double candyWeight, int candyPrice) {
		this.name = name;
		this.candyWeight = candyWeight;
		this.candyPrice = candyPrice;
	}

	@Override
	public int getCost() {
		return (int) Math.round(candyWeight * candyPrice);
	}

	@Override
	public String toString() {
		String s = "";
		s += "\n" + candyWeight + "lbs. @ " + DessertShoppe.cents2dollarsAndCentsmethod(candyPrice) + " /lb.";
		s += "\n" + name;
		s += " " + DessertShoppe.cents2dollarsAndCentsmethod(getCost());
		return s;
	}

}
