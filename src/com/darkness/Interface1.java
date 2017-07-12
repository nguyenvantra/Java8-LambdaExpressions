package com.darkness;

@FunctionalInterface
public interface Interface1 {
	void something();

	default void defaultMethod() {
		System.out.println("..");
	}
}
