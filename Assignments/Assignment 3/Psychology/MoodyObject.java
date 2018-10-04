
public abstract class MoodyObject extends PsychiatristObject{
	
	protected abstract String getMood();
	
	protected abstract void expressFeeling();
	
	public void queryMood() {
		System.out.println("I feel "+ getMood() + " today!");
	}
}
