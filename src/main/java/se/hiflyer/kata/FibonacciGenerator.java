package se.hiflyer.kata;

import java.util.ArrayList;

public class FibonacciGenerator {

	private ArrayList<Long> cache = new ArrayList<>();
	public long get(int ordinal) {
		if (ordinal < 0) {
			throw new IllegalArgumentException("Ordinal must be positive but was " + ordinal);
		}
		if (ordinal < 2) {
			return ordinal;
		}
		int cacheIndex = ordinal - 2;
		if (cache.size() > cacheIndex) {
			return cache.get(cacheIndex);
		}
		long calculatedValue = get(ordinal - 1) + get(ordinal - 2);
		if (calculatedValue < 0) {
			throw new IllegalArgumentException("Fibonacci number of ordinal " + ordinal + " is too large to fit in a long");
		}
		cache.add(cacheIndex, calculatedValue);
		return calculatedValue;
	}
}
