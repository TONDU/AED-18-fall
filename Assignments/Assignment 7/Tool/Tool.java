package Tool;

public class Tool {
	protected int strength;
	protected char type;

	public Tool() {
	}

	public Tool(int s) {
		this.strength = s;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStrength() {
		return strength;
	}

}
