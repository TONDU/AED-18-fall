public class Pet {
	private String name;
	private String ownerName;
	private String color;

	protected int sex;
	public static final int MALE = 1, FEMALE = 2, SPAYED = 3, NEUTERED = 4;

	public Pet(String name, String ownerName, String color) {
		this.name = name;
		this.ownerName = ownerName;
		this.color = color;
	}

	public String getPetName() {
		return name;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getColor() {
		return color;
	}

	public void setSex(int sexid) {
		 this.sex = sexid;
		
	}

	public String getSex() {
		if (sex == 	MALE) {
			return "MALE";
		} else if (sex == FEMALE) {
			return "FEMALE";
		} else if (sex == SPAYED) {
			return  "SPAYED";
		} else if(sex == NEUTERED){
			return  "NEUTERED";
		} else{
			return "FALSE";
		}
		
	}
	

	public String toString() {
		return name + " owned by " + ownerName + "\n" + "Color:" + color + "\n" + "Sex: " + getSex();
	} 

}