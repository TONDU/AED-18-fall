

public class Cat extends Pet implements Boardable {
	private String hairLength;
	private int mmStart;
	private int ddStart;
	private int yyyyStart;
	private int mmEnd;
	private int ddEnd;
	private int yyyyEnd;

	public Cat(String name, String ownerName, String color, String hairLength) {
		super(name, ownerName, color);
		this.hairLength = hairLength;
	}

	public String getHairLength() {
		return hairLength;
	}

	public String toString() {
		return "CAT:" + "\n" + super.toString() + "\n" + "Hair: " + hairLength;
	}

	@Override
	public void setBoardStart(int month, int day, int year) {
		if (month > 0 && month < 13 && day > 0 && day < 32 && year > 999 && year < 10000) {
			mmStart = month;
			ddStart = day;
			yyyyStart = year;
		} else {
			System.out.println("FALSE");
		}

	}

	@Override
	public void setBoardEnd(int month, int day, int year) {
		if (month > 0 && month < 13 && day > 0 && day < 32 && year > 999 && year < 10000) {
			mmEnd = month;
			ddEnd = day;
			yyyyEnd = year;
		} else {
			System.out.println("FALSE");
		}
	}

	@Override
	public boolean boarding(int month, int day, int year) {
		if (year > yyyyStart && year < yyyyEnd) {
			return true;
		}
		if (year == yyyyStart) {
			if (month < mmStart) {
				return false;
			} else if (month == mmStart) {
				if (day < ddStart)
					return false;
			}
		}

		if (year == yyyyEnd) {
			if (month > mmEnd) {
				return false;
			} else if (month == mmEnd) {
				if (day > ddEnd)
					return false;
			}
		}
		return true;
	}

}
// In order to implement the Boardable interface define new data members to
// store the boarding start and end dates,
// implement the setBoardStart and setBoardEnd methods to store values for these
// data members.
// Also implement the boarding method to return true if the given data is
// between the start and end dates,
// otherwise it returns false. Note: You should also return true if the given
// date is equal to the start or end date.
