public class MyIntegerTest {

	public static void main(String[] args) {
		// 10.3
		//Create
		MyInteger int1 = new MyInteger(15);
		MyInteger int2 = new MyInteger(10);
		MyInteger int3 = new MyInteger(60);
		MyInteger int4 = new MyInteger(42);

		System.out.printf("15 is prime? %s%n", int1.getValue(), int1.isPrime());
		System.out.printf("10 is prime? %s%n", int2.getValue(), int2.isPrime());
		System.out.printf("60 is prime? %s%n", int3.getValue(), int3.isPrime());

		System.out.printf("15 is even? %s%n", int1.getValue(), int1.isEven());
		System.out.printf("10 is even? %s%n", int2.getValue(), int2.isEven());
		System.out.printf("60 is even? %s%n", int3.getValue(), int3.isEven());

		System.out.printf("60 is odd? %s%n", MyInteger.isOdd(93));
		
		System.out.printf("%d equals %d? %s%n", int1.getValue(), int4.getValue(), int1.equals(int4));

		System.out.printf("%d%n", MyInteger.parseInt(new char[] {'9', '1', '3'}));
		System.out.printf("%d%n", MyInteger.parseInt("454"));
	}
	}

