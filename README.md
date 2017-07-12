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
Lambda expressions là một tính năng mới quan trọng trong Java 8. Lambda expressions giống class vô danh biểu diễn dưới dạng biểu thức. Chỉ bằng một biểu thức nó có thể biểu diễn thực thi cho method của functional interfaces. Functional interfaces là interface chỉ có 1 method. Lambda expressions cung cấp cách thức mới làm việc với Collection một cách đơn giản và hiệu quả, tăng hiệu năng (performance) của hệ thống chạy trong môi trường đa lõi (multicore).

### Cấu trúc của lambda expressions
Agument list | Arrow tocken | Body
------------ | ------------- | -------------
```([Data type] [param1], [param2], [param_n])``` | ```->``` | ```{body};```

LamExp có thể không có, có một, hoặc nhiều tham số.
``` () -> "Framgia" ```
``` (a) -> return a\*a ```
``` (int a, int b) -> return a\*b ```

Tham số của có thể được định nghĩa kiểu một cách tường minh hoặc không cần định nghĩa kiểu. Kiểu sẽ được suy ra từ ngữ cảnh cụ thể.

Các tham số được đặc trong hai dấu đóng mở đơn **(params)**, khi chỉ có một tham số thì có thể không cần đặt trong dấu đóng mở.
```a -> return a\*a```

Body code của LamExp được đặt trong dấu đóng mở nhọn **{body}**, khi body code chỉ có một sử lý (thể hiện) thì không cần có dấu đóng mở nhọn.



