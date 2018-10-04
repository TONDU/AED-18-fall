
public  class HappyObject extends MoodyObject {
	protected String getMood() {
		return "happy";	
	}
	
	protected void expressFeeling() {
		System.out.println("'hehehe...hahaha...HAHAHA'");	
	}
	
	public String toString() {
		return "subject laughs a lot";
	}
}
