# Java8-LambdaExpressions

## Default Interface
Java 8 cho phép bạn thêm 1 method trong trừu tượng vào interface bằng cách sử dụng từ khoá <font color="red">**default**</font>. Các method này được hiểu như các phương thức mở rộng.

```java
public interface Formula {
	
	double calculate(int a);

	default double sqrt(int a) {
		return Math.sqrt(a);
	}
}
```
