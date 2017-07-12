package com.darkness;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortJava8Example {
	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian", "Cherry");

		Collections.sort(fruits, (String o1, String o2) -> {
			return o1.compareTo(o2);
		});

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}
}
