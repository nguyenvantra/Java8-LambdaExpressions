# Java8-Lambda Expressions

## Default Interface
Java 8 cho phép bạn thêm 1 method không trừu tượng vào interface bằng cách sử dụng từ khoá **default**. Các method này được hiểu như các phương thức mở rộng.

Example:

```java
public interface Formula {
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
```
## Functional Interface
Java 8 coi các Interface có duy nhất một phương thức trừu tượng là các **Functional Interface**

Example: 

```java
public interface Interface1 {
	void something();

	default void defaultMethod() {
		System.out.println("..");
	}
}
```

Bạn có thể sử dụng annotation **@FunctionalInterface** để đánh dấu một interface của bạn là **Functional Interface**, điều này không bắt buộc, tuy nhiên trình biên dịch của Java sẽ thông báo lỗi cho bạn nếu vô tình thêm một method trừu tượng khác nữa vào interface có đánh dấu bởi annotation này.

Example:

```java
@FunctionalInterface
public interface Interface1 {
	void something();

	default void defaultMethod() {
		System.out.println("..");
	}
}
```

## Lambda expressions




