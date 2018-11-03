package Tool;

public class Paper extends Tool {
	public Paper() {
	}

	public Paper(int p) {
		super.setStrength(p);
		super.type = 'p';
	}

	public boolean fight(Tool tool) {
		double factor = 1.0;
		if (tool.getClass() == Rock.class) {
			factor *= 2;
		}
		if (tool.getClass() == Scissors.class) {
			factor /= 2;
		}
		if (this.strength * factor > tool.strength) {
			return true;
		} else {
			return false;
		}

	}

}
