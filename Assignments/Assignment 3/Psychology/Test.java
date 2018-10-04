
public class Test {
	public static void main(String args[]) {
		PsychiatristObject p = new PsychiatristObject() ;
		SadObject s = new SadObject();
		HappyObject h = new HappyObject();
		p.examine(h);
		h.queryMood();
		h.expressFeeling();
		p.observe(h);
		p.examine(s);
		s.queryMood();
		s.expressFeeling();
		p.observe(s);
		
	}
}
