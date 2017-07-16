# Java8-Lambda Expressions
Những tính năng mới trong java8.

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

Example:
Sắp xếp một tập hợp có sẵn

```java
List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian","Cherry");
 
Collections.sort(fruits, new Comparator<String>() {
 
  	@Override
  	public int compare(String o1, String o2) {
      	return o1.compareTo(o2);
  	}
 
});
```
Sắp xếp một tập hợp có sẵn sử dụng lambda expressions
```java
List<String> fruits = Arrays.asList("Grapefruit", "Apple", "Durian", "Cherry");

Collections.sort(fruits, (String o1, String o2) -> {
	return o1.compareTo(o2);
});
```

## Functional Interface API
Java 8 xây dựng sẵn một số lượng khá lớn các **Functional Interface**, chúng nằm trong package **java.util.function**

### java.util.function.Consumer
**Consumer** là một **Functional Interface** xây dựng sẵn của Java 8, nó có một method trừu tượng duy nhất chấp nhận một tham số đầu vào, và method này không trả về gì cả.

Example:
```java
List<String> list = Arrays.asList("a", "b", "c", "a1", "a2");

list.forEach((String t) -> {
	System.out.println(t);
});

//Hoặc có thể sử dụng ngắn gọn hơn
list.forEach((String t) -> System.out.println(t));
```



