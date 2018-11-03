package Tool;

public class Rock extends Tool {
	public Rock() {
	}

	public Rock(int r) {
		super.setStrength(r);
		super.type = 'r';
	}

	public boolean fight(Tool tool) {
		double factor = 1.0;
		if (tool.getClass() == Scissors.class) {
			factor *= 2;
		}
		if (tool.getClass() == Paper.class) {
			factor /= 2;
		}
		if (this.strength * factor > tool.strength) {
			return true;
		} else {
			return false;
		}

	}
}
