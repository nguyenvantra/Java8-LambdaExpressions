package com.darkness;

import java.util.Arrays;
import java.util.List;

public class ConsumerExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "c", "a1", "a2");

		list.forEach((String t) -> {
			System.out.println(t);
		});
		
		//Hoặc có thể sử dụng ngắn gọn hơn
		list.forEach((String t) -> System.out.println(t));
	}
}
