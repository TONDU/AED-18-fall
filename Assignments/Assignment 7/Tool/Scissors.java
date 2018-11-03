package Tool;

public class Scissors extends Tool {
	public Scissors() {
	}

	public Scissors(int s) {
		super.setStrength(s);
		super.type = 's';
	}

	public boolean fight(Tool tool) {
		double factor = 1.0;
		if (tool.getClass() == Paper.class) {
			factor *= 2;
		}
		if (tool.getClass() == Rock.class) {
			factor /= 2;
		}
		if (this.strength * factor > tool.strength) {
			return true;
		} else {
			return false;
		}

	}
}
// Rock’s strength is doubled (temporarily) when fighting scissors,
// but halved (temporarily) when fighting paper. I
