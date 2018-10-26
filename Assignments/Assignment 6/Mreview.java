package thistime;

import java.util.*;

public class Mreview implements Comparable<Mreview> {
	private String title;// title of the movie
	private ArrayList<Integer> ratings = new ArrayList<Integer>();// list of ratings stored in a Store

	public Mreview() {

	}

	public Mreview(String ttl) {
		this.title = ttl;
	}

	public Mreview(String ttl, int firstRating) {
		this.title = ttl;
		ratings.add(firstRating);
	}
	// ttl - a string to be used to initialize title
	// firstRating - the first rating number/int.

	public String getTitle() {
		return title;
	}

	public void addRating(int r) {
		ratings.add(r);
	}

	public double aveRating() {
		double sum = 0;
		for (int i = 0; i < ratings.size(); i++) {
			sum += ratings.get(i);
		}
		return sum / ratings.size();
	}

	public int numrating() {
		return ratings.size();
	}

	@Override
	public int compareTo(Mreview o) {
		if (this.title.compareTo(o.getTitle()) > 0) {
			return 1;
		} else if (this.title.compareTo(o.getTitle()) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this.title.equals(((Mreview) obj).getTitle())) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.getTitle() + "，averge " + this.aveRating() + " out of " + this.numrating() + " ratings";
	}

	public static void main(String[] args) {
		Mreview m = new Mreview("Kill Bill");
		m.addRating(3);
		m.addRating(4);
		m.addRating(3);
		System.out.println(m);
		System.out.println(m.aveRating());
		
		Mreview n = new Mreview("a perfect world");
		m.addRating(5);
		m.addRating(4);
		m.addRating(4);
		System.out.println(n);
		System.out.println(n.aveRating());
		System.out.println(m.compareTo(n));
		System.out.println(m.equals(n));
		
	}

}
