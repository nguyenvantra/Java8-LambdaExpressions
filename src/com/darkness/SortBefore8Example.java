package com.darkness;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortBefore8Example {
	public static void main(String[] args) {

		List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian", "Cherry");

		Collections.sort(fruits, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}

		});

		for (String fruit : fruits) {
			System.out.println(fruit);
		}

	}
}
