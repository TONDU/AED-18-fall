
public class Dog extends Pet implements Boardable {
	private String size;
	private int mmStart;
	private int ddStart;
	private int yyyyStart;
	private int mmEnd;
	private int ddEnd;
	private int yyyyEnd;

	
	public Dog(String name, String ownerName, String color,String size) {
		super(name, ownerName, color);
		this.size = size;
	}
	
	public String getSize(){
		return size;
	}
	public String toString(){
		return "DOG:"+ "\n" + super.toString() + "\n"+ "Size " + size;
	}
	
	@Override
	public void setBoardStart(int month, int day, int year) {
		if (month > 0 && month < 13 && day > 0 && day < 32 && year > 999 && year < 10000) {
			mmStart = month ;
			ddStart = day;
			yyyyStart = year;
		}else{
			System.out.println("FALSE");
		}

	}
	@Override
	public void setBoardEnd(int month, int day, int year) {
		if (month > 0 && month < 13 && day > 0 && day < 32 && year > 999 && year < 10000) {
			mmEnd = month ;
			ddEnd = day;
			yyyyEnd = year;
	}else{
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

