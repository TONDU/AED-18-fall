
//4

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Interval {
	int start;
	int end;

	public Interval(int start, int end) {
		this.start = start;
		this.end = end;
	}
}

public class Solution {

	public List<Interval> merge(List<Interval> intervals) {
		if (intervals == null || intervals.size() <= 1) {
			return intervals;
		}

		Collections.sort(intervals, new IntervalComparator());
		// sort Intervals as order
		List<Interval> result = new ArrayList<Interval>();
		// Create new ArrayList,result
		Interval first = intervals.get(0);
		for (int i = 0; i <= intervals.size(); i++) {
			Interval now = intervals.get(i);
			// look through all element of intevals.
			if (now.start <= first.end) {
				first.end = Math.max(first.end, now.end);
				result.add(first);
				first = now;
			} else if (now.start > first.end) {
				result.add(first);
				first = now;
				return result;
			}
		}
		return result;
	}

	private class IntervalComparator implements Comparator<Interval> {
		public int compare(Interval a, Interval b) {
			return a.start - b.start;
		}
	}
}

// Given a set of time intervals in any order,
// merge all overlapping intervals into one and output the result
// which should have only mutually exclusive intervals.
// Let the intervals be represented as pairs of integers for simplicity.
//
// For example, let the given set of intervals be {{1,3}, {2,4}, {5,7}, {6,8} }.
// The intervals {1,3} and {2,4} overlap with each other,
// so they should be merged and become {1, 4}.
// Similarly {5, 7} and {6, 8} should be merged and become {5, 8}
//
// Write a function which produces the set of merged intervals for the given set
// of intervals.(score 2)
