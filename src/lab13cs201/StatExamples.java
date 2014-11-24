package lab13cs201;

import java.util.ArrayList;

public class StatExamples {
	
	ArrayList<Integer> CreateRandomNumbers(int N, int min, int max) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		int range = max - min;
		
		for (int i = 0; i < N; i++) {
			a.add( (int)(Math.random() * range + min) );
		}
		
		return a;
	}
	
	int findMin(ArrayList<Integer> a) {
		int min = Integer.MAX_VALUE;
		for (int m : a) {
			if (m < min) { 
				min = m;
			}
		}
		return min;
	}
	
	double findMean(ArrayList<Integer> a) {
		double sum = 0.0;
		for (int m : a) {
			sum += m;
		}
		
		return sum/a.size();
	}
	
	// DO at HOME
	// 1. find the max
	// 2. find the standard deviation
	// 3. find media (hint not so easy!)
	// 4. work on reverse in both cases below
	
	public void reverse(ArrayList<Integer> a) {
		// reverse a in place -- in other words: change a!
	}
	
	public ArrayList<Integer> getReverse(ArrayList<Integer> a) {
		// do not change a but create a new list that is the
		// reverse of a
		return null;
	}
	
	public void run() {
		ArrayList<Integer> a = CreateRandomNumbers(1000, 0, 100);
		System.out.println("min = " + findMin(a));
		System.out.println("mean = " + findMean(a));
		// repeat for 1,2, and 3
	}
	
	public static void main(String[] args) {
		new StatExamples().run();
	}

}
