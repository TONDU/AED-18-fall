
public class SadObject extends MoodyObject {
	protected String getMood() {
		return "sad";	
		}
	
	protected void expressFeeling() {
		System.out.println("'wah' 'boo hoo' 'weep' 'sob'");
		
	}
	
	public String toString() {
		return "subject cries a lot";
	}
	

	
	
}
