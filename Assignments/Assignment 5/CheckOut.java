import java.util.*;

public class CheckOut {
	Vector<DessertItem> di;

	public CheckOut() {
		di = new Vector<DessertItem>();
	}

	public int numberOfItems() {
		return di.size();
	}

	public void enterItem(DessertItem item) {
		di.addElement(item);
	}

	public void clear() {
		di.clear();
	}

	public int totalCost() {
		double totalCost = 0;
		for (DessertItem i : di) {
			totalCost += i.getCost();
		}
		return (int) Math.round(totalCost);

	}

	public int totalTax() {
		double totalTax = 0;
		for (DessertItem i : di) {
			totalTax += (int) i.getCost() * DessertShoppe.taxrate;
		}
		return (int) Math.round(totalTax);
	}

	@Override
	public String toString() {
		String s = "";
		s += "\n" + DessertShoppe.Storename;
		s += "\n" + "---------------";

		for (DessertItem i : di) {
			s += i;
		}
		s += "\n";
		s += "\n" + "Tax " + DessertShoppe.cents2dollarsAndCentsmethod(totalTax());
		s += "\n" + "Total Cost " + DessertShoppe.cents2dollarsAndCentsmethod(totalCost() + totalTax());
		return s;

	}
}
